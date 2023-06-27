package typings.sentryReplay.typesTypesReplayFrameMod

import typings.sentryReplay.sentryReplayStrings.uiDotslowClickDetected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.sentryReplay.typesTypesReplayFrameMod.ReplayFrame because Already inherited
- typings.sentryReplay.typesTypesReplayFrameMod.BreadcrumbFrame because Already inherited */ trait SlowClickFrame
  extends StObject
     with BaseBreadcrumbFrame {
  
  @JSName("category")
  var category_SlowClickFrame: uiDotslowClickDetected
  
  @JSName("data")
  var data_SlowClickFrame: SlowClickFrameData
}
object SlowClickFrame {
  
  inline def apply(data: SlowClickFrameData, timestamp: Double, `type`: String): SlowClickFrame = {
    val __obj = js.Dynamic.literal(category = "ui.slowClickDetected", data = data.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlowClickFrame]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SlowClickFrame] (val x: Self) extends AnyVal {
    
    inline def setCategory(value: uiDotslowClickDetected): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setData(value: SlowClickFrameData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
