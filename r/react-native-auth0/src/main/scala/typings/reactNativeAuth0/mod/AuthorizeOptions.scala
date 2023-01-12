package typings.reactNativeAuth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthorizeOptions extends StObject {
  
  //  Disable Single-Sign-On (SSO). It only affects iOS with versions 13 and above. Defaults to `false`.
  var customScheme: js.UndefOr[String] = js.undefined
  
  var ephemeralSession: js.UndefOr[Boolean] = js.undefined
  
  //  Custom scheme to build the callback URL with.
  var leeway: js.UndefOr[Double] = js.undefined
  
  // The amount of leeway, in seconds, to accommodate potential clock skew when validating an ID token's claims. Defaults to 60 seconds if not specified.
  var skipLegacyListener: js.UndefOr[String] = js.undefined
}
object AuthorizeOptions {
  
  inline def apply(): AuthorizeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthorizeOptions] (val x: Self) extends AnyVal {
    
    inline def setCustomScheme(value: String): Self = StObject.set(x, "customScheme", value.asInstanceOf[js.Any])
    
    inline def setCustomSchemeUndefined: Self = StObject.set(x, "customScheme", js.undefined)
    
    inline def setEphemeralSession(value: Boolean): Self = StObject.set(x, "ephemeralSession", value.asInstanceOf[js.Any])
    
    inline def setEphemeralSessionUndefined: Self = StObject.set(x, "ephemeralSession", js.undefined)
    
    inline def setLeeway(value: Double): Self = StObject.set(x, "leeway", value.asInstanceOf[js.Any])
    
    inline def setLeewayUndefined: Self = StObject.set(x, "leeway", js.undefined)
    
    inline def setSkipLegacyListener(value: String): Self = StObject.set(x, "skipLegacyListener", value.asInstanceOf[js.Any])
    
    inline def setSkipLegacyListenerUndefined: Self = StObject.set(x, "skipLegacyListener", js.undefined)
  }
}
