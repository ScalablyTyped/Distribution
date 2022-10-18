package typings.sentryTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@sentry/types", "Severity")
  @js.native
  object Severity extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.sentryTypes.typesSeverityMod.Severity & String] = js.native
    
    /* "debug" */ val Debug: typings.sentryTypes.typesSeverityMod.Severity.Debug & String = js.native
    
    /* "error" */ val Error: typings.sentryTypes.typesSeverityMod.Severity.Error & String = js.native
    
    /* "fatal" */ val Fatal: typings.sentryTypes.typesSeverityMod.Severity.Fatal & String = js.native
    
    /* "info" */ val Info: typings.sentryTypes.typesSeverityMod.Severity.Info & String = js.native
    
    /* "log" */ val Log: typings.sentryTypes.typesSeverityMod.Severity.Log & String = js.native
    
    /* "warning" */ val Warning: typings.sentryTypes.typesSeverityMod.Severity.Warning & String = js.native
  }
}
