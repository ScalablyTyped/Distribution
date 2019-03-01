package typings
package ssDashUtilsLib.ssutilsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SSECommand extends js.Object {
  var channels: java.lang.String
  var displayName: java.lang.String
  var profileUrl: java.lang.String
  var userId: java.lang.String
}

object SSECommand {
  @scala.inline
  def apply(
    channels: java.lang.String,
    displayName: java.lang.String,
    profileUrl: java.lang.String,
    userId: java.lang.String
  ): SSECommand = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("channels")(channels)
    __obj.updateDynamic("displayName")(displayName)
    __obj.updateDynamic("profileUrl")(profileUrl)
    __obj.updateDynamic("userId")(userId)
    __obj.asInstanceOf[SSECommand]
  }
}

