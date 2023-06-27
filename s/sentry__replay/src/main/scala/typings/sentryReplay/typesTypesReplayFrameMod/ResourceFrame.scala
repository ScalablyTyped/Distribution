package typings.sentryReplay.typesTypesReplayFrameMod

import typings.sentryReplay.sentryReplayStrings.resourceDotcss
import typings.sentryReplay.sentryReplayStrings.resourceDotiframe
import typings.sentryReplay.sentryReplayStrings.resourceDotimg
import typings.sentryReplay.sentryReplayStrings.resourceDotlink
import typings.sentryReplay.sentryReplayStrings.resourceDotother
import typings.sentryReplay.sentryReplayStrings.resourceDotscript
import typings.sentryReplay.typesTypesPerformanceMod.ResourceData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.sentryReplay.typesTypesReplayFrameMod.ReplayFrame because Already inherited
- typings.sentryReplay.typesTypesReplayFrameMod.SpanFrame because Already inherited */ trait ResourceFrame
  extends StObject
     with BaseSpanFrame {
  
  @JSName("data")
  var data_ResourceFrame: ResourceData
  
  @JSName("op")
  var op_ResourceFrame: resourceDotcss | resourceDotiframe | resourceDotimg | resourceDotlink | resourceDotother | resourceDotscript
}
object ResourceFrame {
  
  inline def apply(
    data: ResourceData,
    description: String,
    endTimestamp: Double,
    op: resourceDotcss | resourceDotiframe | resourceDotimg | resourceDotlink | resourceDotother | resourceDotscript,
    startTimestamp: Double
  ): ResourceFrame = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], endTimestamp = endTimestamp.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], startTimestamp = startTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceFrame]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourceFrame] (val x: Self) extends AnyVal {
    
    inline def setData(value: ResourceData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setOp(
      value: resourceDotcss | resourceDotiframe | resourceDotimg | resourceDotlink | resourceDotother | resourceDotscript
    ): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
  }
}
