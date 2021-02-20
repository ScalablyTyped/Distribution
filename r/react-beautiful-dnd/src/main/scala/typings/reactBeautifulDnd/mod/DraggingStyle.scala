package typings.reactBeautifulDnd.mod

import typings.reactBeautifulDnd.reactBeautifulDndStrings.`border-box`
import typings.reactBeautifulDnd.reactBeautifulDndStrings.fixed
import typings.reactBeautifulDnd.reactBeautifulDndStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DraggingStyle extends StObject {
  
  var boxSizing: `border-box` = js.native
  
  var height: Double = js.native
  
  var left: Double = js.native
  
  var opacity: js.UndefOr[Double] = js.native
  
  var pointerEvents: none = js.native
  
  var position: fixed = js.native
  
  var top: Double = js.native
  
  var transform: js.UndefOr[String] = js.native
  
  var transition: none = js.native
  
  var width: Double = js.native
  
  var zIndex: Double = js.native
}
object DraggingStyle {
  
  @scala.inline
  def apply(
    boxSizing: `border-box`,
    height: Double,
    left: Double,
    pointerEvents: none,
    position: fixed,
    top: Double,
    transition: none,
    width: Double,
    zIndex: Double
  ): DraggingStyle = {
    val __obj = js.Dynamic.literal(boxSizing = boxSizing.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], pointerEvents = pointerEvents.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], zIndex = zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraggingStyle]
  }
  
  @scala.inline
  implicit class DraggingStyleMutableBuilder[Self <: DraggingStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoxSizing(value: `border-box`): Self = StObject.set(x, "boxSizing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setPointerEvents(value: none): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: fixed): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransform(value: String): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    @scala.inline
    def setTransition(value: none): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
  }
}
