package typings.reactWeui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Data extends js.Object {
  var data: js.Array[_] = js.native
  var dataMap: Id = js.native
  var selected: js.Array[_] = js.native
  var show: Boolean = js.native
}

object Data {
  @scala.inline
  def apply(data: js.Array[_], dataMap: Id, selected: js.Array[_], show: Boolean): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], dataMap = dataMap.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  @scala.inline
  implicit class DataOps[Self <: Data] (val x: Self) extends AnyVal {
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
    def setDataVarargs(value: js.Any*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[_]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataMap(value: Id): Self = this.set("dataMap", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectedVarargs(value: js.Any*): Self = this.set("selected", js.Array(value :_*))
    @scala.inline
    def setSelected(value: js.Array[_]): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
  }
  
}

