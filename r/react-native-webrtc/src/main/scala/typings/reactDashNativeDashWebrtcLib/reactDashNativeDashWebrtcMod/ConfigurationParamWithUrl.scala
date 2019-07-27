package typings
package reactDashNativeDashWebrtcLib.reactDashNativeDashWebrtcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigurationParamWithUrl extends ConfigurationParam {
  var url: java.lang.String
}

object ConfigurationParamWithUrl {
  @scala.inline
  def apply(url: java.lang.String, credential: java.lang.String = null, username: java.lang.String = null): ConfigurationParamWithUrl = {
    val __obj = js.Dynamic.literal(url = url)
    if (credential != null) __obj.updateDynamic("credential")(credential)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[ConfigurationParamWithUrl]
  }
}

