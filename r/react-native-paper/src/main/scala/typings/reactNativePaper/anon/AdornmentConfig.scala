package typings.reactNativePaper.anon

import typings.reactNativePaper.reactNativePaperStrings.flat
import typings.reactNativePaper.reactNativePaperStrings.outlined
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdornmentConfig extends StObject {
  
  var adornmentConfig: js.Array[
    typings.reactNativePaper.libTypescriptComponentsTextInputAdornmentTypesMod.AdornmentConfig
  ]
  
  var inputOffset: js.UndefOr[Double] = js.undefined
  
  var leftAffixWidth: Double
  
  var mode: js.UndefOr[outlined | flat] = js.undefined
  
  var paddingHorizontal: js.UndefOr[Double | String] = js.undefined
  
  var rightAffixWidth: Double
}
object AdornmentConfig {
  
  inline def apply(
    adornmentConfig: js.Array[
      typings.reactNativePaper.libTypescriptComponentsTextInputAdornmentTypesMod.AdornmentConfig
    ],
    leftAffixWidth: Double,
    rightAffixWidth: Double
  ): AdornmentConfig = {
    val __obj = js.Dynamic.literal(adornmentConfig = adornmentConfig.asInstanceOf[js.Any], leftAffixWidth = leftAffixWidth.asInstanceOf[js.Any], rightAffixWidth = rightAffixWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdornmentConfig]
  }
  
  extension [Self <: AdornmentConfig](x: Self) {
    
    inline def setAdornmentConfig(
      value: js.Array[
          typings.reactNativePaper.libTypescriptComponentsTextInputAdornmentTypesMod.AdornmentConfig
        ]
    ): Self = StObject.set(x, "adornmentConfig", value.asInstanceOf[js.Any])
    
    inline def setAdornmentConfigVarargs(value: typings.reactNativePaper.libTypescriptComponentsTextInputAdornmentTypesMod.AdornmentConfig*): Self = StObject.set(x, "adornmentConfig", js.Array(value*))
    
    inline def setInputOffset(value: Double): Self = StObject.set(x, "inputOffset", value.asInstanceOf[js.Any])
    
    inline def setInputOffsetUndefined: Self = StObject.set(x, "inputOffset", js.undefined)
    
    inline def setLeftAffixWidth(value: Double): Self = StObject.set(x, "leftAffixWidth", value.asInstanceOf[js.Any])
    
    inline def setMode(value: outlined | flat): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setPaddingHorizontal(value: Double | String): Self = StObject.set(x, "paddingHorizontal", value.asInstanceOf[js.Any])
    
    inline def setPaddingHorizontalUndefined: Self = StObject.set(x, "paddingHorizontal", js.undefined)
    
    inline def setRightAffixWidth(value: Double): Self = StObject.set(x, "rightAffixWidth", value.asInstanceOf[js.Any])
  }
}
