package typings.sipml.SIPml.Session

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Publish
  extends typings.sipml.SIPml.Session {
  def publish(): Double = js.native
  def publish(
    content: js.UndefOr[scala.Nothing],
    contentType: js.UndefOr[scala.Nothing],
    configuration: Configuration
  ): Double = js.native
  def publish(content: js.UndefOr[scala.Nothing], contentType: String): Double = js.native
  def publish(content: js.UndefOr[scala.Nothing], contentType: String, configuration: Configuration): Double = js.native
  def publish(content: js.Any): Double = js.native
  def publish(content: js.Any, contentType: js.UndefOr[scala.Nothing], configuration: Configuration): Double = js.native
  def publish(content: js.Any, contentType: String): Double = js.native
  def publish(content: js.Any, contentType: String, configuration: Configuration): Double = js.native
  def unpublish(): Unit = js.native
  def unpublish(configuration: Configuration): Unit = js.native
}

