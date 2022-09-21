package typings.reactDates

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.reactDates.mod.DayPickerSingleDateControllerShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsDayPickerSingleDateControllerMod extends Shortcut {
  
  @JSImport("react-dates/lib/components/DayPickerSingleDateController", JSImport.Default)
  @js.native
  val default: ComponentClass[DayPickerSingleDateControllerShape, ComponentState] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("react-dates/lib/components/DayPickerSingleDateController", JSImport.Default)
  @js.native
  open class defaultCls protected () extends Component[DayPickerSingleDateControllerShape, ComponentState, Any] {
    def this(props: DayPickerSingleDateControllerShape) = this()
    def this(props: DayPickerSingleDateControllerShape, context: Any) = this()
  }
  
  type _To = ComponentClass[DayPickerSingleDateControllerShape, ComponentState]
  
  /* This means you don't have to write `default`, but can instead just say `componentsDayPickerSingleDateControllerMod.foo` */
  override def _to: ComponentClass[DayPickerSingleDateControllerShape, ComponentState] = default
}
