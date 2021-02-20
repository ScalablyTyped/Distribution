package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumDefinition
  extends BaseASTNode
     with ASTNode {
  
  var members: js.Array[EnumValue] = js.native
  
  var name: String = js.native
  
  @JSName("type")
  var type_EnumDefinition: typings.solidityParserAntlr.solidityParserAntlrStrings.EnumDefinition = js.native
}
object EnumDefinition {
  
  @scala.inline
  def apply(
    members: js.Array[EnumValue],
    name: String,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.EnumDefinition
  ): EnumDefinition = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumDefinition]
  }
  
  @scala.inline
  implicit class EnumDefinitionMutableBuilder[Self <: EnumDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMembers(value: js.Array[EnumValue]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembersVarargs(value: EnumValue*): Self = StObject.set(x, "members", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.EnumDefinition): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
