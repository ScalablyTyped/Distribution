package typings.reactstrap.libCollapseMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.HTMLProps
import typings.react.reactMod.ReactType
import typings.reactstrap.Anon_Hide
import typings.reactstrap.reactstrapMod.CSSModule
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollapseProps
  extends HTMLProps[HTMLElement]
     with /* key */ StringDictionary[js.Any] {
  var classNames: js.UndefOr[String] = js.undefined
  var cssModule: js.UndefOr[CSSModule] = js.undefined
  var delay: js.UndefOr[Anon_Hide] = js.undefined
  var isOpen: js.UndefOr[Boolean] = js.undefined
  var navbar: js.UndefOr[Boolean] = js.undefined
  var onClosed: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onEntered: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onEntering: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onExit: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onExited: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onExiting: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onOpened: js.UndefOr[js.Function0[Unit]] = js.undefined
  var tag: js.UndefOr[ReactType[_]] = js.undefined
}

object CollapseProps {
  @scala.inline
  def apply(
    HTMLProps: HTMLProps[HTMLElement] = null,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    classNames: String = null,
    cssModule: CSSModule = null,
    delay: Anon_Hide = null,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    navbar: js.UndefOr[Boolean] = js.undefined,
    onClosed: () => Unit = null,
    onEntered: () => Unit = null,
    onEntering: () => Unit = null,
    onExit: () => Unit = null,
    onExited: () => Unit = null,
    onExiting: () => Unit = null,
    onOpened: () => Unit = null,
    tag: ReactType[_] = null
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

