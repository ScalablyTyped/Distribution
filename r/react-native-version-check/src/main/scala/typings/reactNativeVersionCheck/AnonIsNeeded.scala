package typings.reactNativeVersionCheck

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIsNeeded extends js.Object {
  var currentVersion: String
  var isNeeded: Boolean
  var latestVersion: String
  var storeUrl: String
}

object AnonIsNeeded {
  @scala.inline
  def apply(currentVersion: String, isNeeded: Boolean, latestVersion: String, storeUrl: String): AnonIsNeeded = {
    val __obj = js.Dynamic.literal(currentVersion = currentVersion.asInstanceOf[js.Any], isNeeded = isNeeded.asInstanceOf[js.Any], latestVersion = latestVersion.asInstanceOf[js.Any], storeUrl = storeUrl.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIsNeeded]
  }
}

