package typings.reactstrap.libRowMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.HTMLProps
import typings.react.reactMod.ReactType
import typings.reactstrap.reactstrapMod.CSSModule
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowProps
  extends HTMLProps[HTMLElement]
     with /* key */ StringDictionary[js.Any] {
  var cssModule: js.UndefOr[CSSModule] = js.undefined
  var noGutters: js.UndefOr[Boolean] = js.undefined
  var tag: js.UndefOr[ReactType[_]] = js.undefined
}

object RowProps {
  @scala.inline
  def apply(
    HTMLProps: HTMLProps[HTMLElement] = null,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    className: String = null,
    cssModule: CSSModule = null,
    noGutters: js.UndefOr[Boolean] = js.undefined,
    tag: ReactType[_] = null
  ): RowProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className)
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule)
    if (!js.isUndefined(noGutters)) __obj.updateDynamic("noGutters")(noGutters)
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowProps]
  }
}

