package typings
package reactDashWindowDashSizeLib.reactDashWindowDashSizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowSizeProps extends js.Object {
  var windowHeight: scala.Double
  var windowWidth: scala.Double
}

object WindowSizeProps {
  @scala.inline
  def apply(windowHeight: scala.Double, windowWidth: scala.Double): WindowSizeProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("windowHeight")(windowHeight)
    __obj.updateDynamic("windowWidth")(windowWidth)
    __obj.asInstanceOf[WindowSizeProps]
  }
}

