package typings
package sketchappLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSCurvePoint extends js.Object {
  var _class: sketchappLib.sketchappLibStrings.curvePoint
  var cornerRadius: scala.Double
  var curveFrom: SketchMSPointString
  var curveMode: SketchMSCurveMode
  var curveTo: SketchMSPointString
  var hasCurveFrom: scala.Boolean
  var hasCurveTo: scala.Boolean
  var point: SketchMSPointString
}

object SketchMSCurvePoint {
  @scala.inline
  def apply(
    _class: sketchappLib.sketchappLibStrings.curvePoint,
    cornerRadius: scala.Double,
    curveFrom: SketchMSPointString,
    curveMode: SketchMSCurveMode,
    curveTo: SketchMSPointString,
    hasCurveFrom: scala.Boolean,
    hasCurveTo: scala.Boolean,
    point: SketchMSPointString
  ): SketchMSCurvePoint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_class")(_class)
    __obj.updateDynamic("cornerRadius")(cornerRadius)
    __obj.updateDynamic("curveFrom")(curveFrom)
    __obj.updateDynamic("curveMode")(curveMode)
    __obj.updateDynamic("curveTo")(curveTo)
    __obj.updateDynamic("hasCurveFrom")(hasCurveFrom)
    __obj.updateDynamic("hasCurveTo")(hasCurveTo)
    __obj.updateDynamic("point")(point)
    __obj.asInstanceOf[SketchMSCurvePoint]
  }
}

