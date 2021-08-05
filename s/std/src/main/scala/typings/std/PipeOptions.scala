package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipeOptions extends StObject {
  
  var preventAbort: js.UndefOr[scala.Boolean] = js.undefined
  
  var preventCancel: js.UndefOr[scala.Boolean] = js.undefined
  
  var preventClose: js.UndefOr[scala.Boolean] = js.undefined
  
  var signal: js.UndefOr[AbortSignal] = js.undefined
}
object PipeOptions {
  
  inline def apply(): PipeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PipeOptions]
  }
  
  extension [Self <: PipeOptions](x: Self) {
    
    inline def setPreventAbort(value: scala.Boolean): Self = StObject.set(x, "preventAbort", value.asInstanceOf[js.Any])
    
    inline def setPreventAbortUndefined: Self = StObject.set(x, "preventAbort", js.undefined)
    
    inline def setPreventCancel(value: scala.Boolean): Self = StObject.set(x, "preventCancel", value.asInstanceOf[js.Any])
    
    inline def setPreventCancelUndefined: Self = StObject.set(x, "preventCancel", js.undefined)
    
    inline def setPreventClose(value: scala.Boolean): Self = StObject.set(x, "preventClose", value.asInstanceOf[js.Any])
    
    inline def setPreventCloseUndefined: Self = StObject.set(x, "preventClose", js.undefined)
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
  }
}
