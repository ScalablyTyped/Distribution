package typings.regexpp.astMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegExpLiteral
  extends BranchNode
     with NodeBase {
  
  var flags: Flags = js.native
  
  @JSName("parent")
  var parent_RegExpLiteral: Null = js.native
  
  var pattern: Pattern = js.native
  
  @JSName("type")
  var type_RegExpLiteral: typings.regexpp.regexppStrings.RegExpLiteral = js.native
}
object RegExpLiteral {
  
  @scala.inline
  def apply(
    end: Double,
    flags: Flags,
    parent: Null,
    pattern: Pattern,
    raw: String,
    start: Double,
    `type`: typings.regexpp.regexppStrings.RegExpLiteral
  ): RegExpLiteral = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegExpLiteral]
  }
  
  @scala.inline
  implicit class RegExpLiteralMutableBuilder[Self <: RegExpLiteral] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlags(value: Flags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: Null): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPattern(value: Pattern): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.regexpp.regexppStrings.RegExpLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
