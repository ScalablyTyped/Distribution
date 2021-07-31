package typings.sparkpost.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSendingDomain extends StObject {
  
  /** JSON object in which DKIM key configuration is defined. */
  var dkim: js.UndefOr[DKIM] = js.undefined
  
  /** Size, in bits, of the DKIM private key to be generated. This option only applies if generate_dkim is ‘true’. */
  var dkim_key_length: js.UndefOr[Double] = js.undefined
  
  /** Name of the sending domain. */
  var domain: String
  
  /** Whether to generate a DKIM keypair on creation. */
  var generate_dkim: js.UndefOr[Boolean] = js.undefined
  
  /** Setting to true allows this domain to be used by subaccounts. Defaults to false, only available to domains belonging to a master account. */
  var shared_with_subaccounts: js.UndefOr[Boolean] = js.undefined
  
  /** JSON object containing status details, including whether this domain’s ownership has been verified. */
  var status: js.UndefOr[Status] = js.undefined
  
  /** Associated tracking domain. */
  var tracking_domain: js.UndefOr[String] = js.undefined
}
object CreateSendingDomain {
  
  @scala.inline
  def apply(domain: String): CreateSendingDomain = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSendingDomain]
  }
  
  @scala.inline
  implicit class CreateSendingDomainMutableBuilder[Self <: CreateSendingDomain] (val x: Self) extends AnyVal {
    
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
    def setShared_with_subaccountsUndefined: Self = StObject.set(x, "shared_with_subaccounts", js.undefined)
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTracking_domain(value: String): Self = StObject.set(x, "tracking_domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTracking_domainUndefined: Self = StObject.set(x, "tracking_domain", js.undefined)
  }
}
