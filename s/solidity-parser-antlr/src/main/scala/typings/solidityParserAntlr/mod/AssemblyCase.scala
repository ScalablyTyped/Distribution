package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssemblyCase
  extends BaseASTNode
     with ASTNode {
  
  @JSName("type")
  var type_AssemblyCase: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyCase = js.native
}
object AssemblyCase {
  
  @scala.inline
  def apply(`type`: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyCase): AssemblyCase = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyCase]
  }
  
  @scala.inline
  implicit class AssemblyCaseMutableBuilder[Self <: AssemblyCase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyCase): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
