package typings.regjsparser.mod

import typings.regjsparser.regjsparserStrings.`null`
import typings.regjsparser.regjsparserStrings.controlLetter
import typings.regjsparser.regjsparserStrings.hexadecimalEscape
import typings.regjsparser.regjsparserStrings.identifier
import typings.regjsparser.regjsparserStrings.octal
import typings.regjsparser.regjsparserStrings.singleEscape
import typings.regjsparser.regjsparserStrings.symbol
import typings.regjsparser.regjsparserStrings.unicodeCodePointEscape
import typings.regjsparser.regjsparserStrings.unicodeEscape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.regjsparser.mod.CharacterClassEscape
  - typings.regjsparser.mod.CharacterClassRange
  - typings.regjsparser.mod.UnicodePropertyEscape
  - typings.regjsparser.mod.Value
*/
trait CharacterClassBody extends StObject
object CharacterClassBody {
  
  inline def CharacterClassEscape(range: js.Tuple2[Double, Double], raw: String, value: String): typings.regjsparser.mod.CharacterClassEscape = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("characterClassEscape")
    __obj.asInstanceOf[typings.regjsparser.mod.CharacterClassEscape]
  }
  
  inline def CharacterClassRange(max: Value, min: Value, range: js.Tuple2[Double, Double], raw: String): typings.regjsparser.mod.CharacterClassRange = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("characterClassRange")
    __obj.asInstanceOf[typings.regjsparser.mod.CharacterClassRange]
  }
  
  inline def UnicodePropertyEscape(negative: Boolean, range: js.Tuple2[Double, Double], raw: String, value: String): typings.regjsparser.mod.UnicodePropertyEscape = {
    val __obj = js.Dynamic.literal(negative = negative.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("unicodePropertyEscape")
    __obj.asInstanceOf[typings.regjsparser.mod.UnicodePropertyEscape]
  }
  
  inline def Value(
    codePoint: Double,
    kind: controlLetter | hexadecimalEscape | identifier | `null` | octal | singleEscape | symbol | unicodeCodePointEscape | unicodeEscape,
    range: js.Tuple2[Double, Double],
    raw: String
  ): typings.regjsparser.mod.Value = {
    val __obj = js.Dynamic.literal(codePoint = codePoint.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("value")
    __obj.asInstanceOf[typings.regjsparser.mod.Value]
  }
}
