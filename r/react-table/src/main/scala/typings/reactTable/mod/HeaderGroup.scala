package typings.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react-table.react-table.Column<D>, 'id' | 'columns'> ]: react-table.react-table.Column<D>[P]} */ @js.native
trait HeaderGroup[D /* <: js.Object */]
  extends UseTableColumnProps[D]
     with UseTableHeaderGroupProps[D]

