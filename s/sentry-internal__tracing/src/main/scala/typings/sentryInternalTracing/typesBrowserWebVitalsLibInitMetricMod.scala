package typings.sentryInternalTracing

import typings.sentryInternalTracing.sentryInternalTracingStrings.CLS
import typings.sentryInternalTracing.sentryInternalTracingStrings.FCP
import typings.sentryInternalTracing.sentryInternalTracingStrings.FID
import typings.sentryInternalTracing.sentryInternalTracingStrings.INP
import typings.sentryInternalTracing.sentryInternalTracingStrings.LCP
import typings.sentryInternalTracing.sentryInternalTracingStrings.TTFB
import typings.sentryInternalTracing.typesBrowserWebVitalsTypesBaseMod.Metric
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBrowserWebVitalsLibInitMetricMod {
  
  @JSImport("@sentry-internal/tracing/types/browser/web-vitals/lib/initMetric", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def initMetric(name: CLS | FCP | FID | INP | LCP | TTFB): Metric = ^.asInstanceOf[js.Dynamic].applyDynamic("initMetric")(name.asInstanceOf[js.Any]).asInstanceOf[Metric]
  inline def initMetric(name: CLS | FCP | FID | INP | LCP | TTFB, value: Double): Metric = (^.asInstanceOf[js.Dynamic].applyDynamic("initMetric")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Metric]
}
