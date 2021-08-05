package typings.reactCalendarTimeline.mod

import typings.react.mod.ReactNode
import typings.reactCalendarTimeline.reactCalendarTimelineStrings.left
import typings.reactCalendarTimeline.reactCalendarTimelineStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SidebarHeaderProps[Data] extends StObject {
  
  def children(props: SidebarHeaderChildrenFnProps[Data]): ReactNode
  
  var headerData: js.UndefOr[Data] = js.undefined
  
  var variant: js.UndefOr[left | right] = js.undefined
}
object SidebarHeaderProps {
  
  inline def apply[Data](children: SidebarHeaderChildrenFnProps[Data] => ReactNode): SidebarHeaderProps[Data] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[SidebarHeaderProps[Data]]
  }
  
  extension [Self <: SidebarHeaderProps[?], Data](x: Self & SidebarHeaderProps[Data]) {
    
    inline def setChildren(value: SidebarHeaderChildrenFnProps[Data] => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    inline def setHeaderData(value: Data): Self = StObject.set(x, "headerData", value.asInstanceOf[js.Any])
    
    inline def setHeaderDataUndefined: Self = StObject.set(x, "headerData", js.undefined)
    
    inline def setVariant(value: left | right): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
