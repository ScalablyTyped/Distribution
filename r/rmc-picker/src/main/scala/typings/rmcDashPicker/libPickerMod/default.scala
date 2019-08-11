package typings.rmcDashPicker.libPickerMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.rmcDashPicker.Anon_CallBackCallback
import typings.rmcDashPicker.libPickerMixinMod.IItemProps
import typings.rmcDashPicker.libPickerTypesMod.IPickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rmc-picker/lib/Picker", JSImport.Default)
@js.native
class default () extends Anon_CallBackCallback {
  def this(props: IPickerProps) = this()
  def this(props: IPickerProps, context: js.Any) = this()
}

@JSImport("rmc-picker/lib/Picker", JSImport.Default)
@js.native
object default
  extends Instantiable0[Anon_CallBackCallback]
     with Instantiable1[/* props */ IPickerProps, Anon_CallBackCallback]
     with Instantiable2[/* props */ IPickerProps, /* context */ js.Any, Anon_CallBackCallback] {
  def Item(_props: IItemProps): js.Any = js.native
}

