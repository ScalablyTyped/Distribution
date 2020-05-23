package typings.reactGoogleLoginComponent.mod

import typings.reactGoogleLoginComponent.anon.Accesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleLoginInfo extends js.Object {
  def getAuthResponse(): Accesstoken
}

object GoogleLoginInfo {
  @scala.inline
  def apply(getAuthResponse: () => Accesstoken): GoogleLoginInfo = {
    val __obj = js.Dynamic.literal(getAuthResponse = js.Any.fromFunction0(getAuthResponse))
    __obj.asInstanceOf[GoogleLoginInfo]
  }
}

