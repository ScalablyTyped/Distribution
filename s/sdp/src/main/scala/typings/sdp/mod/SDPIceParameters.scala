package typings.sdp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SDPIceParameters extends StObject {
  
  var iceLite: js.UndefOr[Boolean] = js.undefined
  
  var password: String
  
  var usernameFragment: String
}
object SDPIceParameters {
  
  inline def apply(password: String, usernameFragment: String): SDPIceParameters = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], usernameFragment = usernameFragment.asInstanceOf[js.Any])
    __obj.asInstanceOf[SDPIceParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SDPIceParameters] (val x: Self) extends AnyVal {
    
    inline def setIceLite(value: Boolean): Self = StObject.set(x, "iceLite", value.asInstanceOf[js.Any])
    
    inline def setIceLiteUndefined: Self = StObject.set(x, "iceLite", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setUsernameFragment(value: String): Self = StObject.set(x, "usernameFragment", value.asInstanceOf[js.Any])
  }
}
