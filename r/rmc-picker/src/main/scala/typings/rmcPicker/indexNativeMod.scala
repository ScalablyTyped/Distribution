package typings.rmcPicker

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.rmcPicker.anon.ComponentDidUpdate
import typings.rmcPicker.anon.ComponentWillMount
import typings.rmcPicker.pickerMixinMod.IItemProps
import typings.rmcPicker.pickerTypesMod.IPickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rmc-picker/lib/index.native", JSImport.Namespace)
@js.native
object indexNativeMod extends js.Object {
  @js.native
  class Popup protected () extends ComponentWillMount {
    def this(props: js.Any) = this()
  }
  
  @js.native
  class default () extends ComponentDidUpdate {
    def this(props: IPickerProps) = this()
    def this(props: js.UndefOr[scala.Nothing], context: js.Any) = this()
    def this(props: IPickerProps, context: js.Any) = this()
  }
  
  val PopupStyles: js.Any = js.native
  @js.native
  object Popup
    extends Instantiable1[/* props */ js.Any, ComponentWillMount] {
    var defaultProps: js.Any = js.native
  }
  
  @js.native
  object default
    extends Instantiable0[ComponentDidUpdate]
       with Instantiable1[/* props */ IPickerProps, ComponentDidUpdate]
       with Instantiable2[js.UndefOr[/* props */ IPickerProps], /* context */ js.Any, ComponentDidUpdate] {
    def Item(_props: IItemProps): js.Any = js.native
  }
  
}

