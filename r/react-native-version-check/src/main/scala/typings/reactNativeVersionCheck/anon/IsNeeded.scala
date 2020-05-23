package typings.reactNativeVersionCheck.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsNeeded extends js.Object {
  var currentVersion: String
  var isNeeded: Boolean
  var latestVersion: String
  var storeUrl: String
}

object IsNeeded {
  @scala.inline
  def apply(currentVersion: String, isNeeded: Boolean, latestVersion: String, storeUrl: String): IsNeeded = {
    val __obj = js.Dynamic.literal(currentVersion = currentVersion.asInstanceOf[js.Any], isNeeded = isNeeded.asInstanceOf[js.Any], latestVersion = latestVersion.asInstanceOf[js.Any], storeUrl = storeUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsNeeded]
  }
}

