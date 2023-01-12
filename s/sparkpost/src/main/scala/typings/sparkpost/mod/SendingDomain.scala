package typings.sparkpost.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendingDomain extends StObject {
  
  /** JSON object in which DKIM key configuration is defined. */
  var dkim: js.UndefOr[DKIM] = js.undefined
  
  /** Size, in bits, of the DKIM private key to be generated. This option only applies if generate_dkim is ‘true’. */
  var dkim_key_length: js.UndefOr[Double] = js.undefined
  
  /** Name of the sending domain. */
  var domain: String
  
  /** Whether to generate a DKIM keypair on creation. */
  var generate_dkim: js.UndefOr[Boolean] = js.undefined
  
  /** Setting to true allows this domain to be used by subaccounts. Defaults to false, only available to domains belonging to a master account. */
  var shared_with_subaccounts: Boolean
  
  /** JSON object containing status details, including whether this domain’s ownership has been verified. */
  var status: Status
  
  /** Associated tracking domain. */
  var tracking_domain: String
}
object SendingDomain {
  
  inline def apply(domain: String, shared_with_subaccounts: Boolean, status: Status, tracking_domain: String): SendingDomain = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], shared_with_subaccounts = shared_with_subaccounts.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], tracking_domain = tracking_domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendingDomain]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SendingDomain] (val x: Self) extends AnyVal {
    
    inline def setDkim(value: DKIM): Self = StObject.set(x, "dkim", value.asInstanceOf[js.Any])
    
    inline def setDkimUndefined: Self = StObject.set(x, "dkim", js.undefined)
    
    inline def setDkim_key_length(value: Double): Self = StObject.set(x, "dkim_key_length", value.asInstanceOf[js.Any])
    
    inline def setDkim_key_lengthUndefined: Self = StObject.set(x, "dkim_key_length", js.undefined)
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setGenerate_dkim(value: Boolean): Self = StObject.set(x, "generate_dkim", value.asInstanceOf[js.Any])
    
    inline def setGenerate_dkimUndefined: Self = StObject.set(x, "generate_dkim", js.undefined)
    
    inline def setShared_with_subaccounts(value: Boolean): Self = StObject.set(x, "shared_with_subaccounts", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTracking_domain(value: String): Self = StObject.set(x, "tracking_domain", value.asInstanceOf[js.Any])
  }
}
