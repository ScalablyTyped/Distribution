package typings.reactDates

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.reactDates.mod.CalendarMonthGridShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsCalendarMonthGridMod extends Shortcut {
  
  @JSImport("react-dates/lib/components/CalendarMonthGrid", JSImport.Default)
  @js.native
  val default: ComponentClass[CalendarMonthGridShape, ComponentState] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("react-dates/lib/components/CalendarMonthGrid", JSImport.Default)
  @js.native
  open class defaultCls protected () extends Component[CalendarMonthGridShape, ComponentState, Any] {
    def this(props: CalendarMonthGridShape) = this()
    def this(props: CalendarMonthGridShape, context: Any) = this()
  }
  
  type _To = ComponentClass[CalendarMonthGridShape, ComponentState]
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsCalendarMonthGridMod.foo` */
  override def _to: ComponentClass[CalendarMonthGridShape, ComponentState] = default
}
