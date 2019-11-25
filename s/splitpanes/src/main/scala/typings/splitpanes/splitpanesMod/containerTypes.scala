package typings.splitpanes.splitpanesMod

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
  def apply(vnode: js.Any, offsetLeft: Int | Double = null, offsetTop: Int | Double = null): containerTypes = {
    val __obj = js.Dynamic.literal(vnode = vnode.asInstanceOf[js.Any])
    if (offsetLeft != null) __obj.updateDynamic("offsetLeft")(offsetLeft.asInstanceOf[js.Any])
    if (offsetTop != null) __obj.updateDynamic("offsetTop")(offsetTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[containerTypes]
  }
}

