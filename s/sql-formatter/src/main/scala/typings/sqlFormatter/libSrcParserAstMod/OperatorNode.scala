package typings.sqlFormatter.libSrcParserAstMod

import typings.sqlFormatter.libSrcParserAstMod.NodeType.operator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OperatorNode
  extends StObject
     with BaseNode
     with AstNode {
  
  var text: String
  
  var `type`: operator
}
object OperatorNode {
  
  inline def apply(text: String, `type`: operator): OperatorNode = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperatorNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OperatorNode] (val x: Self) extends AnyVal {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setType(value: operator): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
