package typings.reactTouch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SwipeConfig extends StObject {
  
  /** @default 100 */
  var swipeDistance: js.UndefOr[Double] = js.native
}
object SwipeConfig {
  
  @scala.inline
  def apply(): SwipeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwipeConfig]
  }
  
  @scala.inline
  implicit class SwipeConfigMutableBuilder[Self <: SwipeConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSwipeDistance(value: Double): Self = StObject.set(x, "swipeDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipeDistanceUndefined: Self = StObject.set(x, "swipeDistance", js.undefined)
  }
}
