package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssemblyFunctionReturns
  extends BaseASTNode
     with ASTNode {
  
  @JSName("type")
  var type_AssemblyFunctionReturns: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyFunctionReturns = js.native
}
object AssemblyFunctionReturns {
  
  @scala.inline
  def apply(`type`: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyFunctionReturns): AssemblyFunctionReturns = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyFunctionReturns]
  }
  
  @scala.inline
  implicit class AssemblyFunctionReturnsMutableBuilder[Self <: AssemblyFunctionReturns] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyFunctionReturns): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
