package typings.reactNativeMaterialKit.mod

import typings.reactNative.mod.ViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MKSpinnerProperties
  extends StObject
     with ViewProps {
  
  var spinnerAniDuration: js.UndefOr[Double] = js.undefined
  
  var strokeColor: js.UndefOr[String] = js.undefined
  
  var strokeWidth: js.UndefOr[Double] = js.undefined
}
object MKSpinnerProperties {
  
  inline def apply(): MKSpinnerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MKSpinnerProperties]
  }
  
  extension [Self <: MKSpinnerProperties](x: Self) {
    
    inline def setSpinnerAniDuration(value: Double): Self = StObject.set(x, "spinnerAniDuration", value.asInstanceOf[js.Any])
    
    inline def setSpinnerAniDurationUndefined: Self = StObject.set(x, "spinnerAniDuration", js.undefined)
    
    inline def setStrokeColor(value: String): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
    
    inline def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
    
    inline def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
    
    inline def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
  }
}
