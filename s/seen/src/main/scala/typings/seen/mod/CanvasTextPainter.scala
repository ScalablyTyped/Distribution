package typings.seen.mod

import typings.seen.AnonFont
import typings.std.CanvasRenderingContext2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("seen", "CanvasTextPainter")
@js.native
class CanvasTextPainter protected () extends js.Object {
  def this(ctx: CanvasRenderingContext2D) = this()
  def fillText(m: Matrix, text: String): this.type = js.native
  def fillText(m: Matrix, text: String, style: AnonFont): this.type = js.native
}

