package typings.prismReactRenderer

import typings.prismReactRenderer.mod.Language
import typings.prismReactRenderer.mod.PrismThemeEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLanguages extends js.Object {
  var languages: js.UndefOr[js.Array[Language]] = js.undefined
  var style: PrismThemeEntry
  var types: js.Array[String]
}

object AnonLanguages {
  @scala.inline
  def apply(style: PrismThemeEntry, types: js.Array[String], languages: js.Array[Language] = null): AnonLanguages = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    if (languages != null) __obj.updateDynamic("languages")(languages.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLanguages]
  }
}

