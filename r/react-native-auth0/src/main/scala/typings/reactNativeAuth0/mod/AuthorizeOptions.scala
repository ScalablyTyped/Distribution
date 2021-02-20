package typings.reactNativeAuth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthorizeOptions extends StObject {
  
  var ephemeralSession: js.UndefOr[Boolean] = js.native
}
object AuthorizeOptions {
  
  @scala.inline
  def apply(): AuthorizeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizeOptions]
  }
  
  @scala.inline
  implicit class AuthorizeOptionsMutableBuilder[Self <: AuthorizeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEphemeralSession(value: Boolean): Self = StObject.set(x, "ephemeralSession", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEphemeralSessionUndefined: Self = StObject.set(x, "ephemeralSession", js.undefined)
  }
}
