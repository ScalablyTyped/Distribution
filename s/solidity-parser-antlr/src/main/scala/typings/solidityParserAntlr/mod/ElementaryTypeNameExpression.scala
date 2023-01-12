package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementaryTypeNameExpression
  extends StObject
     with BaseASTNode
     with ASTNode
     with PrimaryExpression {
  
  var typeName: ElementaryTypeName
  
  @JSName("type")
  var type_ElementaryTypeNameExpression: typings.solidityParserAntlr.solidityParserAntlrStrings.ElementaryTypeNameExpression
}
object ElementaryTypeNameExpression {
  
  inline def apply(typeName: ElementaryTypeName): ElementaryTypeNameExpression = {
    val __obj = js.Dynamic.literal(typeName = typeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ElementaryTypeNameExpression")
    __obj.asInstanceOf[ElementaryTypeNameExpression]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ElementaryTypeNameExpression] (val x: Self) extends AnyVal {
    
    inline def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.ElementaryTypeNameExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeName(value: ElementaryTypeName): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
  }
}
