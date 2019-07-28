package typings.reactDashNativeDashCommunications

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-communications", JSImport.Namespace)
@js.native
object reactDashNativeDashCommunicationsMod extends js.Object {
  def email(): Unit = js.native
  def email(to: js.Array[String]): Unit = js.native
  def email(to: js.Array[String], cc: js.Array[String]): Unit = js.native
  def email(to: js.Array[String], cc: js.Array[String], bcc: js.Array[String]): Unit = js.native
  def email(to: js.Array[String], cc: js.Array[String], bcc: js.Array[String], subject: String): Unit = js.native
  def email(to: js.Array[String], cc: js.Array[String], bcc: js.Array[String], subject: String, body: String): Unit = js.native
  def phonecall(phoneNumber: String, isPrompt: Boolean): Unit = js.native
  def text(): Unit = js.native
  def text(phoneNumber: String): Unit = js.native
  def text(phoneNumber: String, body: String): Unit = js.native
  def text(phoneNumber: Null, body: String): Unit = js.native
  def textWithoutEncoding(): Unit = js.native
  def textWithoutEncoding(phoneNumber: String): Unit = js.native
  def textWithoutEncoding(phoneNumber: String, body: String): Unit = js.native
  def textWithoutEncoding(phoneNumber: Null, body: String): Unit = js.native
  def web(): Unit = js.native
  def web(address: String): Unit = js.native
}

