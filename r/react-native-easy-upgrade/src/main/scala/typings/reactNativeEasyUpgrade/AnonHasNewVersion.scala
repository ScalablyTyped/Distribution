package typings.reactNativeEasyUpgrade

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHasNewVersion extends js.Object {
  var hasNewVersion: Boolean
  var latestVersion: String
  var localVersion: String
  var lookupInfo: AnonDictkey
  var trackViewUrl: String
}

object AnonHasNewVersion {
  @scala.inline
  def apply(
    hasNewVersion: Boolean,
    latestVersion: String,
    localVersion: String,
    lookupInfo: AnonDictkey,
    trackViewUrl: String
  ): AnonHasNewVersion = {
    val __obj = js.Dynamic.literal(hasNewVersion = hasNewVersion.asInstanceOf[js.Any], latestVersion = latestVersion.asInstanceOf[js.Any], localVersion = localVersion.asInstanceOf[js.Any], lookupInfo = lookupInfo.asInstanceOf[js.Any], trackViewUrl = trackViewUrl.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHasNewVersion]
  }
}

