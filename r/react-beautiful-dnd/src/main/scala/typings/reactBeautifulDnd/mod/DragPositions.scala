package typings.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragPositions extends js.Object {
  var client: ClientPositions
  var page: PagePositions
}

object DragPositions {
  @scala.inline
  def apply(client: ClientPositions, page: PagePositions): DragPositions = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragPositions]
  }
}

