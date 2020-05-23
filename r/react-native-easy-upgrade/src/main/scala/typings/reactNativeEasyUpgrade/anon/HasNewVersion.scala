package typings.reactNativeEasyUpgrade.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HasNewVersion extends js.Object {
  var hasNewVersion: Boolean
  var latestVersion: String
  var localVersion: String
  var lookupInfo: Dictkey
  var trackViewUrl: String
}

object HasNewVersion {
  @scala.inline
  def apply(
    hasNewVersion: Boolean,
    latestVersion: String,
    localVersion: String,
    lookupInfo: Dictkey,
    trackViewUrl: String
  ): HasNewVersion = {
    val __obj = js.Dynamic.literal(hasNewVersion = hasNewVersion.asInstanceOf[js.Any], latestVersion = latestVersion.asInstanceOf[js.Any], localVersion = localVersion.asInstanceOf[js.Any], lookupInfo = lookupInfo.asInstanceOf[js.Any], trackViewUrl = trackViewUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasNewVersion]
  }
}

