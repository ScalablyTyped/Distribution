package typings.reactVisibilitySensor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChildFunctionArg extends js.Object {
  var isVisible: Boolean | Null
  var visibilityRect: Shape
}

object ChildFunctionArg {
  @scala.inline
  def apply(visibilityRect: Shape, isVisible: Boolean = null.asInstanceOf[Boolean]): ChildFunctionArg = {
    val __obj = js.Dynamic.literal(visibilityRect = visibilityRect.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildFunctionArg]
  }
}

