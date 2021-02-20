package typings.raphael.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RaphaelAxisAlignedBoundingBox extends StObject {
  
  /**
    * Height of the bounding box.
    */
  var height: Double = js.native
  
  /**
    * Width of the bounding box.
    */
  var width: Double = js.native
  
  /**
    * Horizontal coordinate of the top left corner.
    */
  var x: Double = js.native
  
  /**
    * Vertical coordinate of the top left corner.
    */
  var y: Double = js.native
}
object RaphaelAxisAlignedBoundingBox {
  
  @scala.inline
  def apply(height: Double, width: Double, x: Double, y: Double): RaphaelAxisAlignedBoundingBox = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaphaelAxisAlignedBoundingBox]
  }
  
  @scala.inline
  implicit class RaphaelAxisAlignedBoundingBoxMutableBuilder[Self <: RaphaelAxisAlignedBoundingBox] (val x: Self) extends AnyVal {
    
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
