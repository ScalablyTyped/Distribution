package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.solidityParserAntlr.mod.ASTNode because Already inherited */ @js.native
trait AssemblyFunctionDefinition
  extends AssemblyItem
     with BaseASTNode {
  
  @JSName("type")
  var type_AssemblyFunctionDefinition: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyFunctionDefinition = js.native
}
object AssemblyFunctionDefinition {
  
  @scala.inline
  def apply(`type`: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyFunctionDefinition): AssemblyFunctionDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyFunctionDefinition]
  }
  
  @scala.inline
  implicit class AssemblyFunctionDefinitionMutableBuilder[Self <: AssemblyFunctionDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyFunctionDefinition): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
