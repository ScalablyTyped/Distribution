package typings.reactstrap.collapseMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.react.mod.ReactType
import typings.reactstrap.anon.Hide
import typings.reactstrap.mod.CSSModule
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollapseProps
  extends AllHTMLAttributes[HTMLElement]
     with ClassAttributes[HTMLElement]
     with /* key */ StringDictionary[js.Any] {
  var classNames: js.UndefOr[String] = js.undefined
  var cssModule: js.UndefOr[CSSModule] = js.undefined
  var delay: js.UndefOr[Hide] = js.undefined
  var isOpen: js.UndefOr[Boolean] = js.undefined
  var navbar: js.UndefOr[Boolean] = js.undefined
  var onClosed: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onEntered: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onEntering: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onExit: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onExited: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onExiting: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onOpened: js.UndefOr[js.Function0[Unit]] = js.undefined
  var tag: js.UndefOr[String | ReactType[_]] = js.undefined
}

object CollapseProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[HTMLElement] = null,
    ClassAttributes: ClassAttributes[HTMLElement] = null,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    classNames: String = null,
    cssModule: CSSModule = null,
    delay: Hide = null,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    navbar: js.UndefOr[Boolean] = js.undefined,
    onClosed: () => Unit = null,
    onEntered: () => Unit = null,
    onEntering: () => Unit = null,
    onExit: () => Unit = null,
    onExited: () => Unit = null,
    onExiting: () => Unit = null,
    onOpened: () => Unit = null,
    tag: String | ReactType[_] = null
  ): CollapseProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (classNames != null) __obj.updateDynamic("classNames")(classNames.asInstanceOf[js.Any])
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen.get.asInstanceOf[js.Any])
    if (!js.isUndefined(navbar)) __obj.updateDynamic("navbar")(navbar.get.asInstanceOf[js.Any])
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

