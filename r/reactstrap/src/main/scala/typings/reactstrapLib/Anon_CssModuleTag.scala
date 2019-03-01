package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CssModuleTag extends js.Object {
  var cssModule: js.UndefOr[reactstrapLib.reactstrapMod.CSSModule] = js.undefined
  var tag: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_]] = js.undefined
}

object Anon_CssModuleTag {
  @scala.inline
  def apply(
    cssModule: reactstrapLib.reactstrapMod.CSSModule = null,
    tag: reactLib.reactMod.ReactNs.ReactType[_] = null
  ): Anon_CssModuleTag = {
    val __obj = js.Dynamic.literal()
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule)
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CssModuleTag]
  }
}

