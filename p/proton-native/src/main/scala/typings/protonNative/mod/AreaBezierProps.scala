package typings.protonNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AreaBezierProps extends AreaBaseProps {
  
  /**
    * The x coordinate of the curve's control point at the start.
    */
  var cx1: Double | String = js.native
  
  /**
    * The x coordinate of the curve's control point at the end.
    */
  var cx2: Double | String = js.native
  
  /**
    * The y coordinate of the curve's control point at the start.
    */
  var cy1: Double | String = js.native
  
  /**
    * The y coordinate of the curve's control point at the end.
    */
  var cy2: Double | String = js.native
  
  /**
    * The x coordinate of the curve's start point.
    */
  var x1: Double | String = js.native
  
  /**
    * The x coordinate of the curve's end point.
    */
  var x2: Double | String = js.native
  
  /**
    * The y coordinate of the curve's start point.
    */
  var y1: Double | String = js.native
  
  /**
    * The y coordinate of the curve's end point.
    */
  var y2: Double | String = js.native
}
object AreaBezierProps {
  
  @scala.inline
  def apply(
    cx1: Double | String,
    cx2: Double | String,
    cy1: Double | String,
    cy2: Double | String,
    x1: Double | String,
    x2: Double | String,
    y1: Double | String,
    y2: Double | String
  ): AreaBezierProps = {
    val __obj = js.Dynamic.literal(cx1 = cx1.asInstanceOf[js.Any], cx2 = cx2.asInstanceOf[js.Any], cy1 = cy1.asInstanceOf[js.Any], cy2 = cy2.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.asInstanceOf[AreaBezierProps]
  }
  
  @scala.inline
  implicit class AreaBezierPropsMutableBuilder[Self <: AreaBezierProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCx1(value: Double | String): Self = StObject.set(x, "cx1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCx2(value: Double | String): Self = StObject.set(x, "cx2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCy1(value: Double | String): Self = StObject.set(x, "cy1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCy2(value: Double | String): Self = StObject.set(x, "cy2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX1(value: Double | String): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX2(value: Double | String): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY1(value: Double | String): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY2(value: Double | String): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
  }
}
