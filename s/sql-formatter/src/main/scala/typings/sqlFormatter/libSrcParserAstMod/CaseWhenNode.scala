package typings.sqlFormatter.libSrcParserAstMod

import typings.sqlFormatter.libSrcParserAstMod.NodeType.case_when
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaseWhenNode
  extends StObject
     with BaseNode
     with AstNode {
  
  var condition: js.Array[AstNode]
  
  var result: js.Array[AstNode]
  
  var thenKw: KeywordNode
  
  var `type`: case_when
  
  var whenKw: KeywordNode
}
object CaseWhenNode {
  
  inline def apply(
    condition: js.Array[AstNode],
    result: js.Array[AstNode],
    thenKw: KeywordNode,
    `type`: case_when,
    whenKw: KeywordNode
  ): CaseWhenNode = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], thenKw = thenKw.asInstanceOf[js.Any], whenKw = whenKw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaseWhenNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CaseWhenNode] (val x: Self) extends AnyVal {
    
    inline def setCondition(value: js.Array[AstNode]): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionVarargs(value: AstNode*): Self = StObject.set(x, "condition", js.Array(value*))
    
    inline def setResult(value: js.Array[AstNode]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultVarargs(value: AstNode*): Self = StObject.set(x, "result", js.Array(value*))
    
    inline def setThenKw(value: KeywordNode): Self = StObject.set(x, "thenKw", value.asInstanceOf[js.Any])
    
    inline def setType(value: case_when): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWhenKw(value: KeywordNode): Self = StObject.set(x, "whenKw", value.asInstanceOf[js.Any])
  }
}
