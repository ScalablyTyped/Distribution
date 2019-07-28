package typings.reactDashModal.reactDashModalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Aria extends js.Object {
  var describedby: js.UndefOr[String] = js.undefined
  var labelledby: js.UndefOr[String] = js.undefined
}

object Aria {
  @scala.inline
  def apply(describedby: String = null, labelledby: String = null): Aria = {
    val __obj = js.Dynamic.literal()
    if (describedby != null) __obj.updateDynamic("describedby")(describedby)
    if (labelledby != null) __obj.updateDynamic("labelledby")(labelledby)
    __obj.asInstanceOf[Aria]
  }
}

