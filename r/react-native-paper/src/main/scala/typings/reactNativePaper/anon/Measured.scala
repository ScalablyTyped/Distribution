package typings.reactNativePaper.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Measured extends StObject {
  
  var height: Double
  
  var measured: Boolean
  
  var width: Double
}
object Measured {
  
  inline def apply(height: Double, measured: Boolean, width: Double): Measured = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], measured = measured.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Measured]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Measured] (val x: Self) extends AnyVal {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setMeasured(value: Boolean): Self = StObject.set(x, "measured", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
