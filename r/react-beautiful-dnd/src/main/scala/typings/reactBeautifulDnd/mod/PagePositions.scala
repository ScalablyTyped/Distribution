package typings.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PagePositions extends js.Object {
  var borderBoxCenter: Position = js.native
  // how much the page position has changed from the initial
  var offset: Position = js.native
  var selection: Position = js.native
}

object PagePositions {
  @scala.inline
  def apply(borderBoxCenter: Position, offset: Position, selection: Position): PagePositions = {
    val __obj = js.Dynamic.literal(borderBoxCenter = borderBoxCenter.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any])
    __obj.asInstanceOf[PagePositions]
  }
  @scala.inline
  implicit class PagePositionsOps[Self <: PagePositions] (val x: Self) extends AnyVal {
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
    def setBorderBoxCenter(value: Position): Self = this.set("borderBoxCenter", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffset(value: Position): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelection(value: Position): Self = this.set("selection", value.asInstanceOf[js.Any])
  }
  
}

