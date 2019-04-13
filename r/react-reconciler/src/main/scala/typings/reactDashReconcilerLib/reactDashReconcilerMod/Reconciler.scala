package typings
package reactDashReconcilerLib.reactDashReconcilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Reconciler[Instance, TextInstance, Container, PublicInstance] extends js.Object {
  def batchedUpdates[A](fn: js.Function0[A]): A = js.native
  def computeUniqueAsyncExpiration(): ExpirationTime = js.native
  def createContainer(containerInfo: Container, isConcurrent: scala.Boolean, hydrate: scala.Boolean): OpaqueRoot = js.native
  def deferredUpdates[A](fn: js.Function0[A]): A = js.native
  // Use for findDOMNode/findHostNode. Legacy API.
  def findHostInstance(component: js.Object): PublicInstance | scala.Null = js.native
  // Used internally for filtering out portals. Legacy API.
  def findHostInstanceWithNoPortals(component: Fiber): PublicInstance | scala.Null = js.native
  def flushControlled(fn: js.Function0[_]): scala.Unit = js.native
  def flushInteractiveUpdates(): scala.Unit = js.native
  def flushRoot(root: OpaqueRoot, expirationTime: ExpirationTime): scala.Unit = js.native
  def flushSync[A](fn: js.Function0[A]): A = js.native
  // Used to extract the return value from the initial render. Legacy API.
  def getPublicRootInstance(container: OpaqueRoot): (reactLib.reactMod.Component[_, _, _]) | PublicInstance | scala.Null = js.native
  def injectIntoDevTools(devToolsConfig: DevToolsConfig[Instance, TextInstance]): scala.Boolean = js.native
  def interactiveUpdates[A](fn: js.Function0[A]): A = js.native
  def requestWork(root: OpaqueRoot, expirationTime: ExpirationTime): scala.Unit = js.native
  def syncUpdates[A](fn: js.Function0[A]): A = js.native
  def unbatchedUpdates[A](fn: js.Function0[A]): A = js.native
  def updateContainer(
    element: ReactNodeList,
    container: OpaqueRoot,
    parentComponent: js.UndefOr[scala.Nothing],
    callback: js.Function0[js.UndefOr[scala.Unit | scala.Null]]
  ): ExpirationTime = js.native
  def updateContainer(
    element: ReactNodeList,
    container: OpaqueRoot,
    parentComponent: reactLib.reactMod.Component[_, _, _],
    callback: js.Function0[js.UndefOr[scala.Unit | scala.Null]]
  ): ExpirationTime = js.native
  def updateContainer(
    element: ReactNodeList,
    container: OpaqueRoot,
    parentComponent: scala.Null,
    callback: js.Function0[js.UndefOr[scala.Unit | scala.Null]]
  ): ExpirationTime = js.native
  def updateContainerAtExpirationTime(
    element: ReactNodeList,
    container: OpaqueRoot,
    parentComponent: js.UndefOr[scala.Nothing],
    expirationTime: ExpirationTime,
    callback: js.Function0[js.UndefOr[scala.Unit | scala.Null]]
  ): ExpirationTime = js.native
  def updateContainerAtExpirationTime(
    element: ReactNodeList,
    container: OpaqueRoot,
    parentComponent: reactLib.reactMod.Component[_, _, _],
    expirationTime: ExpirationTime,
    callback: js.Function0[js.UndefOr[scala.Unit | scala.Null]]
  ): ExpirationTime = js.native
  def updateContainerAtExpirationTime(
    element: ReactNodeList,
    container: OpaqueRoot,
    parentComponent: scala.Null,
    expirationTime: ExpirationTime,
    callback: js.Function0[js.UndefOr[scala.Unit | scala.Null]]
  ): ExpirationTime = js.native
}

