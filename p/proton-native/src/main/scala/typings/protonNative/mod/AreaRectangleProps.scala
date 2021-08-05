package typings.protonNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AreaRectangleProps
  extends StObject
     with AreaBaseProps {
  
  /**
    * The height of the rectangle.
    */
  var height: Double | String
  
  /**
    * The width of the rectangle.
    */
  var width: Double | String
  
  /**
    * The x coordinate of the rectangles top left corner.
    */
  var x: Double | String
  
  /**
    * The y coordinate of the rectangles top left corner.
    */
  var y: Double | String
}
object AreaRectangleProps {
  
  inline def apply(height: Double | String, width: Double | String, x: Double | String, y: Double | String): AreaRectangleProps = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[AreaRectangleProps]
  }
  
  extension [Self <: AreaRectangleProps](x: Self) {
    
    inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double | String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double | String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
