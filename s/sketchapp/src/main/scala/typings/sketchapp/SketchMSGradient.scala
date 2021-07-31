package typings.sketchapp

import typings.sketchapp.anon.X
import typings.sketchapp.sketchappStrings.gradient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchMSGradient extends StObject {
  
  var _class: gradient
  
  var elipseLength: Double
  
  var from: X
  
  var gradientType: Double
  
  var shouldSmoothenOpacity: Boolean
  
  var stops: js.Array[SketchMSGradientStop]
  
  var to: X
}
object SketchMSGradient {
  
  @scala.inline
  def apply(
    elipseLength: Double,
    from: X,
    gradientType: Double,
    shouldSmoothenOpacity: Boolean,
    stops: js.Array[SketchMSGradientStop],
    to: X
  ): SketchMSGradient = {
    val __obj = js.Dynamic.literal(_class = "gradient", elipseLength = elipseLength.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], gradientType = gradientType.asInstanceOf[js.Any], shouldSmoothenOpacity = shouldSmoothenOpacity.asInstanceOf[js.Any], stops = stops.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSGradient]
  }
  
  @scala.inline
  implicit class SketchMSGradientMutableBuilder[Self <: SketchMSGradient] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElipseLength(value: Double): Self = StObject.set(x, "elipseLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrom(value: X): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradientType(value: Double): Self = StObject.set(x, "gradientType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShouldSmoothenOpacity(value: Boolean): Self = StObject.set(x, "shouldSmoothenOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStops(value: js.Array[SketchMSGradientStop]): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopsVarargs(value: SketchMSGradientStop*): Self = StObject.set(x, "stops", js.Array(value :_*))
    
    @scala.inline
    def setTo(value: X): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_class(value: gradient): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
