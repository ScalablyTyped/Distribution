package typings.sentryCore

import typings.sentryCore.typesTracingSpanMod.SpanStatusType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sentryCoreStrings {
  
  @js.native
  sealed trait aborted
    extends StObject
       with SpanStatusType
  inline def aborted: aborted = "aborted".asInstanceOf[aborted]
  
  @js.native
  sealed trait afterSendEvent extends StObject
  inline def afterSendEvent: afterSendEvent = "afterSendEvent".asInstanceOf[afterSendEvent]
  
  @js.native
  sealed trait already_exists
    extends StObject
       with SpanStatusType
  inline def already_exists: already_exists = "already_exists".asInstanceOf[already_exists]
  
  @js.native
  sealed trait beforeAddBreadcrumb extends StObject
  inline def beforeAddBreadcrumb: beforeAddBreadcrumb = "beforeAddBreadcrumb".asInstanceOf[beforeAddBreadcrumb]
  
  @js.native
  sealed trait beforeEnvelope extends StObject
  inline def beforeEnvelope: beforeEnvelope = "beforeEnvelope".asInstanceOf[beforeEnvelope]
  
  @js.native
  sealed trait cancelled
    extends StObject
       with SpanStatusType
  inline def cancelled: cancelled = "cancelled".asInstanceOf[cancelled]
  
  @js.native
  sealed trait createDsc extends StObject
  inline def createDsc: createDsc = "createDsc".asInstanceOf[createDsc]
  
  @js.native
  sealed trait data_loss
    extends StObject
       with SpanStatusType
  inline def data_loss: data_loss = "data_loss".asInstanceOf[data_loss]
  
  @js.native
  sealed trait deadline_exceeded
    extends StObject
       with SpanStatusType
  inline def deadline_exceeded: deadline_exceeded = "deadline_exceeded".asInstanceOf[deadline_exceeded]
  
  @js.native
  sealed trait failed_precondition
    extends StObject
       with SpanStatusType
  inline def failed_precondition: failed_precondition = "failed_precondition".asInstanceOf[failed_precondition]
  
  @js.native
  sealed trait finishTransaction extends StObject
  inline def finishTransaction: finishTransaction = "finishTransaction".asInstanceOf[finishTransaction]
  
  @js.native
  sealed trait internal_error
    extends StObject
       with SpanStatusType
  inline def internal_error: internal_error = "internal_error".asInstanceOf[internal_error]
  
  @js.native
  sealed trait invalid_argument
    extends StObject
       with SpanStatusType
  inline def invalid_argument: invalid_argument = "invalid_argument".asInstanceOf[invalid_argument]
  
  @js.native
  sealed trait not_found
    extends StObject
       with SpanStatusType
  inline def not_found: not_found = "not_found".asInstanceOf[not_found]
  
  @js.native
  sealed trait ok
    extends StObject
       with SpanStatusType
  inline def ok: ok = "ok".asInstanceOf[ok]
  
  @js.native
  sealed trait out_of_range
    extends StObject
       with SpanStatusType
  inline def out_of_range: out_of_range = "out_of_range".asInstanceOf[out_of_range]
  
  @js.native
  sealed trait permission_denied
    extends StObject
       with SpanStatusType
  inline def permission_denied: permission_denied = "permission_denied".asInstanceOf[permission_denied]
  
  @js.native
  sealed trait resource_exhausted
    extends StObject
       with SpanStatusType
  inline def resource_exhausted: resource_exhausted = "resource_exhausted".asInstanceOf[resource_exhausted]
  
  @js.native
  sealed trait startTransaction extends StObject
  inline def startTransaction: startTransaction = "startTransaction".asInstanceOf[startTransaction]
  
  @js.native
  sealed trait unauthenticated
    extends StObject
       with SpanStatusType
  inline def unauthenticated: unauthenticated = "unauthenticated".asInstanceOf[unauthenticated]
  
  @js.native
  sealed trait unavailable
    extends StObject
       with SpanStatusType
  inline def unavailable: unavailable = "unavailable".asInstanceOf[unavailable]
  
  @js.native
  sealed trait unimplemented
    extends StObject
       with SpanStatusType
  inline def unimplemented: unimplemented = "unimplemented".asInstanceOf[unimplemented]
  
  @js.native
  sealed trait unknown_error
    extends StObject
       with SpanStatusType
  inline def unknown_error: unknown_error = "unknown_error".asInstanceOf[unknown_error]
}
