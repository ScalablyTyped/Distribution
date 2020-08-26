package typings.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DragPositions extends js.Object {
  var client: ClientPositions = js.native
  var page: PagePositions = js.native
}

object DragPositions {
  @scala.inline
  def apply(client: ClientPositions, page: PagePositions): DragPositions = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragPositions]
  }
  @scala.inline
  implicit class DragPositionsOps[Self <: DragPositions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClient(value: ClientPositions): Self = this.set("client", value.asInstanceOf[js.Any])
    @scala.inline
    def setPage(value: PagePositions): Self = this.set("page", value.asInstanceOf[js.Any])
  }
  
}

