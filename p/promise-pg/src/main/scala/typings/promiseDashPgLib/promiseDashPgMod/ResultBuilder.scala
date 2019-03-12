package typings
package promiseDashPgLib.promiseDashPgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultBuilder
  extends pgLib.pgMod.ResultBuilder

object ResultBuilder {
  @scala.inline
  def apply(
    addRow: js.Any => scala.Unit,
    command: java.lang.String,
    fields: js.Array[pgLib.pgMod.FieldDef],
    oid: scala.Double,
    rowCount: scala.Double,
    rows: js.Array[_]
  ): ResultBuilder = {
    val __obj = js.Dynamic.literal(addRow = js.Any.fromFunction1(addRow), command = command, fields = fields, oid = oid, rowCount = rowCount, rows = rows)
  
    __obj.asInstanceOf[ResultBuilder]
  }
}

