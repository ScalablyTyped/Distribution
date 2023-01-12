package typings.react.mod

import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FocusEvent[Target, RelatedTarget]
  extends StObject
     with BaseSyntheticEvent[NativeFocusEvent, EventTarget & Target, EventTarget] {
  
  var relatedTarget: (EventTarget & RelatedTarget) | Null
  
  @JSName("target")
  var target_FocusEvent: EventTarget & Target
}
object FocusEvent {
  
  inline def apply[Target, RelatedTarget](
    bubbles: Boolean,
    cancelable: Boolean,
    currentTarget: EventTarget & Target,
    defaultPrevented: Boolean,
    eventPhase: Double,
    isDefaultPrevented: () => Boolean,
    isPropagationStopped: () => Boolean,
    isTrusted: Boolean,
    nativeEvent: NativeFocusEvent,
    persist: () => Unit,
    preventDefault: () => Unit,
    stopPropagation: () => Unit,
    target: EventTarget & Target,
    timeStamp: Double,
    `type`: String
  ): FocusEvent[Target, RelatedTarget] = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), isTrusted = isTrusted.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], persist = js.Any.fromFunction0(persist), preventDefault = js.Any.fromFunction0(preventDefault), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], relatedTarget = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FocusEvent[Target, RelatedTarget]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FocusEvent[?, ?], Target, RelatedTarget] (val x: Self & (FocusEvent[Target, RelatedTarget])) extends AnyVal {
    
    inline def setRelatedTarget(value: EventTarget & RelatedTarget): Self = StObject.set(x, "relatedTarget", value.asInstanceOf[js.Any])
    
    inline def setRelatedTargetNull: Self = StObject.set(x, "relatedTarget", null)
    
    inline def setTarget(value: EventTarget & Target): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
