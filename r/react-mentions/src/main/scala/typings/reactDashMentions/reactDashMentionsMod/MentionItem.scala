package typings.reactDashMentions.reactDashMentionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MentionItem extends js.Object {
  var display: String
  var id: String
  var `type`: Null
}

object MentionItem {
  @scala.inline
  def apply(display: String, id: String, `type`: Null): MentionItem = {
    val __obj = js.Dynamic.literal(display = display.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MentionItem]
  }
}

