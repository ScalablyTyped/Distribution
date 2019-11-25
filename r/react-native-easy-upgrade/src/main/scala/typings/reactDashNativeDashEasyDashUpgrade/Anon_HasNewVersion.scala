package typings.reactDashNativeDashEasyDashUpgrade

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HasNewVersion extends js.Object {
  var hasNewVersion: Boolean
  var latestVersion: String
  var localVersion: String
  var lookupInfo: Anon_Key
  var trackViewUrl: String
}

object Anon_HasNewVersion {
  @scala.inline
  def apply(
    hasNewVersion: Boolean,
    latestVersion: String,
    localVersion: String,
    lookupInfo: Anon_Key,
    trackViewUrl: String
  ): Anon_HasNewVersion = {
    val __obj = js.Dynamic.literal(hasNewVersion = hasNewVersion.asInstanceOf[js.Any], latestVersion = latestVersion.asInstanceOf[js.Any], localVersion = localVersion.asInstanceOf[js.Any], lookupInfo = lookupInfo.asInstanceOf[js.Any], trackViewUrl = trackViewUrl.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_HasNewVersion]
  }
}

