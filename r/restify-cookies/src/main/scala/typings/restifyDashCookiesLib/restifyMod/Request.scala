package typings
package restifyDashCookiesLib.restifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var cookies: js.Any
}

object Request {
  @scala.inline
  def apply(cookies: js.Any): Request = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cookies")(cookies)
    __obj.asInstanceOf[Request]
  }
}

