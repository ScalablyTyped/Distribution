package typings.sharepoint.SPNs.BusinessDataNs.RuntimeNs

import typings.sharepoint.SPNs.ClientObject
import typings.sharepoint.SPNs.ClientRuntimeContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.BusinessData.Runtime.NotificationCallback")
@js.native
class NotificationCallback protected () extends ClientObject {
  def this(context: ClientRuntimeContext, notificationEndpoint: String) = this()
  def get_notificationContext(): String = js.native
  def get_notificationEndpoint(): String = js.native
  def get_notificationForwarderType(): String = js.native
  def set_notificationContext(value: String): Unit = js.native
  def set_notificationForwarderType(value: String): Unit = js.native
}

/* static members */
@JSGlobal("SP.BusinessData.Runtime.NotificationCallback")
@js.native
object NotificationCallback extends js.Object {
  def newObject(context: ClientRuntimeContext, notificationEndpoint: String): NotificationCallback = js.native
}

