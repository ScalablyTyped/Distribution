package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PushManager extends js.Object {
  def getSubscription(): Promise[PushSubscription | scala.Null] = js.native
  def permissionState(): Promise[PushPermissionState] = js.native
  def permissionState(options: PushSubscriptionOptionsInit): Promise[PushPermissionState] = js.native
  def subscribe(): Promise[PushSubscription] = js.native
  def subscribe(options: PushSubscriptionOptionsInit): Promise[PushSubscription] = js.native
}

@JSGlobal("PushManager")
@js.native
object PushManager
  extends org.scalablytyped.runtime.Instantiable0[PushManager] {
  val supportedContentEncodings: atSindresorhusIsLib.ReadonlyArray[java.lang.String] = js.native
}

