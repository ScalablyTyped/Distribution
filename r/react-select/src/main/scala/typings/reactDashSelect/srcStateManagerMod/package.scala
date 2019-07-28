package typings.reactDashSelect

import typings.reactDashSelect.reactDashSelectStrings.inputValue
import typings.reactDashSelect.reactDashSelectStrings.menuIsOpen
import typings.reactDashSelect.reactDashSelectStrings.onChange
import typings.reactDashSelect.reactDashSelectStrings.onInputChange
import typings.reactDashSelect.reactDashSelectStrings.onMenuClose
import typings.reactDashSelect.reactDashSelectStrings.onMenuOpen
import typings.reactDashSelect.reactDashSelectStrings.value
import typings.std.Exclude
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object srcStateManagerMod {
  type GetOptionType[T] = js.Any
  type StateProps[T /* <: typings.reactDashSelect.srcSelectMod.Props[_] */] = Pick[
    T, 
    Exclude[
      String, 
      inputValue | value | menuIsOpen | onChange | onInputChange | onMenuClose | onMenuOpen
    ]
  ]
}
