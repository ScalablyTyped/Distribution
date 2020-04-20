package typings.restifyCookies.mod.restifyAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var cookies: js.Any
}

object Request {
  @scala.inline
  def apply(cookies: js.Any): Request = {
    val __obj = js.Dynamic.literal(cookies = cookies.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
}

