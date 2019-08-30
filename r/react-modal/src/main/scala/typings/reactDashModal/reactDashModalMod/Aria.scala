package typings.reactDashModal.reactDashModalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Aria extends js.Object {
  /** Identifies the element (or elements) that describes the object. */
  var describedby: js.UndefOr[String] = js.undefined
  /** Defines a string value that labels the current element. */
  var labelledby: js.UndefOr[String] = js.undefined
  /** Indicates whether an element is modal when displayed. */
  var modal: js.UndefOr[Boolean] = js.undefined
}

object Aria {
  @scala.inline
  def apply(describedby: String = null, labelledby: String = null, modal: js.UndefOr[Boolean] = js.undefined): Aria = {
    val __obj = js.Dynamic.literal()
    if (describedby != null) __obj.updateDynamic("describedby")(describedby)
    if (labelledby != null) __obj.updateDynamic("labelledby")(labelledby)
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal)
    __obj.asInstanceOf[Aria]
  }
}

