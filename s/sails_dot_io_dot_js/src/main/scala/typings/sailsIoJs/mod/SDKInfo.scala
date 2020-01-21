package typings.sailsIoJs.mod

import typings.sailsIoJs.sailsIoJsStrings.browser
import typings.sailsIoJs.sailsIoJsStrings.node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SDKInfo extends js.Object {
  var language: js.UndefOr[String] = js.undefined
  var platform: js.UndefOr[browser | node] = js.undefined
  var version: js.UndefOr[String] = js.undefined
  var versionString: js.UndefOr[String] = js.undefined
}

object SDKInfo {
  @scala.inline
  def apply(
    language: String = null,
    platform: browser | node = null,
    version: String = null,
    versionString: String = null
  ): SDKInfo = {
    val __obj = js.Dynamic.literal()
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (versionString != null) __obj.updateDynamic("versionString")(versionString.asInstanceOf[js.Any])
    __obj.asInstanceOf[SDKInfo]
  }
}

