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
  
  @scala.inline
  def apply(value: String): HexLiteral = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("HexLiteral")
    __obj.asInstanceOf[HexLiteral]
  }
  
  @scala.inline
  implicit class HexLiteralMutableBuilder[Self <: HexLiteral] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.HexLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
