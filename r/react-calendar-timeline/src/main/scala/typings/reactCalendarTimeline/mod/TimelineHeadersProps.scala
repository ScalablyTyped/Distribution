package typings.reactCalendarTimeline.mod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimelineHeadersProps extends StObject {
  
  var calendarHeaderClassName: js.UndefOr[String] = js.undefined
  
  var calendarHeaderStyle: js.UndefOr[CSSProperties] = js.undefined
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var headerRef: js.UndefOr[Ref[Any]] = js.undefined
  
  var style: js.UndefOr[CSSProperties] = js.undefined
}
object TimelineHeadersProps {
  
  inline def apply(): TimelineHeadersProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimelineHeadersProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimelineHeadersProps] (val x: Self) extends AnyVal {
    
    inline def setCalendarHeaderClassName(value: String): Self = StObject.set(x, "calendarHeaderClassName", value.asInstanceOf[js.Any])
    
    inline def setCalendarHeaderClassNameUndefined: Self = StObject.set(x, "calendarHeaderClassName", js.undefined)
    
    inline def setCalendarHeaderStyle(value: CSSProperties): Self = StObject.set(x, "calendarHeaderStyle", value.asInstanceOf[js.Any])
    
    inline def setCalendarHeaderStyleUndefined: Self = StObject.set(x, "calendarHeaderStyle", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setHeaderRef(value: Ref[Any]): Self = StObject.set(x, "headerRef", value.asInstanceOf[js.Any])
    
    inline def setHeaderRefFunction1(value: /* instance */ Any | Null => scala.Unit): Self = StObject.set(x, "headerRef", js.Any.fromFunction1(value))
    
    inline def setHeaderRefNull: Self = StObject.set(x, "headerRef", null)
    
    inline def setHeaderRefUndefined: Self = StObject.set(x, "headerRef", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
