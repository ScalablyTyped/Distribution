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
  
  @scala.inline
  def apply(): MKSpinnerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MKSpinnerProperties]
  }
  
  @scala.inline
  implicit class MKSpinnerPropertiesMutableBuilder[Self <: MKSpinnerProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSpinnerAniDuration(value: Double): Self = StObject.set(x, "spinnerAniDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpinnerAniDurationUndefined: Self = StObject.set(x, "spinnerAniDuration", js.undefined)
    
    @scala.inline
    def setStrokeColor(value: String): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
    
    @scala.inline
    def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
  }
}
