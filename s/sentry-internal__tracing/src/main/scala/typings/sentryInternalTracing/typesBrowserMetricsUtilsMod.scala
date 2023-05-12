package typings.sentryInternalTracing

import typings.sentryCore.mod.Transaction
import typings.sentryTypes.typesSpanMod.Span
import typings.sentryTypes.typesSpanMod.SpanContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBrowserMetricsUtilsMod {
  
  @JSImport("@sentry-internal/tracing/types/browser/metrics/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isMeasurementValue(value: Any): /* is number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMeasurementValue")(value.asInstanceOf[js.Any]).asInstanceOf[/* is number */ Boolean]
  
  inline def startChild(transaction: Transaction, param1: SpanContext): Span = (^.asInstanceOf[js.Dynamic].applyDynamic("_startChild")(transaction.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[Span]
}
