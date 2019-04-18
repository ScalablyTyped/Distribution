package typings
package reactstrapLib.libMediaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaProps
  extends reactLib.reactMod.HTMLAttributes[stdLib.HTMLElement]
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var alt: js.UndefOr[java.lang.String] = js.undefined
  var body: js.UndefOr[scala.Boolean] = js.undefined
  var bottom: js.UndefOr[scala.Boolean] = js.undefined
  var cssModule: js.UndefOr[reactstrapLib.reactstrapMod.CSSModule] = js.undefined
  var heading: js.UndefOr[scala.Boolean] = js.undefined
  var href: js.UndefOr[java.lang.String] = js.undefined
  var left: js.UndefOr[scala.Boolean] = js.undefined
  var list: js.UndefOr[scala.Boolean] = js.undefined
  var middle: js.UndefOr[scala.Boolean] = js.undefined
  var `object`: js.UndefOr[scala.Boolean] = js.undefined
  var right: js.UndefOr[scala.Boolean] = js.undefined
  var src: js.UndefOr[java.lang.String] = js.undefined
  var tag: js.UndefOr[reactLib.reactMod.ReactType[_]] = js.undefined
  var top: js.UndefOr[scala.Boolean] = js.undefined
}

object MediaProps {
  @scala.inline
  def apply(
    HTMLAttributes: reactLib.reactMod.HTMLAttributes[stdLib.HTMLElement] = null,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    alt: java.lang.String = null,
    body: js.UndefOr[scala.Boolean] = js.undefined,
    bottom: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    cssModule: reactstrapLib.reactstrapMod.CSSModule = null,
    heading: js.UndefOr[scala.Boolean] = js.undefined,
    href: java.lang.String = null,
    left: js.UndefOr[scala.Boolean] = js.undefined,
    list: js.UndefOr[scala.Boolean] = js.undefined,
    middle: js.UndefOr[scala.Boolean] = js.undefined,
    `object`: js.UndefOr[scala.Boolean] = js.undefined,
    right: js.UndefOr[scala.Boolean] = js.undefined,
    src: java.lang.String = null,
    tag: reactLib.reactMod.ReactType[_] = null,
    top: js.UndefOr[scala.Boolean] = js.undefined
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

