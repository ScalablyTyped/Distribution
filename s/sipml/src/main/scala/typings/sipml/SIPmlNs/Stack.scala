package typings.sipml.SIPmlNs

import typings.sipml.SIPmlNs.StackNs.Configuration
import typings.sipml.SIPmlNs.StackNs.EventSubscriptionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SIPml.Stack")
@js.native
class Stack ()
  extends EventTarget[EventSubscriptionType, typings.sipml.SIPmlNs.StackNs.Event] {
  def this(configuration: Configuration) = this()
  def newSession(`type`: String): js.Any = js.native
  def newSession(`type`: String, configuration: typings.sipml.SIPmlNs.SessionNs.Configuration): js.Any = js.native
  def setConfiguration(configuration: Configuration): Double = js.native
  def start(): Double = js.native
  def stop(): Double = js.native
  def stop(timeout: Double): Double = js.native
}

