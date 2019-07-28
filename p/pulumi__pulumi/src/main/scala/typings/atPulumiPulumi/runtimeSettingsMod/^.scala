package typings.atPulumiPulumi.runtimeSettingsMod

import typings.atPulumiPulumi.resourceMod.ComponentResource
import typings.atPulumiPulumi.resourceMod.URN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi/runtime/settings", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var excessiveDebugOutput: Boolean = js.native
  def disconnect(): Unit = js.native
  def disconnectSync(): Unit = js.native
  def getEngine(): js.UndefOr[js.Object] = js.native
  def getMonitor(): js.UndefOr[js.Object] = js.native
  def getProject(): String = js.native
  def getRootResource(): js.Promise[js.UndefOr[URN]] = js.native
  def getStack(): String = js.native
  def hasMonitor(): Boolean = js.native
  def isDryRun(): Boolean = js.native
  def isQueryMode(): Boolean = js.native
  def isTestModeEnabled(): Boolean = js.native
  def monitorSupportsSecrets(): js.Promise[Boolean] = js.native
  def rpcKeepAlive(): js.Function0[Unit] = js.native
  def serialize(): Boolean = js.native
  def setRootResource(res: ComponentResource): js.Promise[Unit] = js.native
}

