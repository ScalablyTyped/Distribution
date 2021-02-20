package typings.sdp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SDPIceParameters extends StObject {
  
  var iceLite: js.UndefOr[Boolean] = js.native
  
  var password: String = js.native
  
  var usernameFragment: String = js.native
}
object SDPIceParameters {
  
  @scala.inline
  def apply(password: String, usernameFragment: String): SDPIceParameters = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], usernameFragment = usernameFragment.asInstanceOf[js.Any])
    __obj.asInstanceOf[SDPIceParameters]
  }
  
  @scala.inline
  implicit class SDPIceParametersMutableBuilder[Self <: SDPIceParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIceLite(value: Boolean): Self = StObject.set(x, "iceLite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIceLiteUndefined: Self = StObject.set(x, "iceLite", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameFragment(value: String): Self = StObject.set(x, "usernameFragment", value.asInstanceOf[js.Any])
  }
}
