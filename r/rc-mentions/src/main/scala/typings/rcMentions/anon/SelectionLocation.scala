package typings.rcMentions.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionLocation extends js.Object {
  var selectionLocation: Double
  var text: String
}

object SelectionLocation {
  @scala.inline
  def apply(selectionLocation: Double, text: String): SelectionLocation = {
    val __obj = js.Dynamic.literal(selectionLocation = selectionLocation.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionLocation]
  }
}

