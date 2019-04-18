package typings
package reactstrapLib.libDropdownMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropdownMenuProps
  extends reactLib.reactMod.HTMLAttributes[stdLib.HTMLElement]
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var cssModule: js.UndefOr[reactstrapLib.reactstrapMod.CSSModule] = js.undefined
  var flip: js.UndefOr[scala.Boolean] = js.undefined
  var modifiers: js.UndefOr[popperDotJsLib.popperDotJsMod.Modifiers] = js.undefined
  var persist: js.UndefOr[scala.Boolean] = js.undefined
  var right: js.UndefOr[scala.Boolean] = js.undefined
  var tag: js.UndefOr[reactLib.reactMod.ReactType[_]] = js.undefined
}

object DropdownMenuProps {
  @scala.inline
  def apply(
    HTMLAttributes: reactLib.reactMod.HTMLAttributes[stdLib.HTMLElement] = null,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    className: java.lang.String = null,
    cssModule: reactstrapLib.reactstrapMod.CSSModule = null,
    flip: js.UndefOr[scala.Boolean] = js.undefined,
    modifiers: popperDotJsLib.popperDotJsMod.Modifiers = null,
    persist: js.UndefOr[scala.Boolean] = js.undefined,
    right: js.UndefOr[scala.Boolean] = js.undefined,
    tag: reactLib.reactMod.ReactType[_] = null
  ): DropdownMenuProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className)
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule)
    if (!js.isUndefined(flip)) __obj.updateDynamic("flip")(flip)
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers)
    if (!js.isUndefined(persist)) __obj.updateDynamic("persist")(persist)
    if (!js.isUndefined(right)) __obj.updateDynamic("right")(right)
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropdownMenuProps]
  }
}

