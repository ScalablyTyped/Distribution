package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITransactionHeader extends StObject {
  
  /** TransactionHeader batcherPublicKey */
  var batcherPublicKey: js.UndefOr[String | Null] = js.undefined
  
  /** TransactionHeader dependencies */
  var dependencies: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /** TransactionHeader familyName */
  var familyName: js.UndefOr[String | Null] = js.undefined
  
  /** TransactionHeader familyVersion */
  var familyVersion: js.UndefOr[String | Null] = js.undefined
  
  /** TransactionHeader inputs */
  var inputs: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /** TransactionHeader nonce */
  var nonce: js.UndefOr[String | Null] = js.undefined
  
  /** TransactionHeader outputs */
  var outputs: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /** TransactionHeader payloadSha512 */
  var payloadSha512: js.UndefOr[String | Null] = js.undefined
  
  /** TransactionHeader signerPublicKey */
  var signerPublicKey: js.UndefOr[String | Null] = js.undefined
}
object ITransactionHeader {
  
  inline def apply(): ITransactionHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITransactionHeader]
  }
  
  extension [Self <: ITransactionHeader](x: Self) {
    
    inline def setBatcherPublicKey(value: String): Self = StObject.set(x, "batcherPublicKey", value.asInstanceOf[js.Any])
    
    inline def setBatcherPublicKeyNull: Self = StObject.set(x, "batcherPublicKey", null)
    
    inline def setBatcherPublicKeyUndefined: Self = StObject.set(x, "batcherPublicKey", js.undefined)
    
    inline def setDependencies(value: js.Array[String]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setDependenciesNull: Self = StObject.set(x, "dependencies", null)
    
    inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
    
    inline def setDependenciesVarargs(value: String*): Self = StObject.set(x, "dependencies", js.Array(value :_*))
    
    inline def setFamilyName(value: String): Self = StObject.set(x, "familyName", value.asInstanceOf[js.Any])
    
    inline def setFamilyNameNull: Self = StObject.set(x, "familyName", null)
    
    inline def setFamilyNameUndefined: Self = StObject.set(x, "familyName", js.undefined)
    
    inline def setFamilyVersion(value: String): Self = StObject.set(x, "familyVersion", value.asInstanceOf[js.Any])
    
    inline def setFamilyVersionNull: Self = StObject.set(x, "familyVersion", null)
    
    inline def setFamilyVersionUndefined: Self = StObject.set(x, "familyVersion", js.undefined)
    
    inline def setInputs(value: js.Array[String]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsNull: Self = StObject.set(x, "inputs", null)
    
    inline def setInputsUndefined: Self = StObject.set(x, "inputs", js.undefined)
    
    inline def setInputsVarargs(value: String*): Self = StObject.set(x, "inputs", js.Array(value :_*))
    
    inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    inline def setNonceNull: Self = StObject.set(x, "nonce", null)
    
    inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    
    inline def setOutputs(value: js.Array[String]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    inline def setOutputsNull: Self = StObject.set(x, "outputs", null)
    
    inline def setOutputsUndefined: Self = StObject.set(x, "outputs", js.undefined)
    
    inline def setOutputsVarargs(value: String*): Self = StObject.set(x, "outputs", js.Array(value :_*))
    
    inline def setPayloadSha512(value: String): Self = StObject.set(x, "payloadSha512", value.asInstanceOf[js.Any])
    
    inline def setPayloadSha512Null: Self = StObject.set(x, "payloadSha512", null)
    
    inline def setPayloadSha512Undefined: Self = StObject.set(x, "payloadSha512", js.undefined)
    
    inline def setSignerPublicKey(value: String): Self = StObject.set(x, "signerPublicKey", value.asInstanceOf[js.Any])
    
    inline def setSignerPublicKeyNull: Self = StObject.set(x, "signerPublicKey", null)
    
    inline def setSignerPublicKeyUndefined: Self = StObject.set(x, "signerPublicKey", js.undefined)
  }
}
