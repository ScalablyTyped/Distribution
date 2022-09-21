package typings.reactDates

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.reactDates.mod.DateRangePickerShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsDateRangePickerMod extends Shortcut {
  
  @JSImport("react-dates/lib/components/DateRangePicker", JSImport.Default)
  @js.native
  val default: ComponentClass[DateRangePickerShape, ComponentState] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("react-dates/lib/components/DateRangePicker", JSImport.Default)
  @js.native
  open class defaultCls protected () extends Component[DateRangePickerShape, ComponentState, Any] {
    def this(props: DateRangePickerShape) = this()
    def this(props: DateRangePickerShape, context: Any) = this()
  }
  
  type _To = ComponentClass[DateRangePickerShape, ComponentState]
  
  /* This means you don't have to write `default`, but can instead just say `componentsDateRangePickerMod.foo` */
  override def _to: ComponentClass[DateRangePickerShape, ComponentState] = default
}
