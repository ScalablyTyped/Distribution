package typings.reactReconciler.mod

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Reconciler[Instance, TextInstance, Container, PublicInstance] extends StObject {
  
  def batchedUpdates[A](fn: js.Function0[A]): A = js.native
  
  def computeUniqueAsyncExpiration(): ExpirationTime = js.native
  
  def createContainer(containerInfo: Container, isConcurrent: Boolean, hydrate: Boolean): OpaqueRoot = js.native
  
  def deferredUpdates[A](fn: js.Function0[A]): A = js.native
  
  // Use for findDOMNode/findHostNode. Legacy API.
  def findHostInstance(component: js.Object): PublicInstance | Null = js.native
  
  // Used internally for filtering out portals. Legacy API.
  def findHostInstanceWithNoPortals(component: Fiber): PublicInstance | Null = js.native
  
  def flushControlled(fn: js.Function0[_]): Unit = js.native
  
  def flushInteractiveUpdates(): Unit = js.native
  
  def flushRoot(root: OpaqueRoot, expirationTime: ExpirationTime): Unit = js.native
  
  def flushSync[A](fn: js.Function0[A]): A = js.native
  
  // Used to extract the return value from the initial render. Legacy API.
  def getPublicRootInstance(container: OpaqueRoot): (Component[_, _, _]) | PublicInstance | Null = js.native
  
  def injectIntoDevTools(devToolsConfig: DevToolsConfig[Instance, TextInstance]): Boolean = js.native
  
  def interactiveUpdates[A](fn: js.Function0[A]): A = js.native
  
  def requestWork(root: OpaqueRoot, expirationTime: ExpirationTime): Unit = js.native
  
  def syncUpdates[A](fn: js.Function0[A]): A = js.native
  
  def unbatchedUpdates[A](fn: js.Function0[A]): A = js.native
  
  def updateContainer(
    element: ReactNodeList,
    container: OpaqueRoot,
    parentComponent: js.UndefOr[scala.Nothing],
    callback: js.Function0[js.UndefOr[Unit | Null]]
  ): ExpirationTime = js.native
  def updateContainer(
    element: ReactNodeList,
    container: OpaqueRoot,
    parentComponent: Null,
    callback: js.Function0[js.UndefOr[Unit | Null]]
  ): ExpirationTime = js.native
  def updateContainer(
    element: ReactNodeList,
    container: OpaqueRoot,
    parentComponent: Component[_, _, _],
    callback: js.Function0[js.UndefOr[Unit | Null]]
  ): ExpirationTime = js.native
  
  def updateContainerAtExpirationTime(
    element: ReactNodeList,
    container: OpaqueRoot,
    parentComponent: js.UndefOr[scala.Nothing],
    expirationTime: ExpirationTime,
    callback: js.Function0[js.UndefOr[Unit | Null]]
  ): ExpirationTime = js.native
  def updateContainerAtExpirationTime(
    element: ReactNodeList,
    container: OpaqueRoot,
    parentComponent: Null,
    expirationTime: ExpirationTime,
    callback: js.Function0[js.UndefOr[Unit | Null]]
  ): ExpirationTime = js.native
  def updateContainerAtExpirationTime(
    element: ReactNodeList,
    container: OpaqueRoot,
    parentComponent: Component[_, _, _],
    expirationTime: ExpirationTime,
    callback: js.Function0[js.UndefOr[Unit | Null]]
  ): ExpirationTime = js.native
}
