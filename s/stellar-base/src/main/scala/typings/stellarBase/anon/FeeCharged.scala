package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.InnerTransactionResultExt
import typings.stellarBase.xdrMod.xdr.InnerTransactionResultResult
import typings.stellarBase.xdrMod.xdr.Int64
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeeCharged extends js.Object {
  
  var ext: InnerTransactionResultExt = js.native
  
  var feeCharged: Int64 = js.native
  
  var result: InnerTransactionResultResult = js.native
}
object FeeCharged {
  
  @scala.inline
  def apply(ext: InnerTransactionResultExt, feeCharged: Int64, result: InnerTransactionResultResult): FeeCharged = {
    val __obj = js.Dynamic.literal(ext = ext.asInstanceOf[js.Any], feeCharged = feeCharged.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeeCharged]
  }
  
  @scala.inline
  implicit class FeeChargedOps[Self <: FeeCharged] (val x: Self) extends AnyVal {
    
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
    def setExt(value: InnerTransactionResultExt): Self = this.set("ext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeeCharged(value: Int64): Self = this.set("feeCharged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: InnerTransactionResultResult): Self = this.set("result", value.asInstanceOf[js.Any])
  }
}
