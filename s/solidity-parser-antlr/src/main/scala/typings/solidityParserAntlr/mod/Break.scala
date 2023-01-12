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
  
  inline def apply(): Break = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Break")
    __obj.asInstanceOf[Break]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Break] (val x: Self) extends AnyVal {
    
    inline def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.Break): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
