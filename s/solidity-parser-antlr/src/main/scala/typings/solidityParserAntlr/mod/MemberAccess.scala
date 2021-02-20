package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MemberAccess
  extends Expression
     with BaseASTNode {
  
  var expression: Expression = js.native
  
  var memberName: String = js.native
  
  @JSName("type")
  var type_MemberAccess: typings.solidityParserAntlr.solidityParserAntlrStrings.MemberAccess = js.native
}
object MemberAccess {
  
  @scala.inline
  def apply(
    expression: Expression,
    memberName: String,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.MemberAccess
  ): MemberAccess = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], memberName = memberName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberAccess]
  }
  
  @scala.inline
  implicit class MemberAccessMutableBuilder[Self <: MemberAccess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberName(value: String): Self = StObject.set(x, "memberName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.MemberAccess): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
