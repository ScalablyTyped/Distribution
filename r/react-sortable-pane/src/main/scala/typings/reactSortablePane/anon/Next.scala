package typings.reactSortablePane.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Next extends js.Object {
  var next: Double
  var previous: Double
}

object Next {
  @scala.inline
  def apply(next: Double, previous: Double): Next = {
    val __obj = js.Dynamic.literal(next = next.asInstanceOf[js.Any], previous = previous.asInstanceOf[js.Any])
    __obj.asInstanceOf[Next]
  }
}

