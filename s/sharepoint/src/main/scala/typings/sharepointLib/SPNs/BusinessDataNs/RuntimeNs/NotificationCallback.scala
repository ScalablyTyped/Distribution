package typings
package sharepointLib.SPNs.BusinessDataNs.RuntimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.BusinessData.Runtime.NotificationCallback")
@js.native
class NotificationCallback protected ()
  extends sharepointLib.SPNs.ClientObject {
  def this(context: sharepointLib.SPNs.ClientRuntimeContext, notificationEndpoint: java.lang.String) = this()
  def get_notificationContext(): java.lang.String = js.native
  def get_notificationEndpoint(): java.lang.String = js.native
  def get_notificationForwarderType(): java.lang.String = js.native
  def set_notificationContext(value: java.lang.String): scala.Unit = js.native
  def set_notificationForwarderType(value: java.lang.String): scala.Unit = js.native
}

@JSGlobal("SP.BusinessData.Runtime.NotificationCallback")
@js.native
object NotificationCallback extends js.Object {
  def newObject(context: sharepointLib.SPNs.ClientRuntimeContext, notificationEndpoint: java.lang.String): sharepointLib.SPNs.BusinessDataNs.RuntimeNs.NotificationCallback = js.native
}

