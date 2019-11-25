package typings.ssDashUtils.ssutils

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
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], profileUrl = profileUrl.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SSECommand]
  }
}

