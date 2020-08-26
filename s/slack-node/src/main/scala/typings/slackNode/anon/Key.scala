package typings.slackNode.anon

import typings.slackNode.slackNodeStrings.icon_emoji
import typings.slackNode.slackNodeStrings.icon_url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Key extends js.Object {
  var key: icon_url | icon_emoji = js.native
  var `val`: String = js.native
}

object Key {
  @scala.inline
  def apply(key: icon_url | icon_emoji, `val`: String): Key = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key]
  }
  @scala.inline
  implicit class KeyOps[Self <: Key] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKey(value: icon_url | icon_emoji): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setVal(value: String): Self = this.set("val", value.asInstanceOf[js.Any])
  }
  
}

