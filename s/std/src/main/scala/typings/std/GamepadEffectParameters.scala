package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GamepadEffectParameters extends StObject {
  
  /* standard dom */
  var duration: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var startDelay: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var strongMagnitude: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var weakMagnitude: js.UndefOr[Double] = js.undefined
}
object GamepadEffectParameters {
  
  inline def apply(): GamepadEffectParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GamepadEffectParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GamepadEffectParameters] (val x: Self) extends AnyVal {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setStartDelay(value: Double): Self = StObject.set(x, "startDelay", value.asInstanceOf[js.Any])
    
    inline def setStartDelayUndefined: Self = StObject.set(x, "startDelay", js.undefined)
    
    inline def setStrongMagnitude(value: Double): Self = StObject.set(x, "strongMagnitude", value.asInstanceOf[js.Any])
    
    inline def setStrongMagnitudeUndefined: Self = StObject.set(x, "strongMagnitude", js.undefined)
    
    inline def setWeakMagnitude(value: Double): Self = StObject.set(x, "weakMagnitude", value.asInstanceOf[js.Any])
    
    inline def setWeakMagnitudeUndefined: Self = StObject.set(x, "weakMagnitude", js.undefined)
  }
}
