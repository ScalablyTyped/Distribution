package typings.reactMdTable.tableHeaderMod

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.std.HTMLTableSectionElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates a `<thead>` element with some basic styles. This component will also
  * update the table configuration so that all the `TableCell` children will
  * automatically become `<th>` elements instead of the normal `<td>` as well as
  * disabling the hover effect and line wrapping. The hover effect and
  * line-wrapping can be re-enabled if desired through the `hoverable` and
  * `disableNoWrap` props.
  */
@JSImport("@react-md/table/types/TableHeader", JSImport.Default)
@js.native
object default extends TopLevel[
      ForwardRefExoticComponent[TableHeaderProps with RefAttributes[HTMLTableSectionElement]]
    ]

