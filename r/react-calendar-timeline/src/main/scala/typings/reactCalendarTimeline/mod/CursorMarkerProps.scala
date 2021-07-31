package typings.reactCalendarTimeline.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<react-calendar-timeline.react-calendar-timeline.MarkerProps, 'date'> */
trait CursorMarkerProps extends StObject {
  
  var children: js.UndefOr[js.Function1[/* props */ CustomMarkerChildrenProps, ReactNode]] = js.undefined
}
object CursorMarkerProps {
  
  @scala.inline
  def apply(): CursorMarkerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CursorMarkerProps]
  }
  
  @scala.inline
  implicit class CursorMarkerPropsMutableBuilder[Self <: CursorMarkerProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: /* props */ CustomMarkerChildrenProps => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
  }
}
