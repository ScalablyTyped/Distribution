package typings
package reactDashNativeDashWebrtcLib.reactDashNativeDashWebrtcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigurationParamWithUrls extends ConfigurationParam {
  var urls: js.Array[java.lang.String]
}

object ConfigurationParamWithUrls {
  @scala.inline
  def apply(
    urls: js.Array[java.lang.String],
    credential: java.lang.String = null,
    username: java.lang.String = null
  ): ConfigurationParamWithUrls = {
    val __obj = js.Dynamic.literal(urls = urls)
    if (credential != null) __obj.updateDynamic("credential")(credential)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[ConfigurationParamWithUrls]
  }
}

