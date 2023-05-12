package typings.sentryReplay

import typings.sentryReplay.typesTypesMod.NetworkRequestData
import typings.sentryReplay.typesTypesMod.ReplayContainer
import typings.sentryReplay.typesTypesMod.ReplayPerformanceEntry
import typings.sentryTypes.typesInstrumentMod.HandlerDataFetch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCoreHandlersHandleFetchMod {
  
  @JSImport("@sentry/replay/types/coreHandlers/handleFetch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def handleFetch(handlerData: HandlerDataFetch): Null | ReplayPerformanceEntry[NetworkRequestData] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleFetch")(handlerData.asInstanceOf[js.Any]).asInstanceOf[Null | ReplayPerformanceEntry[NetworkRequestData]]
  
  inline def handleFetchSpanListener(replay: ReplayContainer): js.Function1[/* handlerData */ HandlerDataFetch, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleFetchSpanListener")(replay.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* handlerData */ HandlerDataFetch, Unit]]
}
