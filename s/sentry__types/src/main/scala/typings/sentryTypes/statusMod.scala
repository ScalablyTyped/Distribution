package typings.sentryTypes

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@sentry/types/dist/status", JSImport.Namespace)
@js.native
object statusMod extends js.Object {
  
  @js.native
  sealed trait Status extends js.Object
  @js.native
  object Status extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Status with String] = js.native
    
    /**
      * Converts a HTTP status code into a {@link Status}.
      *
      * @param code The HTTP response status code.
      * @returns The send status or {@link Status.Unknown}.
      */
    def fromHttpCode(code: Double): Status = js.native
    
    /** A server-side error ocurred during submission. */
    @js.native
    sealed trait Failed extends Status
    /* "failed" */ @js.native
    object Failed extends TopLevel[Failed with String]
    
    /** The event could not be processed. */
    @js.native
    sealed trait Invalid extends Status
    /* "invalid" */ @js.native
    object Invalid extends TopLevel[Invalid with String]
    
    /** The client is currently rate limited and will try again later. */
    @js.native
    sealed trait RateLimit extends Status
    /* "rate_limit" */ @js.native
    object RateLimit extends TopLevel[RateLimit with String]
    
    /** The event was skipped due to configuration or callbacks. */
    @js.native
    sealed trait Skipped extends Status
    /* "skipped" */ @js.native
    object Skipped extends TopLevel[Skipped with String]
    
    /** The event was sent to Sentry successfully. */
    @js.native
    sealed trait Success extends Status
    /* "success" */ @js.native
    object Success extends TopLevel[Success with String]
    
    /** The status could not be determined. */
    @js.native
    sealed trait Unknown extends Status
    /* "unknown" */ @js.native
    object Unknown extends TopLevel[Unknown with String]
  }
}
