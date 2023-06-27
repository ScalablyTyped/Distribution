package typings.sentryReplay.typesTypesReplayFrameMod

import typings.sentryReplay.sentryReplayStrings.uiDotfocus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.sentryReplay.typesTypesReplayFrameMod.ReplayFrame because Already inherited
- typings.sentryReplay.typesTypesReplayFrameMod.BreadcrumbFrame because Already inherited */ trait FocusFrame
  extends StObject
     with BaseBreadcrumbFrame {
  
  @JSName("category")
  var category_FocusFrame: uiDotfocus
}
object FocusFrame {
  
  inline def apply(timestamp: Double, `type`: String): FocusFrame = {
    val __obj = js.Dynamic.literal(category = "ui.focus", timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FocusFrame]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FocusFrame] (val x: Self) extends AnyVal {
    
    inline def setCategory(value: uiDotfocus): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
  }
}
