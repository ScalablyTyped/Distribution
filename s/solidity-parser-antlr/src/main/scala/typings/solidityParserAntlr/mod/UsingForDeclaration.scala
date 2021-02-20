package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsingForDeclaration
  extends BaseASTNode
     with ASTNode {
  
  var libraryName: String = js.native
  
  var typeName: TypeName = js.native
  
  @JSName("type")
  var type_UsingForDeclaration: typings.solidityParserAntlr.solidityParserAntlrStrings.UsingForDeclaration = js.native
}
object UsingForDeclaration {
  
  @scala.inline
  def apply(
    libraryName: String,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.UsingForDeclaration,
    typeName: TypeName
  ): UsingForDeclaration = {
    val __obj = js.Dynamic.literal(libraryName = libraryName.asInstanceOf[js.Any], typeName = typeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
