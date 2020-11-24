package typings.pulumiKubernetes.outputMod.certificates.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * CertificateSigningRequestCondition describes a condition of a CertificateSigningRequest object
  */
@js.native
trait CertificateSigningRequestCondition extends js.Object {
  
  /**
    * lastTransitionTime is the time the condition last transitioned from one status to another. If unset, when a new condition type is added or an existing condition's status is changed, the server defaults this to the current time.
    */
  var lastTransitionTime: String = js.native
  
  /**
    * lastUpdateTime is the time of the last update to this condition
    */
  var lastUpdateTime: String = js.native
  
  /**
    * message contains a human readable message with details about the request state
    */
  var message: String = js.native
  
  /**
    * reason indicates a brief reason for the request state
    */
  var reason: String = js.native
  
  /**
    * status of the condition, one of True, False, Unknown. Approved, Denied, and Failed conditions may not be "False" or "Unknown".
    */
  var status: String = js.native
  
  /**
    * type of the condition. Known conditions are "Approved", "Denied", and "Failed".
    *
    * An "Approved" condition is added via the /approval subresource, indicating the request was approved and should be issued by the signer.
    *
    * A "Denied" condition is added via the /approval subresource, indicating the request was denied and should not be issued by the signer.
    *
    * A "Failed" condition is added via the /status subresource, indicating the signer failed to issue the certificate.
    *
    * Approved and Denied conditions are mutually exclusive. Approved, Denied, and Failed conditions cannot be removed once added.
    *
    * Only one condition of a given type is allowed.
    */
  var `type`: String = js.native
}
object CertificateSigningRequestCondition {
  
  @scala.inline
  def apply(
    lastTransitionTime: String,
    lastUpdateTime: String,
    message: String,
    reason: String,
    status: String,
    `type`: String
  ): CertificateSigningRequestCondition = {
    val __obj = js.Dynamic.literal(lastTransitionTime = lastTransitionTime.asInstanceOf[js.Any], lastUpdateTime = lastUpdateTime.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateSigningRequestCondition]
  }
  
  @scala.inline
  implicit class CertificateSigningRequestConditionOps[Self <: CertificateSigningRequestCondition] (val x: Self) extends AnyVal {
    
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
    def setLastTransitionTime(value: String): Self = this.set("lastTransitionTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdateTime(value: String): Self = this.set("lastUpdateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
