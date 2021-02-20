package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.solidityParserAntlr.mod.ASTNode because Already inherited */ @js.native
trait Conditional
  extends Expression
     with BaseASTNode {
  
  var falseExpression: ASTNode = js.native
  
  var trueExpression: ASTNode = js.native
  
  @JSName("type")
  var type_Conditional: typings.solidityParserAntlr.solidityParserAntlrStrings.Conditional = js.native
}
object Conditional {
  
  @scala.inline
  def apply(
    falseExpression: ASTNode,
    trueExpression: ASTNode,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.Conditional
  ): Conditional = {
    val __obj = js.Dynamic.literal(falseExpression = falseExpression.asInstanceOf[js.Any], trueExpression = trueExpression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Conditional]
  }
  
  @scala.inline
  implicit class ConditionalMutableBuilder[Self <: Conditional] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFalseExpression(value: ASTNode): Self = StObject.set(x, "falseExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrueExpression(value: ASTNode): Self = StObject.set(x, "trueExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.Conditional): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
