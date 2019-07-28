package typings.reactstrap.libCardMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod.ReactType
import typings.reactstrap.reactstrapMod.CSSModule
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardProps
  extends HTMLAttributes[HTMLElement]
     with /* key */ StringDictionary[js.Any] {
  var body: js.UndefOr[Boolean] = js.undefined
  var cssModule: js.UndefOr[CSSModule] = js.undefined
  var inverse: js.UndefOr[Boolean] = js.undefined
  var outline: js.UndefOr[Boolean] = js.undefined
  var tag: js.UndefOr[ReactType[_]] = js.undefined
}

object CardProps {
  @scala.inline
  def apply(
    HTMLAttributes: HTMLAttributes[HTMLElement] = null,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    body: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    color: String = null,
    cssModule: CSSModule = null,
    inverse: js.UndefOr[Boolean] = js.undefined,
    outline: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    tag: ReactType[_] = null
  ): CardProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(body)) __obj.updateDynamic("body")(body)
    if (className != null) __obj.updateDynamic("className")(className)
    if (color != null) __obj.updateDynamic("color")(color)
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule)
    if (!js.isUndefined(inverse)) __obj.updateDynamic("inverse")(inverse)
    if (!js.isUndefined(outline)) __obj.updateDynamic("outline")(outline)
    if (style != null) __obj.updateDynamic("style")(style)
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardProps]
  }
}

