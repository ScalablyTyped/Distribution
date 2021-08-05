package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemberAccess
  extends StObject
     with BaseASTNode
     with Expression {
  
  var expression: Expression
  
  var memberName: String
  
  @JSName("type")
  var type_MemberAccess: typings.solidityParserAntlr.solidityParserAntlrStrings.MemberAccess
}
object MemberAccess {
  
  inline def apply(expression: Expression, memberName: String): MemberAccess = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], memberName = memberName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MemberAccess")
    __obj.asInstanceOf[MemberAccess]
  }
  
  extension [Self <: MemberAccess](x: Self) {
    
    inline def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setMemberName(value: String): Self = StObject.set(x, "memberName", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.MemberAccess): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
