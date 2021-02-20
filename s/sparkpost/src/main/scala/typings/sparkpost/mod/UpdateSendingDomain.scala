package typings.sparkpost.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateSendingDomain extends StObject {
  
  /** JSON object in which DKIM key configuration is defined. */
  var dkim: js.UndefOr[DKIM] = js.native
  
  /** Size, in bits, of the DKIM private key to be generated. This option only applies if generate_dkim is ‘true’. */
  var dkim_key_length: js.UndefOr[Double] = js.native
  
  /** Whether to generate a DKIM keypair on creation. */
  var generate_dkim: js.UndefOr[Boolean] = js.native
  
  /** Setting to true allows this domain to be used by subaccounts. Defaults to false, only available to domains belonging to a master account. */
  var shared_with_subaccounts: js.UndefOr[Boolean] = js.native
  
  /** Associated tracking domain. */
  var tracking_domain: js.UndefOr[String] = js.native
}
object UpdateSendingDomain {
  
  @scala.inline
  def apply(): UpdateSendingDomain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSendingDomain]
  }
  
  @scala.inline
  implicit class UpdateSendingDomainMutableBuilder[Self <: UpdateSendingDomain] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDkim(value: DKIM): Self = StObject.set(x, "dkim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDkimUndefined: Self = StObject.set(x, "dkim", js.undefined)
    
    @scala.inline
    def setDkim_key_length(value: Double): Self = StObject.set(x, "dkim_key_length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDkim_key_lengthUndefined: Self = StObject.set(x, "dkim_key_length", js.undefined)
    
    @scala.inline
    def setGenerate_dkim(value: Boolean): Self = StObject.set(x, "generate_dkim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenerate_dkimUndefined: Self = StObject.set(x, "generate_dkim", js.undefined)
    
    @scala.inline
    def setShared_with_subaccounts(value: Boolean): Self = StObject.set(x, "shared_with_subaccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShared_with_subaccountsUndefined: Self = StObject.set(x, "shared_with_subaccounts", js.undefined)
    
    @scala.inline
    def setTracking_domain(value: String): Self = StObject.set(x, "tracking_domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTracking_domainUndefined: Self = StObject.set(x, "tracking_domain", js.undefined)
  }
}
