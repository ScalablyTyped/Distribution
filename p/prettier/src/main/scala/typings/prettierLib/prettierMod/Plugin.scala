package typings
package prettierLib.prettierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plugin extends js.Object {
  var defaultOptions: js.UndefOr[stdLib.Partial[RequiredOptions]] = js.undefined
  var languages: js.UndefOr[js.Array[SupportLanguage]] = js.undefined
  var options: js.UndefOr[js.Array[SupportOption]] = js.undefined
  var parsers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[Parser]] = js.undefined
  var printers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[Printer]] = js.undefined
}

object Plugin {
  @scala.inline
  def apply(
    defaultOptions: stdLib.Partial[RequiredOptions] = null,
    languages: js.Array[SupportLanguage] = null,
    options: js.Array[SupportOption] = null,
    parsers: org.scalablytyped.runtime.StringDictionary[Parser] = null,
    printers: org.scalablytyped.runtime.StringDictionary[Printer] = null
  ): Plugin = {
    val __obj = js.Dynamic.literal()
    if (defaultOptions != null) __obj.updateDynamic("defaultOptions")(defaultOptions)
    if (languages != null) __obj.updateDynamic("languages")(languages)
    if (options != null) __obj.updateDynamic("options")(options)
    if (parsers != null) __obj.updateDynamic("parsers")(parsers)
    if (printers != null) __obj.updateDynamic("printers")(printers)
    __obj.asInstanceOf[Plugin]
  }
}

