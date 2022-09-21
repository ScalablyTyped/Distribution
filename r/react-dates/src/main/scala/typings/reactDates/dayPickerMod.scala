package typings.reactDates

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.reactDates.mod.DayPickerShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dayPickerMod extends Shortcut {
  
  @JSImport("react-dates/esm/components/DayPicker", JSImport.Default)
  @js.native
  val default: ComponentClass[DayPickerShape, ComponentState] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("react-dates/esm/components/DayPicker", JSImport.Default)
  @js.native
  open class defaultCls protected () extends Component[DayPickerShape, ComponentState, Any] {
    def this(props: DayPickerShape) = this()
    def this(props: DayPickerShape, context: Any) = this()
  }
  
  type _To = ComponentClass[DayPickerShape, ComponentState]
  
  /* This means you don't have to write `default`, but can instead just say `dayPickerMod.foo` */
  override def _to: ComponentClass[DayPickerShape, ComponentState] = default
}
