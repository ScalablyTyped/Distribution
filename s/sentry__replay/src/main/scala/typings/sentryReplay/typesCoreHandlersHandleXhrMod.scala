package typings.sentryReplay

import typings.sentryReplay.typesTypesPerformanceMod.NetworkRequestData
import typings.sentryReplay.typesTypesPerformanceMod.ReplayPerformanceEntry
import typings.sentryReplay.typesTypesReplayMod.ReplayContainer
import typings.sentryTypes.typesInstrumentMod.HandlerDataXhr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCoreHandlersHandleXhrMod {
  
  @JSImport("@sentry/replay/types/coreHandlers/handleXhr", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def handleXhr(handlerData: HandlerDataXhr): ReplayPerformanceEntry[NetworkRequestData] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("handleXhr")(handlerData.asInstanceOf[js.Any]).asInstanceOf[ReplayPerformanceEntry[NetworkRequestData] | Null]
  
  inline def handleXhrSpanListener(replay: ReplayContainer): js.Function1[/* handlerData */ HandlerDataXhr, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleXhrSpanListener")(replay.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* handlerData */ HandlerDataXhr, Unit]]
}
