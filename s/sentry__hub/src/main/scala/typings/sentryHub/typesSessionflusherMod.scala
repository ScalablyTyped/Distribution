package typings.sentryHub

import typings.sentryTypes.typesClientMod.Client
import typings.sentryTypes.typesOptionsMod.ClientOptions
import typings.sentryTypes.typesSessionMod.SessionAggregates
import typings.sentryTypes.typesSessionMod.SessionFlusherLike
import typings.sentryTypes.typesTransportMod.BaseTransportOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSessionflusherMod {
  
  @JSImport("@sentry/hub/types/sessionflusher", "SessionFlusher")
  @js.native
  open class SessionFlusher protected ()
    extends StObject
       with SessionFlusherLike {
    def this(client: Client[ClientOptions[BaseTransportOptions]], attrs: ReleaseHealthAttributes) = this()
    
    /* private */ var _client: Any = js.native
    
    /**
      * Increments status bucket in pendingAggregates buffer (internal state) corresponding to status of
      * the session received
      */
    /* private */ var _incrementSessionStatusCount: Any = js.native
    
    /* private */ var _intervalId: Any = js.native
    
    /* private */ var _isEnabled: Any = js.native
    
    /* private */ var _pendingAggregates: Any = js.native
    
    /* private */ var _sessionAttrs: Any = js.native
    
    /** Clears setInterval and calls flush */
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /** Empties Aggregate Buckets and Sends them to Transport Buffer */
    /* CompleteClass */
    override def flush(): Unit = js.native
    
    val flushTimeout: Double = js.native
    
    /** Massages the entries in `pendingAggregates` and returns aggregated sessions */
    def getSessionAggregates(): SessionAggregates = js.native
    
    /**
      * Increments the Session Status bucket in SessionAggregates Object corresponding to the status of the session
      * captured
      */
    /* CompleteClass */
    override def incrementSessionStatusCount(): Unit = js.native
  }
  
  trait ReleaseHealthAttributes extends StObject {
    
    var environment: js.UndefOr[String] = js.undefined
    
    var release: String
  }
  object ReleaseHealthAttributes {
    
    inline def apply(release: String): ReleaseHealthAttributes = {
      val __obj = js.Dynamic.literal(release = release.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReleaseHealthAttributes]
    }
    
    extension [Self <: ReleaseHealthAttributes](x: Self) {
      
      inline def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
      
      inline def setRelease(value: String): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
    }
  }
}
