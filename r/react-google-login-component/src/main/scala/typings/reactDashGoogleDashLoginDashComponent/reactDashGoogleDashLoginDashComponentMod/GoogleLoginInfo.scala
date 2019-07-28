package typings.reactDashGoogleDashLoginDashComponent.reactDashGoogleDashLoginDashComponentMod

import typings.reactDashGoogleDashLoginDashComponent.Anon_Accesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleLoginInfo extends js.Object {
  def getAuthResponse(): Anon_Accesstoken
}

object GoogleLoginInfo {
  @scala.inline
  def apply(getAuthResponse: () => Anon_Accesstoken): GoogleLoginInfo = {
    val __obj = js.Dynamic.literal(getAuthResponse = js.Any.fromFunction0(getAuthResponse))
  
    __obj.asInstanceOf[GoogleLoginInfo]
  }
}

