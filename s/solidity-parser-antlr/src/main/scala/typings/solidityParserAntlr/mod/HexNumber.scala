package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HexNumber
  extends StObject
     with BaseASTNode
     with AssemblyItem {
  
  @JSName("type")
  var type_HexNumber: typings.solidityParserAntlr.solidityParserAntlrStrings.HexNumber
  
  var value: String
}
object HexNumber {
  
  @scala.inline
  def apply(value: String): HexNumber = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("HexNumber")
    __obj.asInstanceOf[HexNumber]
  }
  
  @scala.inline
  implicit class HexNumberMutableBuilder[Self <: HexNumber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.HexNumber): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
