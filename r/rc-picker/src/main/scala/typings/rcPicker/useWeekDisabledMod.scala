package typings.rcPicker

import typings.rcPicker.anon.DisabledDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-picker/lib/hooks/useWeekDisabled", JSImport.Namespace)
@js.native
object useWeekDisabledMod extends js.Object {
  def default[DateType](hasDisabledDateLocaleGenerateConfig: DisabledDate[DateType]): js.Array[js.Function1[/* date */ DateType, Boolean]] = js.native
}

