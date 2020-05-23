package typings.rcPicker

import typings.rcPicker.anon.DefaultDates
import typings.rcPicker.rcPickerNumbers.`0`
import typings.rcPicker.rcPickerNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-picker/lib/hooks/useRangeViewDates", JSImport.Namespace)
@js.native
object useRangeViewDatesMod extends js.Object {
  def default[DateType](hasValuesPickerDefaultDatesGenerateConfig: DefaultDates[DateType]): js.Tuple2[
    js.Function1[/* activePickerIndex */ `0` | `1`, DateType], 
    js.Function2[/* viewDate */ DateType | Null, /* index */ `0` | `1`, Unit]
  ] = js.native
}

