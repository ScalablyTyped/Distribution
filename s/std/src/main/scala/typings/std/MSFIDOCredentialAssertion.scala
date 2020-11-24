package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MSFIDOCredentialAssertion extends MSAssertion {
  
  val algorithm: java.lang.String | Algorithm = js.native
  
  val attestation: js.Any = js.native
  
  val publicKey: java.lang.String = js.native
  
  val transportHints: js.Array[MSTransportType] = js.native
}
object MSFIDOCredentialAssertion {
  
  @scala.inline
  def apply(
    algorithm: java.lang.String | Algorithm,
    attestation: js.Any,
    id: java.lang.String,
    publicKey: java.lang.String,
    transportHints: js.Array[MSTransportType],
    `type`: MSCredentialType
  ): MSFIDOCredentialAssertion = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], attestation = attestation.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any], transportHints = transportHints.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MSFIDOCredentialAssertion]
  }
  
  @scala.inline
  implicit class MSFIDOCredentialAssertionOps[Self <: MSFIDOCredentialAssertion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlgorithm(value: java.lang.String | Algorithm): Self = this.set("algorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttestation(value: js.Any): Self = this.set("attestation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicKey(value: java.lang.String): Self = this.set("publicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransportHintsVarargs(value: MSTransportType*): Self = this.set("transportHints", js.Array(value :_*))
    
    @scala.inline
    def setTransportHints(value: js.Array[MSTransportType]): Self = this.set("transportHints", value.asInstanceOf[js.Any])
  }
}
