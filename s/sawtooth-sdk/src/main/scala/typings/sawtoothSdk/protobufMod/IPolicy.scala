package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.Policy.IEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPolicy extends js.Object {
  /** Policy entries */
  var entries: js.UndefOr[js.Array[IEntry] | Null] = js.native
  /** Policy name */
  var name: js.UndefOr[String | Null] = js.native
}

object IPolicy {
  @scala.inline
  def apply(): IPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPolicy]
  }
  @scala.inline
  implicit class IPolicyOps[Self <: IPolicy] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNameNull: Self = this.set("name", null)
  }
  
}

