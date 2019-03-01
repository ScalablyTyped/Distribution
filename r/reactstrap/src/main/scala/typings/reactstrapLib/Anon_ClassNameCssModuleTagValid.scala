package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClassNameCssModuleTagValid extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var cssModule: js.UndefOr[reactstrapLib.reactstrapMod.CSSModule] = js.undefined
  var tag: js.UndefOr[java.lang.String] = js.undefined
  var valid: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_ClassNameCssModuleTagValid {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    cssModule: reactstrapLib.reactstrapMod.CSSModule = null,
    tag: java.lang.String = null,
    valid: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_ClassNameCssModuleTagValid = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    if (!js.isUndefined(valid)) __obj.updateDynamic("valid")(valid)
    __obj.asInstanceOf[Anon_ClassNameCssModuleTagValid]
  }
}

