package typings.socketclusterClient.libClientsocketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoReconnectOptions extends StObject {
  
  var initialDelay: js.UndefOr[Double] = js.undefined
  
  var maxDelay: js.UndefOr[Double] = js.undefined
  
  var multiplier: js.UndefOr[Double] = js.undefined
  
  var randomness: js.UndefOr[Double] = js.undefined
}
object AutoReconnectOptions {
  
  inline def apply(): AutoReconnectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoReconnectOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutoReconnectOptions] (val x: Self) extends AnyVal {
    
    inline def setInitialDelay(value: Double): Self = StObject.set(x, "initialDelay", value.asInstanceOf[js.Any])
    
    inline def setInitialDelayUndefined: Self = StObject.set(x, "initialDelay", js.undefined)
    
    inline def setMaxDelay(value: Double): Self = StObject.set(x, "maxDelay", value.asInstanceOf[js.Any])
    
    inline def setMaxDelayUndefined: Self = StObject.set(x, "maxDelay", js.undefined)
    
    inline def setMultiplier(value: Double): Self = StObject.set(x, "multiplier", value.asInstanceOf[js.Any])
    
    inline def setMultiplierUndefined: Self = StObject.set(x, "multiplier", js.undefined)
    
    inline def setRandomness(value: Double): Self = StObject.set(x, "randomness", value.asInstanceOf[js.Any])
    
    inline def setRandomnessUndefined: Self = StObject.set(x, "randomness", js.undefined)
  }
}
