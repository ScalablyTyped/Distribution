package typings.reactDashReduxDashToastr.reactDashReduxDashToastrMod

import typings.reactDashReduxDashToastr.Anon_Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToastrState extends js.Object {
  var confirm: js.UndefOr[Anon_Id] = js.undefined
  var toastrs: js.Array[Toastr]
}

object ToastrState {
  @scala.inline
  def apply(toastrs: js.Array[Toastr], confirm: Anon_Id = null): ToastrState = {
    val __obj = js.Dynamic.literal(toastrs = toastrs)
    if (confirm != null) __obj.updateDynamic("confirm")(confirm)
    __obj.asInstanceOf[ToastrState]
  }
}

