package typings.sentryInternalTracing

import typings.sentryInternalTracing.typesBrowserWebVitalsTypesBaseMod.ReportCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBrowserWebVitalsGetFIDMod {
  
  @JSImport("@sentry-internal/tracing/types/browser/web-vitals/getFID", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def onFID(onReport: ReportCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onFID")(onReport.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
