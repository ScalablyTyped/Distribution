package typings.raphael.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RaphaelCartesianPoint extends StObject {
  
  /** The x coordinate of the point. */
  var x: Double
  
  /** The y coordinate of the point. */
  var y: Double
}
object RaphaelCartesianPoint {
  
  inline def apply(x: Double, y: Double): RaphaelCartesianPoint = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaphaelCartesianPoint]
  }
  
  extension [Self <: RaphaelCartesianPoint](x: Self) {
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
