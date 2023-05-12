package typings.sentryReplay

import typings.sentryReplay.typesTypesMod.ReplayContainer
import typings.std.PerformanceObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCoreHandlersPerformanceObserverMod {
  
  @JSImport("@sentry/replay/types/coreHandlers/performanceObserver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setupPerformanceObserver(replay: ReplayContainer): PerformanceObserver = ^.asInstanceOf[js.Dynamic].applyDynamic("setupPerformanceObserver")(replay.asInstanceOf[js.Any]).asInstanceOf[PerformanceObserver]
}
