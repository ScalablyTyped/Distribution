package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArialabelClassNameCssModule extends js.Object {
  var `aria-label`: js.UndefOr[java.lang.String] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var cssModule: js.UndefOr[reactstrapLib.reactstrapMod.CSSModule] = js.undefined
  var listClassName: js.UndefOr[java.lang.String] = js.undefined
  var listTag: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_]] = js.undefined
  var size: js.UndefOr[java.lang.String] = js.undefined
  var tag: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_]] = js.undefined
}

object Anon_ArialabelClassNameCssModule {
  @scala.inline
  def apply(
    `aria-label`: java.lang.String = null,
    className: java.lang.String = null,
    cssModule: reactstrapLib.reactstrapMod.CSSModule = null,
    listClassName: java.lang.String = null,
    listTag: reactLib.reactMod.ReactNs.ReactType[_] = null,
    size: java.lang.String = null,
    tag: reactLib.reactMod.ReactNs.ReactType[_] = null
  ): Anon_ArialabelClassNameCssModule = {
    val __obj = js.Dynamic.literal()
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`)
    if (className != null) __obj.updateDynamic("className")(className)
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule)
    if (listClassName != null) __obj.updateDynamic("listClassName")(listClassName)
    if (listTag != null) __obj.updateDynamic("listTag")(listTag.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size)
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ArialabelClassNameCssModule]
  }
}

