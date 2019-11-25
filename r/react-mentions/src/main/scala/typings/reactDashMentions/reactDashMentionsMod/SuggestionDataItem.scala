package typings.reactDashMentions.reactDashMentionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuggestionDataItem extends js.Object {
  var display: String
  var id: String | Double
}

object SuggestionDataItem {
  @scala.inline
  def apply(display: String, id: String | Double): SuggestionDataItem = {
    val __obj = js.Dynamic.literal(display = display.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SuggestionDataItem]
  }
}

