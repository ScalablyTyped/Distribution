package typings.prismReactRenderer.anon

import typings.prismReactRenderer.mod.Language
import typings.prismReactRenderer.mod.PrismThemeEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Languages extends js.Object {
  var languages: js.UndefOr[js.Array[Language]] = js.native
  var style: PrismThemeEntry = js.native
  var types: js.Array[String] = js.native
}

object Languages {
  @scala.inline
  def apply(style: PrismThemeEntry, types: js.Array[String]): Languages = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[Languages]
  }
  @scala.inline
  implicit class LanguagesOps[Self <: Languages] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setStyle(value: PrismThemeEntry): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypesVarargs(value: String*): Self = this.set("types", js.Array(value :_*))
    @scala.inline
    def setTypes(value: js.Array[String]): Self = this.set("types", value.asInstanceOf[js.Any])
    @scala.inline
    def setLanguagesVarargs(value: Language*): Self = this.set("languages", js.Array(value :_*))
    @scala.inline
    def setLanguages(value: js.Array[Language]): Self = this.set("languages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguages: Self = this.set("languages", js.undefined)
  }
  
}

