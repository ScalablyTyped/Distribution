package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HexLiteral
  extends StObject
     with BaseASTNode
     with AssemblyItem {
  
  @JSName("type")
  var type_HexLiteral: typings.solidityParserAntlr.solidityParserAntlrStrings.HexLiteral
  
  var value: String
}
object HexLiteral {
  
  inline def apply(value: String): HexLiteral = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("HexLiteral")
    __obj.asInstanceOf[HexLiteral]
  }
  
  extension [Self <: HexLiteral](x: Self) {
    
    inline def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.HexLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
