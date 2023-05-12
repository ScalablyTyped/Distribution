package typings.sentryReplay

import typings.std.PerformanceEntryList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUtilDedupePerformanceEntriesMod {
  
  @JSImport("@sentry/replay/types/util/dedupePerformanceEntries", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def dedupePerformanceEntries(currentList: PerformanceEntryList, newList: PerformanceEntryList): PerformanceEntryList = (^.asInstanceOf[js.Dynamic].applyDynamic("dedupePerformanceEntries")(currentList.asInstanceOf[js.Any], newList.asInstanceOf[js.Any])).asInstanceOf[PerformanceEntryList]
}
