package typings.sarif.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rectangle extends StObject {
  
  /**
    * The Y coordinate of the bottom edge of the rectangle, measured in the image's natural units.
    */
  var bottom: js.UndefOr[Double] = js.undefined
  
  /**
    * The X coordinate of the left edge of the rectangle, measured in the image's natural units.
    */
  var left: js.UndefOr[Double] = js.undefined
  
  /**
    * A message relevant to the rectangle.
    */
  var message: js.UndefOr[Message] = js.undefined
  
  /**
    * Key/value pairs that provide additional information about the rectangle.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  
  /**
    * The X coordinate of the right edge of the rectangle, measured in the image's natural units.
    */
  var right: js.UndefOr[Double] = js.undefined
  
  /**
    * The Y coordinate of the top edge of the rectangle, measured in the image's natural units.
    */
  var top: js.UndefOr[Double] = js.undefined
}
object Rectangle {
  
  @scala.inline
  def apply(): Rectangle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Rectangle]
  }
  
  @scala.inline
  implicit class RectangleMutableBuilder[Self <: Rectangle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    @scala.inline
    def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    @scala.inline
    def setMessage(value: Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setProperties(value: PropertyBag): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    @scala.inline
    def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
