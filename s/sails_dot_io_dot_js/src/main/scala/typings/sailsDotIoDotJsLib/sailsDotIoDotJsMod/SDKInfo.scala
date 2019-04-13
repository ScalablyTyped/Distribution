package typings
package sailsDotIoDotJsLib.sailsDotIoDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SDKInfo extends js.Object {
  var language: js.UndefOr[java.lang.String] = js.undefined
  var platform: js.UndefOr[
    sailsDotIoDotJsLib.sailsDotIoDotJsLibStrings.browser | sailsDotIoDotJsLib.sailsDotIoDotJsLibStrings.node
  ] = js.undefined
  var version: js.UndefOr[java.lang.String] = js.undefined
  var versionString: js.UndefOr[java.lang.String] = js.undefined
}

object SDKInfo {
  @scala.inline
  def apply(
    language: java.lang.String = null,
    platform: sailsDotIoDotJsLib.sailsDotIoDotJsLibStrings.browser | sailsDotIoDotJsLib.sailsDotIoDotJsLibStrings.node = null,
    version: java.lang.String = null,
    versionString: java.lang.String = null
  ): SDKInfo = {
    val __obj = js.Dynamic.literal()
    if (language != null) __obj.updateDynamic("language")(language)
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version)
    if (versionString != null) __obj.updateDynamic("versionString")(versionString)
    __obj.asInstanceOf[SDKInfo]
  }
}

