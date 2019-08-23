package typings.reactDashVega.reactDashVegaMod

import typings.react.reactMod.CSSProperties
import typings.reactDashVega.Anon_Bottom
import typings.std.Error
import typings.std.Record
import typings.vegaDashTypings.typesRuntimeMod.TooltipHandler
import typings.vegaDashTypings.typesSpecMod.Spec
import typings.vegaDashTypings.vegaDashTypingsMod.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VegaPropsWithSpec extends VegaPropsWithoutSpec {
  var spec: Spec
}

object VegaPropsWithSpec {
  @scala.inline
  def apply(
    spec: Spec,
    background: String = null,
    className: String = null,
    data: Record[String, js.Array[_]] = null,
    enableHover: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    logLevel: Int | Double = null,
    onNewView: /* view */ View => Unit = null,
    onParseError: /* error */ Error => Unit = null,
    padding: Double | Anon_Bottom = null,
    renderer: String = null,
    style: CSSProperties = null,
    tooltip: TooltipHandler = null,
    width: Int | Double = null
  ): VegaPropsWithSpec = {
    val __obj = js.Dynamic.literal(spec = spec)
    if (background != null) __obj.updateDynamic("background")(background)
    if (className != null) __obj.updateDynamic("className")(className)
    if (data != null) __obj.updateDynamic("data")(data)
    if (!js.isUndefined(enableHover)) __obj.updateDynamic("enableHover")(enableHover)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel.asInstanceOf[js.Any])
    if (onNewView != null) __obj.updateDynamic("onNewView")(js.Any.fromFunction1(onNewView))
    if (onParseError != null) __obj.updateDynamic("onParseError")(js.Any.fromFunction1(onParseError))
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(renderer)
    if (style != null) __obj.updateDynamic("style")(style)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[VegaPropsWithSpec]
  }
}

