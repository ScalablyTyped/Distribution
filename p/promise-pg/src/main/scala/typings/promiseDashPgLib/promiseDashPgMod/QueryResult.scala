package typings
package promiseDashPgLib.promiseDashPgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryResult
  extends pgLib.pgMod.QueryResult

object QueryResult {
  @scala.inline
  def apply(
    command: java.lang.String,
    fields: js.Array[pgLib.pgMod.FieldDef],
    oid: scala.Double,
    rowCount: scala.Double,
    rows: js.Array[_]
  ): QueryResult = {
    val __obj = js.Dynamic.literal(command = command, fields = fields, oid = oid, rowCount = rowCount, rows = rows)
  
    __obj.asInstanceOf[QueryResult]
  }
}

