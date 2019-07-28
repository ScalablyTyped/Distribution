package typings.seen.seenMod

import typings.seen.Anon_FillFont
import typings.std.CanvasRenderingContext2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("seen", "CanvasTextPainter")
@js.native
class CanvasTextPainter protected () extends js.Object {
  def this(ctx: CanvasRenderingContext2D) = this()
  def fillText(m: Matrix, text: String): this.type = js.native
  def fillText(m: Matrix, text: String, style: Anon_FillFont): this.type = js.native
}

