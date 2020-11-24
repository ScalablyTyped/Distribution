package typings.sentryTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@sentry/types", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  object LogLevel extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sentryTypes.loglevelMod.LogLevel with Double] = js.native
    
    /* 2 */ val Debug: typings.sentryTypes.loglevelMod.LogLevel.Debug with Double = js.native
    
    /* 1 */ val Error: typings.sentryTypes.loglevelMod.LogLevel.Error with Double = js.native
    
    /* 0 */ val None: typings.sentryTypes.loglevelMod.LogLevel.None with Double = js.native
    
    /* 3 */ val Verbose: typings.sentryTypes.loglevelMod.LogLevel.Verbose with Double = js.native
  }
  
  @js.native
  object SessionStatus extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.sentryTypes.sessionMod.SessionStatus with String] = js.native
    
    /* "abnormal" */ val Abnormal: typings.sentryTypes.sessionMod.SessionStatus.Abnormal with String = js.native
    
    /* "crashed" */ val Crashed: typings.sentryTypes.sessionMod.SessionStatus.Crashed with String = js.native
    
    /* "exited" */ val Exited: typings.sentryTypes.sessionMod.SessionStatus.Exited with String = js.native
    
    /* "ok" */ val Ok: typings.sentryTypes.sessionMod.SessionStatus.Ok with String = js.native
  }
  
  @js.native
  object Severity extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.sentryTypes.severityMod.Severity with String] = js.native
    
    /* "critical" */ val Critical: typings.sentryTypes.severityMod.Severity.Critical with String = js.native
    
    /* "debug" */ val Debug: typings.sentryTypes.severityMod.Severity.Debug with String = js.native
    
    /* "error" */ val Error: typings.sentryTypes.severityMod.Severity.Error with String = js.native
    
    /* "fatal" */ val Fatal: typings.sentryTypes.severityMod.Severity.Fatal with String = js.native
    
    /* "info" */ val Info: typings.sentryTypes.severityMod.Severity.Info with String = js.native
    
    /* "log" */ val Log: typings.sentryTypes.severityMod.Severity.Log with String = js.native
    
    /* "warning" */ val Warning: typings.sentryTypes.severityMod.Severity.Warning with String = js.native
    
    /**
      * Converts a string-based level into a {@link Severity}.
      *
      * @param level string representation of Severity
      * @returns Severity
      */
    def fromString(level: String): typings.sentryTypes.severityMod.Severity = js.native
  }
  
  @js.native
  object Status extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.sentryTypes.statusMod.Status with String] = js.native
    
    /* "failed" */ val Failed: typings.sentryTypes.statusMod.Status.Failed with String = js.native
    
    /* "invalid" */ val Invalid: typings.sentryTypes.statusMod.Status.Invalid with String = js.native
    
    /* "rate_limit" */ val RateLimit: typings.sentryTypes.statusMod.Status.RateLimit with String = js.native
    
    /* "skipped" */ val Skipped: typings.sentryTypes.statusMod.Status.Skipped with String = js.native
    
    /* "success" */ val Success: typings.sentryTypes.statusMod.Status.Success with String = js.native
    
    /* "unknown" */ val Unknown: typings.sentryTypes.statusMod.Status.Unknown with String = js.native
    
    /**
      * Converts a HTTP status code into a {@link Status}.
      *
      * @param code The HTTP response status code.
      * @returns The send status or {@link Status.Unknown}.
      */
    def fromHttpCode(code: Double): typings.sentryTypes.statusMod.Status = js.native
  }
}
