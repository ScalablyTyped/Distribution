package typings.rcTable.columnGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-table/lib/sugar/ColumnGroup", JSImport.Default)
@js.native
object default extends js.Object {
  /**
    * This is a syntactic sugar for `columns` prop.
    * So HOC will not work on this.
    */
  def apply[RecordType](_underscore: ColumnGroupProps[RecordType]): js.Any = js.native
}

