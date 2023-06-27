package typings.sentryReplay.typesTypesReplayFrameMod

import typings.sentryReplay.sentryReplayStrings.navigationDotpush
import typings.sentryReplay.typesTypesPerformanceMod.HistoryData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.sentryReplay.typesTypesReplayFrameMod.ReplayFrame because Already inherited
- typings.sentryReplay.typesTypesReplayFrameMod.SpanFrame because Already inherited */ trait HistoryFrame
  extends StObject
     with BaseSpanFrame {
  
  @JSName("data")
  var data_HistoryFrame: HistoryData
  
  @JSName("op")
  var op_HistoryFrame: navigationDotpush
}
object HistoryFrame {
  
  inline def apply(data: HistoryData, description: String, endTimestamp: Double, startTimestamp: Double): HistoryFrame = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], endTimestamp = endTimestamp.asInstanceOf[js.Any], op = "navigation.push", startTimestamp = startTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoryFrame]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HistoryFrame] (val x: Self) extends AnyVal {
    
    inline def setData(value: HistoryData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setOp(value: navigationDotpush): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
  }
}
