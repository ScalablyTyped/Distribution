package typings
package reactDashGoogleDashLoginDashComponentLib.reactDashGoogleDashLoginDashComponentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleLoginProps
  extends reactLib.reactMod.ReactNs.ButtonHTMLAttributes[reactLib.HTMLButtonElement] {
  var buttonText: js.UndefOr[java.lang.String] = js.undefined
  var fetchBasicProfile: js.UndefOr[scala.Boolean] = js.undefined
  var prompt: js.UndefOr[java.lang.String] = js.undefined
  var scope: js.UndefOr[java.lang.String] = js.undefined
  var socialId: java.lang.String
  def responseHandler(response: GoogleLoginInfo): scala.Unit
}

object GoogleLoginProps {
  @scala.inline
  def apply(
    responseHandler: js.Function1[GoogleLoginInfo, scala.Unit],
    socialId: java.lang.String,
    ButtonHTMLAttributes: reactLib.reactMod.ReactNs.ButtonHTMLAttributes[reactLib.HTMLButtonElement] = null,
    buttonText: java.lang.String = null,
    fetchBasicProfile: js.UndefOr[scala.Boolean] = js.undefined,
    prompt: java.lang.String = null,
    scope: java.lang.String = null
  ): GoogleLoginProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("responseHandler")(responseHandler)
    __obj.updateDynamic("socialId")(socialId)
    js.Dynamic.global.Object.assign(__obj, ButtonHTMLAttributes)
    if (buttonText != null) __obj.updateDynamic("buttonText")(buttonText)
    if (!js.isUndefined(fetchBasicProfile)) __obj.updateDynamic("fetchBasicProfile")(fetchBasicProfile)
    if (prompt != null) __obj.updateDynamic("prompt")(prompt)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    __obj.asInstanceOf[GoogleLoginProps]
  }
}

