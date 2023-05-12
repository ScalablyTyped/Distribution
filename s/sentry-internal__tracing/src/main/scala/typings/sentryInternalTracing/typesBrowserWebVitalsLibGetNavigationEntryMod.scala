package typings.sentryInternalTracing

import typings.sentryInternalTracing.anon.PickPerformanceNavigation
import typings.sentryInternalTracing.typesBrowserWebVitalsTypesMod.global.PerformanceNavigationTiming
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBrowserWebVitalsLibGetNavigationEntryMod {
  
  @JSImport("@sentry-internal/tracing/types/browser/web-vitals/lib/getNavigationEntry", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getNavigationEntry(): js.UndefOr[PerformanceNavigationTiming | PickPerformanceNavigation] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNavigationEntry")().asInstanceOf[js.UndefOr[PerformanceNavigationTiming | PickPerformanceNavigation]]
}
