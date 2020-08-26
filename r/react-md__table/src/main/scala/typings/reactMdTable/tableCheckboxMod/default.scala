package typings.reactMdTable.tableCheckboxMod

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.std.HTMLTableDataCellElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a simple wrapper for the `Checkbox` component that allows you to
  * render a nicely styled `Checkbox` within a `TableCell` element. This will
  * mostly just remove the additional padding applied and default an `aria-label`
  * since you normally don't want a checkbox with a label within a table since
  * it's more for selection.
  */
@JSImport("@react-md/table/types/TableCheckbox", JSImport.Default)
@js.native
object default extends TopLevel[
      ForwardRefExoticComponent[TableCheckboxProps with RefAttributes[HTMLTableDataCellElement]]
    ]

