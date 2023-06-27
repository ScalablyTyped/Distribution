package typings.sentryReplay.typesTypesReplayFrameMod

import typings.sentryReplay.sentryReplayStrings.uiDotkeyDown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.sentryReplay.typesTypesReplayFrameMod.ReplayFrame because Already inherited
- typings.sentryReplay.typesTypesReplayFrameMod.BreadcrumbFrame because Already inherited */ trait KeyboardEventFrame
  extends StObject
     with BaseBreadcrumbFrame {
  
  @JSName("category")
  var category_KeyboardEventFrame: uiDotkeyDown
  
  @JSName("data")
  var data_KeyboardEventFrame: KeyboardEventFrameData
}
object KeyboardEventFrame {
  
  inline def apply(data: KeyboardEventFrameData, timestamp: Double, `type`: String): KeyboardEventFrame = {
    val __obj = js.Dynamic.literal(category = "ui.keyDown", data = data.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyboardEventFrame]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyboardEventFrame] (val x: Self) extends AnyVal {
    
    inline def setCategory(value: uiDotkeyDown): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setData(value: KeyboardEventFrameData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
