package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CssModuleIn extends js.Object {
  var cssModule: js.UndefOr[reactstrapLib.reactstrapMod.CSSModule] = js.undefined
  var in: js.UndefOr[scala.Boolean] = js.undefined
  var slide: js.UndefOr[scala.Boolean] = js.undefined
  var tag: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_]] = js.undefined
}

object Anon_CssModuleIn {
  @scala.inline
  def apply(
    cssModule: reactstrapLib.reactstrapMod.CSSModule = null,
    in: js.UndefOr[scala.Boolean] = js.undefined,
    slide: js.UndefOr[scala.Boolean] = js.undefined,
    tag: reactLib.reactMod.ReactNs.ReactType[_] = null
  ): Anon_CssModuleIn = {
    val __obj = js.Dynamic.literal()
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule)
    if (!js.isUndefined(in)) __obj.updateDynamic("in")(in)
    if (!js.isUndefined(slide)) __obj.updateDynamic("slide")(slide)
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CssModuleIn]
  }
}

