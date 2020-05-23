package typings.reactDayPicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object modifiersMod {
  type FunctionModifier = js.Function1[/* date */ typings.std.Date, scala.Boolean]
  /* Rewritten from type alias, can be one of: 
    - typings.std.Date
    - typings.reactDayPicker.modifiersMod.RangeModifier
    - typings.reactDayPicker.modifiersMod.BeforeModifier
    - typings.reactDayPicker.modifiersMod.AfterModifier
    - typings.reactDayPicker.modifiersMod.BeforeAfterModifier
    - typings.reactDayPicker.modifiersMod.DaysOfWeekModifier
    - typings.reactDayPicker.modifiersMod.FunctionModifier
    - js.UndefOr[scala.Nothing]
  */
  type Modifier = js.UndefOr[
    typings.reactDayPicker.modifiersMod._Modifier | typings.std.Date | typings.reactDayPicker.modifiersMod.FunctionModifier
  ]
}
