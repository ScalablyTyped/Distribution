package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PanResponderCallbacks extends StObject {
  
  var onMoveShouldSetPanResponder: js.UndefOr[
    js.Function2[/* e */ GestureResponderEvent, /* gestureState */ PanResponderGestureState, Boolean]
  ] = js.native
  
  var onMoveShouldSetPanResponderCapture: js.UndefOr[
    js.Function2[/* e */ GestureResponderEvent, /* gestureState */ PanResponderGestureState, Boolean]
  ] = js.native
  
  var onPanResponderEnd: js.UndefOr[
    js.Function2[/* e */ GestureResponderEvent, /* gestureState */ PanResponderGestureState, Unit]
  ] = js.native
  
  var onPanResponderGrant: js.UndefOr[
    js.Function2[/* e */ GestureResponderEvent, /* gestureState */ PanResponderGestureState, Unit]
  ] = js.native
  
  var onPanResponderMove: js.UndefOr[
    js.Function2[/* e */ GestureResponderEvent, /* gestureState */ PanResponderGestureState, Unit]
  ] = js.native
  
  var onPanResponderReject: js.UndefOr[
    js.Function2[/* e */ GestureResponderEvent, /* gestureState */ PanResponderGestureState, Unit]
  ] = js.native
  
  var onPanResponderRelease: js.UndefOr[
    js.Function2[/* e */ GestureResponderEvent, /* gestureState */ PanResponderGestureState, Unit]
  ] = js.native
  
  var onPanResponderStart: js.UndefOr[
    js.Function2[/* e */ GestureResponderEvent, /* gestureState */ PanResponderGestureState, Unit]
  ] = js.native
  
  var onPanResponderTerminate: js.UndefOr[
    js.Function2[/* e */ GestureResponderEvent, /* gestureState */ PanResponderGestureState, Unit]
  ] = js.native
  
  var onPanResponderTerminationRequest: js.UndefOr[
    js.Function2[/* e */ GestureResponderEvent, /* gestureState */ PanResponderGestureState, Boolean]
  ] = js.native
  
  var onShouldBlockNativeResponder: js.UndefOr[
    js.Function2[/* e */ GestureResponderEvent, /* gestureState */ PanResponderGestureState, Boolean]
  ] = js.native
  
  var onStartShouldSetPanResponder: js.UndefOr[
    js.Function2[/* e */ GestureResponderEvent, /* gestureState */ PanResponderGestureState, Boolean]
  ] = js.native
  
  var onStartShouldSetPanResponderCapture: js.UndefOr[
    js.Function2[/* e */ GestureResponderEvent, /* gestureState */ PanResponderGestureState, Boolean]
  ] = js.native
}
object PanResponderCallbacks {
  
  @scala.inline
  def apply(): PanResponderCallbacks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PanResponderCallbacks]
  }
  
  @scala.inline
  implicit class PanResponderCallbacksMutableBuilder[Self <: PanResponderCallbacks] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnMoveShouldSetPanResponder(value: (/* e */ GestureResponderEvent, /* gestureState */ PanResponderGestureState) => Boolean): Self = StObject.set(x, "onMoveShouldSetPanResponder", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnMoveShouldSetPanResponderCapture(value: (/* e */ GestureResponderEvent, /* gestureState */ PanResponderGestureState) => Boolean): Self = StObject.set(x, "onMoveShouldSetPanResponderCapture", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnMoveShouldSetPanResponderCaptureUndefined: Self = StObject.set(x, "onMoveShouldSetPanResponderCapture", js.undefined)
    
    @scala.inline
    def setOnMoveShouldSetPanResponderUndefined: Self = StObject.set(x, "onMoveShouldSetPanResponder", js.undefined)
    
    @scala.inline
    def setOnPanResponderEnd(value: (/* e */ GestureResponderEvent, /* gestureState */ PanResponderGestureState) => Unit): Self = StObject.set(x, "onPanResponderEnd", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnPanResponderEndUndefined: Self = StObject.set(x, "onPanResponderEnd", js.undefined)
    
    @scala.inline
    def setOnPanResponderGrant(value: (/* e */ GestureResponderEvent, /* gestureState */ PanResponderGestureState) => Unit): Self = StObject.set(x, "onPanResponderGrant", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnPanResponderGrantUndefined: Self = StObject.set(x, "onPanResponderGrant", js.undefined)
    
    @scala.inline
    def setOnPanResponderMove(value: (/* e */ GestureResponderEvent, /* gestureState */ PanResponderGestureState) => Unit): Self = StObject.set(x, "onPanResponderMove", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnPanResponderMoveUndefined: Self = StObject.set(x, "onPanResponderMove", js.undefined)
    
    @scala.inline
    def setOnPanResponderReject(value: (/* e */ GestureResponderEvent, /* gestureState */ PanResponderGestureState) => Unit): Self = StObject.set(x, "onPanResponderReject", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnPanResponderRejectUndefined: Self = StObject.set(x, "onPanResponderReject", js.undefined)
    
    @scala.inline
    def setOnPanResponderRelease(value: (/* e */ GestureResponderEvent, /* gestureState */ PanResponderGestureState) => Unit): Self = StObject.set(x, "onPanResponderRelease", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnPanResponderReleaseUndefined: Self = StObject.set(x, "onPanResponderRelease", js.undefined)
    
    @scala.inline
    def setOnPanResponderStart(value: (/* e */ GestureResponderEvent, /* gestureState */ PanResponderGestureState) => Unit): Self = StObject.set(x, "onPanResponderStart", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnPanResponderStartUndefined: Self = StObject.set(x, "onPanResponderStart", js.undefined)
    
    @scala.inline
    def setOnPanResponderTerminate(value: (/* e */ GestureResponderEvent, /* gestureState */ PanResponderGestureState) => Unit): Self = StObject.set(x, "onPanResponderTerminate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnPanResponderTerminateUndefined: Self = StObject.set(x, "onPanResponderTerminate", js.undefined)
    
    @scala.inline
    def setOnPanResponderTerminationRequest(value: (/* e */ GestureResponderEvent, /* gestureState */ PanResponderGestureState) => Boolean): Self = StObject.set(x, "onPanResponderTerminationRequest", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnPanResponderTerminationRequestUndefined: Self = StObject.set(x, "onPanResponderTerminationRequest", js.undefined)
    
    @scala.inline
    def setOnShouldBlockNativeResponder(value: (/* e */ GestureResponderEvent, /* gestureState */ PanResponderGestureState) => Boolean): Self = StObject.set(x, "onShouldBlockNativeResponder", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnShouldBlockNativeResponderUndefined: Self = StObject.set(x, "onShouldBlockNativeResponder", js.undefined)
    
    @scala.inline
    def setOnStartShouldSetPanResponder(value: (/* e */ GestureResponderEvent, /* gestureState */ PanResponderGestureState) => Boolean): Self = StObject.set(x, "onStartShouldSetPanResponder", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnStartShouldSetPanResponderCapture(value: (/* e */ GestureResponderEvent, /* gestureState */ PanResponderGestureState) => Boolean): Self = StObject.set(x, "onStartShouldSetPanResponderCapture", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnStartShouldSetPanResponderCaptureUndefined: Self = StObject.set(x, "onStartShouldSetPanResponderCapture", js.undefined)
    
    @scala.inline
    def setOnStartShouldSetPanResponderUndefined: Self = StObject.set(x, "onStartShouldSetPanResponder", js.undefined)
  }
}
