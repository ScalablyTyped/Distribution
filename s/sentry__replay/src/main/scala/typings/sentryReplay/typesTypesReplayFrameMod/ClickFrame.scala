package typings.sentryReplay.typesTypesReplayFrameMod

import typings.sentryReplay.sentryReplayStrings.uiDotclick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.sentryReplay.typesTypesReplayFrameMod.ReplayFrame because Already inherited
- typings.sentryReplay.typesTypesReplayFrameMod.BreadcrumbFrame because Already inherited */ trait ClickFrame
  extends StObject
     with BaseBreadcrumbFrame {
  
  @JSName("category")
  var category_ClickFrame: uiDotclick
  
  @JSName("data")
  var data_ClickFrame: ClickFrameData
  
  @JSName("message")
  var message_ClickFrame: String
}
object ClickFrame {
  
  inline def apply(data: ClickFrameData, message: String, timestamp: Double, `type`: String): ClickFrame = {
    val __obj = js.Dynamic.literal(category = "ui.click", data = data.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClickFrame]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClickFrame] (val x: Self) extends AnyVal {
    
    inline def setCategory(value: uiDotclick): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setData(value: ClickFrameData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
