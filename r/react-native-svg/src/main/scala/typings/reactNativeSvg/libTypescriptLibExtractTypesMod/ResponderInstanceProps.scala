package typings.reactNativeSvg.libTypescriptLibExtractTypesMod

import typings.reactNative.mod.GestureResponderEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponderInstanceProps extends StObject {
  
  var touchableHandleResponderGrant: js.UndefOr[js.Function1[/* e */ GestureResponderEvent, Unit]] = js.undefined
  
  var touchableHandleResponderMove: js.UndefOr[js.Function1[/* e */ GestureResponderEvent, Unit]] = js.undefined
  
  var touchableHandleResponderRelease: js.UndefOr[js.Function1[/* e */ GestureResponderEvent, Unit]] = js.undefined
  
  var touchableHandleResponderTerminate: js.UndefOr[js.Function1[/* e */ GestureResponderEvent, Unit]] = js.undefined
  
  var touchableHandleResponderTerminationRequest: js.UndefOr[js.Function1[/* e */ GestureResponderEvent, Boolean]] = js.undefined
  
  var touchableHandleStartShouldSetResponder: js.UndefOr[js.Function1[/* e */ GestureResponderEvent, Boolean]] = js.undefined
}
object ResponderInstanceProps {
  
  inline def apply(): ResponderInstanceProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponderInstanceProps]
  }
  
  extension [Self <: ResponderInstanceProps](x: Self) {
    
    inline def setTouchableHandleResponderGrant(value: /* e */ GestureResponderEvent => Unit): Self = StObject.set(x, "touchableHandleResponderGrant", js.Any.fromFunction1(value))
    
    inline def setTouchableHandleResponderGrantUndefined: Self = StObject.set(x, "touchableHandleResponderGrant", js.undefined)
    
    inline def setTouchableHandleResponderMove(value: /* e */ GestureResponderEvent => Unit): Self = StObject.set(x, "touchableHandleResponderMove", js.Any.fromFunction1(value))
    
    inline def setTouchableHandleResponderMoveUndefined: Self = StObject.set(x, "touchableHandleResponderMove", js.undefined)
    
    inline def setTouchableHandleResponderRelease(value: /* e */ GestureResponderEvent => Unit): Self = StObject.set(x, "touchableHandleResponderRelease", js.Any.fromFunction1(value))
    
    inline def setTouchableHandleResponderReleaseUndefined: Self = StObject.set(x, "touchableHandleResponderRelease", js.undefined)
    
    inline def setTouchableHandleResponderTerminate(value: /* e */ GestureResponderEvent => Unit): Self = StObject.set(x, "touchableHandleResponderTerminate", js.Any.fromFunction1(value))
    
    inline def setTouchableHandleResponderTerminateUndefined: Self = StObject.set(x, "touchableHandleResponderTerminate", js.undefined)
    
    inline def setTouchableHandleResponderTerminationRequest(value: /* e */ GestureResponderEvent => Boolean): Self = StObject.set(x, "touchableHandleResponderTerminationRequest", js.Any.fromFunction1(value))
    
    inline def setTouchableHandleResponderTerminationRequestUndefined: Self = StObject.set(x, "touchableHandleResponderTerminationRequest", js.undefined)
    
    inline def setTouchableHandleStartShouldSetResponder(value: /* e */ GestureResponderEvent => Boolean): Self = StObject.set(x, "touchableHandleStartShouldSetResponder", js.Any.fromFunction1(value))
    
    inline def setTouchableHandleStartShouldSetResponderUndefined: Self = StObject.set(x, "touchableHandleStartShouldSetResponder", js.undefined)
  }
}
