package typings.reactSketchapp.moduleTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextNode extends StObject {
  
  var content: String
  
  var textStyles: TextStyle
}
object TextNode {
  
  inline def apply(content: String, textStyles: TextStyle): TextNode = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], textStyles = textStyles.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextNode]
  }
  
  extension [Self <: TextNode](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setTextStyles(value: TextStyle): Self = StObject.set(x, "textStyles", value.asInstanceOf[js.Any])
  }
}
