package typings.reactstrap.libCollapseMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.HTMLProps
import typings.react.reactMod.ReactType
import typings.reactstrap.reactstrapMod.CSSModule
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UncontrolledCollapseProps
  extends HTMLProps[HTMLElement]
     with /* key */ StringDictionary[js.Any] {
  var cssModule: js.UndefOr[CSSModule] = js.undefined
  var isOpen: js.UndefOr[Boolean] = js.undefined
  var navbar: js.UndefOr[Boolean] = js.undefined
  var tag: js.UndefOr[ReactType[_]] = js.undefined
  var toggle: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object UncontrolledCollapseProps {
  @scala.inline
  def apply(
    HTMLProps: HTMLProps[HTMLElement] = null,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    className: String = null,
    cssModule: CSSModule = null,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    navbar: js.UndefOr[Boolean] = js.undefined,
    tag: ReactType[_] = null,
    toggle: () => Unit = null
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

