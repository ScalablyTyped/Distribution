package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssemblyFor
  extends StObject
     with BaseASTNode
     with ASTNode
     with AssemblyItem {
  
  @JSName("type")
  var type_AssemblyFor: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyFor
}
object AssemblyFor {
  
  @scala.inline
  def apply(): AssemblyFor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("AssemblyFor")
    __obj.asInstanceOf[AssemblyFor]
  }
  
  @scala.inline
  implicit class AssemblyForMutableBuilder[Self <: AssemblyFor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyFor): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
