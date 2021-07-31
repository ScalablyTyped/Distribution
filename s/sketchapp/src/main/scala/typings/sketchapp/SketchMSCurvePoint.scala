package typings.sketchapp

import typings.sketchapp.sketchappStrings.curvePoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchMSCurvePoint extends StObject {
  
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
    cornerRadius: Double,
    curveFrom: SketchMSPointString,
    curveMode: SketchMSCurveMode,
    curveTo: SketchMSPointString,
    hasCurveFrom: Boolean,
    hasCurveTo: Boolean,
    point: SketchMSPointString
  ): SketchMSCurvePoint = {
    val __obj = js.Dynamic.literal(_class = "curvePoint", cornerRadius = cornerRadius.asInstanceOf[js.Any], curveFrom = curveFrom.asInstanceOf[js.Any], curveMode = curveMode.asInstanceOf[js.Any], curveTo = curveTo.asInstanceOf[js.Any], hasCurveFrom = hasCurveFrom.asInstanceOf[js.Any], hasCurveTo = hasCurveTo.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSCurvePoint]
  }
  
  @scala.inline
  implicit class SketchMSCurvePointMutableBuilder[Self <: SketchMSCurvePoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCornerRadius(value: Double): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurveFrom(value: SketchMSPointString): Self = StObject.set(x, "curveFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurveMode(value: SketchMSCurveMode): Self = StObject.set(x, "curveMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurveTo(value: SketchMSPointString): Self = StObject.set(x, "curveTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasCurveFrom(value: Boolean): Self = StObject.set(x, "hasCurveFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasCurveTo(value: Boolean): Self = StObject.set(x, "hasCurveTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoint(value: SketchMSPointString): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_class(value: curvePoint): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
