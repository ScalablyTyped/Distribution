package typings
package sketchappLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSPath extends js.Object {
  var _class: sketchappLib.sketchappLibStrings.path | sketchappLib.sketchappLibStrings.shapePath | sketchappLib.sketchappLibStrings.rectangle | sketchappLib.sketchappLibStrings.oval | sketchappLib.sketchappLibStrings.triangle
  var frame: SketchMSRect
  var isClosed: scala.Boolean
  var layers: js.Array[SketchMSPath]
  var points: js.Array[SketchMSCurvePoint]
  var style: SketchMSStyle
}

object SketchMSPath {
  @scala.inline
  def apply(
    _class: sketchappLib.sketchappLibStrings.path | sketchappLib.sketchappLibStrings.shapePath | sketchappLib.sketchappLibStrings.rectangle | sketchappLib.sketchappLibStrings.oval | sketchappLib.sketchappLibStrings.triangle,
    frame: SketchMSRect,
    isClosed: scala.Boolean,
    layers: js.Array[SketchMSPath],
    points: js.Array[SketchMSCurvePoint],
    style: SketchMSStyle
  ): SketchMSPath = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], frame = frame, isClosed = isClosed, layers = layers, points = points, style = style)
  
    __obj.asInstanceOf[SketchMSPath]
  }
}

