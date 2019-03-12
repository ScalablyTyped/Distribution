package typings
package reactDashMapDashGlLib.reactDashMapDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasRedrawOptions extends HTMLRedrawOptions {
  var ctx: stdLib.CanvasRenderingContext2D
}

object CanvasRedrawOptions {
  @scala.inline
  def apply(
    ctx: stdLib.CanvasRenderingContext2D,
    height: scala.Double,
    project: js.Array[scala.Double] => js.Array[scala.Double],
    unproject: js.Array[scala.Double] => js.Array[scala.Double],
    width: scala.Double
  ): CanvasRedrawOptions = {
    val __obj = js.Dynamic.literal(ctx = ctx, height = height, project = js.Any.fromFunction1(project), unproject = js.Any.fromFunction1(unproject), width = width)
  
    __obj.asInstanceOf[CanvasRedrawOptions]
  }
}

