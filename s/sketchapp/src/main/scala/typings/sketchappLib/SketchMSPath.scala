package typings
package sketchappLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSPath extends js.Object {
  var _class: sketchappLib.sketchappLibStrings.path
  var isClosed: scala.Boolean
  var points: js.Array[SketchMSCurvePoint]
}

object SketchMSPath {
  @scala.inline
  def apply(
    _class: sketchappLib.sketchappLibStrings.path,
    isClosed: scala.Boolean,
    points: js.Array[SketchMSCurvePoint]
  ): SketchMSPath = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_class")(_class)
    __obj.updateDynamic("isClosed")(isClosed)
    __obj.updateDynamic("points")(points)
    __obj.asInstanceOf[SketchMSPath]
  }
}

