package typings
package prettierLib.prettierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plugin extends js.Object {
  var defaultOptions: js.UndefOr[stdLib.Partial[RequiredOptions]] = js.undefined
  var languages: js.Array[SupportLanguage]
  var options: js.UndefOr[js.Array[SupportOption]] = js.undefined
  var parsers: org.scalablytyped.runtime.StringDictionary[Parser]
  var printers: org.scalablytyped.runtime.StringDictionary[Printer]
}

object Plugin {
  @scala.inline
  def apply(
    languages: js.Array[SupportLanguage],
    parsers: org.scalablytyped.runtime.StringDictionary[Parser],
    printers: org.scalablytyped.runtime.StringDictionary[Printer],
    defaultOptions: stdLib.Partial[RequiredOptions] = null,
    options: js.Array[SupportOption] = null
  ): Plugin = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("languages")(languages)
    __obj.updateDynamic("parsers")(parsers)
    __obj.updateDynamic("printers")(printers)
    if (defaultOptions != null) __obj.updateDynamic("defaultOptions")(defaultOptions)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[Plugin]
  }
}

