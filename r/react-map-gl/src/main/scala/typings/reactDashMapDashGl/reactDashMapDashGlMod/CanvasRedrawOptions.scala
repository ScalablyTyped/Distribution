package typings.reactDashMapDashGl.reactDashMapDashGlMod

import typings.std.CanvasRenderingContext2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasRedrawOptions extends HTMLRedrawOptions {
  var ctx: CanvasRenderingContext2D
}

object CanvasRedrawOptions {
  @scala.inline
  def apply(
    ctx: CanvasRenderingContext2D,
    height: Double,
    project: js.Array[Double] => js.Array[Double],
    unproject: js.Array[Double] => js.Array[Double],
    width: Double
  ): CanvasRedrawOptions = {
    val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], project = js.Any.fromFunction1(project), unproject = js.Any.fromFunction1(unproject), width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CanvasRedrawOptions]
  }
}

