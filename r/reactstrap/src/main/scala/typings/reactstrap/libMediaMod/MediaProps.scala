package typings.reactstrap.libMediaMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod.ReactType
import typings.reactstrap.reactstrapMod.CSSModule
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaProps
  extends HTMLAttributes[HTMLElement]
     with /* key */ StringDictionary[js.Any] {
  var alt: js.UndefOr[String] = js.undefined
  var body: js.UndefOr[Boolean] = js.undefined
  var bottom: js.UndefOr[Boolean] = js.undefined
  var cssModule: js.UndefOr[CSSModule] = js.undefined
  var heading: js.UndefOr[Boolean] = js.undefined
  var href: js.UndefOr[String] = js.undefined
  var left: js.UndefOr[Boolean] = js.undefined
  var list: js.UndefOr[Boolean] = js.undefined
  var middle: js.UndefOr[Boolean] = js.undefined
  var `object`: js.UndefOr[Boolean] = js.undefined
  var right: js.UndefOr[Boolean] = js.undefined
  var src: js.UndefOr[String] = js.undefined
  var tag: js.UndefOr[String | ReactType[_]] = js.undefined
  var top: js.UndefOr[Boolean] = js.undefined
}

object MediaProps {
  @scala.inline
  def apply(
    HTMLAttributes: HTMLAttributes[HTMLElement] = null,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    alt: String = null,
    body: js.UndefOr[Boolean] = js.undefined,
    bottom: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    cssModule: CSSModule = null,
    heading: js.UndefOr[Boolean] = js.undefined,
    href: String = null,
    left: js.UndefOr[Boolean] = js.undefined,
    list: js.UndefOr[Boolean] = js.undefined,
    middle: js.UndefOr[Boolean] = js.undefined,
    `object`: js.UndefOr[Boolean] = js.undefined,
    right: js.UndefOr[Boolean] = js.undefined,
    src: String = null,
    tag: String | ReactType[_] = null,
    top: js.UndefOr[Boolean] = js.undefined
  ): MediaProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (!js.isUndefined(body)) __obj.updateDynamic("body")(body)
    if (!js.isUndefined(bottom)) __obj.updateDynamic("bottom")(bottom)
    if (className != null) __obj.updateDynamic("className")(className)
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule)
    if (!js.isUndefined(heading)) __obj.updateDynamic("heading")(heading)
    if (href != null) __obj.updateDynamic("href")(href)
    if (!js.isUndefined(left)) __obj.updateDynamic("left")(left)
    if (!js.isUndefined(list)) __obj.updateDynamic("list")(list)
    if (!js.isUndefined(middle)) __obj.updateDynamic("middle")(middle)
    if (!js.isUndefined(`object`)) __obj.updateDynamic("object")(`object`)
    if (!js.isUndefined(right)) __obj.updateDynamic("right")(right)
    if (src != null) __obj.updateDynamic("src")(src)
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top)
    __obj.asInstanceOf[MediaProps]
  }
}

