package typings.raphael.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RaphaelAxisAlignedBoundingBox extends StObject {
  
  /**
    * Height of the bounding box.
    */
  var height: Double
  
  /**
    * Width of the bounding box.
    */
  var width: Double
  
  /**
    * Horizontal coordinate of the top left corner.
    */
  var x: Double
  
  /**
    * Vertical coordinate of the top left corner.
    */
  var y: Double
}
object RaphaelAxisAlignedBoundingBox {
  
  inline def apply(height: Double, width: Double, x: Double, y: Double): RaphaelAxisAlignedBoundingBox = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaphaelAxisAlignedBoundingBox]
  }
  
  extension [Self <: RaphaelAxisAlignedBoundingBox](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
