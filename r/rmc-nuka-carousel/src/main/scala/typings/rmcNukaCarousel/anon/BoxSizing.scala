package typings.rmcNukaCarousel.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoxSizing extends StObject {
  
  var MozBoxSizing: String
  
  var boxSizing: String
  
  var display: String
  
  var height: String
  
  var position: String
  
  var visibility: String
  
  var width: js.UndefOr[String] = js.undefined
}
object BoxSizing {
  
  @scala.inline
  def apply(
    MozBoxSizing: String,
    boxSizing: String,
    display: String,
    height: String,
    position: String,
    visibility: String
  ): BoxSizing = {
    val __obj = js.Dynamic.literal(MozBoxSizing = MozBoxSizing.asInstanceOf[js.Any], boxSizing = boxSizing.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoxSizing]
  }
  
  @scala.inline
  implicit class BoxSizingMutableBuilder[Self <: BoxSizing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoxSizing(value: String): Self = StObject.set(x, "boxSizing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMozBoxSizing(value: String): Self = StObject.set(x, "MozBoxSizing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibility(value: String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
