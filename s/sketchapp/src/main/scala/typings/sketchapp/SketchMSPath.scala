package typings.sketchapp

import typings.sketchapp.sketchappStrings.oval
import typings.sketchapp.sketchappStrings.path
import typings.sketchapp.sketchappStrings.rectangle
import typings.sketchapp.sketchappStrings.shapePath
import typings.sketchapp.sketchappStrings.triangle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSPath extends js.Object {
  var _class: path | shapePath | rectangle | oval | triangle
  var frame: SketchMSRect
  var isClosed: Boolean
  var layers: js.Array[SketchMSPath]
  var points: js.Array[SketchMSCurvePoint]
  var style: SketchMSStyle
}

object SketchMSPath {
  @scala.inline
  def apply(
    _class: path | shapePath | rectangle | oval | triangle,
    frame: SketchMSRect,
    isClosed: Boolean,
    layers: js.Array[SketchMSPath],
    points: js.Array[SketchMSCurvePoint],
    style: SketchMSStyle
  ): SketchMSPath = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], frame = frame, isClosed = isClosed, layers = layers, points = points, style = style)
  
    __obj.asInstanceOf[SketchMSPath]
  }
}

