package typings.sentryReplay.typesTypesReplayFrameMod

import typings.sentryReplay.sentryReplayStrings.uiDotblur
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.sentryReplay.typesTypesReplayFrameMod.ReplayFrame because Already inherited
- typings.sentryReplay.typesTypesReplayFrameMod.BreadcrumbFrame because Already inherited */ trait BlurFrame
  extends StObject
     with BaseBreadcrumbFrame {
  
  @JSName("category")
  var category_BlurFrame: uiDotblur
}
object BlurFrame {
  
  inline def apply(timestamp: Double, `type`: String): BlurFrame = {
    val __obj = js.Dynamic.literal(category = "ui.blur", timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlurFrame]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BlurFrame] (val x: Self) extends AnyVal {
    
    inline def setCategory(value: uiDotblur): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
  }
}
