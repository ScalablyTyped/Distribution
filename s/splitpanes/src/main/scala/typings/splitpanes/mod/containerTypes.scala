package typings.splitpanes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait containerTypes extends js.Object {
  var offsetLeft: Null | Double
  var offsetTop: Null | Double
  var vnode: js.Any
}

object containerTypes {
  @scala.inline
  def apply(
    vnode: js.Any,
    offsetLeft: Double = null.asInstanceOf[Double],
    offsetTop: Double = null.asInstanceOf[Double]
  ): containerTypes = {
    val __obj = js.Dynamic.literal(vnode = vnode.asInstanceOf[js.Any], offsetLeft = offsetLeft.asInstanceOf[js.Any], offsetTop = offsetTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[containerTypes]
  }
}

