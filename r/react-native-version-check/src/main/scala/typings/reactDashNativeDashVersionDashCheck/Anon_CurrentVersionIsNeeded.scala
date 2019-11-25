package typings.reactDashNativeDashVersionDashCheck

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CurrentVersionIsNeeded extends js.Object {
  var currentVersion: String
  var isNeeded: Boolean
  var latestVersion: String
}

object Anon_CurrentVersionIsNeeded {
  @scala.inline
  def apply(currentVersion: String, isNeeded: Boolean, latestVersion: String): Anon_CurrentVersionIsNeeded = {
    val __obj = js.Dynamic.literal(currentVersion = currentVersion.asInstanceOf[js.Any], isNeeded = isNeeded.asInstanceOf[js.Any], latestVersion = latestVersion.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CurrentVersionIsNeeded]
  }
}

