package typings
package reactDashMentionsLib.reactDashMentionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MentionItem extends js.Object {
  var display: java.lang.String
  var id: java.lang.String
  var `type`: scala.Null
}

object MentionItem {
  @scala.inline
  def apply(display: java.lang.String, id: java.lang.String, `type`: scala.Null): MentionItem = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("display")(display)
    __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[MentionItem]
  }
}

