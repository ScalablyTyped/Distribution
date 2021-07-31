package typings.regexpp.astMod

import typings.regexpp.regexppStrings.digit
import typings.regexpp.regexppStrings.end
import typings.regexpp.regexppStrings.space
import typings.regexpp.regexppStrings.start
import typings.regexpp.regexppStrings.word
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.regexpp.astMod.BoundaryAssertion
  - typings.regexpp.astMod.CharacterSet
  - typings.regexpp.astMod.Character
  - typings.regexpp.astMod.Backreference
  - typings.regexpp.astMod.Flags
*/
trait LeafNode
  extends StObject
     with Node
object LeafNode {
  
  @scala.inline
  def AnyCharacterSet(end: Double, parent: Alternative | Quantifier, raw: String, start: Double): typings.regexpp.astMod.AnyCharacterSet = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], kind = "any", parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CharacterSet")
    __obj.asInstanceOf[typings.regexpp.astMod.AnyCharacterSet]
  }
  
  @scala.inline
  def Backreference(
    end: Double,
    parent: Alternative | Quantifier,
    raw: String,
    ref: Double | String,
    resolved: CapturingGroup,
    start: Double
  ): typings.regexpp.astMod.Backreference = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], resolved = resolved.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Backreference")
    __obj.asInstanceOf[typings.regexpp.astMod.Backreference]
  }
  
  @scala.inline
  def Character(
    end: Double,
    parent: Alternative | Quantifier | CharacterClass | CharacterClassRange,
    raw: String,
    start: Double,
    value: Double
  ): typings.regexpp.astMod.Character = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Character")
    __obj.asInstanceOf[typings.regexpp.astMod.Character]
  }
  
  @scala.inline
  def EdgeAssertion(end: Double, kind: start | end, parent: Alternative | Quantifier, raw: String, start: Double): typings.regexpp.astMod.EdgeAssertion = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Assertion")
    __obj.asInstanceOf[typings.regexpp.astMod.EdgeAssertion]
  }
  
  @scala.inline
  def EscapeCharacterSet(
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
  
  @scala.inline
  def Flags(
    dotAll: Boolean,
    end: Double,
    global: Boolean,
    ignoreCase: Boolean,
    multiline: Boolean,
    raw: String,
    start: Double,
    sticky: Boolean,
    unicode: Boolean
  ): typings.regexpp.astMod.Flags = {
    val __obj = js.Dynamic.literal(dotAll = dotAll.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any], ignoreCase = ignoreCase.asInstanceOf[js.Any], multiline = multiline.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], sticky = sticky.asInstanceOf[js.Any], unicode = unicode.asInstanceOf[js.Any], parent = null)
    __obj.updateDynamic("type")("Flags")
    __obj.asInstanceOf[typings.regexpp.astMod.Flags]
  }
  
  @scala.inline
  def UnicodePropertyCharacterSet(
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
  
  @scala.inline
  def WordBoundaryAssertion(end: Double, negate: Boolean, parent: Alternative | Quantifier, raw: String, start: Double): typings.regexpp.astMod.WordBoundaryAssertion = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], kind = "word", negate = negate.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Assertion")
    __obj.asInstanceOf[typings.regexpp.astMod.WordBoundaryAssertion]
  }
}
