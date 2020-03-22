package typings.slackNode

import typings.slackNode.slackNodeStrings.icon_emoji
import typings.slackNode.slackNodeStrings.icon_url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKey extends js.Object {
  var key: icon_url | icon_emoji
  var `val`: String
}

object AnonKey {
  @scala.inline
  def apply(key: icon_url | icon_emoji, `val`: String): AnonKey = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKey]
  }
}

