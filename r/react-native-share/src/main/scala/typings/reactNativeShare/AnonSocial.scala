package typings.reactNativeShare

import typings.reactNativeShare.mod.Share.Social
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSocial extends js.Object {
  var social: Social
}

object AnonSocial {
  @scala.inline
  def apply(social: Social): AnonSocial = {
    val __obj = js.Dynamic.literal(social = social.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSocial]
  }
}

