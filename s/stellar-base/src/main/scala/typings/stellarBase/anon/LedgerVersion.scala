package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.BucketMetadataExt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LedgerVersion extends js.Object {
  var ext: BucketMetadataExt = js.native
  var ledgerVersion: Double = js.native
}

object LedgerVersion {
  @scala.inline
  def apply(ext: BucketMetadataExt, ledgerVersion: Double): LedgerVersion = {
    val __obj = js.Dynamic.literal(ext = ext.asInstanceOf[js.Any], ledgerVersion = ledgerVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[LedgerVersion]
  }
  @scala.inline
  implicit class LedgerVersionOps[Self <: LedgerVersion] (val x: Self) extends AnyVal {
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
    def setExt(value: BucketMetadataExt): Self = this.set("ext", value.asInstanceOf[js.Any])
    @scala.inline
    def setLedgerVersion(value: Double): Self = this.set("ledgerVersion", value.asInstanceOf[js.Any])
  }
  
}

