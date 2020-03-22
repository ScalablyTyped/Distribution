package typings.prettier.mod

import org.scalablytyped.runtime.StringDictionary
import typings.prettier.PartialRequiredOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plugin extends js.Object {
  var defaultOptions: js.UndefOr[PartialRequiredOptions] = js.undefined
  var languages: js.UndefOr[js.Array[SupportLanguage]] = js.undefined
  var options: js.UndefOr[js.Array[SupportOption]] = js.undefined
  var parsers: js.UndefOr[StringDictionary[Parser]] = js.undefined
  var printers: js.UndefOr[StringDictionary[Printer]] = js.undefined
}

object Plugin {
  @scala.inline
  def apply(
    defaultOptions: PartialRequiredOptions = null,
    languages: js.Array[SupportLanguage] = null,
    options: js.Array[SupportOption] = null,
    parsers: StringDictionary[Parser] = null,
    printers: StringDictionary[Printer] = null
  ): Plugin = {
    val __obj = js.Dynamic.literal()
    if (defaultOptions != null) __obj.updateDynamic("defaultOptions")(defaultOptions.asInstanceOf[js.Any])
    if (languages != null) __obj.updateDynamic("languages")(languages.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (parsers != null) __obj.updateDynamic("parsers")(parsers.asInstanceOf[js.Any])
    if (printers != null) __obj.updateDynamic("printers")(printers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Plugin]
  }
}

