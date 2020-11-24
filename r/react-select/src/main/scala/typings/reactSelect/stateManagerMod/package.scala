package typings.reactSelect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object stateManagerMod {
  
  type GetOptionType[T] = js.Any
  
  type StateProps[T /* <: typings.reactSelect.selectMod.Props[_] */] = typings.std.Pick[
    T, 
    typings.std.Exclude[
      /* keyof T */ java.lang.String, 
      typings.reactSelect.reactSelectStrings.inputValue | typings.reactSelect.reactSelectStrings.value | typings.reactSelect.reactSelectStrings.menuIsOpen | typings.reactSelect.reactSelectStrings.onChange | typings.reactSelect.reactSelectStrings.onInputChange | typings.reactSelect.reactSelectStrings.onMenuClose | typings.reactSelect.reactSelectStrings.onMenuOpen
    ]
  ]
}
