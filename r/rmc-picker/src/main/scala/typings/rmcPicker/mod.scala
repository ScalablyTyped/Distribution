package typings.rmcPicker

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.rmcPicker.pickerMixinMod.IItemProps
import typings.rmcPicker.pickerTypesMod.IPickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rmc-picker", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class default () extends AnonCallBackCallback {
    def this(props: IPickerProps) = this()
    def this(props: IPickerProps, context: js.Any) = this()
  }
  
  @js.native
  object default
    extends Instantiable0[AnonCallBackCallback]
       with Instantiable1[/* props */ IPickerProps, AnonCallBackCallback]
       with Instantiable2[/* props */ IPickerProps, /* context */ js.Any, AnonCallBackCallback] {
    def Item(_props: IItemProps): js.Any = js.native
  }
  
}

