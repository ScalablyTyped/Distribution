package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DecimalNumber
  extends StObject
     with BaseASTNode
     with AssemblyItem {
  
  @JSName("type")
  var type_DecimalNumber: typings.solidityParserAntlr.solidityParserAntlrStrings.DecimalNumber
  
  var value: String
}
object DecimalNumber {
  
  inline def apply(value: String): DecimalNumber = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DecimalNumber")
    __obj.asInstanceOf[DecimalNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DecimalNumber] (val x: Self) extends AnyVal {
    
    inline def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.DecimalNumber): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
