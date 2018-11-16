package typings
package reactDashNativeDashCommunicationsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-communications", JSImport.Namespace)
@js.native
object reactDashNativeDashCommunicationsMod extends js.Object {
  def email(): scala.Unit = js.native
  def email(to: js.Array[java.lang.String]): scala.Unit = js.native
  def email(to: js.Array[java.lang.String], cc: js.Array[java.lang.String]): scala.Unit = js.native
  def email(to: js.Array[java.lang.String], cc: js.Array[java.lang.String], bcc: js.Array[java.lang.String]): scala.Unit = js.native
  def email(
    to: js.Array[java.lang.String],
    cc: js.Array[java.lang.String],
    bcc: js.Array[java.lang.String],
    subject: java.lang.String
  ): scala.Unit = js.native
  def email(
    to: js.Array[java.lang.String],
    cc: js.Array[java.lang.String],
    bcc: js.Array[java.lang.String],
    subject: java.lang.String,
    body: java.lang.String
  ): scala.Unit = js.native
  def phonecall(phoneNumber: java.lang.String, isPrompt: scala.Boolean): scala.Unit = js.native
  def text(): scala.Unit = js.native
  def text(phoneNumber: java.lang.String): scala.Unit = js.native
  def text(phoneNumber: java.lang.String, body: java.lang.String): scala.Unit = js.native
  def text(phoneNumber: scala.Null, body: java.lang.String): scala.Unit = js.native
  def textWithoutEncoding(): scala.Unit = js.native
  def textWithoutEncoding(phoneNumber: java.lang.String): scala.Unit = js.native
  def textWithoutEncoding(phoneNumber: java.lang.String, body: java.lang.String): scala.Unit = js.native
  def textWithoutEncoding(phoneNumber: scala.Null, body: java.lang.String): scala.Unit = js.native
  def web(): scala.Unit = js.native
  def web(address: java.lang.String): scala.Unit = js.native
}

