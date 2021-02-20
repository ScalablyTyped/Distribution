package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.solidityParserAntlr.mod.ASTNode because Already inherited
- typings.solidityParserAntlr.mod.Expression because Already inherited
- typings.solidityParserAntlr.mod.ASTNode because Already inherited */ @js.native
trait TupleExpression
  extends PrimaryExpression
     with BaseASTNode {
  
  var components: js.Array[Expression] = js.native
  
  var isArray: Boolean = js.native
  
  @JSName("type")
  var type_TupleExpression: typings.solidityParserAntlr.solidityParserAntlrStrings.TupleExpression = js.native
}
object TupleExpression {
  
  @scala.inline
  def apply(
    components: js.Array[Expression],
    isArray: Boolean,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.TupleExpression
  ): TupleExpression = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], isArray = isArray.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TupleExpression]
  }
  
  @scala.inline
  implicit class TupleExpressionMutableBuilder[Self <: TupleExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponents(value: js.Array[Expression]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentsVarargs(value: Expression*): Self = StObject.set(x, "components", js.Array(value :_*))
    
    @scala.inline
    def setIsArray(value: Boolean): Self = StObject.set(x, "isArray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.TupleExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
