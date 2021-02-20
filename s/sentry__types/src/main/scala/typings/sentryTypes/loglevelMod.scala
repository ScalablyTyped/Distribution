package typings.sentryTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loglevelMod {
  
  @js.native
  sealed trait LogLevel extends StObject
  @JSImport("@sentry/types/dist/loglevel", "LogLevel")
  @js.native
  object LogLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[LogLevel with Double] = js.native
    
    /** Information useful for debugging the SDK will be logged. */
    @js.native
    sealed trait Debug extends LogLevel
    /* 2 */ val Debug: typings.sentryTypes.loglevelMod.LogLevel.Debug with Double = js.native
    
    /** Only SDK internal errors will be logged. */
    @js.native
    sealed trait Error extends LogLevel
    /* 1 */ val Error: typings.sentryTypes.loglevelMod.LogLevel.Error with Double = js.native
    
    /** No logs will be generated. */
    @js.native
    sealed trait None extends LogLevel
    /* 0 */ val None: typings.sentryTypes.loglevelMod.LogLevel.None with Double = js.native
    
    /** All SDK actions will be logged. */
    @js.native
    sealed trait Verbose extends LogLevel
    /* 3 */ val Verbose: typings.sentryTypes.loglevelMod.LogLevel.Verbose with Double = js.native
  }
}
