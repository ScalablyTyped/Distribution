package typings
package prettierLib.prettierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Plugin extends js.Object {
  var defaultOptions: js.UndefOr[stdLib.Partial[RequiredOptions]] = js.undefined
  var languages: js.Array[SupportLanguage]
  var options: js.UndefOr[js.Array[SupportOption]] = js.undefined
  var parsers: ScalablyTyped.runtime.StringDictionary[Parser]
  var printers: ScalablyTyped.runtime.StringDictionary[Printer]
}

