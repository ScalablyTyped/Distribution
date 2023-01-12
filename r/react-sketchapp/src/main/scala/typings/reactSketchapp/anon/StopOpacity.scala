package typings.reactSketchapp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopOpacity extends StObject {
  
  var stopColor: String
  
  var stopOpacity: Double
}
object StopOpacity {
  
  inline def apply(stopColor: String, stopOpacity: Double): StopOpacity = {
    val __obj = js.Dynamic.literal(stopColor = stopColor.asInstanceOf[js.Any], stopOpacity = stopOpacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopOpacity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StopOpacity] (val x: Self) extends AnyVal {
    
    inline def setStopColor(value: String): Self = StObject.set(x, "stopColor", value.asInstanceOf[js.Any])
    
    inline def setStopOpacity(value: Double): Self = StObject.set(x, "stopOpacity", value.asInstanceOf[js.Any])
  }
}
