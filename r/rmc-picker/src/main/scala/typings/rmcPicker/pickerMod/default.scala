package typings.rmcPicker.pickerMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.rmcPicker.anon.ComponentDidUpdate
import typings.rmcPicker.pickerMixinMod.IItemProps
import typings.rmcPicker.pickerTypesMod.IPickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rmc-picker/lib/Picker", JSImport.Default)
@js.native
class default () extends ComponentDidUpdate {
  def this(props: IPickerProps) = this()
  def this(props: IPickerProps, context: js.Any) = this()
}

@JSImport("rmc-picker/lib/Picker", JSImport.Default)
@js.native
object default
  extends Instantiable0[ComponentDidUpdate]
     with Instantiable1[/* props */ IPickerProps, ComponentDidUpdate]
     with Instantiable2[/* props */ IPickerProps, /* context */ js.Any, ComponentDidUpdate] {
  def Item(_props: IItemProps): js.Any = js.native
}

