package typings.sourceMap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NullableMappedPosition extends js.Object {
  var column: Double | Null = js.native
  var line: Double | Null = js.native
  var name: String | Null = js.native
  var source: String | Null = js.native
}

object NullableMappedPosition {
  @scala.inline
  def apply(): NullableMappedPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NullableMappedPosition]
  }
  @scala.inline
  implicit class NullableMappedPositionOps[Self <: NullableMappedPosition] (val x: Self) extends AnyVal {
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
    def setLine(value: Double): Self = this.set("line", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineNull: Self = this.set("line", null)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNameNull: Self = this.set("name", null)
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceNull: Self = this.set("source", null)
  }
  
}

