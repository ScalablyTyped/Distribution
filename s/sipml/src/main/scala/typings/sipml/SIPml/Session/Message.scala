package typings.sipml.SIPml.Session

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Message
  extends typings.sipml.SIPml.Session {
  def send(to: String): Double = js.native
  def send(
    to: String,
    content: js.UndefOr[scala.Nothing],
    contentType: js.UndefOr[scala.Nothing],
    configuration: Configuration
  ): Double = js.native
  def send(to: String, content: js.UndefOr[scala.Nothing], contentType: String): Double = js.native
  def send(to: String, content: js.UndefOr[scala.Nothing], contentType: String, configuration: Configuration): Double = js.native
  def send(to: String, content: js.Any): Double = js.native
  def send(to: String, content: js.Any, contentType: js.UndefOr[scala.Nothing], configuration: Configuration): Double = js.native
  def send(to: String, content: js.Any, contentType: String): Double = js.native
  def send(to: String, content: js.Any, contentType: String, configuration: Configuration): Double = js.native
}

