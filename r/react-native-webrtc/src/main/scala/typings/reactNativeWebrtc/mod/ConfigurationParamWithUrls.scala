package typings.reactNativeWebrtc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigurationParamWithUrls extends ConfigurationParam {
  var urls: js.Array[String]
}

object ConfigurationParamWithUrls {
  @scala.inline
  def apply(urls: js.Array[String], credential: String = null, username: String = null): ConfigurationParamWithUrls = {
    val __obj = js.Dynamic.literal(urls = urls.asInstanceOf[js.Any])
    if (credential != null) __obj.updateDynamic("credential")(credential.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationParamWithUrls]
  }
}

