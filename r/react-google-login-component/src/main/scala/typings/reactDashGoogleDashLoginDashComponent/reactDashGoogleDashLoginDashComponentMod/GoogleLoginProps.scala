package typings.reactDashGoogleDashLoginDashComponent.reactDashGoogleDashLoginDashComponentMod

import typings.react.reactMod.ButtonHTMLAttributes
import typings.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleLoginProps extends ButtonHTMLAttributes[HTMLButtonElement] {
  var buttonText: js.UndefOr[String] = js.undefined
  var fetchBasicProfile: js.UndefOr[Boolean] = js.undefined
  var prompt: js.UndefOr[String] = js.undefined
  var scope: js.UndefOr[String] = js.undefined
  var socialId: String
  def responseHandler(response: GoogleLoginInfo): Unit
}

object GoogleLoginProps {
  @scala.inline
  def apply(
    responseHandler: GoogleLoginInfo => Unit,
    socialId: String,
    ButtonHTMLAttributes: ButtonHTMLAttributes[HTMLButtonElement] = null,
    buttonText: String = null,
    fetchBasicProfile: js.UndefOr[Boolean] = js.undefined,
    prompt: String = null,
    scope: String = null
  ): GoogleLoginProps = {
    val __obj = js.Dynamic.literal(responseHandler = js.Any.fromFunction1(responseHandler), socialId = socialId)
    js.Dynamic.global.Object.assign(__obj, ButtonHTMLAttributes)
    if (buttonText != null) __obj.updateDynamic("buttonText")(buttonText)
    if (!js.isUndefined(fetchBasicProfile)) __obj.updateDynamic("fetchBasicProfile")(fetchBasicProfile)
    if (prompt != null) __obj.updateDynamic("prompt")(prompt)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    __obj.asInstanceOf[GoogleLoginProps]
  }
}

