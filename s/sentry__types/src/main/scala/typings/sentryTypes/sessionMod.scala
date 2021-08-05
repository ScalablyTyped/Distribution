package typings.sentryTypes

import typings.sentryTypes.anon.Attrs
import typings.sentryTypes.userMod.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sessionMod {
  
  @js.native
  sealed trait SessionStatus extends StObject
  @JSImport("@sentry/types/dist/session", "SessionStatus")
  @js.native
  object SessionStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[SessionStatus & String] = js.native
    
    /** JSDoc */
    @js.native
    sealed trait Abnormal
      extends StObject
         with SessionStatus
    /* "abnormal" */ val Abnormal: typings.sentryTypes.sessionMod.SessionStatus.Abnormal & String = js.native
    
    /** JSDoc */
    @js.native
    sealed trait Crashed
      extends StObject
         with SessionStatus
    /* "crashed" */ val Crashed: typings.sentryTypes.sessionMod.SessionStatus.Crashed & String = js.native
    
    /** JSDoc */
    @js.native
    sealed trait Exited
      extends StObject
         with SessionStatus
    /* "exited" */ val Exited: typings.sentryTypes.sessionMod.SessionStatus.Exited & String = js.native
    
    /** JSDoc */
    @js.native
    sealed trait Ok
      extends StObject
         with SessionStatus
    /* "ok" */ val Ok: typings.sentryTypes.sessionMod.SessionStatus.Ok & String = js.native
  }
  
  @js.native
  trait Session
    extends StObject
       with SessionContext {
    
    /** JSDoc */
    def close(): Unit = js.native
    def close(status: SessionStatus): Unit = js.native
    
    /** JSDoc */
    def toJSON(): Attrs = js.native
    
    /** JSDoc */
    def update(): Unit = js.native
    def update(context: SessionContext): Unit = js.native
  }
  
  trait SessionContext extends StObject {
    
    var did: js.UndefOr[String] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var environment: js.UndefOr[String] = js.undefined
    
    var errors: js.UndefOr[Double] = js.undefined
    
    var ipAddress: js.UndefOr[String] = js.undefined
    
    var release: js.UndefOr[String] = js.undefined
    
    var sid: js.UndefOr[String] = js.undefined
    
    var started: js.UndefOr[Double] = js.undefined
    
    var status: js.UndefOr[SessionStatus] = js.undefined
    
    var timestamp: js.UndefOr[Double] = js.undefined
    
    var user: js.UndefOr[User | Null] = js.undefined
    
    var userAgent: js.UndefOr[String] = js.undefined
  }
  object SessionContext {
    
    inline def apply(): SessionContext = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SessionContext]
    }
    
    extension [Self <: SessionContext](x: Self) {
      
      inline def setDid(value: String): Self = StObject.set(x, "did", value.asInstanceOf[js.Any])
      
      inline def setDidUndefined: Self = StObject.set(x, "did", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
      
      inline def setErrors(value: Double): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
      
      inline def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
      
      inline def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
      
      inline def setRelease(value: String): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
      
      inline def setReleaseUndefined: Self = StObject.set(x, "release", js.undefined)
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setSidUndefined: Self = StObject.set(x, "sid", js.undefined)
      
      inline def setStarted(value: Double): Self = StObject.set(x, "started", value.asInstanceOf[js.Any])
      
      inline def setStartedUndefined: Self = StObject.set(x, "started", js.undefined)
      
      inline def setStatus(value: SessionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
      
      inline def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
      
      inline def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
      
      inline def setUserNull: Self = StObject.set(x, "user", null)
      
      inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
}
