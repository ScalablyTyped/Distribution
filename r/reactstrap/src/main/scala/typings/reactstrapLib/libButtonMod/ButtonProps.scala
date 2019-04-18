package typings
package reactstrapLib.libButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonProps
  extends reactLib.reactMod.ButtonHTMLAttributes[stdLib.HTMLButtonElement]
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var active: js.UndefOr[scala.Boolean] = js.undefined
  var block: js.UndefOr[scala.Boolean] = js.undefined
  var cssModule: js.UndefOr[reactstrapLib.reactstrapMod.CSSModule] = js.undefined
  var innerRef: js.UndefOr[reactLib.reactMod.Ref[stdLib.HTMLButtonElement]] = js.undefined
  @JSName("onClick")
  var onClick_ButtonProps: js.UndefOr[reactLib.reactMod.MouseEventHandler[_]] = js.undefined
  var outline: js.UndefOr[scala.Boolean] = js.undefined
  var size: js.UndefOr[js.Any] = js.undefined
  var tag: js.UndefOr[reactLib.reactMod.ReactType[_]] = js.undefined
}

object ButtonProps {
  @scala.inline
  def apply(
    ButtonHTMLAttributes: reactLib.reactMod.ButtonHTMLAttributes[stdLib.HTMLButtonElement] = null,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    active: js.UndefOr[scala.Boolean] = js.undefined,
    block: js.UndefOr[scala.Boolean] = js.undefined,
    color: java.lang.String = null,
    cssModule: reactstrapLib.reactstrapMod.CSSModule = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    innerRef: reactLib.reactMod.Ref[stdLib.HTMLButtonElement] = null,
    onClick: reactLib.reactMod.MouseEventHandler[_] = null,
    outline: js.UndefOr[scala.Boolean] = js.undefined,
    size: js.Any = null,
    style: reactLib.reactMod.CSSProperties = null,
    tag: reactLib.reactMod.ReactType[_] = null
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
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (!js.isUndefined(outline)) __obj.updateDynamic("outline")(outline)
    if (size != null) __obj.updateDynamic("size")(size)
    if (style != null) __obj.updateDynamic("style")(style)
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonProps]
  }
}

