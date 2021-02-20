package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.solidityParserAntlr.mod.ASTNode because Already inherited */ @js.native
trait Mapping
  extends TypeName
     with BaseASTNode {
  
  var keyType: ElementaryTypeName = js.native
  
  @JSName("type")
  var type_Mapping: typings.solidityParserAntlr.solidityParserAntlrStrings.Mapping = js.native
  
  var valueType: TypeName = js.native
}
object Mapping {
  
  @scala.inline
  def apply(
    keyType: ElementaryTypeName,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.Mapping,
    valueType: TypeName
  ): Mapping = {
    val __obj = js.Dynamic.literal(keyType = keyType.asInstanceOf[js.Any], valueType = valueType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mapping]
  }
  
  @scala.inline
  implicit class MappingMutableBuilder[Self <: Mapping] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyType(value: ElementaryTypeName): Self = StObject.set(x, "keyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.Mapping): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueType(value: TypeName): Self = StObject.set(x, "valueType", value.asInstanceOf[js.Any])
  }
}
