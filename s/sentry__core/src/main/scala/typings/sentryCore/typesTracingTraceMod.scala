package typings.sentryCore

import typings.sentryCore.typesTracingSpanMod.Span
import typings.sentryTypes.typesTransactionMod.TransactionContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTracingTraceMod {
  
  @JSImport("@sentry/core/types/tracing/trace", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def trace[T](context: TransactionContext, callback: js.Function1[/* span */ js.UndefOr[Span], T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("trace")(context.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def trace[T](
    context: TransactionContext,
    callback: js.Function1[/* span */ js.UndefOr[Span], T],
    onError: js.Function1[/* error */ Any, Unit]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("trace")(context.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[T]
}
