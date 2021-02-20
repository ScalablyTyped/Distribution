package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCIceParameters extends StObject {
  
  var password: js.UndefOr[java.lang.String] = js.native
  
  var usernameFragment: js.UndefOr[java.lang.String] = js.native
}
object RTCIceParameters {
  
  @scala.inline
  def apply(): RTCIceParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCIceParameters]
  }
  
  @scala.inline
  implicit class RTCIceParametersMutableBuilder[Self <: RTCIceParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPassword(value: java.lang.String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    @scala.inline
    def setUsernameFragment(value: java.lang.String): Self = StObject.set(x, "usernameFragment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameFragmentUndefined: Self = StObject.set(x, "usernameFragment", js.undefined)
  }
}
