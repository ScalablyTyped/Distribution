package typings
package reactstrapLib.libCollapseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollapseProps
  extends reactLib.reactMod.HTMLProps[stdLib.HTMLElement]
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var classNames: js.UndefOr[java.lang.String] = js.undefined
  var cssModule: js.UndefOr[reactstrapLib.reactstrapMod.CSSModule] = js.undefined
  var delay: js.UndefOr[reactstrapLib.Anon_Hide] = js.undefined
  var isOpen: js.UndefOr[scala.Boolean] = js.undefined
  var navbar: js.UndefOr[scala.Boolean] = js.undefined
  var onClosed: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onEntered: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onEntering: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onExit: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onExited: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onExiting: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onOpened: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var tag: js.UndefOr[reactLib.reactMod.ReactType[_]] = js.undefined
}

object CollapseProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.HTMLProps[stdLib.HTMLElement] = null,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    classNames: java.lang.String = null,
    cssModule: reactstrapLib.reactstrapMod.CSSModule = null,
    delay: reactstrapLib.Anon_Hide = null,
    isOpen: js.UndefOr[scala.Boolean] = js.undefined,
    navbar: js.UndefOr[scala.Boolean] = js.undefined,
    onClosed: () => scala.Unit = null,
    onEntered: () => scala.Unit = null,
    onEntering: () => scala.Unit = null,
    onExit: () => scala.Unit = null,
    onExited: () => scala.Unit = null,
    onExiting: () => scala.Unit = null,
    onOpened: () => scala.Unit = null,
    tag: reactLib.reactMod.ReactType[_] = null
  ): CollapseProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (classNames != null) __obj.updateDynamic("classNames")(classNames)
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule)
    if (delay != null) __obj.updateDynamic("delay")(delay)
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen)
    if (!js.isUndefined(navbar)) __obj.updateDynamic("navbar")(navbar)
    if (onClosed != null) __obj.updateDynamic("onClosed")(js.Any.fromFunction0(onClosed))
    if (onEntered != null) __obj.updateDynamic("onEntered")(js.Any.fromFunction0(onEntered))
    if (onEntering != null) __obj.updateDynamic("onEntering")(js.Any.fromFunction0(onEntering))
    if (onExit != null) __obj.updateDynamic("onExit")(js.Any.fromFunction0(onExit))
    if (onExited != null) __obj.updateDynamic("onExited")(js.Any.fromFunction0(onExited))
    if (onExiting != null) __obj.updateDynamic("onExiting")(js.Any.fromFunction0(onExiting))
    if (onOpened != null) __obj.updateDynamic("onOpened")(js.Any.fromFunction0(onOpened))
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollapseProps]
  }
}

