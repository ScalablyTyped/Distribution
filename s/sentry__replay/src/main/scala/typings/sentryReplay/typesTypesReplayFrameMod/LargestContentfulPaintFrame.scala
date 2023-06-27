package typings.sentryReplay.typesTypesReplayFrameMod

import typings.sentryReplay.sentryReplayStrings.`largest-contentful-paint`
import typings.sentryReplay.typesTypesPerformanceMod.LargestContentfulPaintData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.sentryReplay.typesTypesReplayFrameMod.ReplayFrame because Already inherited
- typings.sentryReplay.typesTypesReplayFrameMod.SpanFrame because Already inherited */ trait LargestContentfulPaintFrame
  extends StObject
     with BaseSpanFrame {
  
  @JSName("data")
  var data_LargestContentfulPaintFrame: LargestContentfulPaintData
  
  @JSName("op")
  var op_LargestContentfulPaintFrame: `largest-contentful-paint`
}
object LargestContentfulPaintFrame {
  
  inline def apply(
    data: LargestContentfulPaintData,
    description: String,
    endTimestamp: Double,
    startTimestamp: Double
  ): LargestContentfulPaintFrame = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], endTimestamp = endTimestamp.asInstanceOf[js.Any], op = "largest-contentful-paint", startTimestamp = startTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[LargestContentfulPaintFrame]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LargestContentfulPaintFrame] (val x: Self) extends AnyVal {
    
    inline def setData(value: LargestContentfulPaintData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setOp(value: `largest-contentful-paint`): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
  }
}
