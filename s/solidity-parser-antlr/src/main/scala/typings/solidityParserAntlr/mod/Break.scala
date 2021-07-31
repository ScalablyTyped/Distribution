package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Break
  extends StObject
     with BaseASTNode
     with AssemblyItem {
  
  @JSName("type")
  var type_Break: typings.solidityParserAntlr.solidityParserAntlrStrings.Break
}
object Break {
  
  @scala.inline
  def apply(): Break = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Break")
    __obj.asInstanceOf[Break]
  }
  
  @scala.inline
  implicit class BreakMutableBuilder[Self <: Break] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.Break): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
