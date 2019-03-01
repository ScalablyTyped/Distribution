package typings
package reactDashNativeDashSvgLib.reactDashNativeDashSvgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageProps
  extends ResponderProps
     with TouchableProps {
  var height: js.UndefOr[reactDashNativeDashSvgLib.NumberProp] = js.undefined
  var href: js.Any
  var opacity: js.UndefOr[reactDashNativeDashSvgLib.NumberProp] = js.undefined
  var preserveAspectRatio: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[reactDashNativeDashSvgLib.NumberProp] = js.undefined
  var x: js.UndefOr[reactDashNativeDashSvgLib.NumberProp] = js.undefined
  var xlinkHref: js.UndefOr[js.Any] = js.undefined
  var y: js.UndefOr[reactDashNativeDashSvgLib.NumberProp] = js.undefined
}

object ImageProps {
  @scala.inline
  def apply(
    href: js.Any,
    delayLongPress: scala.Int | scala.Double = null,
    delayPressIn: scala.Int | scala.Double = null,
    delayPressOut: scala.Int | scala.Double = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    height: reactDashNativeDashSvgLib.NumberProp = null,
    onLongPress: js.Function1[/* event */ js.Any, _] = null,
    onMoveShouldSetResponder: js.Function1[
      /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent, 
      scala.Boolean
    ] = null,
    onMoveShouldSetResponderCapture: js.Function1[
      /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent, 
      scala.Boolean
    ] = null,
    onPress: js.Function1[/* event */ js.Any, _] = null,
    onPressIn: js.Function1[/* event */ js.Any, _] = null,
    onPressOut: js.Function1[/* event */ js.Any, _] = null,
    onResponderEnd: js.Function1[
      /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent, 
      scala.Unit
    ] = null,
    onResponderGrant: js.Function1[
      /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent, 
      scala.Unit
    ] = null,
    onResponderMove: js.Function1[
      /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent, 
      scala.Unit
    ] = null,
    onResponderReject: js.Function1[
      /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent, 
      scala.Unit
    ] = null,
    onResponderRelease: js.Function1[
      /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent, 
      scala.Unit
    ] = null,
    onResponderStart: js.Function1[
      /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent, 
      scala.Unit
    ] = null,
    onResponderTerminate: js.Function1[
      /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent, 
      scala.Unit
    ] = null,
    onResponderTerminationRequest: js.Function1[
      /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent, 
      scala.Boolean
    ] = null,
    onStartShouldSetResponder: js.Function1[
      /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent, 
      scala.Boolean
    ] = null,
    onStartShouldSetResponderCapture: js.Function1[
      /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent, 
      scala.Boolean
    ] = null,
    opacity: reactDashNativeDashSvgLib.NumberProp = null,
    pointerEvents: js.Function1[/* event */ js.Any, _] = null,
    preserveAspectRatio: java.lang.String = null,
    width: reactDashNativeDashSvgLib.NumberProp = null,
    x: reactDashNativeDashSvgLib.NumberProp = null,
    xlinkHref: js.Any = null,
    y: reactDashNativeDashSvgLib.NumberProp = null
  ): ImageProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("href")(href)
    if (delayLongPress != null) __obj.updateDynamic("delayLongPress")(delayLongPress.asInstanceOf[js.Any])
    if (delayPressIn != null) __obj.updateDynamic("delayPressIn")(delayPressIn.asInstanceOf[js.Any])
    if (delayPressOut != null) __obj.updateDynamic("delayPressOut")(delayPressOut.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (onLongPress != null) __obj.updateDynamic("onLongPress")(onLongPress)
    if (onMoveShouldSetResponder != null) __obj.updateDynamic("onMoveShouldSetResponder")(onMoveShouldSetResponder)
    if (onMoveShouldSetResponderCapture != null) __obj.updateDynamic("onMoveShouldSetResponderCapture")(onMoveShouldSetResponderCapture)
    if (onPress != null) __obj.updateDynamic("onPress")(onPress)
    if (onPressIn != null) __obj.updateDynamic("onPressIn")(onPressIn)
    if (onPressOut != null) __obj.updateDynamic("onPressOut")(onPressOut)
    if (onResponderEnd != null) __obj.updateDynamic("onResponderEnd")(onResponderEnd)
    if (onResponderGrant != null) __obj.updateDynamic("onResponderGrant")(onResponderGrant)
    if (onResponderMove != null) __obj.updateDynamic("onResponderMove")(onResponderMove)
    if (onResponderReject != null) __obj.updateDynamic("onResponderReject")(onResponderReject)
    if (onResponderRelease != null) __obj.updateDynamic("onResponderRelease")(onResponderRelease)
    if (onResponderStart != null) __obj.updateDynamic("onResponderStart")(onResponderStart)
    if (onResponderTerminate != null) __obj.updateDynamic("onResponderTerminate")(onResponderTerminate)
    if (onResponderTerminationRequest != null) __obj.updateDynamic("onResponderTerminationRequest")(onResponderTerminationRequest)
    if (onStartShouldSetResponder != null) __obj.updateDynamic("onStartShouldSetResponder")(onStartShouldSetResponder)
    if (onStartShouldSetResponderCapture != null) __obj.updateDynamic("onStartShouldSetResponderCapture")(onStartShouldSetResponderCapture)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (pointerEvents != null) __obj.updateDynamic("pointerEvents")(pointerEvents)
    if (preserveAspectRatio != null) __obj.updateDynamic("preserveAspectRatio")(preserveAspectRatio)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (xlinkHref != null) __obj.updateDynamic("xlinkHref")(xlinkHref)
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageProps]
  }
}

