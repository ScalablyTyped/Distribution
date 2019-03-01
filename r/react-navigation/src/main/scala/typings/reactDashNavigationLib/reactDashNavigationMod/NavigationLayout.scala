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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("initHeight")(initHeight)
    __obj.updateDynamic("initWidth")(initWidth)
    __obj.updateDynamic("isMeasured")(isMeasured)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[NavigationLayout]
  }
}

