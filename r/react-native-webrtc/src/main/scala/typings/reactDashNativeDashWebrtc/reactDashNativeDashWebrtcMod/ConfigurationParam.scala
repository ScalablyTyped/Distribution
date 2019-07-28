package typings.reactDashNativeDashWebrtc.reactDashNativeDashWebrtcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigurationParam extends js.Object {
  var credential: js.UndefOr[String] = js.undefined
  var username: js.UndefOr[String] = js.undefined
}

object ConfigurationParam {
  @scala.inline
  def apply(credential: String = null, username: String = null): ConfigurationParam = {
    val __obj = js.Dynamic.literal()
    if (credential != null) __obj.updateDynamic("credential")(credential)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[ConfigurationParam]
  }
}

