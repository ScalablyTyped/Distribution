package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.Setting.IEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISetting extends js.Object {
  /** Setting entries */
  var entries: js.UndefOr[js.Array[IEntry] | Null] = js.native
}

object ISetting {
  @scala.inline
  def apply(): ISetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISetting]
  }
  @scala.inline
  implicit class ISettingOps[Self <: ISetting] (val x: Self) extends AnyVal {
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
    def setEntriesVarargs(value: IEntry*): Self = this.set("entries", js.Array(value :_*))
    @scala.inline
    def setEntries(value: js.Array[IEntry]): Self = this.set("entries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntries: Self = this.set("entries", js.undefined)
    @scala.inline
    def setEntriesNull: Self = this.set("entries", null)
  }
  
}

