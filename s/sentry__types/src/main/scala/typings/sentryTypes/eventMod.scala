package typings.sentryTypes

import org.scalablytyped.runtime.StringDictionary
import typings.sentryTypes.anon.Values
import typings.sentryTypes.breadcrumbMod.Breadcrumb
import typings.sentryTypes.contextMod.Contexts
import typings.sentryTypes.extraMod.Extras
import typings.sentryTypes.requestMod.Request
import typings.sentryTypes.scopeMod.CaptureContext
import typings.sentryTypes.scopeMod.Scope
import typings.sentryTypes.sdkinfoMod.SdkInfo
import typings.sentryTypes.sentryTypesStrings.transaction
import typings.sentryTypes.severityMod.Severity
import typings.sentryTypes.spanMod.Span
import typings.sentryTypes.stacktraceMod.Stacktrace
import typings.sentryTypes.transactionMod.Measurements
import typings.sentryTypes.userMod.User
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventMod {
  
  @js.native
  trait Event extends StObject {
    
    var breadcrumbs: js.UndefOr[js.Array[Breadcrumb]] = js.native
    
    var contexts: js.UndefOr[Contexts] = js.native
    
    var dist: js.UndefOr[String] = js.native
    
    var environment: js.UndefOr[String] = js.native
    
    var event_id: js.UndefOr[String] = js.native
    
    var exception: js.UndefOr[Values] = js.native
    
    var extra: js.UndefOr[Extras] = js.native
    
    var fingerprint: js.UndefOr[js.Array[String]] = js.native
    
    var level: js.UndefOr[Severity] = js.native
    
    var logger: js.UndefOr[String] = js.native
    
    var measurements: js.UndefOr[Measurements] = js.native
    
    var message: js.UndefOr[String] = js.native
    
    var modules: js.UndefOr[StringDictionary[String]] = js.native
    
    var platform: js.UndefOr[String] = js.native
    
    var release: js.UndefOr[String] = js.native
    
    var request: js.UndefOr[Request] = js.native
    
    var sdk: js.UndefOr[SdkInfo] = js.native
    
    var server_name: js.UndefOr[String] = js.native
    
    var spans: js.UndefOr[js.Array[Span]] = js.native
    
    var stacktrace: js.UndefOr[Stacktrace] = js.native
    
    var start_timestamp: js.UndefOr[Double] = js.native
    
    var tags: js.UndefOr[StringDictionary[String]] = js.native
    
    var timestamp: js.UndefOr[Double] = js.native
    
    var transaction: js.UndefOr[String] = js.native
    
    var `type`: js.UndefOr[EventType] = js.native
    
    var user: js.UndefOr[User] = js.native
  }
  object Event {
    
    @scala.inline
    def apply(): Event = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Event]
    }
    
    @scala.inline
    implicit class EventMutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBreadcrumbs(value: js.Array[Breadcrumb]): Self = StObject.set(x, "breadcrumbs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBreadcrumbsUndefined: Self = StObject.set(x, "breadcrumbs", js.undefined)
      
      @scala.inline
      def setBreadcrumbsVarargs(value: Breadcrumb*): Self = StObject.set(x, "breadcrumbs", js.Array(value :_*))
      
      @scala.inline
      def setContexts(value: Contexts): Self = StObject.set(x, "contexts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextsUndefined: Self = StObject.set(x, "contexts", js.undefined)
      
      @scala.inline
      def setDist(value: String): Self = StObject.set(x, "dist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDistUndefined: Self = StObject.set(x, "dist", js.undefined)
      
      @scala.inline
      def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
      
      @scala.inline
      def setEvent_id(value: String): Self = StObject.set(x, "event_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvent_idUndefined: Self = StObject.set(x, "event_id", js.undefined)
      
      @scala.inline
      def setException(value: Values): Self = StObject.set(x, "exception", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExceptionUndefined: Self = StObject.set(x, "exception", js.undefined)
      
      @scala.inline
      def setExtra(value: Extras): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      @scala.inline
      def setFingerprint(value: js.Array[String]): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
      
      @scala.inline
      def setFingerprintVarargs(value: String*): Self = StObject.set(x, "fingerprint", js.Array(value :_*))
      
      @scala.inline
      def setLevel(value: Severity): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      @scala.inline
      def setLogger(value: String): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      @scala.inline
      def setMeasurements(value: Measurements): Self = StObject.set(x, "measurements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeasurementsUndefined: Self = StObject.set(x, "measurements", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setModules(value: StringDictionary[String]): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
      
      @scala.inline
      def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      @scala.inline
      def setRelease(value: String): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReleaseUndefined: Self = StObject.set(x, "release", js.undefined)
      
      @scala.inline
      def setRequest(value: Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
      
      @scala.inline
      def setSdk(value: SdkInfo): Self = StObject.set(x, "sdk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSdkUndefined: Self = StObject.set(x, "sdk", js.undefined)
      
      @scala.inline
      def setServer_name(value: String): Self = StObject.set(x, "server_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServer_nameUndefined: Self = StObject.set(x, "server_name", js.undefined)
      
      @scala.inline
      def setSpans(value: js.Array[Span]): Self = StObject.set(x, "spans", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpansUndefined: Self = StObject.set(x, "spans", js.undefined)
      
      @scala.inline
      def setSpansVarargs(value: Span*): Self = StObject.set(x, "spans", js.Array(value :_*))
      
      @scala.inline
      def setStacktrace(value: Stacktrace): Self = StObject.set(x, "stacktrace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStacktraceUndefined: Self = StObject.set(x, "stacktrace", js.undefined)
      
      @scala.inline
      def setStart_timestamp(value: Double): Self = StObject.set(x, "start_timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart_timestampUndefined: Self = StObject.set(x, "start_timestamp", js.undefined)
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
      
      @scala.inline
      def setTransaction(value: String): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
      
      @scala.inline
      def setType(value: EventType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
  
  @js.native
  trait EventHint extends StObject {
    
    var captureContext: js.UndefOr[CaptureContext] = js.native
    
    var data: js.UndefOr[js.Any] = js.native
    
    var event_id: js.UndefOr[String] = js.native
    
    var originalException: js.UndefOr[Error | String | Null] = js.native
    
    var syntheticException: js.UndefOr[Error | Null] = js.native
  }
  object EventHint {
    
    @scala.inline
    def apply(): EventHint = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventHint]
    }
    
    @scala.inline
    implicit class EventHintMutableBuilder[Self <: EventHint] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCaptureContext(value: CaptureContext): Self = StObject.set(x, "captureContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptureContextFunction1(value: /* scope */ Scope => Scope): Self = StObject.set(x, "captureContext", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCaptureContextUndefined: Self = StObject.set(x, "captureContext", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setEvent_id(value: String): Self = StObject.set(x, "event_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvent_idUndefined: Self = StObject.set(x, "event_id", js.undefined)
      
      @scala.inline
      def setOriginalException(value: Error | String): Self = StObject.set(x, "originalException", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalExceptionNull: Self = StObject.set(x, "originalException", null)
      
      @scala.inline
      def setOriginalExceptionUndefined: Self = StObject.set(x, "originalException", js.undefined)
      
      @scala.inline
      def setSyntheticException(value: Error): Self = StObject.set(x, "syntheticException", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSyntheticExceptionNull: Self = StObject.set(x, "syntheticException", null)
      
      @scala.inline
      def setSyntheticExceptionUndefined: Self = StObject.set(x, "syntheticException", js.undefined)
    }
  }
  
  type EventType = transaction
}
