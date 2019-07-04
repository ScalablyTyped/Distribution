package typings
package splitpanesLib.splitpanesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait containerTypes extends js.Object {
  var offsetLeft: scala.Null | scala.Double
  var offsetTop: scala.Null | scala.Double
  var vnode: js.Any
}

object containerTypes {
  @scala.inline
  def apply(
    vnode: js.Any,
    offsetLeft: scala.Int | scala.Double = null,
    offsetTop: scala.Int | scala.Double = null
  ): containerTypes = {
    val __obj = js.Dynamic.literal(vnode = vnode)
    if (offsetLeft != null) __obj.updateDynamic("offsetLeft")(offsetLeft.asInstanceOf[js.Any])
    if (offsetTop != null) __obj.updateDynamic("offsetTop")(offsetTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[containerTypes]
  }
}

