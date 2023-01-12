package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PositionOptions extends StObject {
  
  /* standard dom */
  var enableHighAccuracy: js.UndefOr[scala.Boolean] = js.undefined
  
  /* standard dom */
  var maximumAge: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var timeout: js.UndefOr[Double] = js.undefined
}
object PositionOptions {
  
  inline def apply(): PositionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PositionOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PositionOptions] (val x: Self) extends AnyVal {
    
    inline def setEnableHighAccuracy(value: scala.Boolean): Self = StObject.set(x, "enableHighAccuracy", value.asInstanceOf[js.Any])
    
    inline def setEnableHighAccuracyUndefined: Self = StObject.set(x, "enableHighAccuracy", js.undefined)
    
    inline def setMaximumAge(value: Double): Self = StObject.set(x, "maximumAge", value.asInstanceOf[js.Any])
    
    inline def setMaximumAgeUndefined: Self = StObject.set(x, "maximumAge", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
