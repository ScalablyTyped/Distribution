package typings.reactDates

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.reactDates.mod.SingleDatePickerShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmComponentsSingleDatePickerMod extends Shortcut {
  
  @JSImport("react-dates/esm/components/SingleDatePicker", JSImport.Default)
  @js.native
  val default: ComponentClass[SingleDatePickerShape, ComponentState] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("react-dates/esm/components/SingleDatePicker", JSImport.Default)
  @js.native
  open class defaultCls protected () extends Component[SingleDatePickerShape, ComponentState, Any] {
    def this(props: SingleDatePickerShape) = this()
    def this(props: SingleDatePickerShape, context: Any) = this()
  }
  
  type _To = ComponentClass[SingleDatePickerShape, ComponentState]
  
  /* This means you don't have to write `default`, but can instead just say `esmComponentsSingleDatePickerMod.foo` */
  override def _to: ComponentClass[SingleDatePickerShape, ComponentState] = default
}
