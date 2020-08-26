package typings.stellarBase.anon

import typings.node.Buffer
import typings.stellarBase.xdrMod.xdr.LedgerHeaderHistoryEntryExt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hash extends js.Object {
  var ext: LedgerHeaderHistoryEntryExt = js.native
  var hash: Buffer = js.native
  var header: typings.stellarBase.xdrMod.xdr.LedgerHeader = js.native
}

object Hash {
  @scala.inline
  def apply(
    ext: LedgerHeaderHistoryEntryExt,
    hash: Buffer,
    header: typings.stellarBase.xdrMod.xdr.LedgerHeader
  ): Hash = {
    val __obj = js.Dynamic.literal(ext = ext.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hash]
  }
  @scala.inline
  implicit class HashOps[Self <: Hash] (val x: Self) extends AnyVal {
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
    def setExt(value: LedgerHeaderHistoryEntryExt): Self = this.set("ext", value.asInstanceOf[js.Any])
    @scala.inline
    def setHash(value: Buffer): Self = this.set("hash", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeader(value: typings.stellarBase.xdrMod.xdr.LedgerHeader): Self = this.set("header", value.asInstanceOf[js.Any])
  }
  
}

