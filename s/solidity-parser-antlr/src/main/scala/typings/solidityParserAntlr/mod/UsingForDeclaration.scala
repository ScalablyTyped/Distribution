package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UsingForDeclaration
  extends StObject
     with BaseASTNode
     with ASTNode {
  
  var libraryName: String
  
  var typeName: TypeName
  
  @JSName("type")
  var type_UsingForDeclaration: typings.solidityParserAntlr.solidityParserAntlrStrings.UsingForDeclaration
}
object UsingForDeclaration {
  
  @scala.inline
  def apply(libraryName: String, typeName: TypeName): UsingForDeclaration = {
    val __obj = js.Dynamic.literal(libraryName = libraryName.asInstanceOf[js.Any], typeName = typeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("UsingForDeclaration")
    __obj.asInstanceOf[UsingForDeclaration]
  }
  
  @scala.inline
  implicit class UsingForDeclarationMutableBuilder[Self <: UsingForDeclaration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLibraryName(value: String): Self = StObject.set(x, "libraryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.UsingForDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeName(value: TypeName): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
  }
}
