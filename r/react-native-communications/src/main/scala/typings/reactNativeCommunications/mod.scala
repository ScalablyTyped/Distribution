package typings.reactNativeCommunications

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-communications", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def email(): Unit = js.native
  def email(to: js.Array[String]): Unit = js.native
  def email(to: js.Array[String], cc: js.Array[String]): Unit = js.native
  def email(to: js.Array[String], cc: js.Array[String], bcc: js.Array[String]): Unit = js.native
  def email(to: js.Array[String], cc: js.Array[String], bcc: js.Array[String], subject: String): Unit = js.native
  def email(to: js.Array[String], cc: js.Array[String], bcc: js.Array[String], subject: String, body: String): Unit = js.native
  def email(to: js.Array[String], cc: js.Array[String], bcc: js.Array[String], subject: Null, body: String): Unit = js.native
  def email(to: js.Array[String], cc: js.Array[String], bcc: Null, subject: String): Unit = js.native
  def email(to: js.Array[String], cc: js.Array[String], bcc: Null, subject: String, body: String): Unit = js.native
  def email(to: js.Array[String], cc: js.Array[String], bcc: Null, subject: Null, body: String): Unit = js.native
  def email(to: js.Array[String], cc: Null, bcc: js.Array[String]): Unit = js.native
  def email(to: js.Array[String], cc: Null, bcc: js.Array[String], subject: String): Unit = js.native
  def email(to: js.Array[String], cc: Null, bcc: js.Array[String], subject: String, body: String): Unit = js.native
  def email(to: js.Array[String], cc: Null, bcc: js.Array[String], subject: Null, body: String): Unit = js.native
  def email(to: js.Array[String], cc: Null, bcc: Null, subject: String): Unit = js.native
  def email(to: js.Array[String], cc: Null, bcc: Null, subject: String, body: String): Unit = js.native
  def email(to: js.Array[String], cc: Null, bcc: Null, subject: Null, body: String): Unit = js.native
  def email(to: Null, cc: js.Array[String]): Unit = js.native
  def email(to: Null, cc: js.Array[String], bcc: js.Array[String]): Unit = js.native
  def email(to: Null, cc: js.Array[String], bcc: js.Array[String], subject: String): Unit = js.native
  def email(to: Null, cc: js.Array[String], bcc: js.Array[String], subject: String, body: String): Unit = js.native
  def email(to: Null, cc: js.Array[String], bcc: js.Array[String], subject: Null, body: String): Unit = js.native
  def email(to: Null, cc: js.Array[String], bcc: Null, subject: String): Unit = js.native
  def email(to: Null, cc: js.Array[String], bcc: Null, subject: String, body: String): Unit = js.native
  def email(to: Null, cc: js.Array[String], bcc: Null, subject: Null, body: String): Unit = js.native
  def email(to: Null, cc: Null, bcc: js.Array[String]): Unit = js.native
  def email(to: Null, cc: Null, bcc: js.Array[String], subject: String): Unit = js.native
  def email(to: Null, cc: Null, bcc: js.Array[String], subject: String, body: String): Unit = js.native
  def email(to: Null, cc: Null, bcc: js.Array[String], subject: Null, body: String): Unit = js.native
  def email(to: Null, cc: Null, bcc: Null, subject: String): Unit = js.native
  def email(to: Null, cc: Null, bcc: Null, subject: String, body: String): Unit = js.native
  def email(to: Null, cc: Null, bcc: Null, subject: Null, body: String): Unit = js.native
  
  def phonecall(phoneNumber: String, isPrompt: Boolean): Unit = js.native
  
  def text(): Unit = js.native
  def text(phoneNumber: js.UndefOr[scala.Nothing], body: String): Unit = js.native
  def text(phoneNumber: String): Unit = js.native
  def text(phoneNumber: String, body: String): Unit = js.native
  def text(phoneNumber: Null, body: String): Unit = js.native
  
  def textWithoutEncoding(): Unit = js.native
  def textWithoutEncoding(phoneNumber: js.UndefOr[scala.Nothing], body: String): Unit = js.native
  def textWithoutEncoding(phoneNumber: String): Unit = js.native
  def textWithoutEncoding(phoneNumber: String, body: String): Unit = js.native
  def textWithoutEncoding(phoneNumber: Null, body: String): Unit = js.native
  
  def web(): Unit = js.native
  def web(address: String): Unit = js.native
}
