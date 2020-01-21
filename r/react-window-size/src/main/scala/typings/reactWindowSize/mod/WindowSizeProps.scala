package typings.reactWindowSize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowSizeProps extends js.Object {
  var windowHeight: Double
  var windowWidth: Double
}

object WindowSizeProps {
  @scala.inline
  def apply(windowHeight: Double, windowWidth: Double): WindowSizeProps = {
    val __obj = js.Dynamic.literal(windowHeight = windowHeight.asInstanceOf[js.Any], windowWidth = windowWidth.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WindowSizeProps]
  }
}

