package typings.reactstrap.libDropdownMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.NativeMouseEvent
import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod.KeyboardEvent
import typings.react.reactMod.KeyboardEventHandler
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.MouseEventHandler
import typings.react.reactMod.ReactNode
import typings.react.reactMod.ReactType
import typings.reactstrap.reactstrapMod.CSSModule
import typings.reactstrap.reactstrapStrings.append
import typings.reactstrap.reactstrapStrings.prepend
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropdownProps
  extends HTMLAttributes[HTMLElement]
     with /* key */ StringDictionary[js.Any] {
  var active: js.UndefOr[Boolean] = js.undefined
  var addonType: js.UndefOr[Boolean | prepend | append] = js.undefined
  var cssModule: js.UndefOr[CSSModule] = js.undefined
  var direction: js.UndefOr[Direction] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var group: js.UndefOr[Boolean] = js.undefined
  var inNavbar: js.UndefOr[Boolean] = js.undefined
  var isOpen: js.UndefOr[Boolean] = js.undefined
  var nav: js.UndefOr[Boolean] = js.undefined
  var setActiveFromChild: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[String] = js.undefined
  var tag: js.UndefOr[String | ReactType[_]] = js.undefined
  var toggle: js.UndefOr[KeyboardEventHandler[_] | MouseEventHandler[_]] = js.undefined
}

object DropdownProps {
  @scala.inline
  def apply(
    HTMLAttributes: HTMLAttributes[HTMLElement] = null,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    active: js.UndefOr[Boolean] = js.undefined,
    addonType: Boolean | prepend | append = null,
    children: ReactNode = null,
    className: String = null,
    cssModule: CSSModule = null,
    direction: Direction = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    group: js.UndefOr[Boolean] = js.undefined,
    inNavbar: js.UndefOr[Boolean] = js.undefined,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    nav: js.UndefOr[Boolean] = js.undefined,
    setActiveFromChild: js.UndefOr[Boolean] = js.undefined,
    size: String = null,
    tag: String | ReactType[_] = null,
    toggle: KeyboardEvent[_] | (MouseEvent[_, NativeMouseEvent]) => Unit = null
  ): DropdownProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (addonType != null) __obj.updateDynamic("addonType")(addonType.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule)
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(group)) __obj.updateDynamic("group")(group)
    if (!js.isUndefined(inNavbar)) __obj.updateDynamic("inNavbar")(inNavbar)
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen)
    if (!js.isUndefined(nav)) __obj.updateDynamic("nav")(nav)
    if (!js.isUndefined(setActiveFromChild)) __obj.updateDynamic("setActiveFromChild")(setActiveFromChild)
    if (size != null) __obj.updateDynamic("size")(size)
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (toggle != null) __obj.updateDynamic("toggle")(js.Any.fromFunction1(toggle))
    __obj.asInstanceOf[DropdownProps]
  }
}

