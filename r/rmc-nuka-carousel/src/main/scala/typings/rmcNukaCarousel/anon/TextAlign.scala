package typings.rmcNukaCarousel.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextAlign extends StObject {
  
  var bottom: Double
  
  var position: String
  
  var textAlign: String
  
  var width: String
}
object TextAlign {
  
  @scala.inline
  def apply(bottom: Double, position: String, textAlign: String, width: String): TextAlign = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], textAlign = textAlign.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextAlign]
  }
  
  @scala.inline
  implicit class TextAlignMutableBuilder[Self <: TextAlign] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextAlign(value: String): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
