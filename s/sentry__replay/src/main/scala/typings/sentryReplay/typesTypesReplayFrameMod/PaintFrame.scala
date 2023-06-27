package typings.sentryReplay.typesTypesReplayFrameMod

import typings.sentryReplay.sentryReplayStrings.paint
import typings.sentryReplay.typesTypesPerformanceMod.PaintData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.sentryReplay.typesTypesReplayFrameMod.ReplayFrame because Already inherited
- typings.sentryReplay.typesTypesReplayFrameMod.SpanFrame because Already inherited */ trait PaintFrame
  extends StObject
     with BaseSpanFrame {
  
  @JSName("data")
  var data_PaintFrame: PaintData
  
  @JSName("op")
  var op_PaintFrame: paint
}
object PaintFrame {
  
  inline def apply(data: PaintData, description: String, endTimestamp: Double, startTimestamp: Double): PaintFrame = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], endTimestamp = endTimestamp.asInstanceOf[js.Any], op = "paint", startTimestamp = startTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaintFrame]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PaintFrame] (val x: Self) extends AnyVal {
    
    inline def setData(value: PaintData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setOp(value: paint): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
  }
}
