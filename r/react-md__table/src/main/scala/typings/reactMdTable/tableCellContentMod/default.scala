package typings.reactMdTable.tableCellContentMod

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is mostly an internal component since it is automatically used within
  * the `TableCell` component but this will conditionally wrap the `children`
  * within an `UnstyledButton` to make a clickable cell. This is really to help
  * with sort behavior within headers.
  */
@JSImport("@react-md/table/types/TableCellContent", JSImport.Default)
@js.native
object default extends TopLevel[
      ForwardRefExoticComponent[TableCellContentProps with RefAttributes[HTMLButtonElement]]
    ]

