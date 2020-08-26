package typings.reactNativeSwipeGestures.mod

import typings.reactNative.mod.PanResponderGestureState
import typings.reactNative.mod.ViewProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GestureRecognizerProps extends ViewProps {
  var config: js.UndefOr[GestureRecognizerConfig] = js.native
  var onSwipe: js.UndefOr[
    js.Function2[/* gestureName */ String, /* gestureState */ PanResponderGestureState, Unit]
  ] = js.native
  var onSwipeDown: js.UndefOr[js.Function1[/* gestureState */ PanResponderGestureState, Unit]] = js.native
  var onSwipeLeft: js.UndefOr[js.Function1[/* gestureState */ PanResponderGestureState, Unit]] = js.native
  var onSwipeRight: js.UndefOr[js.Function1[/* gestureState */ PanResponderGestureState, Unit]] = js.native
  var onSwipeUp: js.UndefOr[js.Function1[/* gestureState */ PanResponderGestureState, Unit]] = js.native
}

object GestureRecognizerProps {
  @scala.inline
  def apply(): GestureRecognizerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GestureRecognizerProps]
  }
  @scala.inline
  implicit class GestureRecognizerPropsOps[Self <: GestureRecognizerProps] (val x: Self) extends AnyVal {
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
    def setConfig(value: GestureRecognizerConfig): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    @scala.inline
    def setOnSwipe(value: (/* gestureName */ String, /* gestureState */ PanResponderGestureState) => Unit): Self = this.set("onSwipe", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnSwipe: Self = this.set("onSwipe", js.undefined)
    @scala.inline
    def setOnSwipeDown(value: /* gestureState */ PanResponderGestureState => Unit): Self = this.set("onSwipeDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSwipeDown: Self = this.set("onSwipeDown", js.undefined)
    @scala.inline
    def setOnSwipeLeft(value: /* gestureState */ PanResponderGestureState => Unit): Self = this.set("onSwipeLeft", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSwipeLeft: Self = this.set("onSwipeLeft", js.undefined)
    @scala.inline
    def setOnSwipeRight(value: /* gestureState */ PanResponderGestureState => Unit): Self = this.set("onSwipeRight", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSwipeRight: Self = this.set("onSwipeRight", js.undefined)
    @scala.inline
    def setOnSwipeUp(value: /* gestureState */ PanResponderGestureState => Unit): Self = this.set("onSwipeUp", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSwipeUp: Self = this.set("onSwipeUp", js.undefined)
  }
  
}

