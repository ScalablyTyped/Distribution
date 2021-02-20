package typings.protonNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AreaCircleProps extends AreaBaseProps {
  
  /**
    * The circle's radius. Percentage values use the Area's width.
    */
  var r: Double | String = js.native
  
  /**
    * The x coordinate of the center of the cirle.
    */
  var x: Double | String = js.native
  
  /**
    * The y coordinate of the center of the cirle.
    */
  var y: Double | String = js.native
}
object AreaCircleProps {
  
  @scala.inline
  def apply(r: Double | String, x: Double | String, y: Double | String): AreaCircleProps = {
    val __obj = js.Dynamic.literal(r = r.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[AreaCircleProps]
  }
  
  @scala.inline
  implicit class AreaCirclePropsMutableBuilder[Self <: AreaCircleProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setR(value: Double | String): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double | String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double | String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
