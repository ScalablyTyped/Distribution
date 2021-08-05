package typings.regexpp.astMod

import typings.regexpp.regexppStrings.digit
import typings.regexpp.regexppStrings.space
import typings.regexpp.regexppStrings.word
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.regexpp.astMod.AnyCharacterSet
  - typings.regexpp.astMod.EscapeCharacterSet
  - typings.regexpp.astMod.UnicodePropertyCharacterSet
*/
trait CharacterSet
  extends StObject
     with LeafNode
     with QuantifiableElement
object CharacterSet {
  
  inline def AnyCharacterSet(end: Double, parent: Alternative | Quantifier, raw: String, start: Double): typings.regexpp.astMod.AnyCharacterSet = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], kind = "any", parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CharacterSet")
    __obj.asInstanceOf[typings.regexpp.astMod.AnyCharacterSet]
  }
  
  inline def EscapeCharacterSet(
    end: Double,
    kind: digit | space | word,
    negate: Boolean,
    parent: Alternative | Quantifier | CharacterClass,
    raw: String,
    start: Double
  ): typings.regexpp.astMod.EscapeCharacterSet = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], negate = negate.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CharacterSet")
    __obj.asInstanceOf[typings.regexpp.astMod.EscapeCharacterSet]
  }
  
  inline def UnicodePropertyCharacterSet(
    end: Double,
    key: String,
    negate: Boolean,
    parent: Alternative | Quantifier | CharacterClass,
    raw: String,
    start: Double
  ): typings.regexpp.astMod.UnicodePropertyCharacterSet = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = "property", negate = negate.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = null)
    __obj.updateDynamic("type")("CharacterSet")
    __obj.asInstanceOf[typings.regexpp.astMod.UnicodePropertyCharacterSet]
  }
}
