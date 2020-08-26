package typings.select2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupedDataFormat extends js.Object {
  var children: js.UndefOr[js.Array[DataFormat]] = js.native
  var id: js.UndefOr[scala.Nothing] = js.native
  var text: String = js.native
}

object GroupedDataFormat {
  @scala.inline
  def apply(text: String): GroupedDataFormat = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupedDataFormat]
  }
  @scala.inline
  implicit class GroupedDataFormatOps[Self <: GroupedDataFormat] (val x: Self) extends AnyVal {
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
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildrenVarargs(value: DataFormat*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[DataFormat]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
  }
  
}

