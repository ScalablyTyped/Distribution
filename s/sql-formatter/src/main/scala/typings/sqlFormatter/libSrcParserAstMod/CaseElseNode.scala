package typings.sqlFormatter.libSrcParserAstMod

import typings.sqlFormatter.libSrcParserAstMod.NodeType.case_else
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaseElseNode
  extends StObject
     with BaseNode
     with AstNode {
  
  var elseKw: KeywordNode
  
  var result: js.Array[AstNode]
  
  var `type`: case_else
}
object CaseElseNode {
  
  inline def apply(elseKw: KeywordNode, result: js.Array[AstNode], `type`: case_else): CaseElseNode = {
    val __obj = js.Dynamic.literal(elseKw = elseKw.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaseElseNode]
  }
  
  extension [Self <: CaseElseNode](x: Self) {
    
    inline def setElseKw(value: KeywordNode): Self = StObject.set(x, "elseKw", value.asInstanceOf[js.Any])
    
    inline def setResult(value: js.Array[AstNode]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultVarargs(value: AstNode*): Self = StObject.set(x, "result", js.Array(value*))
    
    inline def setType(value: case_else): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
