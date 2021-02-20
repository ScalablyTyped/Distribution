package typings.recharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SegmentItem extends StObject {
  
  var x: Double | String = js.native
  
  var y: Double | String = js.native
}
object SegmentItem {
  
  @scala.inline
  def apply(x: Double | String, y: Double | String): SegmentItem = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SegmentItem]
  }
  
  @scala.inline
  implicit class SegmentItemMutableBuilder[Self <: SegmentItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: Double | String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double | String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
