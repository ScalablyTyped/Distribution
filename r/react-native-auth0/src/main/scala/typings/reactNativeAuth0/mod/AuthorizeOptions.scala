package typings.reactNativeAuth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthorizeOptions extends StObject {
  
  var ephemeralSession: js.UndefOr[Boolean] = js.undefined
}
object AuthorizeOptions {
  
  inline def apply(): AuthorizeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizeOptions]
  }
  
  extension [Self <: AuthorizeOptions](x: Self) {
    
    inline def setEphemeralSession(value: Boolean): Self = StObject.set(x, "ephemeralSession", value.asInstanceOf[js.Any])
    
    inline def setEphemeralSessionUndefined: Self = StObject.set(x, "ephemeralSession", js.undefined)
  }
}
