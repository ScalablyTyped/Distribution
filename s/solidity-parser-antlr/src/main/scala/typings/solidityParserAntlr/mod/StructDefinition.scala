package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StructDefinition
  extends StObject
     with BaseASTNode
     with ASTNode {
  
  var members: js.Array[VariableDeclaration]
  
  var name: String
  
  @JSName("type")
  var type_StructDefinition: typings.solidityParserAntlr.solidityParserAntlrStrings.StructDefinition
}
object StructDefinition {
  
  inline def apply(members: js.Array[VariableDeclaration], name: String): StructDefinition = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("StructDefinition")
    __obj.asInstanceOf[StructDefinition]
  }
  
  extension [Self <: StructDefinition](x: Self) {
    
    inline def setMembers(value: js.Array[VariableDeclaration]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    inline def setMembersVarargs(value: VariableDeclaration*): Self = StObject.set(x, "members", js.Array(value :_*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.StructDefinition): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
