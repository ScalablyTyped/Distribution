package typings.reactBeautifulDnd.mod

import typings.reactBeautifulDnd.reactBeautifulDndStrings.`border-box`
import typings.reactBeautifulDnd.reactBeautifulDndStrings.fixed
import typings.reactBeautifulDnd.reactBeautifulDndStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DraggingStyle extends StObject {
  
  var boxSizing: `border-box`
  
  var height: Double
  
  var left: Double
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var pointerEvents: none
  
  var position: fixed
  
  var top: Double
  
  var transform: js.UndefOr[String] = js.undefined
  
  var transition: none
  
  var width: Double
  
  var zIndex: Double
}
object DraggingStyle {
  
  inline def apply(height: Double, left: Double, top: Double, width: Double, zIndex: Double): DraggingStyle = {
    val __obj = js.Dynamic.literal(boxSizing = "border-box", height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], pointerEvents = "none", position = "fixed", top = top.asInstanceOf[js.Any], transition = "none", width = width.asInstanceOf[js.Any], zIndex = zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraggingStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DraggingStyle] (val x: Self) extends AnyVal {
    
    inline def setBoxSizing(value: `border-box`): Self = StObject.set(x, "boxSizing", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setPointerEvents(value: none): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: fixed): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTransform(value: String): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    inline def setTransition(value: none): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
  }
}
