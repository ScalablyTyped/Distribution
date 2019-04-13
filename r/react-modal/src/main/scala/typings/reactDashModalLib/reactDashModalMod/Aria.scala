package typings
package reactDashModalLib.reactDashModalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Aria extends js.Object {
  var describedby: js.UndefOr[java.lang.String] = js.undefined
  var labelledby: js.UndefOr[java.lang.String] = js.undefined
}

object Aria {
  @scala.inline
  def apply(describedby: java.lang.String = null, labelledby: java.lang.String = null): Aria = {
    val __obj = js.Dynamic.literal()
    if (describedby != null) __obj.updateDynamic("describedby")(describedby)
    if (labelledby != null) __obj.updateDynamic("labelledby")(labelledby)
    __obj.asInstanceOf[Aria]
  }
}

