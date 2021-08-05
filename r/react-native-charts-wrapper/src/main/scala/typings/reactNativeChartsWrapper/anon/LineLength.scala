package typings.reactNativeChartsWrapper.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineLength extends StObject {
  
  var lineLength: js.UndefOr[Double] = js.undefined
  
  var phase: js.UndefOr[Double] = js.undefined
  
  var spaceLength: js.UndefOr[Double] = js.undefined
}
object LineLength {
  
  inline def apply(): LineLength = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineLength]
  }
  
  extension [Self <: LineLength](x: Self) {
    
    inline def setLineLength(value: Double): Self = StObject.set(x, "lineLength", value.asInstanceOf[js.Any])
    
    inline def setLineLengthUndefined: Self = StObject.set(x, "lineLength", js.undefined)
    
    inline def setPhase(value: Double): Self = StObject.set(x, "phase", value.asInstanceOf[js.Any])
    
    inline def setPhaseUndefined: Self = StObject.set(x, "phase", js.undefined)
    
    inline def setSpaceLength(value: Double): Self = StObject.set(x, "spaceLength", value.asInstanceOf[js.Any])
    
    inline def setSpaceLengthUndefined: Self = StObject.set(x, "spaceLength", js.undefined)
  }
}
