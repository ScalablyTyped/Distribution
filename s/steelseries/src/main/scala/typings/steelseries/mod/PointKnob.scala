package typings.steelseries.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Pointer & Knob
trait PointKnob extends StObject {
  
  // Omit<> in Clock
  var knobStyle: js.UndefOr[KnobStyle] = js.undefined
  
  var knobType: js.UndefOr[KnobType] = js.undefined
  
  // Omit<> in Altimeter, WindDir
  var pointerColor: js.UndefOr[ColorDef] = js.undefined
  
  // Omit<> in Clock
  var pointerType: js.UndefOr[PointerType] = js.undefined
}
object PointKnob {
  
  inline def apply(): PointKnob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointKnob]
  }
  
  extension [Self <: PointKnob](x: Self) {
    
    inline def setKnobStyle(value: KnobStyle): Self = StObject.set(x, "knobStyle", value.asInstanceOf[js.Any])
    
    inline def setKnobStyleUndefined: Self = StObject.set(x, "knobStyle", js.undefined)
    
    inline def setKnobType(value: KnobType): Self = StObject.set(x, "knobType", value.asInstanceOf[js.Any])
    
    inline def setKnobTypeUndefined: Self = StObject.set(x, "knobType", js.undefined)
    
    inline def setPointerColor(value: ColorDef): Self = StObject.set(x, "pointerColor", value.asInstanceOf[js.Any])
    
    inline def setPointerColorUndefined: Self = StObject.set(x, "pointerColor", js.undefined)
    
    inline def setPointerType(value: PointerType): Self = StObject.set(x, "pointerType", value.asInstanceOf[js.Any])
    
    inline def setPointerTypeUndefined: Self = StObject.set(x, "pointerType", js.undefined)
  }
}
