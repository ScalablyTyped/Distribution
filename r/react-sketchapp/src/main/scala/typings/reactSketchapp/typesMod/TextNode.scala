package typings.reactSketchapp.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextNode extends StObject {
  
  var content: String = js.native
  
  var textStyles: TextStyle = js.native
}
object TextNode {
  
  @scala.inline
  def apply(content: String, textStyles: TextStyle): TextNode = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], textStyles = textStyles.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextNode]
  }
  
  @scala.inline
  implicit class TextNodeMutableBuilder[Self <: TextNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextStyles(value: TextStyle): Self = StObject.set(x, "textStyles", value.asInstanceOf[js.Any])
  }
}
