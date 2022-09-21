package typings.sentryTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object severityMod {
  
  @js.native
  sealed trait Severity extends StObject
  @JSImport("@sentry/types/types/severity", "Severity")
  @js.native
  object Severity extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Severity & String] = js.native
    
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
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.sentryTypes.sentryTypesStrings.fatal
    - typings.sentryTypes.sentryTypesStrings.error
    - typings.sentryTypes.sentryTypesStrings.warning
    - typings.sentryTypes.sentryTypesStrings.log
    - typings.sentryTypes.sentryTypesStrings.info
    - typings.sentryTypes.sentryTypesStrings.debug
  */
  trait SeverityLevel extends StObject
  object SeverityLevel {
    
    inline def debug: typings.sentryTypes.sentryTypesStrings.debug = "debug".asInstanceOf[typings.sentryTypes.sentryTypesStrings.debug]
    
    inline def error: typings.sentryTypes.sentryTypesStrings.error = "error".asInstanceOf[typings.sentryTypes.sentryTypesStrings.error]
    
    inline def fatal: typings.sentryTypes.sentryTypesStrings.fatal = "fatal".asInstanceOf[typings.sentryTypes.sentryTypesStrings.fatal]
    
    inline def info: typings.sentryTypes.sentryTypesStrings.info = "info".asInstanceOf[typings.sentryTypes.sentryTypesStrings.info]
    
    inline def log: typings.sentryTypes.sentryTypesStrings.log = "log".asInstanceOf[typings.sentryTypes.sentryTypesStrings.log]
    
    inline def warning: typings.sentryTypes.sentryTypesStrings.warning = "warning".asInstanceOf[typings.sentryTypes.sentryTypesStrings.warning]
  }
}
