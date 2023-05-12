package typings.sentryReplay.typesTypesMod

import typings.sentryReplay.typesTypesRrwebMod.eventWithTime
import typings.sentryReplay.typesTypesRrwebMod.recordOptions
import typings.std.Blob
import typings.std.BufferSource
import typings.std.FormData
import typings.std.PerformanceEntry
import typings.std.PerformanceResourceTiming
import typings.std.Record
import typings.std.URLSearchParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AddEventResult = Unit

type AddUpdateCallback = js.Function0[Boolean | Unit]

/* Rewritten from type alias, can be one of: 
  - typings.sentryReplay.typesTypesMod.AllPerformanceEntryData
  - typings.sentryReplay.typesTypesMod.MemoryData
  - typings.sentryReplay.typesTypesMod.NetworkRequestData
  - typings.sentryReplay.typesTypesMod.HistoryData
*/
type AllEntryData = _AllEntryData | PaintData

type AllPerformanceEntry = PerformancePaintTiming | PerformanceResourceTiming | PerformanceNavigationTiming

/* Rewritten from type alias, can be one of: 
  - typings.sentryReplay.typesTypesMod.PaintData
  - typings.sentryReplay.typesTypesMod.NavigationData
  - typings.sentryReplay.typesTypesMod.ResourceData
  - typings.sentryReplay.typesTypesMod.LargestContentfulPaintData
*/
type AllPerformanceEntryData = _AllPerformanceEntryData | PaintData

type JsonArray = js.Array[Any]

type JsonObject = Record[String, Any]

type NetworkBody = JsonObject | JsonArray | String

type PaintData = Unit

type PerformancePaintTiming = PerformanceEntry

type RecordingEvent = eventWithTime

type RecordingOptions = recordOptions

type RequestBody = Null | Blob | BufferSource | FormData | URLSearchParams | String
