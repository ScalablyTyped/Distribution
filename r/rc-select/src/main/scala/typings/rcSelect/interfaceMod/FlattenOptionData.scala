package typings.rcSelect.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlattenOptionData extends js.Object {
  var data: OptionData | OptionGroupData = js.native
  var group: js.UndefOr[Boolean] = js.native
  var groupOption: js.UndefOr[Boolean] = js.native
  var key: String | Double = js.native
}

object FlattenOptionData {
  @scala.inline
  def apply(data: OptionData | OptionGroupData, key: String | Double): FlattenOptionData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlattenOptionData]
  }
  @scala.inline
  implicit class FlattenOptionDataOps[Self <: FlattenOptionData] (val x: Self) extends AnyVal {
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
    def setData(value: OptionData | OptionGroupData): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: String | Double): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroup(value: Boolean): Self = this.set("group", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    @scala.inline
    def setGroupOption(value: Boolean): Self = this.set("groupOption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupOption: Self = this.set("groupOption", js.undefined)
  }
  
}

