package typings.sentryTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@sentry/types", "LogLevel")
  @js.native
  object LogLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sentryTypes.loglevelMod.LogLevel & Double] = js.native
    
    /* 2 */ val Debug: typings.sentryTypes.loglevelMod.LogLevel.Debug & Double = js.native
    
    /* 1 */ val Error: typings.sentryTypes.loglevelMod.LogLevel.Error & Double = js.native
    
    /* 0 */ val None: typings.sentryTypes.loglevelMod.LogLevel.None & Double = js.native
    
    /* 3 */ val Verbose: typings.sentryTypes.loglevelMod.LogLevel.Verbose & Double = js.native
  }
  
  @JSImport("@sentry/types", "SessionStatus")
  @js.native
  object SessionStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.sentryTypes.sessionMod.SessionStatus & String] = js.native
    
    /* "abnormal" */ val Abnormal: typings.sentryTypes.sessionMod.SessionStatus.Abnormal & String = js.native
    
    /* "crashed" */ val Crashed: typings.sentryTypes.sessionMod.SessionStatus.Crashed & String = js.native
    
    /* "exited" */ val Exited: typings.sentryTypes.sessionMod.SessionStatus.Exited & String = js.native
    
    /* "ok" */ val Ok: typings.sentryTypes.sessionMod.SessionStatus.Ok & String = js.native
  }
  
  @JSImport("@sentry/types", "Severity")
  @js.native
  object Severity extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.sentryTypes.severityMod.Severity & String] = js.native
    
    /* "critical" */ val Critical: typings.sentryTypes.severityMod.Severity.Critical & String = js.native
    
    /* "debug" */ val Debug: typings.sentryTypes.severityMod.Severity.Debug & String = js.native
    
    /* "error" */ val Error: typings.sentryTypes.severityMod.Severity.Error & String = js.native
    
    /* "fatal" */ val Fatal: typings.sentryTypes.severityMod.Severity.Fatal & String = js.native
    
    /* "info" */ val Info: typings.sentryTypes.severityMod.Severity.Info & String = js.native
    
    /* "log" */ val Log: typings.sentryTypes.severityMod.Severity.Log & String = js.native
    
    /* "warning" */ val Warning: typings.sentryTypes.severityMod.Severity.Warning & String = js.native
    
    /**
      * Converts a string-based level into a {@link Severity}.
      *
      * @param level string representation of Severity
      * @returns Severity
      */
    def fromString(level: String): typings.sentryTypes.severityMod.Severity = js.native
  }
  
  @JSImport("@sentry/types", "Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.sentryTypes.statusMod.Status & String] = js.native
    
    /* "failed" */ val Failed: typings.sentryTypes.statusMod.Status.Failed & String = js.native
    
    /* "invalid" */ val Invalid: typings.sentryTypes.statusMod.Status.Invalid & String = js.native
    
    /* "rate_limit" */ val RateLimit: typings.sentryTypes.statusMod.Status.RateLimit & String = js.native
    
    /* "skipped" */ val Skipped: typings.sentryTypes.statusMod.Status.Skipped & String = js.native
    
    /* "success" */ val Success: typings.sentryTypes.statusMod.Status.Success & String = js.native
    
    /* "unknown" */ val Unknown: typings.sentryTypes.statusMod.Status.Unknown & String = js.native
    
    /**
      * Converts a HTTP status code into a {@link Status}.
      *
      * @param code The HTTP response status code.
      * @returns The send status or {@link Status.Unknown}.
      */
    def fromHttpCode(code: Double): typings.sentryTypes.statusMod.Status = js.native
  }
}
