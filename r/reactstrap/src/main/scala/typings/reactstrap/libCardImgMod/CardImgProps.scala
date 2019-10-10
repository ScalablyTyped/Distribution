package typings.reactstrap.libCardImgMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod.ReactType
import typings.reactstrap.reactstrapMod.CSSModule
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardImgProps
  extends HTMLAttributes[HTMLElement]
     with /* key */ StringDictionary[js.Any] {
  var alt: js.UndefOr[String] = js.undefined
  var bottom: js.UndefOr[Boolean] = js.undefined
  var cssModule: js.UndefOr[CSSModule] = js.undefined
  var height: js.UndefOr[String] = js.undefined
  var src: js.UndefOr[String] = js.undefined
  var tag: js.UndefOr[String | ReactType[_]] = js.undefined
  var top: js.UndefOr[Boolean] = js.undefined
  var width: js.UndefOr[String] = js.undefined
}

object CardImgProps {
  @scala.inline
  def apply(
    HTMLAttributes: HTMLAttributes[HTMLElement] = null,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    alt: String = null,
    bottom: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    cssModule: CSSModule = null,
    height: String = null,
    src: String = null,
    tag: String | ReactType[_] = null,
    top: js.UndefOr[Boolean] = js.undefined,
    width: String = null
  ): CardImgProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (!js.isUndefined(bottom)) __obj.updateDynamic("bottom")(bottom)
    if (className != null) __obj.updateDynamic("className")(className)
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule)
    if (height != null) __obj.updateDynamic("height")(height)
    if (src != null) __obj.updateDynamic("src")(src)
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top)
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[CardImgProps]
  }
}

