package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.Int64
import typings.stellarBase.xdrMod.xdr.TransactionResultExt
import typings.stellarBase.xdrMod.xdr.TransactionResultResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtFeeCharged extends StObject {
  
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
  implicit class ExtFeeChargedMutableBuilder[Self <: ExtFeeCharged] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExt(value: TransactionResultExt): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeeCharged(value: Int64): Self = StObject.set(x, "feeCharged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: TransactionResultResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
