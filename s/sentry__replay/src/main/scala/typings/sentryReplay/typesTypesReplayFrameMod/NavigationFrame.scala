package typings.sentryReplay.typesTypesReplayFrameMod

import typings.sentryReplay.sentryReplayStrings.navigationDotback_forward
import typings.sentryReplay.sentryReplayStrings.navigationDotnavigate
import typings.sentryReplay.sentryReplayStrings.navigationDotreload
import typings.sentryReplay.typesTypesPerformanceMod.NavigationData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.sentryReplay.typesTypesReplayFrameMod.ReplayFrame because Already inherited
- typings.sentryReplay.typesTypesReplayFrameMod.SpanFrame because Already inherited */ trait NavigationFrame
  extends StObject
     with BaseSpanFrame {
  
  @JSName("data")
  var data_NavigationFrame: NavigationData
  
  @JSName("op")
  var op_NavigationFrame: navigationDotnavigate | navigationDotreload | navigationDotback_forward
}
object NavigationFrame {
  
  inline def apply(
    data: NavigationData,
    description: String,
    endTimestamp: Double,
    op: navigationDotnavigate | navigationDotreload | navigationDotback_forward,
    startTimestamp: Double
  ): NavigationFrame = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], endTimestamp = endTimestamp.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], startTimestamp = startTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationFrame]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NavigationFrame] (val x: Self) extends AnyVal {
    
    inline def setData(value: NavigationData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setOp(value: navigationDotnavigate | navigationDotreload | navigationDotback_forward): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
  }
}
