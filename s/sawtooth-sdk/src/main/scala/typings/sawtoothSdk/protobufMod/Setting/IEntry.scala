package typings.sawtoothSdk.protobufMod.Setting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an Entry. */
@js.native
trait IEntry extends js.Object {
  /** Entry key */
  var key: js.UndefOr[String | Null] = js.native
  /** Entry value */
  var value: js.UndefOr[String | Null] = js.native
}

object IEntry {
  @scala.inline
  def apply(): IEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEntry]
  }
  @scala.inline
  implicit class IEntryOps[Self <: IEntry] (val x: Self) extends AnyVal {
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setKeyNull: Self = this.set("key", null)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setValueNull: Self = this.set("value", null)
  }
  
}

