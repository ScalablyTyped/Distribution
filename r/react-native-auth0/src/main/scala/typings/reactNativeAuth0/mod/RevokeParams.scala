package typings.reactNativeAuth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RevokeParams extends js.Object {
  var refreshToken: String
}

object RevokeParams {
  @scala.inline
  def apply(refreshToken: String): RevokeParams = {
    val __obj = js.Dynamic.literal(refreshToken = refreshToken.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RevokeParams]
  }
}

