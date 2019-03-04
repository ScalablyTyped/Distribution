package typings
package reactDashNavigationLib.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationLayout extends js.Object {
  var height: AnimatedValue
  var initHeight: scala.Double
  var initWidth: scala.Double
  var isMeasured: scala.Boolean
  var width: AnimatedValue
}

object NavigationLayout {
  @scala.inline
  def apply(
    height: AnimatedValue,
    initHeight: scala.Double,
    initWidth: scala.Double,
    isMeasured: scala.Boolean,
    width: AnimatedValue
  ): NavigationLayout = {
    val __obj = js.Dynamic.literal(height = height, initHeight = initHeight, initWidth = initWidth, isMeasured = isMeasured, width = width)
  
    __obj.asInstanceOf[NavigationLayout]
  }
}

