package typings.sentryTypes

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@sentry/types/dist/loglevel", JSImport.Namespace)
@js.native
object loglevelMod extends js.Object {
  
  @js.native
  sealed trait LogLevel extends js.Object
  @js.native
  object LogLevel extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[LogLevel with Double] = js.native
    
    /** Information useful for debugging the SDK will be logged. */
    @js.native
    sealed trait Debug extends LogLevel
    /* 2 */ @js.native
    object Debug extends TopLevel[Debug with Double]
    
    /** Only SDK internal errors will be logged. */
    @js.native
    sealed trait Error extends LogLevel
    /* 1 */ @js.native
    object Error extends TopLevel[Error with Double]
    
    /** No logs will be generated. */
    @js.native
    sealed trait None extends LogLevel
    /* 0 */ @js.native
    object None extends TopLevel[None with Double]
    
    /** All SDK actions will be logged. */
    @js.native
    sealed trait Verbose extends LogLevel
    /* 3 */ @js.native
    object Verbose extends TopLevel[Verbose with Double]
  }
}
