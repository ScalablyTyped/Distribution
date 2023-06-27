package typings.sentryReplay.typesTypesReplayFrameMod

import typings.sentryReplay.sentryReplayStrings.console
import typings.sentryTypes.typesSeverityMod.Severity
import typings.sentryTypes.typesSeverityMod.SeverityLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.sentryReplay.typesTypesReplayFrameMod.ReplayFrame because Already inherited
- typings.sentryReplay.typesTypesReplayFrameMod.BreadcrumbFrame because Already inherited */ trait ConsoleFrame
  extends StObject
     with BaseBreadcrumbFrame {
  
  @JSName("category")
  var category_ConsoleFrame: console
  
  @JSName("data")
  var data_ConsoleFrame: ConsoleFrameData
  
  var level: js.UndefOr[Severity | SeverityLevel] = js.undefined
  
  @JSName("message")
  var message_ConsoleFrame: String
}
object ConsoleFrame {
  
  inline def apply(data: ConsoleFrameData, message: String, timestamp: Double, `type`: String): ConsoleFrame = {
    val __obj = js.Dynamic.literal(category = "console", data = data.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsoleFrame]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConsoleFrame] (val x: Self) extends AnyVal {
    
    inline def setCategory(value: console): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setData(value: ConsoleFrameData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setLevel(value: Severity | SeverityLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
