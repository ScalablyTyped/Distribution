package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringLiteral
  extends StObject
     with BaseASTNode
     with AssemblyItem {
  
  @JSName("type")
  var type_StringLiteral: typings.solidityParserAntlr.solidityParserAntlrStrings.StringLiteral
  
  var value: String
}
object StringLiteral {
  
  inline def apply(value: String): StringLiteral = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("StringLiteral")
    __obj.asInstanceOf[StringLiteral]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StringLiteral] (val x: Self) extends AnyVal {
    
    inline def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.StringLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
