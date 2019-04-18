package typings
package reactstrapLib.libCollapseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UncontrolledCollapseProps
  extends reactLib.reactMod.HTMLProps[stdLib.HTMLElement]
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var cssModule: js.UndefOr[reactstrapLib.reactstrapMod.CSSModule] = js.undefined
  var isOpen: js.UndefOr[scala.Boolean] = js.undefined
  var navbar: js.UndefOr[scala.Boolean] = js.undefined
  var tag: js.UndefOr[reactLib.reactMod.ReactType[_]] = js.undefined
  var toggle: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object UncontrolledCollapseProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.HTMLProps[stdLib.HTMLElement] = null,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    className: java.lang.String = null,
    cssModule: reactstrapLib.reactstrapMod.CSSModule = null,
    isOpen: js.UndefOr[scala.Boolean] = js.undefined,
    navbar: js.UndefOr[scala.Boolean] = js.undefined,
    tag: reactLib.reactMod.ReactType[_] = null,
    toggle: () => scala.Unit = null
  ): UncontrolledCollapseProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className)
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule)
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen)
    if (!js.isUndefined(navbar)) __obj.updateDynamic("navbar")(navbar)
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (toggle != null) __obj.updateDynamic("toggle")(js.Any.fromFunction0(toggle))
    __obj.asInstanceOf[UncontrolledCollapseProps]
  }
}

