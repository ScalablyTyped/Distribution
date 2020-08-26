package typings.stellarBase.anon

import typings.node.Buffer
import typings.stellarBase.xdrMod.xdr.DataEntryExt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataValue extends js.Object {
  var accountId: typings.stellarBase.xdrMod.xdr.AccountId = js.native
  var dataName: String | Buffer = js.native
  var dataValue: Buffer = js.native
  var ext: DataEntryExt = js.native
}

object DataValue {
  @scala.inline
  def apply(
    accountId: typings.stellarBase.xdrMod.xdr.AccountId,
    dataName: String | Buffer,
    dataValue: Buffer,
    ext: DataEntryExt
  ): DataValue = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], dataName = dataName.asInstanceOf[js.Any], dataValue = dataValue.asInstanceOf[js.Any], ext = ext.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataValue]
  }
  @scala.inline
  implicit class DataValueOps[Self <: DataValue] (val x: Self) extends AnyVal {
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
    def setAccountId(value: typings.stellarBase.xdrMod.xdr.AccountId): Self = this.set("accountId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataName(value: String | Buffer): Self = this.set("dataName", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataValue(value: Buffer): Self = this.set("dataValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setExt(value: DataEntryExt): Self = this.set("ext", value.asInstanceOf[js.Any])
  }
  
}

