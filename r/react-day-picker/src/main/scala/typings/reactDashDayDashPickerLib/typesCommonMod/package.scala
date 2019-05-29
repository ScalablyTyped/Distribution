package typings
package reactDashDayDashPickerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesCommonMod {
  type FunctionModifier = js.Function1[/* date */ stdLib.Date, scala.Boolean]
  /* Rewritten from type alias, can be one of: 
    - stdLib.Date
    - RangeModifier
    - BeforeModifier
    - AfterModifier
    - BeforeAfterModifier
    - DaysOfWeekModifier
    - FunctionModifier
    - `js.undefined`
    - scala.Nothing
    - scala.Null
  */
  type Modifier = js.UndefOr[_Modifier | stdLib.Date | FunctionModifier | scala.Null]
}
