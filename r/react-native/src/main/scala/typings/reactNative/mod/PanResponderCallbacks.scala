package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PanResponderCallbacks extends js.Object {
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
  implicit class PanResponderCallbacksOps[Self <: PanResponderCallbacks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOnMoveShouldSetPanResponder(value: (/* e */ GestureResponderEvent, /* gestureState */ PanResponderGestureState) => Boolean): Self = this.set("onMoveShouldSetPanResponder", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnMoveShouldSetPanResponder: Self = this.set("onMoveShouldSetPanResponder", js.undefined)
    @scala.inline
    def setOnMoveShouldSetPanResponderCapture(value: (/* e */ GestureResponderEvent, /* gestureState */ PanResponderGestureState) => Boolean): Self = this.set("onMoveShouldSetPanResponderCapture", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnMoveShouldSetPanResponderCapture: Self = this.set("onMoveShouldSetPanResponderCapture", js.undefined)
    @scala.inline
    def setOnPanResponderEnd(value: (/* e */ GestureResponderEvent, /* gestureState */ PanResponderGestureState) => Unit): Self = this.set("onPanResponderEnd", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnPanResponderEnd: Self = this.set("onPanResponderEnd", js.undefined)
    @scala.inline
    def setOnPanResponderGrant(value: (/* e */ GestureResponderEvent, /* gestureState */ PanResponderGestureState) => Unit): Self = this.set("onPanResponderGrant", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnPanResponderGrant: Self = this.set("onPanResponderGrant", js.undefined)
    @scala.inline
    def setOnPanResponderMove(value: (/* e */ GestureResponderEvent, /* gestureState */ PanResponderGestureState) => Unit): Self = this.set("onPanResponderMove", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnPanResponderMove: Self = this.set("onPanResponderMove", js.undefined)
    @scala.inline
    def setOnPanResponderReject(value: (/* e */ GestureResponderEvent, /* gestureState */ PanResponderGestureState) => Unit): Self = this.set("onPanResponderReject", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnPanResponderReject: Self = this.set("onPanResponderReject", js.undefined)
    @scala.inline
    def setOnPanResponderRelease(value: (/* e */ GestureResponderEvent, /* gestureState */ PanResponderGestureState) => Unit): Self = this.set("onPanResponderRelease", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnPanResponderRelease: Self = this.set("onPanResponderRelease", js.undefined)
    @scala.inline
    def setOnPanResponderStart(value: (/* e */ GestureResponderEvent, /* gestureState */ PanResponderGestureState) => Unit): Self = this.set("onPanResponderStart", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnPanResponderStart: Self = this.set("onPanResponderStart", js.undefined)
    @scala.inline
    def setOnPanResponderTerminate(value: (/* e */ GestureResponderEvent, /* gestureState */ PanResponderGestureState) => Unit): Self = this.set("onPanResponderTerminate", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnPanResponderTerminate: Self = this.set("onPanResponderTerminate", js.undefined)
    @scala.inline
    def setOnPanResponderTerminationRequest(value: (/* e */ GestureResponderEvent, /* gestureState */ PanResponderGestureState) => Boolean): Self = this.set("onPanResponderTerminationRequest", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnPanResponderTerminationRequest: Self = this.set("onPanResponderTerminationRequest", js.undefined)
    @scala.inline
    def setOnShouldBlockNativeResponder(value: (/* e */ GestureResponderEvent, /* gestureState */ PanResponderGestureState) => Boolean): Self = this.set("onShouldBlockNativeResponder", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnShouldBlockNativeResponder: Self = this.set("onShouldBlockNativeResponder", js.undefined)
    @scala.inline
    def setOnStartShouldSetPanResponder(value: (/* e */ GestureResponderEvent, /* gestureState */ PanResponderGestureState) => Boolean): Self = this.set("onStartShouldSetPanResponder", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnStartShouldSetPanResponder: Self = this.set("onStartShouldSetPanResponder", js.undefined)
    @scala.inline
    def setOnStartShouldSetPanResponderCapture(value: (/* e */ GestureResponderEvent, /* gestureState */ PanResponderGestureState) => Boolean): Self = this.set("onStartShouldSetPanResponderCapture", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnStartShouldSetPanResponderCapture: Self = this.set("onStartShouldSetPanResponderCapture", js.undefined)
  }
  
}

