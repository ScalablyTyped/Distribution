package typings.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITransactionHeader extends js.Object {
  
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
  implicit class ITransactionHeaderOps[Self <: ITransactionHeader] (val x: Self) extends AnyVal {
    
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
    def setBatcherPublicKey(value: String): Self = this.set("batcherPublicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBatcherPublicKey: Self = this.set("batcherPublicKey", js.undefined)
    
    @scala.inline
    def setBatcherPublicKeyNull: Self = this.set("batcherPublicKey", null)
    
    @scala.inline
    def setDependenciesVarargs(value: String*): Self = this.set("dependencies", js.Array(value :_*))
    
    @scala.inline
    def setDependencies(value: js.Array[String]): Self = this.set("dependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDependencies: Self = this.set("dependencies", js.undefined)
    
    @scala.inline
    def setDependenciesNull: Self = this.set("dependencies", null)
    
    @scala.inline
    def setFamilyName(value: String): Self = this.set("familyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFamilyName: Self = this.set("familyName", js.undefined)
    
    @scala.inline
    def setFamilyNameNull: Self = this.set("familyName", null)
    
    @scala.inline
    def setFamilyVersion(value: String): Self = this.set("familyVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFamilyVersion: Self = this.set("familyVersion", js.undefined)
    
    @scala.inline
    def setFamilyVersionNull: Self = this.set("familyVersion", null)
    
    @scala.inline
    def setInputsVarargs(value: String*): Self = this.set("inputs", js.Array(value :_*))
    
    @scala.inline
    def setInputs(value: js.Array[String]): Self = this.set("inputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputs: Self = this.set("inputs", js.undefined)
    
    @scala.inline
    def setInputsNull: Self = this.set("inputs", null)
    
    @scala.inline
    def setNonce(value: String): Self = this.set("nonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNonce: Self = this.set("nonce", js.undefined)
    
    @scala.inline
    def setNonceNull: Self = this.set("nonce", null)
    
    @scala.inline
    def setOutputsVarargs(value: String*): Self = this.set("outputs", js.Array(value :_*))
    
    @scala.inline
    def setOutputs(value: js.Array[String]): Self = this.set("outputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputs: Self = this.set("outputs", js.undefined)
    
    @scala.inline
    def setOutputsNull: Self = this.set("outputs", null)
    
    @scala.inline
    def setPayloadSha512(value: String): Self = this.set("payloadSha512", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayloadSha512: Self = this.set("payloadSha512", js.undefined)
    
    @scala.inline
    def setPayloadSha512Null: Self = this.set("payloadSha512", null)
    
    @scala.inline
    def setSignerPublicKey(value: String): Self = this.set("signerPublicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignerPublicKey: Self = this.set("signerPublicKey", js.undefined)
    
    @scala.inline
    def setSignerPublicKeyNull: Self = this.set("signerPublicKey", null)
  }
}
