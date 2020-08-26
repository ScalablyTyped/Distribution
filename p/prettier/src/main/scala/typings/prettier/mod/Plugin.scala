package typings.prettier.mod

import org.scalablytyped.runtime.StringDictionary
import typings.prettier.anon.PartialRequiredOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Plugin extends js.Object {
  var defaultOptions: js.UndefOr[PartialRequiredOptions] = js.native
  var languages: js.UndefOr[js.Array[SupportLanguage]] = js.native
  var options: js.UndefOr[js.Array[SupportOption]] = js.native
  var parsers: js.UndefOr[StringDictionary[Parser]] = js.native
  var printers: js.UndefOr[StringDictionary[Printer]] = js.native
}

object Plugin {
  @scala.inline
  def apply(): Plugin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Plugin]
  }
  @scala.inline
  implicit class PluginOps[Self <: Plugin] (val x: Self) extends AnyVal {
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
    def setDefaultOptions(value: PartialRequiredOptions): Self = this.set("defaultOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultOptions: Self = this.set("defaultOptions", js.undefined)
    @scala.inline
    def setLanguagesVarargs(value: SupportLanguage*): Self = this.set("languages", js.Array(value :_*))
    @scala.inline
    def setLanguages(value: js.Array[SupportLanguage]): Self = this.set("languages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguages: Self = this.set("languages", js.undefined)
    @scala.inline
    def setOptionsVarargs(value: SupportOption*): Self = this.set("options", js.Array(value :_*))
    @scala.inline
    def setOptions(value: js.Array[SupportOption]): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setParsers(value: StringDictionary[Parser]): Self = this.set("parsers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParsers: Self = this.set("parsers", js.undefined)
    @scala.inline
    def setPrinters(value: StringDictionary[Printer]): Self = this.set("printers", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrinters: Self = this.set("printers", js.undefined)
  }
  
}

