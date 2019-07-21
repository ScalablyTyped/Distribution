package typings
package reactDashNativeDashEasyDashUpgradeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HasNewVersion extends js.Object {
  var hasNewVersion: scala.Boolean
  var latestVersion: java.lang.String
  var localVersion: java.lang.String
  var lookupInfo: Anon_Key
  var trackViewUrl: java.lang.String
}

object Anon_HasNewVersion {
  @scala.inline
  def apply(
    hasNewVersion: scala.Boolean,
    latestVersion: java.lang.String,
    localVersion: java.lang.String,
    lookupInfo: Anon_Key,
    trackViewUrl: java.lang.String
  ): Anon_HasNewVersion = {
    val __obj = js.Dynamic.literal(hasNewVersion = hasNewVersion, latestVersion = latestVersion, localVersion = localVersion, lookupInfo = lookupInfo, trackViewUrl = trackViewUrl)
  
    __obj.asInstanceOf[Anon_HasNewVersion]
  }
}

