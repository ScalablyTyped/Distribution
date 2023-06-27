package typings.sentryReplay.typesTypesReplayFrameMod

import typings.sentryReplay.sentryReplayStrings.memory
import typings.sentryReplay.typesTypesPerformanceMod.MemoryData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.sentryReplay.typesTypesReplayFrameMod.ReplayFrame because Already inherited
- typings.sentryReplay.typesTypesReplayFrameMod.SpanFrame because Already inherited */ trait MemoryFrame
  extends StObject
     with BaseSpanFrame {
  
  @JSName("data")
  var data_MemoryFrame: MemoryData
  
  @JSName("op")
  var op_MemoryFrame: memory
}
object MemoryFrame {
  
  inline def apply(data: MemoryData, description: String, endTimestamp: Double, startTimestamp: Double): MemoryFrame = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], endTimestamp = endTimestamp.asInstanceOf[js.Any], op = "memory", startTimestamp = startTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemoryFrame]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MemoryFrame] (val x: Self) extends AnyVal {
    
    inline def setData(value: MemoryData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setOp(value: memory): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
  }
}
