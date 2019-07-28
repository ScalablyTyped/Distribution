package typings.reactDashNativeDashSwiper.reactDashNativeDashSwiperMod

import typings.reactDashNativeDashSwiper.Anon_X
import typings.reactDashNativeDashSwiper.reactDashNativeDashSwiperStrings.x
import typings.reactDashNativeDashSwiper.reactDashNativeDashSwiperStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwiperState extends js.Object {
  var autoplayEnd: Boolean
  var dir: x | y
  var height: Double
  var index: Double
  var isScrolling: Boolean
  var loopJump: Boolean
  var offset: Anon_X
  var total: Double
  var width: Double
}

object SwiperState {
  @scala.inline
  def apply(
    autoplayEnd: Boolean,
    dir: x | y,
    height: Double,
    index: Double,
    isScrolling: Boolean,
    loopJump: Boolean,
    offset: Anon_X,
    total: Double,
    width: Double
  ): SwiperState = {
    val __obj = js.Dynamic.literal(autoplayEnd = autoplayEnd, dir = dir.asInstanceOf[js.Any], height = height, index = index, isScrolling = isScrolling, loopJump = loopJump, offset = offset, total = total, width = width)
  
    __obj.asInstanceOf[SwiperState]
  }
}

