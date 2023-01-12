package typings.scrollmagic.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SceneConstructorOptions extends StObject {
  
  var duration: js.UndefOr[(js.Function0[Double | String]) | Double | String] = js.undefined
  
  var loglevel: js.UndefOr[LogLevel] = js.undefined
  
  var offset: js.UndefOr[Double] = js.undefined
  
  var reverse: js.UndefOr[Boolean] = js.undefined
  
  var triggerElement: js.UndefOr[ElementOrSelector | Null] = js.undefined
  
  var triggerHook: js.UndefOr[TriggerHook] = js.undefined
}
object SceneConstructorOptions {
  
  inline def apply(): SceneConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SceneConstructorOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SceneConstructorOptions] (val x: Self) extends AnyVal {
    
    inline def setDuration(value: (js.Function0[Double | String]) | Double | String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationFunction0(value: () => Double | String): Self = StObject.set(x, "duration", js.Any.fromFunction0(value))
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setLoglevel(value: LogLevel): Self = StObject.set(x, "loglevel", value.asInstanceOf[js.Any])
    
    inline def setLoglevelUndefined: Self = StObject.set(x, "loglevel", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    
    inline def setTriggerElement(value: ElementOrSelector): Self = StObject.set(x, "triggerElement", value.asInstanceOf[js.Any])
    
    inline def setTriggerElementNull: Self = StObject.set(x, "triggerElement", null)
    
    inline def setTriggerElementUndefined: Self = StObject.set(x, "triggerElement", js.undefined)
    
    inline def setTriggerHook(value: TriggerHook): Self = StObject.set(x, "triggerHook", value.asInstanceOf[js.Any])
    
    inline def setTriggerHookUndefined: Self = StObject.set(x, "triggerHook", js.undefined)
  }
}
