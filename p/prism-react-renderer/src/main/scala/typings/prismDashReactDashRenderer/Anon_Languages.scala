package typings.prismDashReactDashRenderer

import typings.prismDashReactDashRenderer.prismDashReactDashRendererMod.Language
import typings.prismDashReactDashRenderer.prismDashReactDashRendererMod.PrismThemeEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Languages extends js.Object {
  var languages: js.UndefOr[js.Array[Language]] = js.undefined
  var style: PrismThemeEntry
  var types: js.Array[String]
}

object Anon_Languages {
  @scala.inline
  def apply(style: PrismThemeEntry, types: js.Array[String], languages: js.Array[Language] = null): Anon_Languages = {
    val __obj = js.Dynamic.literal(style = style, types = types)
    if (languages != null) __obj.updateDynamic("languages")(languages)
    __obj.asInstanceOf[Anon_Languages]
  }
}

