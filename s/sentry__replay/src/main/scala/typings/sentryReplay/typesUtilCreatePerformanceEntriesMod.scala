package typings.sentryReplay

import typings.sentryReplay.typesTypesMod.AllPerformanceEntry
import typings.sentryReplay.typesTypesMod.AllPerformanceEntryData
import typings.sentryReplay.typesTypesMod.ReplayPerformanceEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUtilCreatePerformanceEntriesMod {
  
  @JSImport("@sentry/replay/types/util/createPerformanceEntries", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createPerformanceEntries(entries: js.Array[AllPerformanceEntry]): js.Array[ReplayPerformanceEntry[AllPerformanceEntryData]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createPerformanceEntries")(entries.asInstanceOf[js.Any]).asInstanceOf[js.Array[ReplayPerformanceEntry[AllPerformanceEntryData]]]
}
