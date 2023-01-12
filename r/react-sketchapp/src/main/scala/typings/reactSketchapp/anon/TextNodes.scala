package typings.reactSketchapp.anon

import typings.reactSketchapp.libModuleTypesMod.TextNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextNodes extends StObject {
  
  var textNodes: js.Array[TextNode]
}
object TextNodes {
  
  inline def apply(textNodes: js.Array[TextNode]): TextNodes = {
    val __obj = js.Dynamic.literal(textNodes = textNodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextNodes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextNodes] (val x: Self) extends AnyVal {
    
    inline def setTextNodes(value: js.Array[TextNode]): Self = StObject.set(x, "textNodes", value.asInstanceOf[js.Any])
    
    inline def setTextNodesVarargs(value: TextNode*): Self = StObject.set(x, "textNodes", js.Array(value*))
  }
}
