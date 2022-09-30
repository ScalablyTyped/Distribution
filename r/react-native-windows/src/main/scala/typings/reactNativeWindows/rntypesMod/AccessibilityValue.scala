package typings.reactNativeWindows.rntypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessibilityValue extends StObject {
  
  /**
    * The maximum value of this component's range. (should be an integer)
    */
  var max: js.UndefOr[Double] = js.undefined
  
  /**
    * The minimum value of this component's range. (should be an integer)
    */
  var min: js.UndefOr[Double] = js.undefined
  
  /**
    * The current value of this component's range. (should be an integer)
    */
  var now: js.UndefOr[Double] = js.undefined
  
  /**
    * A textual description of this component's value. (will override minimum, current, and maximum if set)
    */
  var text: js.UndefOr[String] = js.undefined
}
object AccessibilityValue {
  
  inline def apply(): AccessibilityValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessibilityValue]
  }
  
  extension [Self <: AccessibilityValue](x: Self) {
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setNow(value: Double): Self = StObject.set(x, "now", value.asInstanceOf[js.Any])
    
    inline def setNowUndefined: Self = StObject.set(x, "now", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
