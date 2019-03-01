package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewPagerAndroidOnPageScrollEventData extends js.Object {
  var offset: scala.Double
  var position: scala.Double
}

object ViewPagerAndroidOnPageScrollEventData {
  @scala.inline
  def apply(offset: scala.Double, position: scala.Double): ViewPagerAndroidOnPageScrollEventData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("offset")(offset)
    __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[ViewPagerAndroidOnPageScrollEventData]
  }
}

