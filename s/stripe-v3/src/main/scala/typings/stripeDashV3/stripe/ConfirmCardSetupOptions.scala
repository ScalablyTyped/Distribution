package typings.stripeDashV3.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfirmCardSetupOptions extends js.Object {
  /*
    * Set this to false if you want to handle next actions yourself, or if
    * you want to defer next action handling until later (e.g. for use in
    * the PaymentRequest API). Default is true.
    */
  var handleActions: js.UndefOr[Boolean] = js.undefined
}

object ConfirmCardSetupOptions {
  @scala.inline
  def apply(handleActions: js.UndefOr[Boolean] = js.undefined): ConfirmCardSetupOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(handleActions)) __obj.updateDynamic("handleActions")(handleActions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfirmCardSetupOptions]
  }
}

