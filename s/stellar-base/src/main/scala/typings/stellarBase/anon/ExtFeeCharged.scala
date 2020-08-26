package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.Int64
import typings.stellarBase.xdrMod.xdr.TransactionResultExt
import typings.stellarBase.xdrMod.xdr.TransactionResultResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtFeeCharged extends js.Object {
  var ext: TransactionResultExt = js.native
  var feeCharged: Int64 = js.native
  var result: TransactionResultResult = js.native
}

object ExtFeeCharged {
  @scala.inline
  def apply(ext: TransactionResultExt, feeCharged: Int64, result: TransactionResultResult): ExtFeeCharged = {
    val __obj = js.Dynamic.literal(ext = ext.asInstanceOf[js.Any], feeCharged = feeCharged.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtFeeCharged]
  }
  @scala.inline
  implicit class ExtFeeChargedOps[Self <: ExtFeeCharged] (val x: Self) extends AnyVal {
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
    def setExt(value: TransactionResultExt): Self = this.set("ext", value.asInstanceOf[js.Any])
    @scala.inline
    def setFeeCharged(value: Int64): Self = this.set("feeCharged", value.asInstanceOf[js.Any])
    @scala.inline
    def setResult(value: TransactionResultResult): Self = this.set("result", value.asInstanceOf[js.Any])
  }
  
}

