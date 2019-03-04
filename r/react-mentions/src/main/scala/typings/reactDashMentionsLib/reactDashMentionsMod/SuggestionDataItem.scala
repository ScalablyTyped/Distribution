package typings
package reactDashMentionsLib.reactDashMentionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuggestionDataItem extends js.Object {
  var display: java.lang.String
  var id: java.lang.String | scala.Double
}

object SuggestionDataItem {
  @scala.inline
  def apply(display: java.lang.String, id: java.lang.String | scala.Double): SuggestionDataItem = {
    val __obj = js.Dynamic.literal(display = display, id = id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SuggestionDataItem]
  }
}

