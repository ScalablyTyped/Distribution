package typings.sentryCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTracingSpanstatusMod {
  
  @js.native
  sealed trait SpanStatus extends StObject
  @JSImport("@sentry/core/types/tracing/spanstatus", "SpanStatus")
  @js.native
  object SpanStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[SpanStatus & String] = js.native
    
    /** The operation was aborted, typically due to a concurrency issue. */
    @js.native
    sealed trait Aborted
      extends StObject
         with SpanStatus
    /* "aborted" */ val Aborted: typings.sentryCore.typesTracingSpanstatusMod.SpanStatus.Aborted & String = js.native
    
    /** Already exists (409) */
    @js.native
    sealed trait AlreadyExists
      extends StObject
         with SpanStatus
    /* "already_exists" */ val AlreadyExists: typings.sentryCore.typesTracingSpanstatusMod.SpanStatus.AlreadyExists & String = js.native
    
    /** The operation was cancelled (typically by the user). */
    @js.native
    sealed trait Cancelled
      extends StObject
         with SpanStatus
    /* "cancelled" */ val Cancelled: typings.sentryCore.typesTracingSpanstatusMod.SpanStatus.Cancelled & String = js.native
    
    /** Unrecoverable data loss or corruption */
    @js.native
    sealed trait DataLoss
      extends StObject
         with SpanStatus
    /* "data_loss" */ val DataLoss: typings.sentryCore.typesTracingSpanstatusMod.SpanStatus.DataLoss & String = js.native
    
    /** Deadline expired before operation could complete. */
    @js.native
    sealed trait DeadlineExceeded
      extends StObject
         with SpanStatus
    /* "deadline_exceeded" */ val DeadlineExceeded: typings.sentryCore.typesTracingSpanstatusMod.SpanStatus.DeadlineExceeded & String = js.native
    
    /** Operation was rejected because the system is not in a state required for the operation's */
    @js.native
    sealed trait FailedPrecondition
      extends StObject
         with SpanStatus
    /* "failed_precondition" */ val FailedPrecondition: typings.sentryCore.typesTracingSpanstatusMod.SpanStatus.FailedPrecondition & String = js.native
    
    /** Other/generic 5xx. */
    @js.native
    sealed trait InternalError
      extends StObject
         with SpanStatus
    /* "internal_error" */ val InternalError: typings.sentryCore.typesTracingSpanstatusMod.SpanStatus.InternalError & String = js.native
    
    /** Client specified an invalid argument. 4xx. */
    @js.native
    sealed trait InvalidArgument
      extends StObject
         with SpanStatus
    /* "invalid_argument" */ val InvalidArgument: typings.sentryCore.typesTracingSpanstatusMod.SpanStatus.InvalidArgument & String = js.native
    
    /** 404 Not Found. Some requested entity (file or directory) was not found. */
    @js.native
    sealed trait NotFound
      extends StObject
         with SpanStatus
    /* "not_found" */ val NotFound: typings.sentryCore.typesTracingSpanstatusMod.SpanStatus.NotFound & String = js.native
    
    /** The operation completed successfully. */
    @js.native
    sealed trait Ok
      extends StObject
         with SpanStatus
    /* "ok" */ val Ok: typings.sentryCore.typesTracingSpanstatusMod.SpanStatus.Ok & String = js.native
    
    /** Operation was attempted past the valid range. */
    @js.native
    sealed trait OutOfRange
      extends StObject
         with SpanStatus
    /* "out_of_range" */ val OutOfRange: typings.sentryCore.typesTracingSpanstatusMod.SpanStatus.OutOfRange & String = js.native
    
    /** 403 Forbidden */
    @js.native
    sealed trait PermissionDenied
      extends StObject
         with SpanStatus
    /* "permission_denied" */ val PermissionDenied: typings.sentryCore.typesTracingSpanstatusMod.SpanStatus.PermissionDenied & String = js.native
    
    /** 429 Too Many Requests */
    @js.native
    sealed trait ResourceExhausted
      extends StObject
         with SpanStatus
    /* "resource_exhausted" */ val ResourceExhausted: typings.sentryCore.typesTracingSpanstatusMod.SpanStatus.ResourceExhausted & String = js.native
    
    /** 401 Unauthorized (actually does mean unauthenticated according to RFC 7235) */
    @js.native
    sealed trait Unauthenticated
      extends StObject
         with SpanStatus
    /* "unauthenticated" */ val Unauthenticated: typings.sentryCore.typesTracingSpanstatusMod.SpanStatus.Unauthenticated & String = js.native
    
    /** 503 Service Unavailable */
    @js.native
    sealed trait Unavailable
      extends StObject
         with SpanStatus
    /* "unavailable" */ val Unavailable: typings.sentryCore.typesTracingSpanstatusMod.SpanStatus.Unavailable & String = js.native
    
    /** 501 Not Implemented */
    @js.native
    sealed trait Unimplemented
      extends StObject
         with SpanStatus
    /* "unimplemented" */ val Unimplemented: typings.sentryCore.typesTracingSpanstatusMod.SpanStatus.Unimplemented & String = js.native
    
    /** Unknown. Any non-standard HTTP status code. */
    @js.native
    sealed trait UnknownError
      extends StObject
         with SpanStatus
    /* "unknown_error" */ val UnknownError: typings.sentryCore.typesTracingSpanstatusMod.SpanStatus.UnknownError & String = js.native
  }
}
