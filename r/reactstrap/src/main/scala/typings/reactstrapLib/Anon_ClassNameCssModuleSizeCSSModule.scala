package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClassNameCssModuleSizeCSSModule extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var cssModule: js.UndefOr[reactstrapLib.reactstrapMod.CSSModule] = js.undefined
  var size: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ClassNameCssModuleSizeCSSModule {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    cssModule: reactstrapLib.reactstrapMod.CSSModule = null,
    size: java.lang.String = null
  ): Anon_ClassNameCssModuleSizeCSSModule = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule)
    if (size != null) __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[Anon_ClassNameCssModuleSizeCSSModule]
  }
}

