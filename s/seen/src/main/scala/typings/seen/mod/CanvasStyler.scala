package typings.seen.mod

import typings.seen.anon.Fill
import typings.seen.anon.Stroke
import typings.std.CanvasRenderingContext2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("seen", "CanvasStyler")
@js.native
class CanvasStyler protected () extends js.Object {
  def this(ctx: CanvasRenderingContext2D) = this()
  def draw(): this.type = js.native
  def draw(style: Stroke): this.type = js.native
  def fill(): this.type = js.native
  def fill(style: Fill): this.type = js.native
}

