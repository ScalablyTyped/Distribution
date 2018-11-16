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

