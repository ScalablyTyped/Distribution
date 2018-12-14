package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PushManager extends js.Object {
  def getSubscription(): js.Promise[PushSubscription | scala.Null] = js.native
  def permissionState(): js.Promise[PushPermissionState] = js.native
  def permissionState(options: PushSubscriptionOptionsInit): js.Promise[PushPermissionState] = js.native
  def subscribe(): js.Promise[PushSubscription] = js.native
  def subscribe(options: PushSubscriptionOptionsInit): js.Promise[PushSubscription] = js.native
}

@JSGlobal("PushManager")
@js.native
object PushManager
  extends org.scalablytyped.runtime.Instantiable0[PushManager] {
  val supportedContentEncodings: js.Array[java.lang.String] = js.native
}

