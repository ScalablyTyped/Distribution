package typings.reactDashFacebookDashLogin.reactDashFacebookDashLoginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactFacebookLoginState extends js.Object {
  var isProcessing: js.UndefOr[Boolean] = js.undefined
  var isSdkLoaded: js.UndefOr[Boolean] = js.undefined
}

object ReactFacebookLoginState {
  @scala.inline
  def apply(isProcessing: js.UndefOr[Boolean] = js.undefined, isSdkLoaded: js.UndefOr[Boolean] = js.undefined): ReactFacebookLoginState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isProcessing)) __obj.updateDynamic("isProcessing")(isProcessing.asInstanceOf[js.Any])
    if (!js.isUndefined(isSdkLoaded)) __obj.updateDynamic("isSdkLoaded")(isSdkLoaded.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactFacebookLoginState]
  }
}

