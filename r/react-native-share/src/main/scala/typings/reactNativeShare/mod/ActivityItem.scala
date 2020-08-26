package typings.reactNativeShare.mod

import typings.reactNativeShare.reactNativeShareStrings.text
import typings.reactNativeShare.reactNativeShareStrings.url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivityItem extends js.Object {
  var content: String = js.native
  var `type`: text | url = js.native
}

object ActivityItem {
  @scala.inline
  def apply(content: String, `type`: text | url): ActivityItem = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityItem]
  }
  @scala.inline
  implicit class ActivityItemOps[Self <: ActivityItem] (val x: Self) extends AnyVal {
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
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: text | url): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

