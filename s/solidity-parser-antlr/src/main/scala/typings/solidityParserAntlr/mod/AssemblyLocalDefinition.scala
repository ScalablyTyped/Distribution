package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.solidityParserAntlr.mod.ASTNode because Already inherited */ @js.native
trait AssemblyLocalDefinition
  extends AssemblyItem
     with BaseASTNode {
  
  @JSName("type")
  var type_AssemblyLocalDefinition: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyLocalDefinition = js.native
}
object AssemblyLocalDefinition {
  
  @scala.inline
  def apply(`type`: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyLocalDefinition): AssemblyLocalDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyLocalDefinition]
  }
  
  @scala.inline
  implicit class AssemblyLocalDefinitionMutableBuilder[Self <: AssemblyLocalDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyLocalDefinition): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
