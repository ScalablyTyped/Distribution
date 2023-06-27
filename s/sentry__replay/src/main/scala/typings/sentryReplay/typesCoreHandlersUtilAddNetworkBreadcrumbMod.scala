package typings.sentryReplay

import typings.sentryReplay.typesTypesPerformanceMod.NetworkRequestData
import typings.sentryReplay.typesTypesPerformanceMod.ReplayPerformanceEntry
import typings.sentryReplay.typesTypesReplayMod.ReplayContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCoreHandlersUtilAddNetworkBreadcrumbMod {
  
  @JSImport("@sentry/replay/types/coreHandlers/util/addNetworkBreadcrumb", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addNetworkBreadcrumb(replay: ReplayContainer): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addNetworkBreadcrumb")(replay.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def addNetworkBreadcrumb(replay: ReplayContainer, result: ReplayPerformanceEntry[NetworkRequestData]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addNetworkBreadcrumb")(replay.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
