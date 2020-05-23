package typings.rcResizeObserver.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Height extends js.Object {
  var height: Double
  var offsetHeight: Double
  var offsetWidth: Double
  var width: Double
}

object Height {
  @scala.inline
  def apply(height: Double, offsetHeight: Double, offsetWidth: Double, width: Double): Height = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], offsetHeight = offsetHeight.asInstanceOf[js.Any], offsetWidth = offsetWidth.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Height]
  }
}

