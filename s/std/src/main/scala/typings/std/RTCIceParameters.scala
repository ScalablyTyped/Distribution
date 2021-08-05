package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCIceParameters extends StObject {
  
  var password: js.UndefOr[java.lang.String] = js.undefined
  
  var usernameFragment: js.UndefOr[java.lang.String] = js.undefined
}
object RTCIceParameters {
  
  inline def apply(): RTCIceParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCIceParameters]
  }
  
  extension [Self <: RTCIceParameters](x: Self) {
    
    inline def setPassword(value: java.lang.String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setUsernameFragment(value: java.lang.String): Self = StObject.set(x, "usernameFragment", value.asInstanceOf[js.Any])
    
    inline def setUsernameFragmentUndefined: Self = StObject.set(x, "usernameFragment", js.undefined)
  }
}
