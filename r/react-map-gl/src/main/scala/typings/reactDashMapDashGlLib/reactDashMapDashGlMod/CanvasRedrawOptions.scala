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
    project: js.Function1[js.Array[scala.Double], js.Array[scala.Double]],
    unproject: js.Function1[js.Array[scala.Double], js.Array[scala.Double]],
    width: scala.Double
  ): CanvasRedrawOptions = {
    val __obj = js.Dynamic.literal(ctx = ctx, height = height, project = project, unproject = unproject, width = width)
  
    __obj.asInstanceOf[CanvasRedrawOptions]
  }
}

