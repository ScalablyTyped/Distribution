package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PipeOptions extends StObject {
  
  var preventAbort: js.UndefOr[scala.Boolean] = js.native
  
  var preventCancel: js.UndefOr[scala.Boolean] = js.native
  
  var preventClose: js.UndefOr[scala.Boolean] = js.native
  
  var signal: js.UndefOr[AbortSignal] = js.native
}
object PipeOptions {
  
  @scala.inline
  def apply(): PipeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PipeOptions]
  }
  
  @scala.inline
  implicit class PipeOptionsMutableBuilder[Self <: PipeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPreventAbort(value: scala.Boolean): Self = StObject.set(x, "preventAbort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventAbortUndefined: Self = StObject.set(x, "preventAbort", js.undefined)
    
    @scala.inline
    def setPreventCancel(value: scala.Boolean): Self = StObject.set(x, "preventCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventCancelUndefined: Self = StObject.set(x, "preventCancel", js.undefined)
    
    @scala.inline
    def setPreventClose(value: scala.Boolean): Self = StObject.set(x, "preventClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventCloseUndefined: Self = StObject.set(x, "preventClose", js.undefined)
    
    @scala.inline
    def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
  }
}
