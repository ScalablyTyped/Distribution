package typings.sparkpost.mod

import typings.sparkpost.sparkpostStrings.blocked
import typings.sparkpost.sparkpostStrings.invalid
import typings.sparkpost.sparkpostStrings.pending
import typings.sparkpost.sparkpostStrings.unverified
import typings.sparkpost.sparkpostStrings.valid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Status extends StObject {
  
  /** Verification status of abuse@ mailbox */
  var abuse_at_status: valid | invalid | unverified | pending
  
  /** Verification status of CNAME configuration */
  var cname_status: valid | invalid | unverified | pending
  
  /** Compliance status */
  var compliance_status: valid | pending | blocked
  
  /** Verification status of DKIM configuration */
  var dkim_status: valid | invalid | unverified | pending
  
  /** Verification status of MX configuration */
  var mx_status: valid | invalid | unverified | pending
  
  /** Whether domain ownership has been verified */
  var ownership_verified: Boolean
  
  /** Verification status of postmaster@ mailbox */
  var postmaster_at_status: valid | invalid | unverified | pending
  
  /** Verification status of SPF configuration */
  var spf_status: valid | invalid | unverified | pending
}
object Status {
  
  @scala.inline
  def apply(
    abuse_at_status: valid | invalid | unverified | pending,
    cname_status: valid | invalid | unverified | pending,
    compliance_status: valid | pending | blocked,
    dkim_status: valid | invalid | unverified | pending,
    mx_status: valid | invalid | unverified | pending,
    ownership_verified: Boolean,
    postmaster_at_status: valid | invalid | unverified | pending,
    spf_status: valid | invalid | unverified | pending
  ): Status = {
    val __obj = js.Dynamic.literal(abuse_at_status = abuse_at_status.asInstanceOf[js.Any], cname_status = cname_status.asInstanceOf[js.Any], compliance_status = compliance_status.asInstanceOf[js.Any], dkim_status = dkim_status.asInstanceOf[js.Any], mx_status = mx_status.asInstanceOf[js.Any], ownership_verified = ownership_verified.asInstanceOf[js.Any], postmaster_at_status = postmaster_at_status.asInstanceOf[js.Any], spf_status = spf_status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Status]
  }
  
  @scala.inline
  implicit class StatusMutableBuilder[Self <: Status] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbuse_at_status(value: valid | invalid | unverified | pending): Self = StObject.set(x, "abuse_at_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCname_status(value: valid | invalid | unverified | pending): Self = StObject.set(x, "cname_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompliance_status(value: valid | pending | blocked): Self = StObject.set(x, "compliance_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDkim_status(value: valid | invalid | unverified | pending): Self = StObject.set(x, "dkim_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMx_status(value: valid | invalid | unverified | pending): Self = StObject.set(x, "mx_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnership_verified(value: Boolean): Self = StObject.set(x, "ownership_verified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostmaster_at_status(value: valid | invalid | unverified | pending): Self = StObject.set(x, "postmaster_at_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpf_status(value: valid | invalid | unverified | pending): Self = StObject.set(x, "spf_status", value.asInstanceOf[js.Any])
  }
}
