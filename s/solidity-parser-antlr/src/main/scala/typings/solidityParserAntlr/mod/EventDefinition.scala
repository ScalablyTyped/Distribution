package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventDefinition
  extends BaseASTNode
     with ASTNode {
  
  var name: String = js.native
  
  var parameters: js.Array[VariableDeclaration] = js.native
  
  @JSName("type")
  var type_EventDefinition: typings.solidityParserAntlr.solidityParserAntlrStrings.EventDefinition = js.native
}
object EventDefinition {
  
  @scala.inline
  def apply(
    name: String,
    parameters: js.Array[VariableDeclaration],
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.EventDefinition
  ): EventDefinition = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventDefinition]
  }
  
  @scala.inline
  implicit class EventDefinitionMutableBuilder[Self <: EventDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameters(value: js.Array[VariableDeclaration]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersVarargs(value: VariableDeclaration*): Self = StObject.set(x, "parameters", js.Array(value :_*))
    
    @scala.inline
    def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.EventDefinition): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
