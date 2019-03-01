package typings
package reactDashFacebookDashLoginLib.reactDashFacebookDashLoginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactFacebookLoginState extends js.Object {
  var isProcessing: js.UndefOr[scala.Boolean] = js.undefined
  var isSdkLoaded: js.UndefOr[scala.Boolean] = js.undefined
}

object ReactFacebookLoginState {
  @scala.inline
  def apply(
    isProcessing: js.UndefOr[scala.Boolean] = js.undefined,
    isSdkLoaded: js.UndefOr[scala.Boolean] = js.undefined
  ): ReactFacebookLoginState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isProcessing)) __obj.updateDynamic("isProcessing")(isProcessing)
    if (!js.isUndefined(isSdkLoaded)) __obj.updateDynamic("isSdkLoaded")(isSdkLoaded)
    __obj.asInstanceOf[ReactFacebookLoginState]
  }
}

