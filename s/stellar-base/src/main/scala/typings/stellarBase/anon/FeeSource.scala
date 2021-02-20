package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.FeeBumpTransactionExt
import typings.stellarBase.xdrMod.xdr.FeeBumpTransactionInnerTx
import typings.stellarBase.xdrMod.xdr.Int64
import typings.stellarBase.xdrMod.xdr.MuxedAccount
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeeSource extends StObject {
  
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
  implicit class FeeSourceMutableBuilder[Self <: FeeSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExt(value: FeeBumpTransactionExt): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFee(value: Int64): Self = StObject.set(x, "fee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeeSource(value: MuxedAccount): Self = StObject.set(x, "feeSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerTx(value: FeeBumpTransactionInnerTx): Self = StObject.set(x, "innerTx", value.asInstanceOf[js.Any])
  }
}
