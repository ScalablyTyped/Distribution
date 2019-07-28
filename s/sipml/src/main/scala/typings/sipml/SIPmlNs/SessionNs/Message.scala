package typings.sipml.SIPmlNs.SessionNs

import typings.sipml.SIPmlNs.Session
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SIPml.Session.Message")
@js.native
class Message () extends Session {
  def send(to: String): Double = js.native
  def send(to: String, content: js.Any): Double = js.native
  def send(to: String, content: js.Any, contentType: String): Double = js.native
  def send(to: String, content: js.Any, contentType: String, configuration: Configuration): Double = js.native
}

