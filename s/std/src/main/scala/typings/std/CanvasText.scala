package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanvasText extends js.Object {
  def fillText(text: java.lang.String, x: Double, y: Double): Unit = js.native
  def fillText(text: java.lang.String, x: Double, y: Double, maxWidth: Double): Unit = js.native
  def measureText(text: java.lang.String): TextMetrics = js.native
  def strokeText(text: java.lang.String, x: Double, y: Double): Unit = js.native
  def strokeText(text: java.lang.String, x: Double, y: Double, maxWidth: Double): Unit = js.native
}

