package typings
package sipmlLib.SIPmlNs.SessionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SIPml.Session.Call")
@js.native
class Call ()
  extends sipmlLib.SIPmlNs.Session {
  def acceptTransfer(): scala.Double = js.native
  def acceptTransfer(configuration: Configuration): scala.Double = js.native
  def call(to: java.lang.String): scala.Double = js.native
  def call(to: java.lang.String, configuration: Configuration): scala.Double = js.native
  def dtmf(): scala.Double = js.native
  def hangup(): scala.Double = js.native
  def hangup(configuration: Configuration): scala.Double = js.native
  def hold(): scala.Double = js.native
  def hold(configuration: Configuration): scala.Double = js.native
  def info(): scala.Double = js.native
  def rejectTransfer(): scala.Double = js.native
  def resume(): scala.Double = js.native
  def transfer(): scala.Double = js.native
}

