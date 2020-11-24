package typings.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.solidityParserAntlr.mod.ASTNode because Already inherited */ @js.native
trait ElementaryTypeNameExpression
  extends PrimaryExpression
     with BaseASTNode {
  
  var typeName: ElementaryTypeName = js.native
  
  @JSName("type")
  var type_ElementaryTypeNameExpression: typings.solidityParserAntlr.solidityParserAntlrStrings.ElementaryTypeNameExpression = js.native
}
object ElementaryTypeNameExpression {
  
  @scala.inline
  def apply(
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.ElementaryTypeNameExpression,
    typeName: ElementaryTypeName
  ): ElementaryTypeNameExpression = {
    val __obj = js.Dynamic.literal(typeName = typeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementaryTypeNameExpression]
  }
  
  @scala.inline
  implicit class ElementaryTypeNameExpressionOps[Self <: ElementaryTypeNameExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.ElementaryTypeNameExpression): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeName(value: ElementaryTypeName): Self = this.set("typeName", value.asInstanceOf[js.Any])
  }
}
