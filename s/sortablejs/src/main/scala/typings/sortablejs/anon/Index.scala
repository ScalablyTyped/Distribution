package typings.sortablejs.anon

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Index extends js.Object {
  var index: Double
  var multiDragElement: HTMLElement
}

object Index {
  @scala.inline
  def apply(index: Double, multiDragElement: HTMLElement): Index = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], multiDragElement = multiDragElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[Index]
  }
}

