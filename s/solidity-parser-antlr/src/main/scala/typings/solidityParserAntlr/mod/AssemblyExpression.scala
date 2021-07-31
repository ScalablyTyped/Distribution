package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.solidityParserAntlr.mod.AssemblyCall
  - typings.solidityParserAntlr.mod.AssemblyLiteral
*/
trait AssemblyExpression
  extends StObject
     with AssemblyItem
object AssemblyExpression {
  
  @scala.inline
  def AssemblyCall(arguments: js.Array[AssemblyExpression], functionName: String): typings.solidityParserAntlr.mod.AssemblyCall = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], functionName = functionName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AssemblyCall")
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.AssemblyCall]
  }
  
  @scala.inline
  def AssemblyLiteral(): typings.solidityParserAntlr.mod.AssemblyLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("AssemblyLiteral")
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.AssemblyLiteral]
  }
}
