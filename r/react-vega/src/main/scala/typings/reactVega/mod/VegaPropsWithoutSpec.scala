package typings.reactVega.mod

import typings.react.mod.CSSProperties
import typings.reactVega.anon.Bottom
import typings.std.Error
import typings.std.MouseEvent
import typings.std.Record
import typings.vegaTypings.mod.View
import typings.vegaTypings.runtimeMod.Item
import typings.vegaTypings.runtimeMod.TooltipHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VegaPropsWithoutSpec extends js.Object {
  var background: js.UndefOr[String] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var data: js.UndefOr[Record[String, js.Array[_]]] = js.undefined
  var enableHover: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var logLevel: js.UndefOr[Double] = js.undefined
  var onNewView: js.UndefOr[js.Function1[/* view */ View, Unit]] = js.undefined
  var onParseError: js.UndefOr[js.Function1[/* error */ Error, Unit]] = js.undefined
  var padding: js.UndefOr[Double | Bottom] = js.undefined
  var renderer: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var tooltip: js.UndefOr[TooltipHandler] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object VegaPropsWithoutSpec {
  @scala.inline
  def apply(
    background: String = null,
    className: String = null,
    data: Record[String, js.Array[_]] = null,
    enableHover: js.UndefOr[Boolean] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    logLevel: js.UndefOr[Double] = js.undefined,
    onNewView: /* view */ View => Unit = null,
    onParseError: /* error */ Error => Unit = null,
    padding: Double | Bottom = null,
    renderer: String = null,
    style: CSSProperties = null,
    tooltip: (/* handler */ js.Any, /* event */ MouseEvent, /* item */ Item[js.Any], /* value */ js.Any) => Unit = null,
    width: js.UndefOr[Double] = js.undefined
  ): VegaPropsWithoutSpec = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(enableHover)) __obj.updateDynamic("enableHover")(enableHover.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(logLevel)) __obj.updateDynamic("logLevel")(logLevel.get.asInstanceOf[js.Any])
    if (onNewView != null) __obj.updateDynamic("onNewView")(js.Any.fromFunction1(onNewView))
    if (onParseError != null) __obj.updateDynamic("onParseError")(js.Any.fromFunction1(onParseError))
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(renderer.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(js.Any.fromFunction4(tooltip))
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[VegaPropsWithoutSpec]
  }
}

