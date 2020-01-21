package typings.reactNativeWebrtc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigurationParamWithUrl extends ConfigurationParam {
  var url: String
}

object ConfigurationParamWithUrl {
  @scala.inline
  def apply(url: String, credential: String = null, username: String = null): ConfigurationParamWithUrl = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (credential != null) __obj.updateDynamic("credential")(credential.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationParamWithUrl]
  }
}

