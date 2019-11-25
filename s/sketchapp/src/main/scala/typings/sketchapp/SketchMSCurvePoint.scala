package typings.sketchapp

import typings.sketchapp.sketchappStrings.curvePoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSCurvePoint extends js.Object {
  var _class: curvePoint
  var cornerRadius: Double
  var curveFrom: SketchMSPointString
  var curveMode: SketchMSCurveMode
  var curveTo: SketchMSPointString
  var hasCurveFrom: Boolean
  var hasCurveTo: Boolean
  var point: SketchMSPointString
}

object SketchMSCurvePoint {
  @scala.inline
  def apply(
    _class: curvePoint,
    cornerRadius: Double,
    curveFrom: SketchMSPointString,
    curveMode: SketchMSCurveMode,
    curveTo: SketchMSPointString,
    hasCurveFrom: Boolean,
    hasCurveTo: Boolean,
    point: SketchMSPointString
  ): SketchMSCurvePoint = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], cornerRadius = cornerRadius.asInstanceOf[js.Any], curveFrom = curveFrom.asInstanceOf[js.Any], curveMode = curveMode.asInstanceOf[js.Any], curveTo = curveTo.asInstanceOf[js.Any], hasCurveFrom = hasCurveFrom.asInstanceOf[js.Any], hasCurveTo = hasCurveTo.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SketchMSCurvePoint]
  }
}

