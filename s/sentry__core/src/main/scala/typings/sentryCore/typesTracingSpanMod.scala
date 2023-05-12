package typings.sentryCore

import typings.sentryCore.anon.PickSpanContextExcludekey
import typings.sentryTypes.typesSpanMod.SpanContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTracingSpanMod {
  
  @JSImport("@sentry/core/types/tracing/span", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@sentry/core/types/tracing/span", "Span")
  @js.native
  /**
    * You should never call the constructor manually, always use `Sentry.startTransaction()`
    * or call `startChild()` on an existing span.
    * @internal
    * @hideconstructor
    * @hidden
    */
  open class Span ()
    extends StObject
       with typings.sentryTypes.typesSpanMod.Span {
    def this(spanContext: SpanContext) = this()
    
    /**
      * @inheritDoc
      */
    def setStatus(value: SpanStatusType): this.type = js.native
    
    /**
      * List of spans that were finalized
      */
    var spanRecorder: js.UndefOr[SpanRecorder] = js.native
    
    def startChild(spanContext: PickSpanContextExcludekey): Span = js.native
  }
  
  @JSImport("@sentry/core/types/tracing/span", "SpanRecorder")
  @js.native
  open class SpanRecorder () extends StObject {
    def this(maxlen: Double) = this()
    
    /* private */ val _maxlen: Any = js.native
    
    /**
      * This is just so that we don't run out of memory while recording a lot
      * of spans. At some point we just stop and flush out the start of the
      * trace tree (i.e.the first n spans with the smallest
      * start_timestamp).
      */
    def add(span: Span): Unit = js.native
    
    var spans: js.Array[Span] = js.native
  }
  
  inline def spanStatusfromHttpCode(httpStatus: Double): SpanStatusType = ^.asInstanceOf[js.Dynamic].applyDynamic("spanStatusfromHttpCode")(httpStatus.asInstanceOf[js.Any]).asInstanceOf[SpanStatusType]
  
  /* Rewritten from type alias, can be one of: 
    - typings.sentryCore.sentryCoreStrings.ok
    - typings.sentryCore.sentryCoreStrings.deadline_exceeded
    - typings.sentryCore.sentryCoreStrings.unauthenticated
    - typings.sentryCore.sentryCoreStrings.permission_denied
    - typings.sentryCore.sentryCoreStrings.not_found
    - typings.sentryCore.sentryCoreStrings.resource_exhausted
    - typings.sentryCore.sentryCoreStrings.invalid_argument
    - typings.sentryCore.sentryCoreStrings.unimplemented
    - typings.sentryCore.sentryCoreStrings.unavailable
    - typings.sentryCore.sentryCoreStrings.internal_error
    - typings.sentryCore.sentryCoreStrings.unknown_error
    - typings.sentryCore.sentryCoreStrings.cancelled
    - typings.sentryCore.sentryCoreStrings.already_exists
    - typings.sentryCore.sentryCoreStrings.failed_precondition
    - typings.sentryCore.sentryCoreStrings.aborted
    - typings.sentryCore.sentryCoreStrings.out_of_range
    - typings.sentryCore.sentryCoreStrings.data_loss
  */
  trait SpanStatusType extends StObject
  object SpanStatusType {
    
    inline def aborted: typings.sentryCore.sentryCoreStrings.aborted = "aborted".asInstanceOf[typings.sentryCore.sentryCoreStrings.aborted]
    
    inline def already_exists: typings.sentryCore.sentryCoreStrings.already_exists = "already_exists".asInstanceOf[typings.sentryCore.sentryCoreStrings.already_exists]
    
    inline def cancelled: typings.sentryCore.sentryCoreStrings.cancelled = "cancelled".asInstanceOf[typings.sentryCore.sentryCoreStrings.cancelled]
    
    inline def data_loss: typings.sentryCore.sentryCoreStrings.data_loss = "data_loss".asInstanceOf[typings.sentryCore.sentryCoreStrings.data_loss]
    
    inline def deadline_exceeded: typings.sentryCore.sentryCoreStrings.deadline_exceeded = "deadline_exceeded".asInstanceOf[typings.sentryCore.sentryCoreStrings.deadline_exceeded]
    
    inline def failed_precondition: typings.sentryCore.sentryCoreStrings.failed_precondition = "failed_precondition".asInstanceOf[typings.sentryCore.sentryCoreStrings.failed_precondition]
    
    inline def internal_error: typings.sentryCore.sentryCoreStrings.internal_error = "internal_error".asInstanceOf[typings.sentryCore.sentryCoreStrings.internal_error]
    
    inline def invalid_argument: typings.sentryCore.sentryCoreStrings.invalid_argument = "invalid_argument".asInstanceOf[typings.sentryCore.sentryCoreStrings.invalid_argument]
    
    inline def not_found: typings.sentryCore.sentryCoreStrings.not_found = "not_found".asInstanceOf[typings.sentryCore.sentryCoreStrings.not_found]
    
    inline def ok: typings.sentryCore.sentryCoreStrings.ok = "ok".asInstanceOf[typings.sentryCore.sentryCoreStrings.ok]
    
    inline def out_of_range: typings.sentryCore.sentryCoreStrings.out_of_range = "out_of_range".asInstanceOf[typings.sentryCore.sentryCoreStrings.out_of_range]
    
    inline def permission_denied: typings.sentryCore.sentryCoreStrings.permission_denied = "permission_denied".asInstanceOf[typings.sentryCore.sentryCoreStrings.permission_denied]
    
    inline def resource_exhausted: typings.sentryCore.sentryCoreStrings.resource_exhausted = "resource_exhausted".asInstanceOf[typings.sentryCore.sentryCoreStrings.resource_exhausted]
    
    inline def unauthenticated: typings.sentryCore.sentryCoreStrings.unauthenticated = "unauthenticated".asInstanceOf[typings.sentryCore.sentryCoreStrings.unauthenticated]
    
    inline def unavailable: typings.sentryCore.sentryCoreStrings.unavailable = "unavailable".asInstanceOf[typings.sentryCore.sentryCoreStrings.unavailable]
    
    inline def unimplemented: typings.sentryCore.sentryCoreStrings.unimplemented = "unimplemented".asInstanceOf[typings.sentryCore.sentryCoreStrings.unimplemented]
    
    inline def unknown_error: typings.sentryCore.sentryCoreStrings.unknown_error = "unknown_error".asInstanceOf[typings.sentryCore.sentryCoreStrings.unknown_error]
  }
}
