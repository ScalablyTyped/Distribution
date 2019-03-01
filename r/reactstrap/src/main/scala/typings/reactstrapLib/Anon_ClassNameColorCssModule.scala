package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClassNameColorCssModule extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
  var cssModule: js.UndefOr[reactstrapLib.reactstrapMod.CSSModule] = js.undefined
  var `inline`: js.UndefOr[scala.Boolean] = js.undefined
  var tag: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_]] = js.undefined
}

object Anon_ClassNameColorCssModule {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    color: java.lang.String = null,
    cssModule: reactstrapLib.reactstrapMod.CSSModule = null,
    `inline`: js.UndefOr[scala.Boolean] = js.undefined,
    tag: reactLib.reactMod.ReactNs.ReactType[_] = null
  ): Anon_ClassNameColorCssModule = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (color != null) __obj.updateDynamic("color")(color)
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule)
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`)
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ClassNameColorCssModule]
  }
}

