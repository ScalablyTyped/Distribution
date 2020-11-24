package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.FeeBumpTransactionExt
import typings.stellarBase.xdrMod.xdr.FeeBumpTransactionInnerTx
import typings.stellarBase.xdrMod.xdr.Int64
import typings.stellarBase.xdrMod.xdr.MuxedAccount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeeSource extends js.Object {
  
  var ext: FeeBumpTransactionExt = js.native
  
  var fee: Int64 = js.native
  
  var feeSource: MuxedAccount = js.native
  
  var innerTx: FeeBumpTransactionInnerTx = js.native
}
object FeeSource {
  
  @scala.inline
  def apply(
    ext: FeeBumpTransactionExt,
    fee: Int64,
    feeSource: MuxedAccount,
    innerTx: FeeBumpTransactionInnerTx
  ): FeeSource = {
    val __obj = js.Dynamic.literal(ext = ext.asInstanceOf[js.Any], fee = fee.asInstanceOf[js.Any], feeSource = feeSource.asInstanceOf[js.Any], innerTx = innerTx.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeeSource]
  }
  
  @scala.inline
  implicit class FeeSourceOps[Self <: FeeSource] (val x: Self) extends AnyVal {
    
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
    def setExt(value: FeeBumpTransactionExt): Self = this.set("ext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFee(value: Int64): Self = this.set("fee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeeSource(value: MuxedAccount): Self = this.set("feeSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerTx(value: FeeBumpTransactionInnerTx): Self = this.set("innerTx", value.asInstanceOf[js.Any])
  }
}
