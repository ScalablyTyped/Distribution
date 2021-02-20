package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DecimalNumber
  extends AssemblyItem
     with BaseASTNode {
  
  @JSName("type")
  var type_DecimalNumber: typings.solidityParserAntlr.solidityParserAntlrStrings.DecimalNumber = js.native
  
  var value: String = js.native
}
object DecimalNumber {
  
  @scala.inline
  def apply(`type`: typings.solidityParserAntlr.solidityParserAntlrStrings.DecimalNumber, value: String): DecimalNumber = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecimalNumber]
  }
  
  @scala.inline
  implicit class DecimalNumberMutableBuilder[Self <: DecimalNumber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.DecimalNumber): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
