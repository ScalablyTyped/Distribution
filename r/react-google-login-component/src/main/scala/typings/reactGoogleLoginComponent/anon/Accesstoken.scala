package typings.reactGoogleLoginComponent.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Accesstoken extends js.Object {
  var access_token: String
}

object Accesstoken {
  @scala.inline
  def apply(access_token: String): Accesstoken = {
    val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accesstoken]
  }
}

