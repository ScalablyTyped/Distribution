package typings.reactNativeShare

import typings.reactNativeShare.mod.SupportedSocialApps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSocial extends js.Object {
  var social: SupportedSocialApps
}

object AnonSocial {
  @scala.inline
  def apply(social: SupportedSocialApps): AnonSocial = {
    val __obj = js.Dynamic.literal(social = social.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSocial]
  }
}

