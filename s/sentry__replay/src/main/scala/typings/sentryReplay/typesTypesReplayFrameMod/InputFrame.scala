package typings.sentryReplay.typesTypesReplayFrameMod

import typings.sentryReplay.sentryReplayStrings.uiDotinput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.sentryReplay.typesTypesReplayFrameMod.ReplayFrame because Already inherited
- typings.sentryReplay.typesTypesReplayFrameMod.BreadcrumbFrame because Already inherited */ trait InputFrame
  extends StObject
     with BaseBreadcrumbFrame {
  
  @JSName("category")
  var category_InputFrame: uiDotinput
  
  @JSName("message")
  var message_InputFrame: String
}
object InputFrame {
  
  inline def apply(message: String, timestamp: Double, `type`: String): InputFrame = {
    val __obj = js.Dynamic.literal(category = "ui.input", message = message.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputFrame]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InputFrame] (val x: Self) extends AnyVal {
    
    inline def setCategory(value: uiDotinput): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
