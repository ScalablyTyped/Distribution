package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.solidityParserAntlr.mod.ASTNode because Already inherited */ @js.native
trait AssemblyAssignment
  extends AssemblyItem
     with BaseASTNode {
  
  var expression: AssemblyExpression = js.native
  
  var names: js.Array[Identifier] = js.native
  
  @JSName("type")
  var type_AssemblyAssignment: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyAssignment = js.native
}
object AssemblyAssignment {
  
  @scala.inline
  def apply(
    expression: AssemblyExpression,
    names: js.Array[Identifier],
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyAssignment
  ): AssemblyAssignment = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyAssignment]
  }
  
  @scala.inline
  implicit class AssemblyAssignmentMutableBuilder[Self <: AssemblyAssignment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpression(value: AssemblyExpression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNames(value: js.Array[Identifier]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamesVarargs(value: Identifier*): Self = StObject.set(x, "names", js.Array(value :_*))
    
    @scala.inline
    def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyAssignment): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
