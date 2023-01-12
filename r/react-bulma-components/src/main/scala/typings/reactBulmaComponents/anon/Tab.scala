package typings.reactBulmaComponents.anon

import typings.react.mod.ReactElement
import typings.reactBulmaComponents.reactBulmaComponentsStrings.a
import typings.reactBulmaComponents.srcComponentsMod.BulmaComponent
import typings.reactBulmaComponents.srcComponentsMod.ElementProps
import typings.reactBulmaComponents.srcComponentsPanelMod.PanelTabProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tab extends StObject {
  
  var Tab: BulmaComponent[PanelTabProps, a]
}
object Tab {
  
  inline def apply(Tab: /* props */ PanelTabProps & (ElementProps[PanelTabProps, a]) => ReactElement): Tab = {
    val __obj = js.Dynamic.literal(Tab = js.Any.fromFunction1(Tab))
    __obj.asInstanceOf[Tab]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Tab] (val x: Self) extends AnyVal {
    
    inline def setTab(value: /* props */ PanelTabProps & (ElementProps[PanelTabProps, a]) => ReactElement): Self = StObject.set(x, "Tab", js.Any.fromFunction1(value))
  }
}
