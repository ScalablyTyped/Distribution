package typings.sentryTypes

import org.scalablytyped.runtime.StringDictionary
import typings.sentryTypes.contextMod.Contexts
import typings.sentryTypes.exceptionMod.Exception
import typings.sentryTypes.extraMod.Extras
import typings.sentryTypes.scopeMod._CaptureContext
import typings.sentryTypes.sessionMod.SessionStatus
import typings.sentryTypes.severityMod.Severity
import typings.sentryTypes.userMod.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Attrs extends StObject {
    
    var attrs: js.UndefOr[Environment] = js.undefined
    
    var did: js.UndefOr[String] = js.undefined
    
    var duration: Double
    
    var errors: Double
    
    var init: Boolean
    
    var sid: String
    
    var started: String
    
    var status: SessionStatus
    
    var timestamp: String
  }
  object Attrs {
    
    inline def apply(
      duration: Double,
      errors: Double,
      init: Boolean,
      sid: String,
      started: String,
      status: SessionStatus,
      timestamp: String
    ): Attrs = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], started = started.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[Attrs]
    }
    
    extension [Self <: Attrs](x: Self) {
      
      inline def setAttrs(value: Environment): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      inline def setAttrsUndefined: Self = StObject.set(x, "attrs", js.undefined)
      
      inline def setDid(value: String): Self = StObject.set(x, "did", value.asInstanceOf[js.Any])
      
      inline def setDidUndefined: Self = StObject.set(x, "did", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setErrors(value: Double): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setInit(value: Boolean): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setStarted(value: String): Self = StObject.set(x, "started", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: SessionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  trait Data extends StObject {
    
    var data: js.UndefOr[StringDictionary[js.Any]] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var op: js.UndefOr[String] = js.undefined
    
    var parent_span_id: js.UndefOr[String] = js.undefined
    
    var span_id: String
    
    var status: js.UndefOr[String] = js.undefined
    
    var tags: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var trace_id: String
  }
  object Data {
    
    inline def apply(span_id: String, trace_id: String): Data = {
      val __obj = js.Dynamic.literal(span_id = span_id.asInstanceOf[js.Any], trace_id = trace_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setData(value: StringDictionary[js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setOp(value: String): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
      
      inline def setOpUndefined: Self = StObject.set(x, "op", js.undefined)
      
      inline def setParent_span_id(value: String): Self = StObject.set(x, "parent_span_id", value.asInstanceOf[js.Any])
      
      inline def setParent_span_idUndefined: Self = StObject.set(x, "parent_span_id", js.undefined)
      
      inline def setSpan_id(value: String): Self = StObject.set(x, "span_id", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTrace_id(value: String): Self = StObject.set(x, "trace_id", value.asInstanceOf[js.Any])
    }
  }
  
  trait Description extends StObject {
    
    var data: js.UndefOr[StringDictionary[js.Any]] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var op: js.UndefOr[String] = js.undefined
    
    var parent_span_id: js.UndefOr[String] = js.undefined
    
    var span_id: String
    
    var start_timestamp: Double
    
    var status: js.UndefOr[String] = js.undefined
    
    var tags: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var timestamp: js.UndefOr[Double] = js.undefined
    
    var trace_id: String
  }
  object Description {
    
    inline def apply(span_id: String, start_timestamp: Double, trace_id: String): Description = {
      val __obj = js.Dynamic.literal(span_id = span_id.asInstanceOf[js.Any], start_timestamp = start_timestamp.asInstanceOf[js.Any], trace_id = trace_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Description]
    }
    
    extension [Self <: Description](x: Self) {
      
      inline def setData(value: StringDictionary[js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setOp(value: String): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
      
      inline def setOpUndefined: Self = StObject.set(x, "op", js.undefined)
      
      inline def setParent_span_id(value: String): Self = StObject.set(x, "parent_span_id", value.asInstanceOf[js.Any])
      
      inline def setParent_span_idUndefined: Self = StObject.set(x, "parent_span_id", js.undefined)
      
      inline def setSpan_id(value: String): Self = StObject.set(x, "span_id", value.asInstanceOf[js.Any])
      
      inline def setStart_timestamp(value: Double): Self = StObject.set(x, "start_timestamp", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
      
      inline def setTrace_id(value: String): Self = StObject.set(x, "trace_id", value.asInstanceOf[js.Any])
    }
  }
  
  trait Environment extends StObject {
    
    var environment: js.UndefOr[String] = js.undefined
    
    var ip_address: js.UndefOr[String] = js.undefined
    
    var release: js.UndefOr[String] = js.undefined
    
    var user_agent: js.UndefOr[String] = js.undefined
  }
  object Environment {
    
    inline def apply(): Environment = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Environment]
    }
    
    extension [Self <: Environment](x: Self) {
      
      inline def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
      
      inline def setIp_address(value: String): Self = StObject.set(x, "ip_address", value.asInstanceOf[js.Any])
      
      inline def setIp_addressUndefined: Self = StObject.set(x, "ip_address", js.undefined)
      
      inline def setRelease(value: String): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
      
      inline def setReleaseUndefined: Self = StObject.set(x, "release", js.undefined)
      
      inline def setUser_agent(value: String): Self = StObject.set(x, "user_agent", value.asInstanceOf[js.Any])
      
      inline def setUser_agentUndefined: Self = StObject.set(x, "user_agent", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@sentry/types.@sentry/types/dist/scope.ScopeContext> */
  trait PartialScopeContext
    extends StObject
       with _CaptureContext {
    
    var contexts: js.UndefOr[Contexts] = js.undefined
    
    var extra: js.UndefOr[Extras] = js.undefined
    
    var fingerprint: js.UndefOr[js.Array[String]] = js.undefined
    
    var level: js.UndefOr[Severity] = js.undefined
    
    var tags: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var user: js.UndefOr[User] = js.undefined
  }
  object PartialScopeContext {
    
    inline def apply(): PartialScopeContext = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialScopeContext]
    }
    
    extension [Self <: PartialScopeContext](x: Self) {
      
      inline def setContexts(value: Contexts): Self = StObject.set(x, "contexts", value.asInstanceOf[js.Any])
      
      inline def setContextsUndefined: Self = StObject.set(x, "contexts", js.undefined)
      
      inline def setExtra(value: Extras): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      inline def setFingerprint(value: js.Array[String]): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
      
      inline def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
      
      inline def setFingerprintVarargs(value: String*): Self = StObject.set(x, "fingerprint", js.Array(value :_*))
      
      inline def setLevel(value: Severity): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
  
  /* Inlined std.Pick<@sentry/types.@sentry/types/dist/span.SpanContext, std.Exclude<keyof @sentry/types.@sentry/types/dist/span.SpanContext, 'spanId' | 'sampled' | 'traceId' | 'parentSpanId'>> */
  trait PickSpanContextExcludekey extends StObject {
    
    var data: js.UndefOr[StringDictionary[js.Any]] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var endTimestamp: js.UndefOr[Double] = js.undefined
    
    var op: js.UndefOr[String] = js.undefined
    
    var startTimestamp: js.UndefOr[Double] = js.undefined
    
    var status: js.UndefOr[String] = js.undefined
    
    var tags: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object PickSpanContextExcludekey {
    
    inline def apply(): PickSpanContextExcludekey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickSpanContextExcludekey]
    }
    
    extension [Self <: PickSpanContextExcludekey](x: Self) {
      
      inline def setData(value: StringDictionary[js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setEndTimestamp(value: Double): Self = StObject.set(x, "endTimestamp", value.asInstanceOf[js.Any])
      
      inline def setEndTimestampUndefined: Self = StObject.set(x, "endTimestamp", js.undefined)
      
      inline def setOp(value: String): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
      
      inline def setOpUndefined: Self = StObject.set(x, "op", js.undefined)
      
      inline def setStartTimestamp(value: Double): Self = StObject.set(x, "startTimestamp", value.asInstanceOf[js.Any])
      
      inline def setStartTimestampUndefined: Self = StObject.set(x, "startTimestamp", js.undefined)
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait Value extends StObject {
    
    var value: Double
  }
  object Value {
    
    inline def apply(value: Double): Value = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    extension [Self <: Value](x: Self) {
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Values extends StObject {
    
    var values: js.UndefOr[js.Array[Exception]] = js.undefined
  }
  object Values {
    
    inline def apply(): Values = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Values]
    }
    
    extension [Self <: Values](x: Self) {
      
      inline def setValues(value: js.Array[Exception]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      inline def setValuesVarargs(value: Exception*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
}
