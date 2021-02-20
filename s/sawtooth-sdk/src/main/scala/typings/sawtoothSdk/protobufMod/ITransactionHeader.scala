package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITransactionHeader extends StObject {
  
  /** TransactionHeader batcherPublicKey */
  var batcherPublicKey: js.UndefOr[String | Null] = js.native
  
  /** TransactionHeader dependencies */
  var dependencies: js.UndefOr[js.Array[String] | Null] = js.native
  
  /** TransactionHeader familyName */
  var familyName: js.UndefOr[String | Null] = js.native
  
  /** TransactionHeader familyVersion */
  var familyVersion: js.UndefOr[String | Null] = js.native
  
  /** TransactionHeader inputs */
  var inputs: js.UndefOr[js.Array[String] | Null] = js.native
  
  /** TransactionHeader nonce */
  var nonce: js.UndefOr[String | Null] = js.native
  
  /** TransactionHeader outputs */
  var outputs: js.UndefOr[js.Array[String] | Null] = js.native
  
  /** TransactionHeader payloadSha512 */
  var payloadSha512: js.UndefOr[String | Null] = js.native
  
  /** TransactionHeader signerPublicKey */
  var signerPublicKey: js.UndefOr[String | Null] = js.native
}
object ITransactionHeader {
  
  @scala.inline
  def apply(): ITransactionHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITransactionHeader]
  }
  
  @scala.inline
  implicit class ITransactionHeaderMutableBuilder[Self <: ITransactionHeader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatcherPublicKey(value: String): Self = StObject.set(x, "batcherPublicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatcherPublicKeyNull: Self = StObject.set(x, "batcherPublicKey", null)
    
    @scala.inline
    def setBatcherPublicKeyUndefined: Self = StObject.set(x, "batcherPublicKey", js.undefined)
    
    @scala.inline
    def setDependencies(value: js.Array[String]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDependenciesNull: Self = StObject.set(x, "dependencies", null)
    
    @scala.inline
    def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
    
    @scala.inline
    def setDependenciesVarargs(value: String*): Self = StObject.set(x, "dependencies", js.Array(value :_*))
    
    @scala.inline
    def setFamilyName(value: String): Self = StObject.set(x, "familyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFamilyNameNull: Self = StObject.set(x, "familyName", null)
    
    @scala.inline
    def setFamilyNameUndefined: Self = StObject.set(x, "familyName", js.undefined)
    
    @scala.inline
    def setFamilyVersion(value: String): Self = StObject.set(x, "familyVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFamilyVersionNull: Self = StObject.set(x, "familyVersion", null)
    
    @scala.inline
    def setFamilyVersionUndefined: Self = StObject.set(x, "familyVersion", js.undefined)
    
    @scala.inline
    def setInputs(value: js.Array[String]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputsNull: Self = StObject.set(x, "inputs", null)
    
    @scala.inline
    def setInputsUndefined: Self = StObject.set(x, "inputs", js.undefined)
    
    @scala.inline
    def setInputsVarargs(value: String*): Self = StObject.set(x, "inputs", js.Array(value :_*))
    
    @scala.inline
    def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonceNull: Self = StObject.set(x, "nonce", null)
    
    @scala.inline
    def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    
    @scala.inline
    def setOutputs(value: js.Array[String]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputsNull: Self = StObject.set(x, "outputs", null)
    
    @scala.inline
    def setOutputsUndefined: Self = StObject.set(x, "outputs", js.undefined)
    
    @scala.inline
    def setOutputsVarargs(value: String*): Self = StObject.set(x, "outputs", js.Array(value :_*))
    
    @scala.inline
    def setPayloadSha512(value: String): Self = StObject.set(x, "payloadSha512", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadSha512Null: Self = StObject.set(x, "payloadSha512", null)
    
    @scala.inline
    def setPayloadSha512Undefined: Self = StObject.set(x, "payloadSha512", js.undefined)
    
    @scala.inline
    def setSignerPublicKey(value: String): Self = StObject.set(x, "signerPublicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignerPublicKeyNull: Self = StObject.set(x, "signerPublicKey", null)
    
    @scala.inline
    def setSignerPublicKeyUndefined: Self = StObject.set(x, "signerPublicKey", js.undefined)
  }
}
