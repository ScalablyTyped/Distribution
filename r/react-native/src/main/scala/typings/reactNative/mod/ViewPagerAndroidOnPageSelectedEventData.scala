package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewPagerAndroidOnPageSelectedEventData extends StObject {
  
  var position: Double = js.native
}
object ViewPagerAndroidOnPageSelectedEventData {
  
  @scala.inline
  def apply(position: Double): ViewPagerAndroidOnPageSelectedEventData = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewPagerAndroidOnPageSelectedEventData]
  }
  
  @scala.inline
  implicit class ViewPagerAndroidOnPageSelectedEventDataMutableBuilder[Self <: ViewPagerAndroidOnPageSelectedEventData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
