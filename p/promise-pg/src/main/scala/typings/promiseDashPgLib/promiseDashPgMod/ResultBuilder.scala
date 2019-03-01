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
    addRow: js.Function1[js.Any, scala.Unit],
    command: java.lang.String,
    fields: js.Array[pgLib.pgMod.FieldDef],
    oid: scala.Double,
    rowCount: scala.Double,
    rows: js.Array[_]
  ): ResultBuilder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addRow")(addRow)
    __obj.updateDynamic("command")(command)
    __obj.updateDynamic("fields")(fields)
    __obj.updateDynamic("oid")(oid)
    __obj.updateDynamic("rowCount")(rowCount)
    __obj.updateDynamic("rows")(rows)
    __obj.asInstanceOf[ResultBuilder]
  }
}

