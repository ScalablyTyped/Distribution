package typings.sourceMap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NullablePosition extends js.Object {
  var column: Double | Null = js.native
  var lastColumn: Double | Null = js.native
  var line: Double | Null = js.native
}

object NullablePosition {
  @scala.inline
  def apply(): NullablePosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NullablePosition]
  }
  @scala.inline
  implicit class NullablePositionOps[Self <: NullablePosition] (val x: Self) extends AnyVal {
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
    def setColumn(value: Double): Self = this.set("column", value.asInstanceOf[js.Any])
    @scala.inline
    def setColumnNull: Self = this.set("column", null)
    @scala.inline
    def setLastColumn(value: Double): Self = this.set("lastColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastColumnNull: Self = this.set("lastColumn", null)
    @scala.inline
    def setLine(value: Double): Self = this.set("line", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineNull: Self = this.set("line", null)
  }
  
}

