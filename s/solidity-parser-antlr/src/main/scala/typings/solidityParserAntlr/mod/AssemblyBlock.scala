package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssemblyBlock
  extends StObject
     with BaseASTNode
     with ASTNode
     with AssemblyItem {
  
  var operations: js.Array[AssemblyItem]
  
  @JSName("type")
  var type_AssemblyBlock: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyBlock
}
object AssemblyBlock {
  
  @scala.inline
  def apply(operations: js.Array[AssemblyItem]): AssemblyBlock = {
    val __obj = js.Dynamic.literal(operations = operations.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AssemblyBlock")
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
