package typings.sentryReplay.typesTypesReplayFrameMod

import typings.sentryReplay.sentryReplayStrings.uiDotmultiClick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.sentryReplay.typesTypesReplayFrameMod.ReplayFrame because Already inherited
- typings.sentryReplay.typesTypesReplayFrameMod.BreadcrumbFrame because Already inherited */ trait MultiClickFrame
  extends StObject
     with BaseBreadcrumbFrame {
  
  @JSName("category")
  var category_MultiClickFrame: uiDotmultiClick
  
  @JSName("data")
  var data_MultiClickFrame: MultiClickFrameData
}
object MultiClickFrame {
  
  inline def apply(data: MultiClickFrameData, timestamp: Double, `type`: String): MultiClickFrame = {
    val __obj = js.Dynamic.literal(category = "ui.multiClick", data = data.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiClickFrame]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MultiClickFrame] (val x: Self) extends AnyVal {
    
    inline def setCategory(value: uiDotmultiClick): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setData(value: MultiClickFrameData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
