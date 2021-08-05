package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumDefinition
  extends StObject
     with BaseASTNode
     with ASTNode {
  
  var members: js.Array[EnumValue]
  
  var name: String
  
  @JSName("type")
  var type_EnumDefinition: typings.solidityParserAntlr.solidityParserAntlrStrings.EnumDefinition
}
object EnumDefinition {
  
  inline def apply(members: js.Array[EnumValue], name: String): EnumDefinition = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("EnumDefinition")
    __obj.asInstanceOf[EnumDefinition]
  }
  
  extension [Self <: EnumDefinition](x: Self) {
    
    inline def setMembers(value: js.Array[EnumValue]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    inline def setMembersVarargs(value: EnumValue*): Self = StObject.set(x, "members", js.Array(value :_*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.EnumDefinition): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
