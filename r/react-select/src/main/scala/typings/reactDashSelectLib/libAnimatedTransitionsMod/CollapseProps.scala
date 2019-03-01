package typings
package reactDashSelectLib.libAnimatedTransitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollapseProps extends js.Object {
  var children: js.Any
  var in: scala.Boolean
}

object CollapseProps {
  @scala.inline
  def apply(children: js.Any, in: scala.Boolean): CollapseProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("children")(children)
    __obj.updateDynamic("in")(in)
    __obj.asInstanceOf[CollapseProps]
  }
}

