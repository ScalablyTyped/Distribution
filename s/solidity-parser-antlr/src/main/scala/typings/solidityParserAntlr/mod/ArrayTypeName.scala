package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrayTypeName
  extends StObject
     with BaseASTNode
     with TypeName {
  
  var baseTypeName: TypeName
  
  var length: js.UndefOr[Expression] = js.undefined
  
  @JSName("type")
  var type_ArrayTypeName: typings.solidityParserAntlr.solidityParserAntlrStrings.ArrayTypeName
}
object ArrayTypeName {
  
  @scala.inline
  def apply(baseTypeName: TypeName): ArrayTypeName = {
    val __obj = js.Dynamic.literal(baseTypeName = baseTypeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ArrayTypeName")
    __obj.asInstanceOf[ArrayTypeName]
  }
  
  @scala.inline
  implicit class ArrayTypeNameMutableBuilder[Self <: ArrayTypeName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseTypeName(value: TypeName): Self = StObject.set(x, "baseTypeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Expression): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    @scala.inline
    def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.ArrayTypeName): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
