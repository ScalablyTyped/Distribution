package typings.reactBeautifulDnd.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropAnimation extends StObject {
  
  var curve: String
  
  var duration: Double
  
  var moveTo: Position
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var scale: js.UndefOr[Double] = js.undefined
}
object DropAnimation {
  
  inline def apply(curve: String, duration: Double, moveTo: Position): DropAnimation = {
    val __obj = js.Dynamic.literal(curve = curve.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], moveTo = moveTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropAnimation]
  }
  
  extension [Self <: DropAnimation](x: Self) {
    
    inline def setCurve(value: String): Self = StObject.set(x, "curve", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setMoveTo(value: Position): Self = StObject.set(x, "moveTo", value.asInstanceOf[js.Any])
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
  }
}
