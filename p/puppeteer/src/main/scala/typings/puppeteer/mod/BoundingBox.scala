package typings.puppeteer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoundingBox extends StObject {
  
  /** The height. */
  var height: Double
  
  /** The width. */
  var width: Double
  
  /** The x-coordinate of top-left corner. */
  var x: Double
  
  /** The y-coordinate of top-left corner. */
  var y: Double
}
object BoundingBox {
  
  @scala.inline
  def apply(height: Double, width: Double, x: Double, y: Double): BoundingBox = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoundingBox]
  }
  
  @scala.inline
  implicit class BoundingBoxMutableBuilder[Self <: BoundingBox] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
