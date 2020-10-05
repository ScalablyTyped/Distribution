package typings.rcPicker

import typings.rcPicker.anon.Disabled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-picker/es/hooks/useRangeDisabled", JSImport.Namespace)
@js.native
object useRangeDisabledMod extends js.Object {
  def default[DateType](
    hasPickerLocaleSelectedValueDisabledDateDisabledGenerateConfig: Disabled[DateType],
    disabledStart: Boolean,
    disabledEnd: Boolean
  ): js.Array[js.Function1[/* date */ DateType, Boolean]] = js.native
}

