package typings.select2.mod

import typings.jquery.BaseJQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataParams extends js.Object {
  var data: OptionData = js.native
   // TODO: must be data source
  var originalEvent: BaseJQueryEventObject = js.native
}

object DataParams {
  @scala.inline
  def apply(data: OptionData, originalEvent: BaseJQueryEventObject): DataParams = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataParams]
  }
  @scala.inline
  implicit class DataParamsOps[Self <: DataParams] (val x: Self) extends AnyVal {
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
    def setData(value: OptionData): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginalEvent(value: BaseJQueryEventObject): Self = this.set("originalEvent", value.asInstanceOf[js.Any])
  }
  
}

