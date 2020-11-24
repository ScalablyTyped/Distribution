package typings.sketchapp

import typings.sketchapp.sketchappStrings.curvePoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SketchMSCurvePoint extends js.Object {
  
  var _class: curvePoint = js.native
  
  var cornerRadius: Double = js.native
  
  var curveFrom: SketchMSPointString = js.native
  
  var curveMode: SketchMSCurveMode = js.native
  
  var curveTo: SketchMSPointString = js.native
  
  var hasCurveFrom: Boolean = js.native
  
  var hasCurveTo: Boolean = js.native
  
  var point: SketchMSPointString = js.native
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
  
  @scala.inline
  implicit class SketchMSCurvePointOps[Self <: SketchMSCurvePoint] (val x: Self) extends AnyVal {
    
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
    def set_class(value: curvePoint): Self = this.set("_class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCornerRadius(value: Double): Self = this.set("cornerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurveFrom(value: SketchMSPointString): Self = this.set("curveFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurveMode(value: SketchMSCurveMode): Self = this.set("curveMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurveTo(value: SketchMSPointString): Self = this.set("curveTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasCurveFrom(value: Boolean): Self = this.set("hasCurveFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasCurveTo(value: Boolean): Self = this.set("hasCurveTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoint(value: SketchMSPointString): Self = this.set("point", value.asInstanceOf[js.Any])
  }
}
