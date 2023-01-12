package typings.reactNativePaper.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdornmentConfigArray extends StObject {
  
  var adornmentConfig: js.Array[
    typings.reactNativePaper.libTypescriptComponentsTextInputAdornmentTypesMod.AdornmentConfig
  ]
}
object AdornmentConfigArray {
  
  inline def apply(
    adornmentConfig: js.Array[
      typings.reactNativePaper.libTypescriptComponentsTextInputAdornmentTypesMod.AdornmentConfig
    ]
  ): AdornmentConfigArray = {
    val __obj = js.Dynamic.literal(adornmentConfig = adornmentConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdornmentConfigArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdornmentConfigArray] (val x: Self) extends AnyVal {
    
    inline def setAdornmentConfig(
      value: js.Array[
          typings.reactNativePaper.libTypescriptComponentsTextInputAdornmentTypesMod.AdornmentConfig
        ]
    ): Self = StObject.set(x, "adornmentConfig", value.asInstanceOf[js.Any])
    
    inline def setAdornmentConfigVarargs(value: typings.reactNativePaper.libTypescriptComponentsTextInputAdornmentTypesMod.AdornmentConfig*): Self = StObject.set(x, "adornmentConfig", js.Array(value*))
  }
}
