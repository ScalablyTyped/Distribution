package typings.reactCalendarTimeline.mod

import typings.react.mod.ReactNode
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MarkerProps extends StObject {
  
  var children: js.UndefOr[js.Function1[/* props */ CustomMarkerChildrenProps, ReactNode]] = js.native
  
  var date: Date | Double = js.native
}
object MarkerProps {
  
  @scala.inline
  def apply(date: Date | Double): MarkerProps = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerProps]
  }
  
  @scala.inline
  implicit class MarkerPropsMutableBuilder[Self <: MarkerProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: /* props */ CustomMarkerChildrenProps => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setDate(value: Date | Double): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
  }
}
