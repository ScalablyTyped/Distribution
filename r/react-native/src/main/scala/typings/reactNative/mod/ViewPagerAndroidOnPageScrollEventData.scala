package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewPagerAndroidOnPageScrollEventData extends StObject {
  
  var offset: Double = js.native
  
  var position: Double = js.native
}
object ViewPagerAndroidOnPageScrollEventData {
  
  @scala.inline
  def apply(offset: Double, position: Double): ViewPagerAndroidOnPageScrollEventData = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewPagerAndroidOnPageScrollEventData]
  }
  
  @scala.inline
  implicit class ViewPagerAndroidOnPageScrollEventDataMutableBuilder[Self <: ViewPagerAndroidOnPageScrollEventData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
