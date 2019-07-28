package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCIceParameters extends js.Object {
  var password: js.UndefOr[java.lang.String] = js.undefined
  var usernameFragment: js.UndefOr[java.lang.String] = js.undefined
}

object RTCIceParameters {
  @scala.inline
  def apply(password: java.lang.String = null, usernameFragment: java.lang.String = null): RTCIceParameters = {
    val __obj = js.Dynamic.literal()
    if (password != null) __obj.updateDynamic("password")(password)
    if (usernameFragment != null) __obj.updateDynamic("usernameFragment")(usernameFragment)
    __obj.asInstanceOf[RTCIceParameters]
  }
}

