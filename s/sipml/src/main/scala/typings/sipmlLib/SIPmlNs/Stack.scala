package typings
package sipmlLib.SIPmlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SIPml.Stack")
@js.native
class Stack ()
  extends EventTarget[sipmlLib.SIPmlNs.StackNs.EventSubscriptionType, sipmlLib.SIPmlNs.StackNs.Event] {
  def this(configuration: sipmlLib.SIPmlNs.StackNs.Configuration) = this()
  def newSession(`type`: java.lang.String): js.Any = js.native
  def newSession(`type`: java.lang.String, configuration: sipmlLib.SIPmlNs.SessionNs.Configuration): js.Any = js.native
  def setConfiguration(configuration: sipmlLib.SIPmlNs.StackNs.Configuration): scala.Double = js.native
  def start(): scala.Double = js.native
  def stop(): scala.Double = js.native
  def stop(timeout: scala.Double): scala.Double = js.native
}

