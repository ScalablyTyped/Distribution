package typings.reactDashNavigation.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationLayout extends js.Object {
  var height: AnimatedValue
  var initHeight: Double
  var initWidth: Double
  var isMeasured: Boolean
  var width: AnimatedValue
}

object NavigationLayout {
  @scala.inline
  def apply(
    height: AnimatedValue,
    initHeight: Double,
    initWidth: Double,
    isMeasured: Boolean,
    width: AnimatedValue
  ): NavigationLayout = {
    val __obj = js.Dynamic.literal(height = height, initHeight = initHeight, initWidth = initWidth, isMeasured = isMeasured, width = width)
  
    __obj.asInstanceOf[NavigationLayout]
  }
}

