package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBatchHeader extends StObject {
  
  /** BatchHeader signerPublicKey */
  var signerPublicKey: js.UndefOr[String | Null] = js.native
  
  /** BatchHeader transactionIds */
  var transactionIds: js.UndefOr[js.Array[String] | Null] = js.native
}
object IBatchHeader {
  
  @scala.inline
  def apply(): IBatchHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBatchHeader]
  }
  
  @scala.inline
  implicit class IBatchHeaderMutableBuilder[Self <: IBatchHeader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSignerPublicKey(value: String): Self = StObject.set(x, "signerPublicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignerPublicKeyNull: Self = StObject.set(x, "signerPublicKey", null)
    
    @scala.inline
    def setSignerPublicKeyUndefined: Self = StObject.set(x, "signerPublicKey", js.undefined)
    
    @scala.inline
    def setTransactionIds(value: js.Array[String]): Self = StObject.set(x, "transactionIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionIdsNull: Self = StObject.set(x, "transactionIds", null)
    
    @scala.inline
    def setTransactionIdsUndefined: Self = StObject.set(x, "transactionIds", js.undefined)
    
    @scala.inline
    def setTransactionIdsVarargs(value: String*): Self = StObject.set(x, "transactionIds", js.Array(value :_*))
  }
}
