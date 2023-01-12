package typings.protonNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AreaLineProps
  extends StObject
     with AreaBaseProps {
  
  /**
    * The x coordinate of the line's start point.
    */
  var x1: Double | String
  
  /**
    * The x coordinate of the line's end point.
    */
  var x2: Double | String
  
  /**
    * The y coordinate of the line's start point.
    */
  var y1: Double | String
  
  /**
    * The y coordinate of the line's end point.
    */
  var y2: Double | String
}
object AreaLineProps {
  
  inline def apply(x1: Double | String, x2: Double | String, y1: Double | String, y2: Double | String): AreaLineProps = {
    val __obj = js.Dynamic.literal(x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.asInstanceOf[AreaLineProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AreaLineProps] (val x: Self) extends AnyVal {
    
    inline def setX1(value: Double | String): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
    
    inline def setX2(value: Double | String): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
    
    inline def setY1(value: Double | String): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
    
    inline def setY2(value: Double | String): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
  }
}
