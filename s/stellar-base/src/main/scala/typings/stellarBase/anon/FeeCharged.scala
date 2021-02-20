package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.InnerTransactionResultExt
import typings.stellarBase.xdrMod.xdr.InnerTransactionResultResult
import typings.stellarBase.xdrMod.xdr.Int64
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeeCharged extends StObject {
  
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
  implicit class FeeChargedMutableBuilder[Self <: FeeCharged] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExt(value: InnerTransactionResultExt): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeeCharged(value: Int64): Self = StObject.set(x, "feeCharged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: InnerTransactionResultResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
