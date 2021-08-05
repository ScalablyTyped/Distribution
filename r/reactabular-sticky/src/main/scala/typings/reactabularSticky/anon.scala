package typings.reactabularSticky

import typings.std.EventTarget
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<std.UIEvent> */
  trait PartialUIEvent extends StObject {
    
    var AT_TARGET: js.UndefOr[Double] = js.undefined
    
    var BUBBLING_PHASE: js.UndefOr[Double] = js.undefined
    
    var CAPTURING_PHASE: js.UndefOr[Double] = js.undefined
    
    var NONE: js.UndefOr[Double] = js.undefined
    
    var bubbles: js.UndefOr[Boolean] = js.undefined
    
    var cancelBubble: js.UndefOr[Boolean] = js.undefined
    
    var cancelable: js.UndefOr[Boolean] = js.undefined
    
    var composed: js.UndefOr[Boolean] = js.undefined
    
    var composedPath: js.UndefOr[js.Function0[js.Array[EventTarget]]] = js.undefined
    
    var currentTarget: js.UndefOr[EventTarget | Null] = js.undefined
    
    var defaultPrevented: js.UndefOr[Boolean] = js.undefined
    
    var detail: js.UndefOr[Double] = js.undefined
    
    var eventPhase: js.UndefOr[Double] = js.undefined
    
    var initEvent: js.UndefOr[js.Function1[/* type */ String, Unit]] = js.undefined
    
    var isTrusted: js.UndefOr[Boolean] = js.undefined
    
    var preventDefault: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var returnValue: js.UndefOr[Boolean] = js.undefined
    
    var srcElement: js.UndefOr[EventTarget | Null] = js.undefined
    
    var stopImmediatePropagation: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var stopPropagation: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var target: js.UndefOr[EventTarget | Null] = js.undefined
    
    var timeStamp: js.UndefOr[Double] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var view: js.UndefOr[Window | Null] = js.undefined
    
    var which: js.UndefOr[Double] = js.undefined
  }
  object PartialUIEvent {
    
    inline def apply(): PartialUIEvent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialUIEvent]
    }
    
    extension [Self <: PartialUIEvent](x: Self) {
      
      inline def setAT_TARGET(value: Double): Self = StObject.set(x, "AT_TARGET", value.asInstanceOf[js.Any])
      
      inline def setAT_TARGETUndefined: Self = StObject.set(x, "AT_TARGET", js.undefined)
      
      inline def setBUBBLING_PHASE(value: Double): Self = StObject.set(x, "BUBBLING_PHASE", value.asInstanceOf[js.Any])
      
      inline def setBUBBLING_PHASEUndefined: Self = StObject.set(x, "BUBBLING_PHASE", js.undefined)
      
      inline def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
      
      inline def setBubblesUndefined: Self = StObject.set(x, "bubbles", js.undefined)
      
      inline def setCAPTURING_PHASE(value: Double): Self = StObject.set(x, "CAPTURING_PHASE", value.asInstanceOf[js.Any])
      
      inline def setCAPTURING_PHASEUndefined: Self = StObject.set(x, "CAPTURING_PHASE", js.undefined)
      
      inline def setCancelBubble(value: Boolean): Self = StObject.set(x, "cancelBubble", value.asInstanceOf[js.Any])
      
      inline def setCancelBubbleUndefined: Self = StObject.set(x, "cancelBubble", js.undefined)
      
      inline def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
      
      inline def setCancelableUndefined: Self = StObject.set(x, "cancelable", js.undefined)
      
      inline def setComposed(value: Boolean): Self = StObject.set(x, "composed", value.asInstanceOf[js.Any])
      
      inline def setComposedPath(value: () => js.Array[EventTarget]): Self = StObject.set(x, "composedPath", js.Any.fromFunction0(value))
      
      inline def setComposedPathUndefined: Self = StObject.set(x, "composedPath", js.undefined)
      
      inline def setComposedUndefined: Self = StObject.set(x, "composed", js.undefined)
      
      inline def setCurrentTarget(value: EventTarget): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
      
      inline def setCurrentTargetNull: Self = StObject.set(x, "currentTarget", null)
      
      inline def setCurrentTargetUndefined: Self = StObject.set(x, "currentTarget", js.undefined)
      
      inline def setDefaultPrevented(value: Boolean): Self = StObject.set(x, "defaultPrevented", value.asInstanceOf[js.Any])
      
      inline def setDefaultPreventedUndefined: Self = StObject.set(x, "defaultPrevented", js.undefined)
      
      inline def setDetail(value: Double): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
      
      inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
      
      inline def setEventPhase(value: Double): Self = StObject.set(x, "eventPhase", value.asInstanceOf[js.Any])
      
      inline def setEventPhaseUndefined: Self = StObject.set(x, "eventPhase", js.undefined)
      
      inline def setInitEvent(value: /* type */ String => Unit): Self = StObject.set(x, "initEvent", js.Any.fromFunction1(value))
      
      inline def setInitEventUndefined: Self = StObject.set(x, "initEvent", js.undefined)
      
      inline def setIsTrusted(value: Boolean): Self = StObject.set(x, "isTrusted", value.asInstanceOf[js.Any])
      
      inline def setIsTrustedUndefined: Self = StObject.set(x, "isTrusted", js.undefined)
      
      inline def setNONE(value: Double): Self = StObject.set(x, "NONE", value.asInstanceOf[js.Any])
      
      inline def setNONEUndefined: Self = StObject.set(x, "NONE", js.undefined)
      
      inline def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
      
      inline def setPreventDefaultUndefined: Self = StObject.set(x, "preventDefault", js.undefined)
      
      inline def setReturnValue(value: Boolean): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
      
      inline def setReturnValueUndefined: Self = StObject.set(x, "returnValue", js.undefined)
      
      inline def setSrcElement(value: EventTarget): Self = StObject.set(x, "srcElement", value.asInstanceOf[js.Any])
      
      inline def setSrcElementNull: Self = StObject.set(x, "srcElement", null)
      
      inline def setSrcElementUndefined: Self = StObject.set(x, "srcElement", js.undefined)
      
      inline def setStopImmediatePropagation(value: () => Unit): Self = StObject.set(x, "stopImmediatePropagation", js.Any.fromFunction0(value))
      
      inline def setStopImmediatePropagationUndefined: Self = StObject.set(x, "stopImmediatePropagation", js.undefined)
      
      inline def setStopPropagation(value: () => Unit): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
      
      inline def setStopPropagationUndefined: Self = StObject.set(x, "stopPropagation", js.undefined)
      
      inline def setTarget(value: EventTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetNull: Self = StObject.set(x, "target", null)
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTimeStamp(value: Double): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
      
      inline def setTimeStampUndefined: Self = StObject.set(x, "timeStamp", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setView(value: Window): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      inline def setViewNull: Self = StObject.set(x, "view", null)
      
      inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
      
      inline def setWhich(value: Double): Self = StObject.set(x, "which", value.asInstanceOf[js.Any])
      
      inline def setWhichUndefined: Self = StObject.set(x, "which", js.undefined)
    }
  }
}
