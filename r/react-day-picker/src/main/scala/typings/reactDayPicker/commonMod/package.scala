package typings.reactDayPicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object commonMod {
  type FunctionModifier = js.Function1[/* date */ typings.std.Date, scala.Boolean]
  /* Rewritten from type alias, can be one of: 
    - typings.std.Date
    - typings.reactDayPicker.commonMod.RangeModifier
    - typings.reactDayPicker.commonMod.BeforeModifier
    - typings.reactDayPicker.commonMod.AfterModifier
    - typings.reactDayPicker.commonMod.BeforeAfterModifier
    - typings.reactDayPicker.commonMod.DaysOfWeekModifier
    - typings.reactDayPicker.commonMod.FunctionModifier
    - `js.undefined`
  */
  type Modifier = js.UndefOr[
    typings.reactDayPicker.commonMod._Modifier | typings.std.Date | typings.reactDayPicker.commonMod.FunctionModifier
  ]
}
