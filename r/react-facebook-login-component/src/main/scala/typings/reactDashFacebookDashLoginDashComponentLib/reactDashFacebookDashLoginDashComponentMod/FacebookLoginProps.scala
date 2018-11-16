package typings
package reactDashFacebookDashLoginDashComponentLib.reactDashFacebookDashLoginDashComponentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FacebookLoginProps
  extends reactLib.reactMod.ReactNs.ButtonHTMLAttributes[reactLib.HTMLButtonElement] {
  var buttonText: js.UndefOr[java.lang.String] = js.undefined
  var fields: js.UndefOr[java.lang.String] = js.undefined
  var socialId: java.lang.String
  var version: js.UndefOr[java.lang.String] = js.undefined
  var xfbml: js.UndefOr[scala.Boolean] = js.undefined
  def responseHandler(response: FacebookLoginInfo): scala.Unit
}

