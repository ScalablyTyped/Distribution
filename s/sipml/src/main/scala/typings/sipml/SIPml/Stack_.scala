package typings.sipml.SIPml

import typings.sipml.SIPml.Session.Configuration
import typings.sipml.SIPml.Stack.EventSubscriptionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stack_
  extends EventTarget[EventSubscriptionType, typings.sipml.SIPml.Stack.Event] {
  def newSession(`type`: String): js.Any = js.native
  def newSession(`type`: String, configuration: Configuration): js.Any = js.native
  def setConfiguration(configuration: typings.sipml.SIPml.Stack.Configuration): Double = js.native
  def start(): Double = js.native
  def stop(): Double = js.native
  def stop(timeout: Double): Double = js.native
}

