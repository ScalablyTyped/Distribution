package typings.raphael.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RaphaelAxisAlignedBoundingBox extends StObject {
  
  /**
    * Horizontal coordinate of the center of the box.
    */
  var cx: Double
  
  /**
    * Vertical coordinate of the center of the box.
    */
  var cy: Double
  
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
    * Horizontal coordinate of the bottom right corner.
    */
  var x2: Double
  
  /**
    * Vertical coordinate of the top left corner.
    */
  var y: Double
  
  /**
    * Vertical coordinate of the bottom right corner.
    */
  var y2: Double
}
object RaphaelAxisAlignedBoundingBox {
  
  inline def apply(
    cx: Double,
    cy: Double,
    height: Double,
    width: Double,
    x: Double,
    x2: Double,
    y: Double,
    y2: Double
  ): RaphaelAxisAlignedBoundingBox = {
    val __obj = js.Dynamic.literal(cx = cx.asInstanceOf[js.Any], cy = cy.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaphaelAxisAlignedBoundingBox]
  }
  
  extension [Self <: RaphaelAxisAlignedBoundingBox](x: Self) {
    
    inline def setCx(value: Double): Self = StObject.set(x, "cx", value.asInstanceOf[js.Any])
    
    inline def setCy(value: Double): Self = StObject.set(x, "cy", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setX2(value: Double): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setY2(value: Double): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
  }
}
