package typings
package reactstrapLib.libCardImgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardImgProps
  extends reactLib.reactMod.HTMLAttributes[stdLib.HTMLElement]
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var alt: js.UndefOr[java.lang.String] = js.undefined
  var bottom: js.UndefOr[scala.Boolean] = js.undefined
  var cssModule: js.UndefOr[reactstrapLib.reactstrapMod.CSSModule] = js.undefined
  var height: js.UndefOr[java.lang.String] = js.undefined
  var src: js.UndefOr[java.lang.String] = js.undefined
  var tag: js.UndefOr[reactLib.reactMod.ReactType[_]] = js.undefined
  var top: js.UndefOr[scala.Boolean] = js.undefined
  var width: js.UndefOr[java.lang.String] = js.undefined
}

object CardImgProps {
  @scala.inline
  def apply(
    HTMLAttributes: reactLib.reactMod.HTMLAttributes[stdLib.HTMLElement] = null,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    alt: java.lang.String = null,
    bottom: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    cssModule: reactstrapLib.reactstrapMod.CSSModule = null,
    height: java.lang.String = null,
    src: java.lang.String = null,
    tag: reactLib.reactMod.ReactType[_] = null,
    top: js.UndefOr[scala.Boolean] = js.undefined,
    width: java.lang.String = null
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

