package typings.reactDashNativeDashCanvas.reactDashNativeDashCanvasMod

import typings.react.reactMod.RefObject
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasProps extends js.Object {
  var baseUrl: js.UndefOr[String] = js.undefined
  var originWhitelist: js.UndefOr[js.Array[String]] = js.undefined
  var ref: (js.Function1[/* canvas */ Canvas, _]) | RefObject[Canvas]
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object CanvasProps {
  @scala.inline
  def apply(
    ref: (js.Function1[/* canvas */ Canvas, _]) | RefObject[Canvas],
    baseUrl: String = null,
    originWhitelist: js.Array[String] = null,
    style: StyleProp[ViewStyle] = null
  ): CanvasProps = {
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any])
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl)
    if (originWhitelist != null) __obj.updateDynamic("originWhitelist")(originWhitelist)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasProps]
  }
}

