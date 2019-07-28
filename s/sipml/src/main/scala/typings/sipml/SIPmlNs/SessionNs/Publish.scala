package typings.sipml.SIPmlNs.SessionNs

import typings.sipml.SIPmlNs.Session
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SIPml.Session.Publish")
@js.native
class Publish () extends Session {
  def publish(): Double = js.native
  def publish(content: js.Any): Double = js.native
  def publish(content: js.Any, contentType: String): Double = js.native
  def publish(content: js.Any, contentType: String, configuration: Configuration): Double = js.native
  def unpublish(): Unit = js.native
  def unpublish(configuration: Configuration): Unit = js.native
}

