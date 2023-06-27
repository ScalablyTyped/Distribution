package typings.sentryReplay

import typings.sentryReplay.typesTypesPerformanceMod.AllEntryData
import typings.sentryReplay.typesTypesPerformanceMod.ReplayPerformanceEntry
import typings.sentryReplay.typesTypesReplayMod.AddEventResult
import typings.sentryReplay.typesTypesReplayMod.ReplayContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUtilCreatePerformanceSpansMod {
  
  @JSImport("@sentry/replay/types/util/createPerformanceSpans", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createPerformanceSpans(replay: ReplayContainer, entries: js.Array[ReplayPerformanceEntry[AllEntryData]]): js.Array[js.Promise[AddEventResult | Null]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createPerformanceSpans")(replay.asInstanceOf[js.Any], entries.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Promise[AddEventResult | Null]]]
}
