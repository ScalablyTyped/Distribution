package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StructDefinition
  extends BaseASTNode
     with ASTNode {
  
  var members: js.Array[VariableDeclaration] = js.native
  
  var name: String = js.native
  
  @JSName("type")
  var type_StructDefinition: typings.solidityParserAntlr.solidityParserAntlrStrings.StructDefinition = js.native
}
object StructDefinition {
  
  @scala.inline
  def apply(
    members: js.Array[VariableDeclaration],
    name: String,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.StructDefinition
  ): StructDefinition = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructDefinition]
  }
  
  @scala.inline
  implicit class StructDefinitionMutableBuilder[Self <: StructDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMembers(value: js.Array[VariableDeclaration]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembersVarargs(value: VariableDeclaration*): Self = StObject.set(x, "members", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.StructDefinition): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
