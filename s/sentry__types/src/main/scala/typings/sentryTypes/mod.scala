package typings.sentryTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@sentry/types", "Severity")
  @js.native
  object Severity extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.sentryTypes.severityMod.Severity & String] = js.native
    
    /* "debug" */ val Debug: typings.sentryTypes.severityMod.Severity.Debug & String = js.native
    
    /* "error" */ val Error: typings.sentryTypes.severityMod.Severity.Error & String = js.native
    
    /* "fatal" */ val Fatal: typings.sentryTypes.severityMod.Severity.Fatal & String = js.native
    
    /* "info" */ val Info: typings.sentryTypes.severityMod.Severity.Info & String = js.native
    
    /* "log" */ val Log: typings.sentryTypes.severityMod.Severity.Log & String = js.native
    
    /* "warning" */ val Warning: typings.sentryTypes.severityMod.Severity.Warning & String = js.native
  }
}
