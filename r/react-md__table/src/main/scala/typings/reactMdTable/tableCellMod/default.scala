package typings.reactMdTable.tableCellMod

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates a `<th>` or `<td>` cell with sensible styled defaults. You can create
  * a `<th>` element by enabling the `header` prop OR having a `TableCell` as a
  * child of the `TableHeader` component.
  *
  * Note: If you have a checkbox column in the `TableHeader` without any labels,
  * you will need to manually set the `header={false}` prop for that cell since
  * it is invalid to have a `<th>` without any readable content for screen
  * readers.
  */
@JSImport("@react-md/table/types/TableCell", JSImport.Default)
@js.native
object default extends TopLevel[ForwardRefExoticComponent[TableCellProps with RefAttributes[TableCellElement]]]

