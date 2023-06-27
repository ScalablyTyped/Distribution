package typings.sentryReplay.typesTypesReplayFrameMod

import typings.sentryReplay.sentryReplayStrings.resourceDotfetch
import typings.sentryReplay.sentryReplayStrings.resourceDotxhr
import typings.sentryReplay.typesTypesPerformanceMod.NetworkRequestData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.sentryReplay.typesTypesReplayFrameMod.ReplayFrame because Already inherited
- typings.sentryReplay.typesTypesReplayFrameMod.SpanFrame because Already inherited */ trait RequestFrame
  extends StObject
     with BaseSpanFrame {
  
  @JSName("data")
  var data_RequestFrame: NetworkRequestData
  
  @JSName("op")
  var op_RequestFrame: resourceDotfetch | resourceDotxhr
}
object RequestFrame {
  
  inline def apply(
    data: NetworkRequestData,
    description: String,
    endTimestamp: Double,
    op: resourceDotfetch | resourceDotxhr,
    startTimestamp: Double
  ): RequestFrame = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], endTimestamp = endTimestamp.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], startTimestamp = startTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestFrame]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestFrame] (val x: Self) extends AnyVal {
    
    inline def setData(value: NetworkRequestData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setOp(value: resourceDotfetch | resourceDotxhr): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
  }
}
