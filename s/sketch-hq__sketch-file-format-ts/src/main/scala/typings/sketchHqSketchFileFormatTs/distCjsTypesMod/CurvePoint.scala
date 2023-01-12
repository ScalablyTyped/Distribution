package typings.sketchHqSketchFileFormatTs.distCjsTypesMod

import typings.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsStrings.curvePoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CurvePoint
  extends StObject
     with AnyObject {
  
  var _class: curvePoint
  
  var cornerRadius: Double
  
  var cornerStyle: CornerStyle
  
  var curveFrom: PointString
  
  var curveMode: CurveMode
  
  var curveTo: PointString
  
  var hasCurveFrom: Boolean
  
  var hasCurveTo: Boolean
  
  var point: PointString
}
object CurvePoint {
  
  inline def apply(
    cornerRadius: Double,
    cornerStyle: CornerStyle,
    curveFrom: PointString,
    curveMode: CurveMode,
    curveTo: PointString,
    hasCurveFrom: Boolean,
    hasCurveTo: Boolean,
    point: PointString
  ): CurvePoint = {
    val __obj = js.Dynamic.literal(_class = "curvePoint", cornerRadius = cornerRadius.asInstanceOf[js.Any], cornerStyle = cornerStyle.asInstanceOf[js.Any], curveFrom = curveFrom.asInstanceOf[js.Any], curveMode = curveMode.asInstanceOf[js.Any], curveTo = curveTo.asInstanceOf[js.Any], hasCurveFrom = hasCurveFrom.asInstanceOf[js.Any], hasCurveTo = hasCurveTo.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurvePoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CurvePoint] (val x: Self) extends AnyVal {
    
    inline def setCornerRadius(value: Double): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
    
    inline def setCornerStyle(value: CornerStyle): Self = StObject.set(x, "cornerStyle", value.asInstanceOf[js.Any])
    
    inline def setCurveFrom(value: PointString): Self = StObject.set(x, "curveFrom", value.asInstanceOf[js.Any])
    
    inline def setCurveMode(value: CurveMode): Self = StObject.set(x, "curveMode", value.asInstanceOf[js.Any])
    
    inline def setCurveTo(value: PointString): Self = StObject.set(x, "curveTo", value.asInstanceOf[js.Any])
    
    inline def setHasCurveFrom(value: Boolean): Self = StObject.set(x, "hasCurveFrom", value.asInstanceOf[js.Any])
    
    inline def setHasCurveTo(value: Boolean): Self = StObject.set(x, "hasCurveTo", value.asInstanceOf[js.Any])
    
    inline def setPoint(value: PointString): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    inline def set_class(value: curvePoint): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
