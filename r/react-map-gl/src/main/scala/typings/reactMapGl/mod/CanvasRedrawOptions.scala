package typings.reactMapGl.mod

import typings.std.CanvasRenderingContext2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanvasRedrawOptions extends HTMLRedrawOptions {
  
  var ctx: CanvasRenderingContext2D = js.native
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
  
  @scala.inline
  implicit class CanvasRedrawOptionsOps[Self <: CanvasRedrawOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCtx(value: CanvasRenderingContext2D): Self = this.set("ctx", value.asInstanceOf[js.Any])
  }
}
