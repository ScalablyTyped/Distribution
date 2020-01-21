package typings.rcTable.colGroupMod

import typings.rcTable.interfaceMod.ColumnType
import typings.rcTable.interfaceMod.DefaultValueType
import typings.rcTable.interfaceMod.FixedType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColGroupProps extends js.Object {
  /** FIXME: Not used. Should confirm why this prop here */
  var columns: js.UndefOr[js.Array[ColumnType[DefaultValueType]]] = js.undefined
  var fixed: FixedType
}

object ColGroupProps {
  @scala.inline
  def apply(fixed: FixedType, columns: js.Array[ColumnType[DefaultValueType]] = null): ColGroupProps = {
    val __obj = js.Dynamic.literal(fixed = fixed.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColGroupProps]
  }
}

