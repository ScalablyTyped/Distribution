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
    val __obj = js.Dynamic.literal(channels = channels, displayName = displayName, profileUrl = profileUrl, userId = userId)
  
    __obj.asInstanceOf[SSECommand]
  }
}

