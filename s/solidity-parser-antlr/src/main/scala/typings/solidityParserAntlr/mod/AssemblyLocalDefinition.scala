package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssemblyLocalDefinition
  extends StObject
     with BaseASTNode
     with ASTNode
     with AssemblyItem {
  
  @JSName("type")
  var type_AssemblyLocalDefinition: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyLocalDefinition
}
object AssemblyLocalDefinition {
  
  @scala.inline
  def apply(): AssemblyLocalDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("AssemblyLocalDefinition")
    __obj.asInstanceOf[AssemblyLocalDefinition]
  }
  
  @scala.inline
  implicit class AssemblyLocalDefinitionMutableBuilder[Self <: AssemblyLocalDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyLocalDefinition): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
