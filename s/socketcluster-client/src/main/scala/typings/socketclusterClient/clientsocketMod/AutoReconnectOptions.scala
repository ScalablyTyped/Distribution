package typings.socketclusterClient.clientsocketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoReconnectOptions extends StObject {
  
  var initialDelay: js.UndefOr[Double] = js.native
  
  var maxDelay: js.UndefOr[Double] = js.native
  
  var multiplier: js.UndefOr[Double] = js.native
  
  var randomness: js.UndefOr[Double] = js.native
}
object AutoReconnectOptions {
  
  @scala.inline
  def apply(): AutoReconnectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoReconnectOptions]
  }
  
  @scala.inline
  implicit class AutoReconnectOptionsMutableBuilder[Self <: AutoReconnectOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInitialDelay(value: Double): Self = StObject.set(x, "initialDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialDelayUndefined: Self = StObject.set(x, "initialDelay", js.undefined)
    
    @scala.inline
    def setMaxDelay(value: Double): Self = StObject.set(x, "maxDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDelayUndefined: Self = StObject.set(x, "maxDelay", js.undefined)
    
    @scala.inline
    def setMultiplier(value: Double): Self = StObject.set(x, "multiplier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiplierUndefined: Self = StObject.set(x, "multiplier", js.undefined)
    
    @scala.inline
    def setRandomness(value: Double): Self = StObject.set(x, "randomness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRandomnessUndefined: Self = StObject.set(x, "randomness", js.undefined)
  }
}
