package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.PushNotificationSubscriber")
@js.native
class PushNotificationSubscriber () extends ClientObject {
  def get_customArgs(): java.lang.String = js.native
  def get_deviceAppInstanceId(): Guid = js.native
  def get_lastModifiedTimeStamp(): microsoftDashAjaxLib.Date = js.native
  def get_registrationTimeStamp(): microsoftDashAjaxLib.Date = js.native
  def get_serviceToken(): java.lang.String = js.native
  def get_subscriberType(): java.lang.String = js.native
  def get_user(): User = js.native
  def set_customArgs(value: java.lang.String): scala.Unit = js.native
  def set_serviceToken(value: java.lang.String): scala.Unit = js.native
  def set_subscriberType(value: java.lang.String): scala.Unit = js.native
  def update(): scala.Unit = js.native
}

