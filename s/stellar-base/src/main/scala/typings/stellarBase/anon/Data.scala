package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.LedgerEntryData
import typings.stellarBase.xdrMod.xdr.LedgerEntryExt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Data extends js.Object {
  var data: LedgerEntryData = js.native
  var ext: LedgerEntryExt = js.native
  var lastModifiedLedgerSeq: Double = js.native
}

object Data {
  @scala.inline
  def apply(data: LedgerEntryData, ext: LedgerEntryExt, lastModifiedLedgerSeq: Double): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], ext = ext.asInstanceOf[js.Any], lastModifiedLedgerSeq = lastModifiedLedgerSeq.asInstanceOf[js.Any])
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
    def setData(value: LedgerEntryData): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setExt(value: LedgerEntryExt): Self = this.set("ext", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastModifiedLedgerSeq(value: Double): Self = this.set("lastModifiedLedgerSeq", value.asInstanceOf[js.Any])
  }
  
}

