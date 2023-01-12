package typings.protonNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AreaCircleProps
  extends StObject
     with AreaBaseProps {
  
  /**
    * The circle's radius. Percentage values use the Area's width.
    */
  var r: Double | String
  
  /**
    * The x coordinate of the center of the cirle.
    */
  var x: Double | String
  
  /**
    * The y coordinate of the center of the cirle.
    */
  var y: Double | String
}
object AreaCircleProps {
  
  inline def apply(r: Double | String, x: Double | String, y: Double | String): AreaCircleProps = {
    val __obj = js.Dynamic.literal(r = r.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[AreaCircleProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AreaCircleProps] (val x: Self) extends AnyVal {
    
    inline def setR(value: Double | String): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double | String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double | String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
