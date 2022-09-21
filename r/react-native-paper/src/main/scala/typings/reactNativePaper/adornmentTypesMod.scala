package typings.reactNativePaper

import typings.reactNativePaper.anon.PaddingLeft
import typings.reactNativePaper.enumsMod.AdornmentSide
import typings.reactNativePaper.enumsMod.AdornmentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adornmentTypesMod {
  
  trait AdornmentConfig extends StObject {
    
    var side: AdornmentSide
    
    var `type`: AdornmentType
  }
  object AdornmentConfig {
    
    inline def apply(side: AdornmentSide, `type`: AdornmentType): AdornmentConfig = {
      val __obj = js.Dynamic.literal(side = side.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AdornmentConfig]
    }
    
    extension [Self <: AdornmentConfig](x: Self) {
      
      inline def setSide(value: AdornmentSide): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
      
      inline def setType(value: AdornmentType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait AdornmentStyleAdjustmentForNativeInput extends StObject {
    
    var adornmentStyleAdjustmentForNativeInput: js.Array[PaddingLeft | js.Object]
  }
  object AdornmentStyleAdjustmentForNativeInput {
    
    inline def apply(adornmentStyleAdjustmentForNativeInput: js.Array[PaddingLeft | js.Object]): AdornmentStyleAdjustmentForNativeInput = {
      val __obj = js.Dynamic.literal(adornmentStyleAdjustmentForNativeInput = adornmentStyleAdjustmentForNativeInput.asInstanceOf[js.Any])
      __obj.asInstanceOf[AdornmentStyleAdjustmentForNativeInput]
    }
    
    extension [Self <: AdornmentStyleAdjustmentForNativeInput](x: Self) {
      
      inline def setAdornmentStyleAdjustmentForNativeInput(value: js.Array[PaddingLeft | js.Object]): Self = StObject.set(x, "adornmentStyleAdjustmentForNativeInput", value.asInstanceOf[js.Any])
      
      inline def setAdornmentStyleAdjustmentForNativeInputVarargs(value: (PaddingLeft | js.Object)*): Self = StObject.set(x, "adornmentStyleAdjustmentForNativeInput", js.Array(value*))
    }
  }
}
