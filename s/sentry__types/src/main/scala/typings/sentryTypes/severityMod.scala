package typings.sentryTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object severityMod {
  
  @js.native
  sealed trait Severity extends StObject
  @JSImport("@sentry/types/dist/severity", "Severity")
  @js.native
  object Severity extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Severity with String] = js.native
    
    /** JSDoc */
    @js.native
    sealed trait Critical extends Severity
    /* "critical" */ val Critical: typings.sentryTypes.severityMod.Severity.Critical with String = js.native
    
    /** JSDoc */
    @js.native
    sealed trait Debug extends Severity
    /* "debug" */ val Debug: typings.sentryTypes.severityMod.Severity.Debug with String = js.native
    
    /** JSDoc */
    @js.native
    sealed trait Error extends Severity
    /* "error" */ val Error: typings.sentryTypes.severityMod.Severity.Error with String = js.native
    
    /** JSDoc */
    @js.native
    sealed trait Fatal extends Severity
    /* "fatal" */ val Fatal: typings.sentryTypes.severityMod.Severity.Fatal with String = js.native
    
    /** JSDoc */
    @js.native
    sealed trait Info extends Severity
    /* "info" */ val Info: typings.sentryTypes.severityMod.Severity.Info with String = js.native
    
    /** JSDoc */
    @js.native
    sealed trait Log extends Severity
    /* "log" */ val Log: typings.sentryTypes.severityMod.Severity.Log with String = js.native
    
    /** JSDoc */
    @js.native
    sealed trait Warning extends Severity
    /* "warning" */ val Warning: typings.sentryTypes.severityMod.Severity.Warning with String = js.native
    
    /**
      * Converts a string-based level into a {@link Severity}.
      *
      * @param level string representation of Severity
      * @returns Severity
      */
    def fromString(level: String): Severity = js.native
  }
}
