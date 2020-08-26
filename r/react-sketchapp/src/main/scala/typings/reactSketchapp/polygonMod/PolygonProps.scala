package typings.reactSketchapp.polygonMod

import typings.reactSketchapp.propsMod.ClipProps
import typings.reactSketchapp.propsMod.DefinationProps
import typings.reactSketchapp.propsMod.FillProps
import typings.reactSketchapp.propsMod.StrokeProps
import typings.reactSketchapp.propsMod.TransformProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolygonProps
  extends FillProps
     with StrokeProps
     with ClipProps
     with TransformProps
     with DefinationProps {
  var points: String = js.native
}

object PolygonProps {
  @scala.inline
  def apply(points: String): PolygonProps = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolygonProps]
  }
  @scala.inline
  implicit class PolygonPropsOps[Self <: PolygonProps] (val x: Self) extends AnyVal {
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
    def setPoints(value: String): Self = this.set("points", value.asInstanceOf[js.Any])
  }
  
}

