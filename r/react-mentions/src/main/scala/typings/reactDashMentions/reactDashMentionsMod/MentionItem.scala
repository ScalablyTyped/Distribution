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
    val __obj = js.Dynamic.literal(display = display, id = id)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MentionItem]
  }
}

