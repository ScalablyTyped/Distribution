package typings.sentryTypes

import typings.sentryTypes.anon.Environment
import typings.sentryTypes.anon.Ipaddress
import typings.sentryTypes.typesUserMod.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSessionMod {
  
  trait AggregationCounts extends StObject {
    
    var crashed: js.UndefOr[Double] = js.undefined
    
    var errored: js.UndefOr[Double] = js.undefined
    
    var exited: js.UndefOr[Double] = js.undefined
    
    var started: String
  }
  object AggregationCounts {
    
    inline def apply(started: String): AggregationCounts = {
      val __obj = js.Dynamic.literal(started = started.asInstanceOf[js.Any])
      __obj.asInstanceOf[AggregationCounts]
    }
    
    extension [Self <: AggregationCounts](x: Self) {
      
      inline def setCrashed(value: Double): Self = StObject.set(x, "crashed", value.asInstanceOf[js.Any])
      
      inline def setCrashedUndefined: Self = StObject.set(x, "crashed", js.undefined)
      
      inline def setErrored(value: Double): Self = StObject.set(x, "errored", value.asInstanceOf[js.Any])
      
      inline def setErroredUndefined: Self = StObject.set(x, "errored", js.undefined)
      
      inline def setExited(value: Double): Self = StObject.set(x, "exited", value.asInstanceOf[js.Any])
      
      inline def setExitedUndefined: Self = StObject.set(x, "exited", js.undefined)
      
      inline def setStarted(value: String): Self = StObject.set(x, "started", value.asInstanceOf[js.Any])
    }
  }
  
  trait RequestSession extends StObject {
    
    var status: js.UndefOr[RequestSessionStatus] = js.undefined
  }
  object RequestSession {
    
    inline def apply(): RequestSession = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestSession]
    }
    
    extension [Self <: RequestSession](x: Self) {
      
      inline def setStatus(value: RequestSessionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.sentryTypes.sentryTypesStrings.ok
    - typings.sentryTypes.sentryTypesStrings.errored
    - typings.sentryTypes.sentryTypesStrings.crashed
  */
  trait RequestSessionStatus extends StObject
  object RequestSessionStatus {
    
    inline def crashed: typings.sentryTypes.sentryTypesStrings.crashed = "crashed".asInstanceOf[typings.sentryTypes.sentryTypesStrings.crashed]
    
    inline def errored: typings.sentryTypes.sentryTypesStrings.errored = "errored".asInstanceOf[typings.sentryTypes.sentryTypesStrings.errored]
    
    inline def ok: typings.sentryTypes.sentryTypesStrings.ok = "ok".asInstanceOf[typings.sentryTypes.sentryTypesStrings.ok]
  }
  
  trait SerializedSession extends StObject {
    
    var attrs: js.UndefOr[Ipaddress] = js.undefined
    
    var did: js.UndefOr[String] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var errors: Double
    
    var init: Boolean
    
    var sid: String
    
    var started: String
    
    var status: SessionStatus
    
    var timestamp: String
  }
  object SerializedSession {
    
    inline def apply(
      errors: Double,
      init: Boolean,
      sid: String,
      started: String,
      status: SessionStatus,
      timestamp: String
    ): SerializedSession = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], started = started.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[SerializedSession]
    }
    
    extension [Self <: SerializedSession](x: Self) {
      
      inline def setAttrs(value: Ipaddress): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      inline def setAttrsUndefined: Self = StObject.set(x, "attrs", js.undefined)
      
      inline def setDid(value: String): Self = StObject.set(x, "did", value.asInstanceOf[js.Any])
      
      inline def setDidUndefined: Self = StObject.set(x, "did", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setErrors(value: Double): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setInit(value: Boolean): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setStarted(value: String): Self = StObject.set(x, "started", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: SessionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  trait Session extends StObject {
    
    var did: js.UndefOr[String] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var environment: js.UndefOr[String] = js.undefined
    
    var errors: Double
    
    var ignoreDuration: Boolean
    
    var init: Boolean
    
    var ipAddress: js.UndefOr[String] = js.undefined
    
    var release: js.UndefOr[String] = js.undefined
    
    var sid: String
    
    var started: Double
    
    var status: SessionStatus
    
    var timestamp: Double
    
    /**
      * Overrides default JSON serialization of the Session because
      * the Sentry servers expect a slightly different schema of a session
      * which is described in the interface @see SerializedSession in this file.
      *
      * @return a Sentry-backend conforming JSON object of the session
      */
    def toJSON(): SerializedSession
    
    var user: js.UndefOr[User | Null] = js.undefined
    
    var userAgent: js.UndefOr[String] = js.undefined
  }
  object Session {
    
    inline def apply(
      errors: Double,
      ignoreDuration: Boolean,
      init: Boolean,
      sid: String,
      started: Double,
      status: SessionStatus,
      timestamp: Double,
      toJSON: () => SerializedSession
    ): Session = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], ignoreDuration = ignoreDuration.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], started = started.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
      __obj.asInstanceOf[Session]
    }
    
    extension [Self <: Session](x: Self) {
      
      inline def setDid(value: String): Self = StObject.set(x, "did", value.asInstanceOf[js.Any])
      
      inline def setDidUndefined: Self = StObject.set(x, "did", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
      
      inline def setErrors(value: Double): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setIgnoreDuration(value: Boolean): Self = StObject.set(x, "ignoreDuration", value.asInstanceOf[js.Any])
      
      inline def setInit(value: Boolean): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
      
      inline def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
      
      inline def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
      
      inline def setRelease(value: String): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
      
      inline def setReleaseUndefined: Self = StObject.set(x, "release", js.undefined)
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setStarted(value: Double): Self = StObject.set(x, "started", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: SessionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setToJSON(value: () => SerializedSession): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      inline def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
      
      inline def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
      
      inline def setUserNull: Self = StObject.set(x, "user", null)
      
      inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
  
  trait SessionAggregates extends StObject {
    
    var aggregates: js.Array[AggregationCounts]
    
    var attrs: js.UndefOr[Environment] = js.undefined
  }
  object SessionAggregates {
    
    inline def apply(aggregates: js.Array[AggregationCounts]): SessionAggregates = {
      val __obj = js.Dynamic.literal(aggregates = aggregates.asInstanceOf[js.Any])
      __obj.asInstanceOf[SessionAggregates]
    }
    
    extension [Self <: SessionAggregates](x: Self) {
      
      inline def setAggregates(value: js.Array[AggregationCounts]): Self = StObject.set(x, "aggregates", value.asInstanceOf[js.Any])
      
      inline def setAggregatesVarargs(value: AggregationCounts*): Self = StObject.set(x, "aggregates", js.Array(value*))
      
      inline def setAttrs(value: Environment): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      inline def setAttrsUndefined: Self = StObject.set(x, "attrs", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@sentry/types.@sentry/types/types/session.Session> */
  trait SessionContext extends StObject {
    
    var did: js.UndefOr[String] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var environment: js.UndefOr[String] = js.undefined
    
    var errors: js.UndefOr[Double] = js.undefined
    
    var ignoreDuration: js.UndefOr[Boolean] = js.undefined
    
    var init: js.UndefOr[Boolean] = js.undefined
    
    var ipAddress: js.UndefOr[String] = js.undefined
    
    var release: js.UndefOr[String] = js.undefined
    
    var sid: js.UndefOr[String] = js.undefined
    
    var started: js.UndefOr[Double] = js.undefined
    
    var status: js.UndefOr[SessionStatus] = js.undefined
    
    var timestamp: js.UndefOr[Double] = js.undefined
    
    var toJSON: js.UndefOr[js.Function0[SerializedSession]] = js.undefined
    
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
      
      inline def setStarted(value: Double): Self = StObject.set(x, "started", value.asInstanceOf[js.Any])
      
      inline def setStartedUndefined: Self = StObject.set(x, "started", js.undefined)
      
      inline def setStatus(value: SessionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
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
  
  trait SessionFlusherLike extends StObject {
    
    /** Clears setInterval and calls flush */
    def close(): Unit
    
    /** Empties Aggregate Buckets and Sends them to Transport Buffer */
    def flush(): Unit
    
    /**
      * Increments the Session Status bucket in SessionAggregates Object corresponding to the status of the session
      * captured
      */
    def incrementSessionStatusCount(): Unit
  }
  object SessionFlusherLike {
    
    inline def apply(close: () => Unit, flush: () => Unit, incrementSessionStatusCount: () => Unit): SessionFlusherLike = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), flush = js.Any.fromFunction0(flush), incrementSessionStatusCount = js.Any.fromFunction0(incrementSessionStatusCount))
      __obj.asInstanceOf[SessionFlusherLike]
    }
    
    extension [Self <: SessionFlusherLike](x: Self) {
      
      inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      inline def setFlush(value: () => Unit): Self = StObject.set(x, "flush", js.Any.fromFunction0(value))
      
      inline def setIncrementSessionStatusCount(value: () => Unit): Self = StObject.set(x, "incrementSessionStatusCount", js.Any.fromFunction0(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.sentryTypes.sentryTypesStrings.ok
    - typings.sentryTypes.sentryTypesStrings.exited
    - typings.sentryTypes.sentryTypesStrings.crashed
    - typings.sentryTypes.sentryTypesStrings.abnormal
  */
  trait SessionStatus extends StObject
  object SessionStatus {
    
    inline def abnormal: typings.sentryTypes.sentryTypesStrings.abnormal = "abnormal".asInstanceOf[typings.sentryTypes.sentryTypesStrings.abnormal]
    
    inline def crashed: typings.sentryTypes.sentryTypesStrings.crashed = "crashed".asInstanceOf[typings.sentryTypes.sentryTypesStrings.crashed]
    
    inline def exited: typings.sentryTypes.sentryTypesStrings.exited = "exited".asInstanceOf[typings.sentryTypes.sentryTypesStrings.exited]
    
    inline def ok: typings.sentryTypes.sentryTypesStrings.ok = "ok".asInstanceOf[typings.sentryTypes.sentryTypesStrings.ok]
  }
}
