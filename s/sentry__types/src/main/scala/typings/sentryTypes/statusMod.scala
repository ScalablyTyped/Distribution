package typings.sentryTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statusMod {
  
  @js.native
  sealed trait Status extends StObject
  @JSImport("@sentry/types/dist/status", "Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Status & String] = js.native
    
    /** A server-side error ocurred during submission. */
    @js.native
    sealed trait Failed
      extends StObject
         with Status
    /* "failed" */ val Failed: typings.sentryTypes.statusMod.Status.Failed & String = js.native
    
    /** The event could not be processed. */
    @js.native
    sealed trait Invalid
      extends StObject
         with Status
    /* "invalid" */ val Invalid: typings.sentryTypes.statusMod.Status.Invalid & String = js.native
    
    /** The client is currently rate limited and will try again later. */
    @js.native
    sealed trait RateLimit
      extends StObject
         with Status
    /* "rate_limit" */ val RateLimit: typings.sentryTypes.statusMod.Status.RateLimit & String = js.native
    
    /** The event was skipped due to configuration or callbacks. */
    @js.native
    sealed trait Skipped
      extends StObject
         with Status
    /* "skipped" */ val Skipped: typings.sentryTypes.statusMod.Status.Skipped & String = js.native
    
    /** The event was sent to Sentry successfully. */
    @js.native
    sealed trait Success
      extends StObject
         with Status
    /* "success" */ val Success: typings.sentryTypes.statusMod.Status.Success & String = js.native
    
    /** The status could not be determined. */
    @js.native
    sealed trait Unknown
      extends StObject
         with Status
    /* "unknown" */ val Unknown: typings.sentryTypes.statusMod.Status.Unknown & String = js.native
    
    /**
      * Converts a HTTP status code into a {@link Status}.
      *
      * @param code The HTTP response status code.
      * @returns The send status or {@link Status.Unknown}.
      */
    def fromHttpCode(code: Double): Status = js.native
  }
}
