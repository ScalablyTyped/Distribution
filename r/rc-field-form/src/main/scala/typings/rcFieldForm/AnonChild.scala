package typings.rcFieldForm

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChild extends js.Object {
  var child: ReactNode
  var isFunction: Boolean
}

object AnonChild {
  @scala.inline
  def apply(isFunction: Boolean, child: ReactNode = null): AnonChild = {
    val __obj = js.Dynamic.literal(isFunction = isFunction.asInstanceOf[js.Any])
    if (child != null) __obj.updateDynamic("child")(child.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChild]
  }
}

