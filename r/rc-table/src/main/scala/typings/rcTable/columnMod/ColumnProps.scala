package typings.rcTable.columnMod

import typings.rcTable.interfaceMod.ColumnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnProps[RecordType] extends ColumnType[RecordType] {
  var children: js.UndefOr[Null] = js.native
}

object ColumnProps {
  @scala.inline
  def apply[RecordType](): ColumnProps[RecordType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnProps[RecordType]]
  }
}

