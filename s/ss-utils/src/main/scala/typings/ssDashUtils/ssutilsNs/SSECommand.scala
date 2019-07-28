package typings.ssDashUtils.ssutilsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SSECommand extends js.Object {
  var channels: String
  var displayName: String
  var profileUrl: String
  var userId: String
}

object SSECommand {
  @scala.inline
  def apply(channels: String, displayName: String, profileUrl: String, userId: String): SSECommand = {
    val __obj = js.Dynamic.literal(channels = channels, displayName = displayName, profileUrl = profileUrl, userId = userId)
  
    __obj.asInstanceOf[SSECommand]
  }
}

