package typings.reactDates

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.reactDates.mod.DayPickerRangeControllerShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dayPickerRangeControllerMod extends Shortcut {
  
  @JSImport("react-dates/esm/components/DayPickerRangeController", JSImport.Default)
  @js.native
  val default: ComponentClass[DayPickerRangeControllerShape, ComponentState] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("react-dates/esm/components/DayPickerRangeController", JSImport.Default)
  @js.native
  open class defaultCls protected () extends Component[DayPickerRangeControllerShape, ComponentState, Any] {
    def this(props: DayPickerRangeControllerShape) = this()
    def this(props: DayPickerRangeControllerShape, context: Any) = this()
  }
  
  type _To = ComponentClass[DayPickerRangeControllerShape, ComponentState]
  
  /* This means you don't have to write `default`, but can instead just say `dayPickerRangeControllerMod.foo` */
  override def _to: ComponentClass[DayPickerRangeControllerShape, ComponentState] = default
}
