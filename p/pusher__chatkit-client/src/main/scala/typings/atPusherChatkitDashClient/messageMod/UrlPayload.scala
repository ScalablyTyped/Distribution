package typings.atPusherChatkitDashClient.messageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlPayload extends js.Object {
  var `type`: String
  var url: String
}

object UrlPayload {
  @scala.inline
  def apply(`type`: String, url: String): UrlPayload = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlPayload]
  }
}

