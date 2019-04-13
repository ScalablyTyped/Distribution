package typings
package prismDashReactDashRendererLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Languages extends js.Object {
  var languages: js.UndefOr[js.Array[prismDashReactDashRendererLib.prismDashReactDashRendererMod.Language]] = js.undefined
  var style: prismDashReactDashRendererLib.prismDashReactDashRendererMod.PrismThemeEntry
  var types: js.Array[java.lang.String]
}

object Anon_Languages {
  @scala.inline
  def apply(
    style: prismDashReactDashRendererLib.prismDashReactDashRendererMod.PrismThemeEntry,
    types: js.Array[java.lang.String],
    languages: js.Array[prismDashReactDashRendererLib.prismDashReactDashRendererMod.Language] = null
  ): Anon_Languages = {
    val __obj = js.Dynamic.literal(style = style, types = types)
    if (languages != null) __obj.updateDynamic("languages")(languages)
    __obj.asInstanceOf[Anon_Languages]
  }
}

