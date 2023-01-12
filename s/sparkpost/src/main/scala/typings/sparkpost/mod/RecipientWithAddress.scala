package typings.sparkpost.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecipientWithAddress extends StObject {
  
  /** Address information for a recipient  At a minimum, address or multichannel_addresses is required. */
  var address: Address | String
}
object RecipientWithAddress {
  
  inline def apply(address: Address | String): RecipientWithAddress = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecipientWithAddress]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecipientWithAddress] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: Address | String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
  }
}
