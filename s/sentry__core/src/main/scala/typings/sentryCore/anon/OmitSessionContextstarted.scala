package typings.sentryCore.anon

import typings.sentryTypes.typesSessionMod.SerializedSession
import typings.sentryTypes.typesUserMod.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@sentry/types.@sentry/types.SessionContext, 'started' | 'status'> */
trait OmitSessionContextstarted extends StObject {
  
  var did: js.UndefOr[String] = js.undefined
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var environment: js.UndefOr[String] = js.undefined
  
  var errors: js.UndefOr[Double] = js.undefined
  
  var ignoreDuration: js.UndefOr[Boolean] = js.undefined
  
  var init: js.UndefOr[Boolean] = js.undefined
  
  var ipAddress: js.UndefOr[String] = js.undefined
  
  var release: js.UndefOr[String] = js.undefined
  
  var sid: js.UndefOr[String] = js.undefined
  
  var timestamp: js.UndefOr[Double] = js.undefined
  
  var toJSON: js.UndefOr[js.Function0[SerializedSession]] = js.undefined
  
  var user: js.UndefOr[User | Null] = js.undefined
  
  var userAgent: js.UndefOr[String] = js.undefined
}
object OmitSessionContextstarted {
  
  inline def apply(): OmitSessionContextstarted = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitSessionContextstarted]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OmitSessionContextstarted] (val x: Self) extends AnyVal {
    
    inline def setDid(value: String): Self = StObject.set(x, "did", value.asInstanceOf[js.Any])
    
    inline def setDidUndefined: Self = StObject.set(x, "did", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    inline def setErrors(value: Double): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setIgnoreDuration(value: Boolean): Self = StObject.set(x, "ignoreDuration", value.asInstanceOf[js.Any])
    
    inline def setIgnoreDurationUndefined: Self = StObject.set(x, "ignoreDuration", js.undefined)
    
    inline def setInit(value: Boolean): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
    
    inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    
    inline def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    
    inline def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
    
    inline def setRelease(value: String): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
    
    inline def setReleaseUndefined: Self = StObject.set(x, "release", js.undefined)
    
    inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
    
    inline def setSidUndefined: Self = StObject.set(x, "sid", js.undefined)
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    inline def setToJSON(value: () => SerializedSession): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    
    inline def setToJSONUndefined: Self = StObject.set(x, "toJSON", js.undefined)
    
    inline def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
    
    inline def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
    
    inline def setUserNull: Self = StObject.set(x, "user", null)
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
