package typings.reactReduxToastr.mod

import typings.reactReduxToastr.AnonId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToastrState extends js.Object {
  var confirm: js.UndefOr[AnonId] = js.undefined
  var toastrs: js.Array[Toastr_]
}

object ToastrState {
  @scala.inline
  def apply(toastrs: js.Array[Toastr_], confirm: AnonId = null): ToastrState = {
    val __obj = js.Dynamic.literal(toastrs = toastrs.asInstanceOf[js.Any])
    if (confirm != null) __obj.updateDynamic("confirm")(confirm.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastrState]
  }
}

