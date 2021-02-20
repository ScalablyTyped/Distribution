package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.solidityParserAntlr.mod.ASTNode because Already inherited */ @js.native
trait AssemblyBlock
  extends AssemblyItem
     with BaseASTNode {
  
  var operations: js.Array[AssemblyItem] = js.native
  
  @JSName("type")
  var type_AssemblyBlock: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyBlock = js.native
}
object AssemblyBlock {
  
  @scala.inline
  def apply(
    operations: js.Array[AssemblyItem],
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyBlock
  ): AssemblyBlock = {
    val __obj = js.Dynamic.literal(operations = operations.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyBlock]
  }
  
  @scala.inline
  implicit class AssemblyBlockMutableBuilder[Self <: AssemblyBlock] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperations(value: js.Array[AssemblyItem]): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationsVarargs(value: AssemblyItem*): Self = StObject.set(x, "operations", js.Array(value :_*))
    
    @scala.inline
    def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyBlock): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
