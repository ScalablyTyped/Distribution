package typings.reactDates

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.reactDates.mod.CalendarDayShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsCalendarDayMod extends Shortcut {
  
  @JSImport("react-dates/lib/components/CalendarDay", JSImport.Default)
  @js.native
  val default: ComponentClass[CalendarDayShape, ComponentState] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("react-dates/lib/components/CalendarDay", JSImport.Default)
  @js.native
  open class defaultCls protected () extends Component[CalendarDayShape, ComponentState, Any] {
    def this(props: CalendarDayShape) = this()
    def this(props: CalendarDayShape, context: Any) = this()
  }
  
  type _To = ComponentClass[CalendarDayShape, ComponentState]
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsCalendarDayMod.foo` */
  override def _to: ComponentClass[CalendarDayShape, ComponentState] = default
}
