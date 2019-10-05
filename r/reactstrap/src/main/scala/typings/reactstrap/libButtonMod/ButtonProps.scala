package typings.reactstrap.libButtonMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.NativeMouseEvent
import typings.react.reactMod.ButtonHTMLAttributes
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.MouseEventHandler
import typings.react.reactMod.ReactType
import typings.react.reactMod.Ref
import typings.reactstrap.reactstrapMod.CSSModule
import typings.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonProps
  extends ButtonHTMLAttributes[HTMLButtonElement]
     with /* key */ StringDictionary[js.Any] {
  var active: js.UndefOr[Boolean] = js.undefined
  var block: js.UndefOr[Boolean] = js.undefined
  var cssModule: js.UndefOr[CSSModule] = js.undefined
  var innerRef: js.UndefOr[Ref[HTMLButtonElement]] = js.undefined
  @JSName("onClick")
  var onClick_ButtonProps: js.UndefOr[MouseEventHandler[_]] = js.undefined
  var outline: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[js.Any] = js.undefined
  var tag: js.UndefOr[ReactType[_]] = js.undefined
}

object ButtonProps {
  @scala.inline
  def apply(
    ButtonHTMLAttributes: ButtonHTMLAttributes[HTMLButtonElement] = null,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    active: js.UndefOr[Boolean] = js.undefined,
    block: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    cssModule: CSSModule = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    innerRef: Ref[HTMLButtonElement] = null,
    onClick: MouseEvent[_, NativeMouseEvent] => Unit = null,
    outline: js.UndefOr[Boolean] = js.undefined,
    size: js.Any = null,
    style: CSSProperties = null,
    tag: ReactType[_] = null
  ): ButtonProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, ButtonHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (!js.isUndefined(block)) __obj.updateDynamic("block")(block)
    if (color != null) __obj.updateDynamic("color")(color)
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (id != null) __obj.updateDynamic("id")(id)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (!js.isUndefined(outline)) __obj.updateDynamic("outline")(outline)
    if (size != null) __obj.updateDynamic("size")(size)
    if (style != null) __obj.updateDynamic("style")(style)
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonProps]
  }
}

