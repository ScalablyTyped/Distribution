package typings
package reactDashBootstrapLib.libUtilsBootstrapUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BSProps extends js.Object {
  var bsClass: js.Any
  var bsRole: js.Any
  var bsSize: js.Any
  var bsStyle: js.Any
}

object BSProps {
  @scala.inline
  def apply(bsClass: js.Any, bsRole: js.Any, bsSize: js.Any, bsStyle: js.Any): BSProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bsClass")(bsClass)
    __obj.updateDynamic("bsRole")(bsRole)
    __obj.updateDynamic("bsSize")(bsSize)
    __obj.updateDynamic("bsStyle")(bsStyle)
    __obj.asInstanceOf[BSProps]
  }
}

