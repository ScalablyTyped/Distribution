package typings.sketchapp

import typings.sketchapp.anon.X
import typings.sketchapp.sketchappStrings.gradient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SketchMSGradient extends StObject {
  
  var _class: gradient = js.native
  
  var elipseLength: Double = js.native
  
  var from: X = js.native
  
  var gradientType: Double = js.native
  
  var shouldSmoothenOpacity: Boolean = js.native
  
  var stops: js.Array[SketchMSGradientStop] = js.native
  
  var to: X = js.native
}
object SketchMSGradient {
  
  @scala.inline
  def apply(
    _class: gradient,
    elipseLength: Double,
    from: X,
    gradientType: Double,
    shouldSmoothenOpacity: Boolean,
    stops: js.Array[SketchMSGradientStop],
    to: X
  ): SketchMSGradient = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], elipseLength = elipseLength.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], gradientType = gradientType.asInstanceOf[js.Any], shouldSmoothenOpacity = shouldSmoothenOpacity.asInstanceOf[js.Any], stops = stops.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
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
