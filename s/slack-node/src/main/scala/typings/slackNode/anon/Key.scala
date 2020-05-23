package typings.slackNode.anon

import typings.slackNode.slackNodeStrings.icon_emoji
import typings.slackNode.slackNodeStrings.icon_url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Key extends js.Object {
  var key: icon_url | icon_emoji
  var `val`: String
}

object Key {
  @scala.inline
  def apply(key: icon_url | icon_emoji, `val`: String): Key = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key]
  }
}

