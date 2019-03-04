package typings
package reactDashNativeDashSwiperLib.reactDashNativeDashSwiperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwiperState extends js.Object {
  var autoplayEnd: scala.Boolean
  var dir: reactDashNativeDashSwiperLib.reactDashNativeDashSwiperLibStrings.x | reactDashNativeDashSwiperLib.reactDashNativeDashSwiperLibStrings.y
  var height: scala.Double
  var index: scala.Double
  var isScrolling: scala.Boolean
  var loopJump: scala.Boolean
  var offset: reactDashNativeDashSwiperLib.Anon_X
  var total: scala.Double
  var width: scala.Double
}

object SwiperState {
  @scala.inline
  def apply(
    autoplayEnd: scala.Boolean,
    dir: reactDashNativeDashSwiperLib.reactDashNativeDashSwiperLibStrings.x | reactDashNativeDashSwiperLib.reactDashNativeDashSwiperLibStrings.y,
    height: scala.Double,
    index: scala.Double,
    isScrolling: scala.Boolean,
    loopJump: scala.Boolean,
    offset: reactDashNativeDashSwiperLib.Anon_X,
    total: scala.Double,
    width: scala.Double
  ): SwiperState = {
    val __obj = js.Dynamic.literal(autoplayEnd = autoplayEnd, dir = dir.asInstanceOf[js.Any], height = height, index = index, isScrolling = isScrolling, loopJump = loopJump, offset = offset, total = total, width = width)
  
    __obj.asInstanceOf[SwiperState]
  }
}

