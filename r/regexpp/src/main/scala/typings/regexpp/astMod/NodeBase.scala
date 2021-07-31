package typings.regexpp.astMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeBase extends StObject {
  
  var end: Double
  
  var parent: Null | RegExpLiteral | Pattern | Group | CapturingGroup | LookaroundAssertion | Alternative | Quantifier | CharacterClass | CharacterClassRange
  
  var raw: String
  
  var start: Double
  
  var `type`: typings.regexpp.regexppStrings.RegExpLiteral | typings.regexpp.regexppStrings.Pattern | typings.regexpp.regexppStrings.Alternative | typings.regexpp.regexppStrings.Group | typings.regexpp.regexppStrings.CapturingGroup | typings.regexpp.regexppStrings.Quantifier | typings.regexpp.regexppStrings.CharacterClass | typings.regexpp.regexppStrings.Assertion | typings.regexpp.regexppStrings.CharacterClassRange | typings.regexpp.regexppStrings.CharacterSet | typings.regexpp.regexppStrings.Character | typings.regexpp.regexppStrings.Backreference | typings.regexpp.regexppStrings.Flags
}
object NodeBase {
  
  @scala.inline
  def apply(
    end: Double,
    raw: String,
    start: Double,
    `type`: typings.regexpp.regexppStrings.RegExpLiteral | typings.regexpp.regexppStrings.Pattern | typings.regexpp.regexppStrings.Alternative | typings.regexpp.regexppStrings.Group | typings.regexpp.regexppStrings.CapturingGroup | typings.regexpp.regexppStrings.Quantifier | typings.regexpp.regexppStrings.CharacterClass | typings.regexpp.regexppStrings.Assertion | typings.regexpp.regexppStrings.CharacterClassRange | typings.regexpp.regexppStrings.CharacterSet | typings.regexpp.regexppStrings.Character | typings.regexpp.regexppStrings.Backreference | typings.regexpp.regexppStrings.Flags
  ): NodeBase = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], parent = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeBase]
  }
  
  @scala.inline
  implicit class NodeBaseMutableBuilder[Self <: NodeBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(
      value: RegExpLiteral | Pattern | Group | CapturingGroup | LookaroundAssertion | Alternative | Quantifier | CharacterClass | CharacterClassRange
    ): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentNull: Self = StObject.set(x, "parent", null)
    
    @scala.inline
    def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(
      value: typings.regexpp.regexppStrings.RegExpLiteral | typings.regexpp.regexppStrings.Pattern | typings.regexpp.regexppStrings.Alternative | typings.regexpp.regexppStrings.Group | typings.regexpp.regexppStrings.CapturingGroup | typings.regexpp.regexppStrings.Quantifier | typings.regexpp.regexppStrings.CharacterClass | typings.regexpp.regexppStrings.Assertion | typings.regexpp.regexppStrings.CharacterClassRange | typings.regexpp.regexppStrings.CharacterSet | typings.regexpp.regexppStrings.Character | typings.regexpp.regexppStrings.Backreference | typings.regexpp.regexppStrings.Flags
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
