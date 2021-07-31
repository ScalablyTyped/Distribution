package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssemblyStackAssignment
  extends StObject
     with BaseASTNode
     with ASTNode
     with AssemblyItem {
  
  @JSName("type")
  var type_AssemblyStackAssignment: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyStackAssignment
}
object AssemblyStackAssignment {
  
  @scala.inline
  def apply(): AssemblyStackAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("AssemblyStackAssignment")
    __obj.asInstanceOf[AssemblyStackAssignment]
  }
  
  @scala.inline
  implicit class AssemblyStackAssignmentMutableBuilder[Self <: AssemblyStackAssignment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyStackAssignment): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
