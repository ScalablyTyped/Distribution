package typings.sketchHqSketchFileFormatTs.distCjsTypesMod

import typings.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsStrings.gradient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Gradient
  extends StObject
     with AnyObject {
  
  var _class: gradient
  
  var elipseLength: Double
  
  var from: PointString
  
  var gradientType: GradientType
  
  var stops: js.Array[GradientStop]
  
  var to: PointString
}
object Gradient {
  
  inline def apply(
    elipseLength: Double,
    from: PointString,
    gradientType: GradientType,
    stops: js.Array[GradientStop],
    to: PointString
  ): Gradient = {
    val __obj = js.Dynamic.literal(_class = "gradient", elipseLength = elipseLength.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], gradientType = gradientType.asInstanceOf[js.Any], stops = stops.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gradient]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Gradient] (val x: Self) extends AnyVal {
    
    inline def setElipseLength(value: Double): Self = StObject.set(x, "elipseLength", value.asInstanceOf[js.Any])
    
    inline def setFrom(value: PointString): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setGradientType(value: GradientType): Self = StObject.set(x, "gradientType", value.asInstanceOf[js.Any])
    
    inline def setStops(value: js.Array[GradientStop]): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
    
    inline def setStopsVarargs(value: GradientStop*): Self = StObject.set(x, "stops", js.Array(value*))
    
    inline def setTo(value: PointString): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def set_class(value: gradient): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
