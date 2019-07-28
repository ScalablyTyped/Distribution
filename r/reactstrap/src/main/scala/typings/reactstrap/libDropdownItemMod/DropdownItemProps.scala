package typings.reactstrap.libDropdownItemMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.NativeMouseEvent
import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.ReactType
import typings.reactstrap.reactstrapMod.CSSModule
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropdownItemProps
  extends HTMLAttributes[HTMLElement]
     with /* key */ StringDictionary[js.Any] {
  var active: js.UndefOr[Boolean] = js.undefined
  var cssModule: js.UndefOr[CSSModule] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var divider: js.UndefOr[Boolean] = js.undefined
  var header: js.UndefOr[Boolean] = js.undefined
  var href: js.UndefOr[String] = js.undefined
  @JSName("onClick")
  var onClick_DropdownItemProps: js.UndefOr[js.Function1[/* event */ MouseEvent[_, NativeMouseEvent], Unit]] = js.undefined
  var tag: js.UndefOr[ReactType[_]] = js.undefined
  var toggle: js.UndefOr[Boolean] = js.undefined
}

object DropdownItemProps {
  @scala.inline
  def apply(
    HTMLAttributes: HTMLAttributes[HTMLElement] = null,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    active: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    cssModule: CSSModule = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    divider: js.UndefOr[Boolean] = js.undefined,
    header: js.UndefOr[Boolean] = js.undefined,
    href: String = null,
    onClick: /* event */ MouseEvent[_, NativeMouseEvent] => Unit = null,
    tag: ReactType[_] = null,
    toggle: js.UndefOr[Boolean] = js.undefined
  ): DropdownItemProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (className != null) __obj.updateDynamic("className")(className)
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(divider)) __obj.updateDynamic("divider")(divider)
    if (!js.isUndefined(header)) __obj.updateDynamic("header")(header)
    if (href != null) __obj.updateDynamic("href")(href)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (!js.isUndefined(toggle)) __obj.updateDynamic("toggle")(toggle)
    __obj.asInstanceOf[DropdownItemProps]
  }
}

