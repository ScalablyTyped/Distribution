package typings
package reactDashDayDashPickerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesCommonMod {
  type FunctionModifier = js.Function1[/* date */ stdLib.Date, scala.Boolean]
  type Modifier = js.UndefOr[
    stdLib.Date | RangeModifier | BeforeModifier | AfterModifier | BeforeAfterModifier | DaysOfWeekModifier | FunctionModifier | scala.Null
  ]
}
