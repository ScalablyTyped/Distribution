package typings.reactstrap.libDropdownMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.HTMLAttributes
import typings.reactstrap.reactstrapMod.CSSModule
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UncontrolledDropdownProps
  extends HTMLAttributes[HTMLElement]
     with /* key */ StringDictionary[js.Any] {
  var cssModule: js.UndefOr[CSSModule] = js.undefined
  var inNavbar: js.UndefOr[Boolean] = js.undefined
  var isOpen: js.UndefOr[Boolean] = js.undefined
  var nav: js.UndefOr[Boolean] = js.undefined
  var setActiveFromChild: js.UndefOr[Boolean] = js.undefined
  var toggle: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object UncontrolledDropdownProps {
  @scala.inline
  def apply(
    HTMLAttributes: HTMLAttributes[HTMLElement] = null,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    className: String = null,
    cssModule: CSSModule = null,
    inNavbar: js.UndefOr[Boolean] = js.undefined,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    nav: js.UndefOr[Boolean] = js.undefined,
    setActiveFromChild: js.UndefOr[Boolean] = js.undefined,
    toggle: () => Unit = null
  ): UncontrolledDropdownProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className)
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule)
    if (!js.isUndefined(inNavbar)) __obj.updateDynamic("inNavbar")(inNavbar)
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen)
    if (!js.isUndefined(nav)) __obj.updateDynamic("nav")(nav)
    if (!js.isUndefined(setActiveFromChild)) __obj.updateDynamic("setActiveFromChild")(setActiveFromChild)
    if (toggle != null) __obj.updateDynamic("toggle")(js.Any.fromFunction0(toggle))
    __obj.asInstanceOf[UncontrolledDropdownProps]
  }
}

