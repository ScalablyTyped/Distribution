package typings.sortablejs

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIndex extends js.Object {
  var index: Double
  var multiDragElement: HTMLElement
}

object AnonIndex {
  @scala.inline
  def apply(index: Double, multiDragElement: HTMLElement): AnonIndex = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], multiDragElement = multiDragElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIndex]
  }
}

