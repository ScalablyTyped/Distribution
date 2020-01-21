package typings.reactNativeVersionCheck

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCurrentVersionIsNeeded extends js.Object {
  var currentVersion: String
  var isNeeded: Boolean
  var latestVersion: String
}

object AnonCurrentVersionIsNeeded {
  @scala.inline
  def apply(currentVersion: String, isNeeded: Boolean, latestVersion: String): AnonCurrentVersionIsNeeded = {
    val __obj = js.Dynamic.literal(currentVersion = currentVersion.asInstanceOf[js.Any], isNeeded = isNeeded.asInstanceOf[js.Any], latestVersion = latestVersion.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCurrentVersionIsNeeded]
  }
}

