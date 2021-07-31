package typings.rcPicker

import typings.rcPicker.anon.DefaultDates
import typings.rcPicker.rcPickerNumbers.`0`
import typings.rcPicker.rcPickerNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useRangeViewDatesMod {
  
  @JSImport("rc-picker/es/hooks/useRangeViewDates", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[DateType](hasValuesPickerDefaultDatesGenerateConfig: DefaultDates[DateType]): js.Tuple2[
    js.Function1[/* activePickerIndex */ `0` | `1`, DateType], 
    js.Function2[/* viewDate */ DateType | Null, /* index */ `0` | `1`, Unit]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasValuesPickerDefaultDatesGenerateConfig.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[
    js.Function1[/* activePickerIndex */ `0` | `1`, DateType], 
    js.Function2[/* viewDate */ DateType | Null, /* index */ `0` | `1`, Unit]
  ]]
}
