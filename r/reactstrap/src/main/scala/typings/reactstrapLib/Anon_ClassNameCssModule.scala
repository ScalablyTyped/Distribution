package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClassNameCssModule extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var cssModule: js.UndefOr[reactstrapLib.reactstrapMod.CSSModule] = js.undefined
  var listClassName: js.UndefOr[java.lang.String] = js.undefined
  var listTag: js.UndefOr[java.lang.String] = js.undefined
  var tag: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ClassNameCssModule {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    cssModule: reactstrapLib.reactstrapMod.CSSModule = null,
    listClassName: java.lang.String = null,
    listTag: java.lang.String = null,
    tag: java.lang.String = null
  ): Anon_ClassNameCssModule = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule)
    if (listClassName != null) __obj.updateDynamic("listClassName")(listClassName)
    if (listTag != null) __obj.updateDynamic("listTag")(listTag)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    __obj.asInstanceOf[Anon_ClassNameCssModule]
  }
}

