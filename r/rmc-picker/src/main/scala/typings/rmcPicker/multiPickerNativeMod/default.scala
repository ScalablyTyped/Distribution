package typings.rmcPicker.multiPickerNativeMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.rmcPicker.AnonCallBack
import typings.rmcPicker.AnonOnValueChange
import typings.rmcPicker.multiPickerPropsMod.IMultiPickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rmc-picker/lib/MultiPicker.native", JSImport.Default)
@js.native
class default () extends AnonCallBack {
  def this(props: IMultiPickerProps) = this()
  def this(props: IMultiPickerProps, context: js.Any) = this()
}

@JSImport("rmc-picker/lib/MultiPicker.native", JSImport.Default)
@js.native
object default
  extends Instantiable0[AnonCallBack]
     with Instantiable1[/* props */ IMultiPickerProps, AnonCallBack]
     with Instantiable2[/* props */ IMultiPickerProps, /* context */ js.Any, AnonCallBack] {
  var defaultProps: AnonOnValueChange = js.native
}

