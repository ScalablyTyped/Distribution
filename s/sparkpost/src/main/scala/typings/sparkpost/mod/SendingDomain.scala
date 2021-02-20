package typings.sparkpost.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendingDomain extends StObject {
  
  /** JSON object in which DKIM key configuration is defined. */
  var dkim: js.UndefOr[DKIM] = js.native
  
  /** Size, in bits, of the DKIM private key to be generated. This option only applies if generate_dkim is ‘true’. */
  var dkim_key_length: js.UndefOr[Double] = js.native
  
  /** Name of the sending domain. */
  var domain: String = js.native
  
  /** Whether to generate a DKIM keypair on creation. */
  var generate_dkim: js.UndefOr[Boolean] = js.native
  
  /** Setting to true allows this domain to be used by subaccounts. Defaults to false, only available to domains belonging to a master account. */
  var shared_with_subaccounts: Boolean = js.native
  
  /** JSON object containing status details, including whether this domain’s ownership has been verified. */
  var status: Status = js.native
  
  /** Associated tracking domain. */
  var tracking_domain: String = js.native
}
object SendingDomain {
  
  @scala.inline
  def apply(domain: String, shared_with_subaccounts: Boolean, status: Status, tracking_domain: String): SendingDomain = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], shared_with_subaccounts = shared_with_subaccounts.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], tracking_domain = tracking_domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendingDomain]
  }
  
  @scala.inline
  implicit class SendingDomainMutableBuilder[Self <: SendingDomain] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDkim(value: DKIM): Self = StObject.set(x, "dkim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDkimUndefined: Self = StObject.set(x, "dkim", js.undefined)
    
    @scala.inline
    def setDkim_key_length(value: Double): Self = StObject.set(x, "dkim_key_length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDkim_key_lengthUndefined: Self = StObject.set(x, "dkim_key_length", js.undefined)
    
    @scala.inline
    def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenerate_dkim(value: Boolean): Self = StObject.set(x, "generate_dkim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenerate_dkimUndefined: Self = StObject.set(x, "generate_dkim", js.undefined)
    
    @scala.inline
    def setShared_with_subaccounts(value: Boolean): Self = StObject.set(x, "shared_with_subaccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTracking_domain(value: String): Self = StObject.set(x, "tracking_domain", value.asInstanceOf[js.Any])
  }
}
