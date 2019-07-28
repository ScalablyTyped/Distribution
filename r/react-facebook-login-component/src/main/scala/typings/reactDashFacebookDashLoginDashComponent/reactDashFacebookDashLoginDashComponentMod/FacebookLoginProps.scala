package typings.reactDashFacebookDashLoginDashComponent.reactDashFacebookDashLoginDashComponentMod

import typings.react.reactMod.ButtonHTMLAttributes
import typings.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FacebookLoginProps extends ButtonHTMLAttributes[HTMLButtonElement] {
  var buttonText: js.UndefOr[String] = js.undefined
  var fields: js.UndefOr[String] = js.undefined
  var socialId: String
  var version: js.UndefOr[String] = js.undefined
  var xfbml: js.UndefOr[Boolean] = js.undefined
  def responseHandler(response: FacebookLoginInfo): Unit
}

object FacebookLoginProps {
  @scala.inline
  def apply(
    responseHandler: FacebookLoginInfo => Unit,
    socialId: String,
    ButtonHTMLAttributes: ButtonHTMLAttributes[HTMLButtonElement] = null,
    buttonText: String = null,
    fields: String = null,
    version: String = null,
    xfbml: js.UndefOr[Boolean] = js.undefined
  ): FacebookLoginProps = {
    val __obj = js.Dynamic.literal(responseHandler = js.Any.fromFunction1(responseHandler), socialId = socialId)
    js.Dynamic.global.Object.assign(__obj, ButtonHTMLAttributes)
    if (buttonText != null) __obj.updateDynamic("buttonText")(buttonText)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (version != null) __obj.updateDynamic("version")(version)
    if (!js.isUndefined(xfbml)) __obj.updateDynamic("xfbml")(xfbml)
    __obj.asInstanceOf[FacebookLoginProps]
  }
}

