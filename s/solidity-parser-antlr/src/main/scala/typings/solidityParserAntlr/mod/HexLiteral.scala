package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HexLiteral
  extends AssemblyItem
     with BaseASTNode {
  
  @JSName("type")
  var type_HexLiteral: typings.solidityParserAntlr.solidityParserAntlrStrings.HexLiteral = js.native
  
  var value: String = js.native
}
object HexLiteral {
  
  @scala.inline
  def apply(`type`: typings.solidityParserAntlr.solidityParserAntlrStrings.HexLiteral, value: String): HexLiteral = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
