package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Alt extends js.Object {
  var alt: js.UndefOr[java.lang.String] = js.undefined
  var bottom: js.UndefOr[scala.Boolean] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var cssModule: js.UndefOr[reactstrapLib.reactstrapMod.CSSModule] = js.undefined
  var height: js.UndefOr[java.lang.String] = js.undefined
  var src: js.UndefOr[java.lang.String] = js.undefined
  var tag: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_]] = js.undefined
  var top: js.UndefOr[scala.Boolean] = js.undefined
  var width: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Alt {
  @scala.inline
  def apply(
    alt: java.lang.String = null,
    bottom: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    cssModule: reactstrapLib.reactstrapMod.CSSModule = null,
    height: java.lang.String = null,
    src: java.lang.String = null,
    tag: reactLib.reactMod.ReactNs.ReactType[_] = null,
    top: js.UndefOr[scala.Boolean] = js.undefined,
    width: java.lang.String = null
  ): Anon_Alt = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (!js.isUndefined(bottom)) __obj.updateDynamic("bottom")(bottom)
    if (className != null) __obj.updateDynamic("className")(className)
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule)
    if (height != null) __obj.updateDynamic("height")(height)
    if (src != null) __obj.updateDynamic("src")(src)
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top)
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[Anon_Alt]
  }
}

