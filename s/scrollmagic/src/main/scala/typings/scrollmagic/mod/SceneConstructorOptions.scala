package typings.scrollmagic.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SceneConstructorOptions extends StObject {
  
  var duration: js.UndefOr[(js.Function0[Double | String]) | Double | String] = js.native
  
  var loglevel: js.UndefOr[LogLevel] = js.native
  
  var offset: js.UndefOr[Double] = js.native
  
  var reverse: js.UndefOr[Boolean] = js.native
  
  var triggerElement: js.UndefOr[ElementOrSelector | Null] = js.native
  
  var triggerHook: js.UndefOr[TriggerHook] = js.native
}
object SceneConstructorOptions {
  
  @scala.inline
  def apply(): SceneConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SceneConstructorOptions]
  }
  
  @scala.inline
  implicit class SceneConstructorOptionsMutableBuilder[Self <: SceneConstructorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: (js.Function0[Double | String]) | Double | String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationFunction0(value: () => Double | String): Self = StObject.set(x, "duration", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setLoglevel(value: LogLevel): Self = StObject.set(x, "loglevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoglevelUndefined: Self = StObject.set(x, "loglevel", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    
    @scala.inline
    def setTriggerElement(value: ElementOrSelector): Self = StObject.set(x, "triggerElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerElementNull: Self = StObject.set(x, "triggerElement", null)
    
    @scala.inline
    def setTriggerElementUndefined: Self = StObject.set(x, "triggerElement", js.undefined)
    
    @scala.inline
    def setTriggerHook(value: TriggerHook): Self = StObject.set(x, "triggerHook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerHookUndefined: Self = StObject.set(x, "triggerHook", js.undefined)
  }
}
