package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssemblyIf
  extends StObject
     with BaseASTNode
     with ASTNode
     with AssemblyItem {
  
  @JSName("type")
  var type_AssemblyIf: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyIf
}
object AssemblyIf {
  
  inline def apply(): AssemblyIf = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("AssemblyIf")
    __obj.asInstanceOf[AssemblyIf]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssemblyIf] (val x: Self) extends AnyVal {
    
    inline def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyIf): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
