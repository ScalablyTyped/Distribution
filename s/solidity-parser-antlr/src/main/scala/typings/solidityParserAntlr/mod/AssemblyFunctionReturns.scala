package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssemblyFunctionReturns
  extends StObject
     with BaseASTNode
     with ASTNode {
  
  @JSName("type")
  var type_AssemblyFunctionReturns: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyFunctionReturns
}
object AssemblyFunctionReturns {
  
  @scala.inline
  def apply(): AssemblyFunctionReturns = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("AssemblyFunctionReturns")
    __obj.asInstanceOf[AssemblyFunctionReturns]
  }
  
  @scala.inline
  implicit class AssemblyFunctionReturnsMutableBuilder[Self <: AssemblyFunctionReturns] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyFunctionReturns): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
