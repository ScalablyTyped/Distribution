package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementaryTypeName
  extends StObject
     with BaseASTNode
     with ASTNode
     with TypeName {
  
  var name: String
  
  @JSName("type")
  var type_ElementaryTypeName: typings.solidityParserAntlr.solidityParserAntlrStrings.ElementaryTypeName
}
object ElementaryTypeName {
  
  @scala.inline
  def apply(name: String): ElementaryTypeName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ElementaryTypeName")
    __obj.asInstanceOf[ElementaryTypeName]
  }
  
  @scala.inline
  implicit class ElementaryTypeNameMutableBuilder[Self <: ElementaryTypeName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.ElementaryTypeName): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
