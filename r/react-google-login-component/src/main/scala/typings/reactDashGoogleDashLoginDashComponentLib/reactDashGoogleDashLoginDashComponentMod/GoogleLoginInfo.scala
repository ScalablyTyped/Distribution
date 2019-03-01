package typings
package reactDashGoogleDashLoginDashComponentLib.reactDashGoogleDashLoginDashComponentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleLoginInfo extends js.Object {
  def getAuthResponse(): reactDashGoogleDashLoginDashComponentLib.Anon_Accesstoken
}

object GoogleLoginInfo {
  @scala.inline
  def apply(getAuthResponse: js.Function0[reactDashGoogleDashLoginDashComponentLib.Anon_Accesstoken]): GoogleLoginInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getAuthResponse")(getAuthResponse)
    __obj.asInstanceOf[GoogleLoginInfo]
  }
}

