package typings
package reactstrapLib.libDropdownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UncontrolledDropdownProps
  extends reactLib.reactMod.HTMLAttributes[stdLib.HTMLElement]
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var cssModule: js.UndefOr[reactstrapLib.reactstrapMod.CSSModule] = js.undefined
  var inNavbar: js.UndefOr[scala.Boolean] = js.undefined
  var isOpen: js.UndefOr[scala.Boolean] = js.undefined
  var nav: js.UndefOr[scala.Boolean] = js.undefined
  var setActiveFromChild: js.UndefOr[scala.Boolean] = js.undefined
  var toggle: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object UncontrolledDropdownProps {
  @scala.inline
  def apply(
    HTMLAttributes: reactLib.reactMod.HTMLAttributes[stdLib.HTMLElement] = null,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    className: java.lang.String = null,
    cssModule: reactstrapLib.reactstrapMod.CSSModule = null,
    inNavbar: js.UndefOr[scala.Boolean] = js.undefined,
    isOpen: js.UndefOr[scala.Boolean] = js.undefined,
    nav: js.UndefOr[scala.Boolean] = js.undefined,
    setActiveFromChild: js.UndefOr[scala.Boolean] = js.undefined,
    toggle: () => scala.Unit = null
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

