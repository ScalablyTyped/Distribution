package typings.sentryTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object severityMod {
  
  @js.native
  sealed trait Severity extends StObject
  @JSImport("@sentry/types/dist/severity", "Severity")
  @js.native
  object Severity extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Severity & String] = js.native
    
    /** JSDoc */
    @js.native
    sealed trait Critical
      extends StObject
         with Severity
    /* "critical" */ val Critical: typings.sentryTypes.severityMod.Severity.Critical & String = js.native
    
    /** JSDoc */
    @js.native
    sealed trait Debug
      extends StObject
         with Severity
    /* "debug" */ val Debug: typings.sentryTypes.severityMod.Severity.Debug & String = js.native
    
    /** JSDoc */
    @js.native
    sealed trait Error
      extends StObject
         with Severity
    /* "error" */ val Error: typings.sentryTypes.severityMod.Severity.Error & String = js.native
    
    /** JSDoc */
    @js.native
    sealed trait Fatal
      extends StObject
         with Severity
    /* "fatal" */ val Fatal: typings.sentryTypes.severityMod.Severity.Fatal & String = js.native
    
    /** JSDoc */
    @js.native
    sealed trait Info
      extends StObject
         with Severity
    /* "info" */ val Info: typings.sentryTypes.severityMod.Severity.Info & String = js.native
    
    /** JSDoc */
    @js.native
    sealed trait Log
      extends StObject
         with Severity
    /* "log" */ val Log: typings.sentryTypes.severityMod.Severity.Log & String = js.native
    
    /** JSDoc */
    @js.native
    sealed trait Warning
      extends StObject
         with Severity
    /* "warning" */ val Warning: typings.sentryTypes.severityMod.Severity.Warning & String = js.native
    
    /**
      * Converts a string-based level into a {@link Severity}.
      *
      * @param level string representation of Severity
      * @returns Severity
      */
    def fromString(level: String): Severity = js.native
  }
}
