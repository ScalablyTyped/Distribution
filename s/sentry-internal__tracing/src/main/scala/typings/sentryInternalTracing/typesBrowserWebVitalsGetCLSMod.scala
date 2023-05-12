package typings.sentryInternalTracing

import typings.sentryInternalTracing.typesBrowserWebVitalsTypesBaseMod.ReportCallback
import typings.sentryInternalTracing.typesBrowserWebVitalsTypesBaseMod.StopListening
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBrowserWebVitalsGetCLSMod {
  
  @JSImport("@sentry-internal/tracing/types/browser/web-vitals/getCLS", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def onCLS(onReport: ReportCallback): js.UndefOr[StopListening] = ^.asInstanceOf[js.Dynamic].applyDynamic("onCLS")(onReport.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[StopListening]]
}
