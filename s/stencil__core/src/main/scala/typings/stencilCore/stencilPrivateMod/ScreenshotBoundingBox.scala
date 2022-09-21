package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScreenshotBoundingBox extends StObject {
  
  /**
    * The height in pixels.
    */
  var height: Double
  
  /**
    * The width in pixels.
    */
  var width: Double
  
  /**
    * The x-coordinate of top-left corner.
    */
  var x: Double
  
  /**
    * The y-coordinate of top-left corner.
    */
  var y: Double
}
object ScreenshotBoundingBox {
  
  inline def apply(height: Double, width: Double, x: Double, y: Double): ScreenshotBoundingBox = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScreenshotBoundingBox]
  }
  
  extension [Self <: ScreenshotBoundingBox](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
