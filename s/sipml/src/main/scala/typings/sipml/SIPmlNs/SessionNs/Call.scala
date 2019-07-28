package typings.sipml.SIPmlNs.SessionNs

import typings.sipml.SIPmlNs.Session
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SIPml.Session.Call")
@js.native
class Call () extends Session {
  def acceptTransfer(): Double = js.native
  def acceptTransfer(configuration: Configuration): Double = js.native
  def call(to: String): Double = js.native
  def call(to: String, configuration: Configuration): Double = js.native
  def dtmf(): Double = js.native
  def hangup(): Double = js.native
  def hangup(configuration: Configuration): Double = js.native
  def hold(): Double = js.native
  def hold(configuration: Configuration): Double = js.native
  def info(): Double = js.native
  def rejectTransfer(): Double = js.native
  def resume(): Double = js.native
  def transfer(): Double = js.native
}

