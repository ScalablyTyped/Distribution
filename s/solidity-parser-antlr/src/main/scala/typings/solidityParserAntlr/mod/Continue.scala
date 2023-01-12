package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Continue
  extends StObject
     with BaseASTNode
     with AssemblyItem {
  
  @JSName("type")
  var type_Continue: typings.solidityParserAntlr.solidityParserAntlrStrings.Continue
}
object Continue {
  
  inline def apply(): Continue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Continue")
    __obj.asInstanceOf[Continue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Continue] (val x: Self) extends AnyVal {
    
    inline def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.Continue): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
