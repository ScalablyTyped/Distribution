package typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.messaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-firebase", "RNFirebase.messaging.RemoteMessage")
@js.native
class RemoteMessage () extends js.Object {
  var collapseKey: js.UndefOr[String] = js.native
  var data: js.Object = js.native
  var from: js.UndefOr[String] = js.native
  var messageId: js.UndefOr[String] = js.native
  var messageType: String = js.native
  var sentTime: js.UndefOr[Double] = js.native
  var to: js.UndefOr[String] = js.native
  var ttl: js.UndefOr[Double] = js.native
  def setCollapseKey(collapseKey: String): RemoteMessage = js.native
  def setData(data: js.Object): RemoteMessage = js.native
  def setMessageId(messageId: String): RemoteMessage = js.native
  def setMessageType(messageType: String): RemoteMessage = js.native
  def setTo(to: String): RemoteMessage = js.native
  def setTtl(ttl: Double): RemoteMessage = js.native
}

