package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValue
  extends BaseASTNode
     with ASTNode {
  
  var name: String = js.native
  
  @JSName("type")
  var type_EnumValue: typings.solidityParserAntlr.solidityParserAntlrStrings.EnumValue = js.native
}
object EnumValue {
  
  @scala.inline
  def apply(name: String, `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.EnumValue): EnumValue = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValue]
  }
  
  @scala.inline
  implicit class EnumValueMutableBuilder[Self <: EnumValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.EnumValue): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
