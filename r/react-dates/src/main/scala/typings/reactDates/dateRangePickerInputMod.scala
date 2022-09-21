package typings.reactDates

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.reactDates.mod.DateRangePickerInputShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateRangePickerInputMod extends Shortcut {
  
  @JSImport("react-dates/esm/components/DateRangePickerInput", JSImport.Default)
  @js.native
  val default: ComponentClass[DateRangePickerInputShape, ComponentState] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("react-dates/esm/components/DateRangePickerInput", JSImport.Default)
  @js.native
  open class defaultCls protected () extends Component[DateRangePickerInputShape, ComponentState, Any] {
    def this(props: DateRangePickerInputShape) = this()
    def this(props: DateRangePickerInputShape, context: Any) = this()
  }
  
  type _To = ComponentClass[DateRangePickerInputShape, ComponentState]
  
  /* This means you don't have to write `default`, but can instead just say `dateRangePickerInputMod.foo` */
  override def _to: ComponentClass[DateRangePickerInputShape, ComponentState] = default
}
