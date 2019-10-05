package typings.rmcDashPicker

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.rmcDashPicker.esPickerMixinMod.IItemProps
import typings.rmcDashPicker.esPickerTypesMod.IPickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rmc-picker/es", JSImport.Namespace)
@js.native
object esMod extends js.Object {
  @js.native
  class default () extends Anon_CallBack {
    def this(props: IPickerProps) = this()
    def this(props: IPickerProps, context: js.Any) = this()
  }
  
  @js.native
  object default
    extends Instantiable0[Anon_CallBack]
       with Instantiable1[/* props */ IPickerProps, Anon_CallBack]
       with Instantiable2[/* props */ IPickerProps, /* context */ js.Any, Anon_CallBack] {
    def Item(_props: IItemProps): js.Any = js.native
  }
  
}

