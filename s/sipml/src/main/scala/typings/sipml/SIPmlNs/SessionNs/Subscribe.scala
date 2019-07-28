package typings.sipml.SIPmlNs.SessionNs

import typings.sipml.SIPmlNs.Session
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SIPml.Session.Subscribe")
@js.native
class Subscribe () extends Session {
  def subscribe(to: String): Double = js.native
  def subscribe(to: String, configuration: Configuration): Double = js.native
  def unsubscribe(): Double = js.native
  def unsubscribe(configuration: Configuration): Double = js.native
}

