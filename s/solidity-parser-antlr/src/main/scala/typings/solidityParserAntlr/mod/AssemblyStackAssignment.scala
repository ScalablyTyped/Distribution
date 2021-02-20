package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.solidityParserAntlr.mod.ASTNode because Already inherited */ @js.native
trait AssemblyStackAssignment
  extends AssemblyItem
     with BaseASTNode {
  
  @JSName("type")
  var type_AssemblyStackAssignment: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyStackAssignment = js.native
}
object AssemblyStackAssignment {
  
  @scala.inline
  def apply(`type`: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyStackAssignment): AssemblyStackAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyStackAssignment]
  }
  
  @scala.inline
  implicit class AssemblyStackAssignmentMutableBuilder[Self <: AssemblyStackAssignment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyStackAssignment): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
