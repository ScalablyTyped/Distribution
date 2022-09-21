package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LockOptions extends StObject {
  
  /* standard dom */
  var ifAvailable: js.UndefOr[scala.Boolean] = js.undefined
  
  /* standard dom */
  var mode: js.UndefOr[LockMode] = js.undefined
  
  /* standard dom */
  var signal: js.UndefOr[AbortSignal] = js.undefined
  
  /* standard dom */
  var steal: js.UndefOr[scala.Boolean] = js.undefined
}
object LockOptions {
  
  inline def apply(): LockOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LockOptions]
  }
  
  extension [Self <: LockOptions](x: Self) {
    
    inline def setIfAvailable(value: scala.Boolean): Self = StObject.set(x, "ifAvailable", value.asInstanceOf[js.Any])
    
    inline def setIfAvailableUndefined: Self = StObject.set(x, "ifAvailable", js.undefined)
    
    inline def setMode(value: LockMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    
    inline def setSteal(value: scala.Boolean): Self = StObject.set(x, "steal", value.asInstanceOf[js.Any])
    
    inline def setStealUndefined: Self = StObject.set(x, "steal", js.undefined)
  }
}
