package typings.sentryReplay.typesTypesReplayFrameMod

import typings.sentryReplay.sentryReplayStrings.navigationDotback_forward
import typings.sentryReplay.sentryReplayStrings.navigationDotnavigate
import typings.sentryReplay.sentryReplayStrings.navigationDotreload
import typings.sentryReplay.sentryReplayStrings.resourceDotcss
import typings.sentryReplay.sentryReplayStrings.resourceDotfetch
import typings.sentryReplay.sentryReplayStrings.resourceDotiframe
import typings.sentryReplay.sentryReplayStrings.resourceDotimg
import typings.sentryReplay.sentryReplayStrings.resourceDotlink
import typings.sentryReplay.sentryReplayStrings.resourceDotother
import typings.sentryReplay.sentryReplayStrings.resourceDotscript
import typings.sentryReplay.sentryReplayStrings.resourceDotxhr
import typings.sentryReplay.typesTypesPerformanceMod.HistoryData
import typings.sentryReplay.typesTypesPerformanceMod.LargestContentfulPaintData
import typings.sentryReplay.typesTypesPerformanceMod.MemoryData
import typings.sentryReplay.typesTypesPerformanceMod.NavigationData
import typings.sentryReplay.typesTypesPerformanceMod.NetworkRequestData
import typings.sentryReplay.typesTypesPerformanceMod.PaintData
import typings.sentryReplay.typesTypesPerformanceMod.ResourceData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.sentryReplay.typesTypesReplayFrameMod.BaseSpanFrame
  - typings.sentryReplay.typesTypesReplayFrameMod.HistoryFrame
  - typings.sentryReplay.typesTypesReplayFrameMod.RequestFrame
  - typings.sentryReplay.typesTypesReplayFrameMod.LargestContentfulPaintFrame
  - typings.sentryReplay.typesTypesReplayFrameMod.MemoryFrame
  - typings.sentryReplay.typesTypesReplayFrameMod.NavigationFrame
  - typings.sentryReplay.typesTypesReplayFrameMod.PaintFrame
  - typings.sentryReplay.typesTypesReplayFrameMod.ResourceFrame
*/
trait SpanFrame
  extends StObject
     with ReplayFrame
object SpanFrame {
  
  inline def BaseSpanFrame(description: String, endTimestamp: Double, op: String, startTimestamp: Double): typings.sentryReplay.typesTypesReplayFrameMod.BaseSpanFrame = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], endTimestamp = endTimestamp.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], startTimestamp = startTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sentryReplay.typesTypesReplayFrameMod.BaseSpanFrame]
  }
  
  inline def HistoryFrame(data: HistoryData, description: String, endTimestamp: Double, startTimestamp: Double): typings.sentryReplay.typesTypesReplayFrameMod.HistoryFrame = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], endTimestamp = endTimestamp.asInstanceOf[js.Any], op = "navigation.push", startTimestamp = startTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sentryReplay.typesTypesReplayFrameMod.HistoryFrame]
  }
  
  inline def LargestContentfulPaintFrame(
    data: LargestContentfulPaintData,
    description: String,
    endTimestamp: Double,
    startTimestamp: Double
  ): typings.sentryReplay.typesTypesReplayFrameMod.LargestContentfulPaintFrame = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], endTimestamp = endTimestamp.asInstanceOf[js.Any], op = "largest-contentful-paint", startTimestamp = startTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sentryReplay.typesTypesReplayFrameMod.LargestContentfulPaintFrame]
  }
  
  inline def MemoryFrame(data: MemoryData, description: String, endTimestamp: Double, startTimestamp: Double): typings.sentryReplay.typesTypesReplayFrameMod.MemoryFrame = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], endTimestamp = endTimestamp.asInstanceOf[js.Any], op = "memory", startTimestamp = startTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sentryReplay.typesTypesReplayFrameMod.MemoryFrame]
  }
  
  inline def NavigationFrame(
    data: NavigationData,
    description: String,
    endTimestamp: Double,
    op: navigationDotnavigate | navigationDotreload | navigationDotback_forward,
    startTimestamp: Double
  ): typings.sentryReplay.typesTypesReplayFrameMod.NavigationFrame = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], endTimestamp = endTimestamp.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], startTimestamp = startTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sentryReplay.typesTypesReplayFrameMod.NavigationFrame]
  }
  
  inline def PaintFrame(data: PaintData, description: String, endTimestamp: Double, startTimestamp: Double): typings.sentryReplay.typesTypesReplayFrameMod.PaintFrame = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], endTimestamp = endTimestamp.asInstanceOf[js.Any], op = "paint", startTimestamp = startTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sentryReplay.typesTypesReplayFrameMod.PaintFrame]
  }
  
  inline def RequestFrame(
    data: NetworkRequestData,
    description: String,
    endTimestamp: Double,
    op: resourceDotfetch | resourceDotxhr,
    startTimestamp: Double
  ): typings.sentryReplay.typesTypesReplayFrameMod.RequestFrame = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], endTimestamp = endTimestamp.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], startTimestamp = startTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sentryReplay.typesTypesReplayFrameMod.RequestFrame]
  }
  
  inline def ResourceFrame(
    data: ResourceData,
    description: String,
    endTimestamp: Double,
    op: resourceDotcss | resourceDotiframe | resourceDotimg | resourceDotlink | resourceDotother | resourceDotscript,
    startTimestamp: Double
  ): typings.sentryReplay.typesTypesReplayFrameMod.ResourceFrame = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], endTimestamp = endTimestamp.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], startTimestamp = startTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sentryReplay.typesTypesReplayFrameMod.ResourceFrame]
  }
}
