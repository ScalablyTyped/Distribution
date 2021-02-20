package typings.reactCalendarTimeline.mod

import typings.react.mod.CSSProperties
import typings.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimelineHeadersProps extends StObject {
  
  var calendarHeaderClassName: js.UndefOr[String] = js.native
  
  var calendarHeaderStyle: js.UndefOr[CSSProperties] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var headerRef: js.UndefOr[Ref[_]] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
}
object TimelineHeadersProps {
  
  @scala.inline
  def apply(): TimelineHeadersProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimelineHeadersProps]
  }
  
  @scala.inline
  implicit class TimelineHeadersPropsMutableBuilder[Self <: TimelineHeadersProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCalendarHeaderClassName(value: String): Self = StObject.set(x, "calendarHeaderClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalendarHeaderClassNameUndefined: Self = StObject.set(x, "calendarHeaderClassName", js.undefined)
    
    @scala.inline
    def setCalendarHeaderStyle(value: CSSProperties): Self = StObject.set(x, "calendarHeaderStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalendarHeaderStyleUndefined: Self = StObject.set(x, "calendarHeaderStyle", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setHeaderRef(value: Ref[_]): Self = StObject.set(x, "headerRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderRefFunction1(value: /* instance */ _ | Null => scala.Unit): Self = StObject.set(x, "headerRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHeaderRefNull: Self = StObject.set(x, "headerRef", null)
    
    @scala.inline
    def setHeaderRefUndefined: Self = StObject.set(x, "headerRef", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
