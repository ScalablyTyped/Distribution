package typings
package reactDashFacebookDashLoginDashComponentLib.reactDashFacebookDashLoginDashComponentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FacebookLoginProps
  extends reactLib.reactMod.ButtonHTMLAttributes[stdLib.HTMLButtonElement] {
  var buttonText: js.UndefOr[java.lang.String] = js.undefined
  var fields: js.UndefOr[java.lang.String] = js.undefined
  var socialId: java.lang.String
  var version: js.UndefOr[java.lang.String] = js.undefined
  var xfbml: js.UndefOr[scala.Boolean] = js.undefined
  def responseHandler(response: FacebookLoginInfo): scala.Unit
}

object FacebookLoginProps {
  @scala.inline
  def apply(
    responseHandler: FacebookLoginInfo => scala.Unit,
    socialId: java.lang.String,
    ButtonHTMLAttributes: reactLib.reactMod.ButtonHTMLAttributes[stdLib.HTMLButtonElement] = null,
    buttonText: java.lang.String = null,
    fields: java.lang.String = null,
    version: java.lang.String = null,
    xfbml: js.UndefOr[scala.Boolean] = js.undefined
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

