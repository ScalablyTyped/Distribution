package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Identifier
  extends PrimaryExpression
     with BaseASTNode
     with AssemblyItem {
  
  var name: String = js.native
  
  @JSName("type")
  var type_Identifier: typings.solidityParserAntlr.solidityParserAntlrStrings.Identifier = js.native
}
object Identifier {
  
  @scala.inline
  def apply(name: String, `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.Identifier): Identifier = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Identifier]
  }
  
  @scala.inline
  implicit class IdentifierMutableBuilder[Self <: Identifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.Identifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
