package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifierDefinition
  extends BaseASTNode
     with ASTNode {
  
  var name: String = js.native
  
  @JSName("type")
  var type_ModifierDefinition: typings.solidityParserAntlr.solidityParserAntlrStrings.ModifierDefinition = js.native
}
object ModifierDefinition {
  
  @scala.inline
  def apply(name: String, `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.ModifierDefinition): ModifierDefinition = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifierDefinition]
  }
  
  @scala.inline
  implicit class ModifierDefinitionMutableBuilder[Self <: ModifierDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.ModifierDefinition): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
