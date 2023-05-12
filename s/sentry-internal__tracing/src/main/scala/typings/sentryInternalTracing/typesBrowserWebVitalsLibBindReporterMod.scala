package typings.sentryInternalTracing

import typings.sentryInternalTracing.typesBrowserWebVitalsTypesBaseMod.Metric
import typings.sentryInternalTracing.typesBrowserWebVitalsTypesBaseMod.ReportCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBrowserWebVitalsLibBindReporterMod {
  
  @JSImport("@sentry-internal/tracing/types/browser/web-vitals/lib/bindReporter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bindReporter(callback: ReportCallback, metric: Metric): js.Function1[/* forceReport */ js.UndefOr[Boolean], Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindReporter")(callback.asInstanceOf[js.Any], metric.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* forceReport */ js.UndefOr[Boolean], Unit]]
  inline def bindReporter(callback: ReportCallback, metric: Metric, reportAllChanges: Boolean): js.Function1[/* forceReport */ js.UndefOr[Boolean], Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindReporter")(callback.asInstanceOf[js.Any], metric.asInstanceOf[js.Any], reportAllChanges.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* forceReport */ js.UndefOr[Boolean], Unit]]
}
