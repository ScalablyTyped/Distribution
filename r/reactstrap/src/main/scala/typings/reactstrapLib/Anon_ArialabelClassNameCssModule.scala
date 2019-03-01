package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArialabelClassNameCssModule extends js.Object {
  var `aria-label`: js.UndefOr[java.lang.String] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var cssModule: js.UndefOr[reactstrapLib.reactstrapMod.CSSModule] = js.undefined
  var next: js.UndefOr[scala.Boolean] = js.undefined
  var previous: js.UndefOr[scala.Boolean] = js.undefined
  var tag: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_]] = js.undefined
}

object Anon_ArialabelClassNameCssModule {
  @scala.inline
  def apply(
    `aria-label`: java.lang.String = null,
    className: java.lang.String = null,
    cssModule: reactstrapLib.reactstrapMod.CSSModule = null,
    next: js.UndefOr[scala.Boolean] = js.undefined,
    previous: js.UndefOr[scala.Boolean] = js.undefined,
    tag: reactLib.reactMod.ReactNs.ReactType[_] = null
  ): Anon_ArialabelClassNameCssModule = {
    val __obj = js.Dynamic.literal()
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`)
    if (className != null) __obj.updateDynamic("className")(className)
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule)
    if (!js.isUndefined(next)) __obj.updateDynamic("next")(next)
    if (!js.isUndefined(previous)) __obj.updateDynamic("previous")(previous)
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ArialabelClassNameCssModule]
  }
}

