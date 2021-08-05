package typings.solidityParserAntlr.mod

import typings.solidityParserAntlr.solidityParserAntlrStrings.`private`
import typings.solidityParserAntlr.solidityParserAntlrStrings.default
import typings.solidityParserAntlr.solidityParserAntlrStrings.internal
import typings.solidityParserAntlr.solidityParserAntlrStrings.public
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VariableDeclaration
  extends StObject
     with BaseASTNode
     with ASTNode {
  
  var expression: js.UndefOr[Expression] = js.undefined
  
  var isDeclaredConst: js.UndefOr[Boolean] = js.undefined
  
  var isIndexed: Boolean
  
  var isStateVar: Boolean
  
  var name: String
  
  var storageLocation: js.UndefOr[String] = js.undefined
  
  var typeName: TypeName
  
  @JSName("type")
  var type_VariableDeclaration: typings.solidityParserAntlr.solidityParserAntlrStrings.VariableDeclaration
  
  var visibility: js.UndefOr[public | `private` | internal | default] = js.undefined
}
object VariableDeclaration {
  
  inline def apply(isIndexed: Boolean, isStateVar: Boolean, name: String, typeName: TypeName): VariableDeclaration = {
    val __obj = js.Dynamic.literal(isIndexed = isIndexed.asInstanceOf[js.Any], isStateVar = isStateVar.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], typeName = typeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("VariableDeclaration")
    __obj.asInstanceOf[VariableDeclaration]
  }
  
  extension [Self <: VariableDeclaration](x: Self) {
    
    inline def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
    
    inline def setIsDeclaredConst(value: Boolean): Self = StObject.set(x, "isDeclaredConst", value.asInstanceOf[js.Any])
    
    inline def setIsDeclaredConstUndefined: Self = StObject.set(x, "isDeclaredConst", js.undefined)
    
    inline def setIsIndexed(value: Boolean): Self = StObject.set(x, "isIndexed", value.asInstanceOf[js.Any])
    
    inline def setIsStateVar(value: Boolean): Self = StObject.set(x, "isStateVar", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStorageLocation(value: String): Self = StObject.set(x, "storageLocation", value.asInstanceOf[js.Any])
    
    inline def setStorageLocationUndefined: Self = StObject.set(x, "storageLocation", js.undefined)
    
    inline def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.VariableDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeName(value: TypeName): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
    
    inline def setVisibility(value: public | `private` | internal | default): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
