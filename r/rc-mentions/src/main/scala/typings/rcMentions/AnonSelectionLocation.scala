package typings.rcMentions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSelectionLocation extends js.Object {
  var selectionLocation: Double
  var text: String
}

object AnonSelectionLocation {
  @scala.inline
  def apply(selectionLocation: Double, text: String): AnonSelectionLocation = {
    val __obj = js.Dynamic.literal(selectionLocation = selectionLocation.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSelectionLocation]
  }
}

