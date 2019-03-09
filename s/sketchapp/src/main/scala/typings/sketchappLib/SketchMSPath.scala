package typings
package sketchappLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSPath extends js.Object {
  var _class: sketchappLib.sketchappLibStrings.path | sketchappLib.sketchappLibStrings.shapePath | sketchappLib.sketchappLibStrings.rectangle | sketchappLib.sketchappLibStrings.oval | sketchappLib.sketchappLibStrings.triangle
  var isClosed: js.UndefOr[scala.Boolean] = js.undefined
  var points: js.Array[SketchMSCurvePoint]
}

object SketchMSPath {
  @scala.inline
  def apply(
    _class: sketchappLib.sketchappLibStrings.path | sketchappLib.sketchappLibStrings.shapePath | sketchappLib.sketchappLibStrings.rectangle | sketchappLib.sketchappLibStrings.oval | sketchappLib.sketchappLibStrings.triangle,
    points: js.Array[SketchMSCurvePoint],
    isClosed: js.UndefOr[scala.Boolean] = js.undefined
  ): SketchMSPath = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], points = points)
    if (!js.isUndefined(isClosed)) __obj.updateDynamic("isClosed")(isClosed)
    __obj.asInstanceOf[SketchMSPath]
  }
}

