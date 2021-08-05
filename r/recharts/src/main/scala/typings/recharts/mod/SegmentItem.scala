package typings.recharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SegmentItem extends StObject {
  
  var x: Double | String
  
  var y: Double | String
}
object SegmentItem {
  
  inline def apply(x: Double | String, y: Double | String): SegmentItem = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SegmentItem]
  }
  
  extension [Self <: SegmentItem](x: Self) {
    
    inline def setX(value: Double | String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double | String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
