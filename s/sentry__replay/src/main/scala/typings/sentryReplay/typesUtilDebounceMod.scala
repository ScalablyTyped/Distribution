package typings.sentryReplay

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUtilDebounceMod {
  
  @JSImport("@sentry/replay/types/util/debounce", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def debounce(func: CallbackFunction, wait: Double): DebouncedCallback = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(func.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[DebouncedCallback]
  inline def debounce(func: CallbackFunction, wait: Double, options: DebounceOptions): DebouncedCallback = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(func.asInstanceOf[js.Any], wait.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DebouncedCallback]
  
  type CallbackFunction = js.Function0[Any]
  
  trait DebounceOptions extends StObject {
    
    var maxWait: js.UndefOr[Double] = js.undefined
  }
  object DebounceOptions {
    
    inline def apply(): DebounceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DebounceOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DebounceOptions] (val x: Self) extends AnyVal {
      
      inline def setMaxWait(value: Double): Self = StObject.set(x, "maxWait", value.asInstanceOf[js.Any])
      
      inline def setMaxWaitUndefined: Self = StObject.set(x, "maxWait", js.undefined)
    }
  }
  
  @js.native
  trait DebouncedCallback extends StObject {
    
    def apply(): Unit | Any = js.native
    
    def cancel(): Unit = js.native
    
    def flush(): Unit | Any = js.native
  }
}
