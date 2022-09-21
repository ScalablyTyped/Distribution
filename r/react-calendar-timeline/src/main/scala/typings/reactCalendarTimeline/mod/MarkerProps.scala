package typings.reactCalendarTimeline.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarkerProps extends StObject {
  
  var children: js.UndefOr[js.Function1[/* props */ CustomMarkerChildrenProps, ReactNode]] = js.undefined
  
  var date: js.Date | Double
}
object MarkerProps {
  
  inline def apply(date: js.Date | Double): MarkerProps = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerProps]
  }
  
  extension [Self <: MarkerProps](x: Self) {
    
    inline def setChildren(value: /* props */ CustomMarkerChildrenProps => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setDate(value: js.Date | Double): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
  }
}
