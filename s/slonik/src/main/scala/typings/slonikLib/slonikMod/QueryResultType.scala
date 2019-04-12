package typings
package slonikLib.slonikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryResultType[T] extends js.Object {
  var command: slonikLib.slonikLibStrings.DELETE | slonikLib.slonikLibStrings.INSERT | slonikLib.slonikLibStrings.SELECT | slonikLib.slonikLibStrings.UPDATE
  var fields: js.Array[FieldType]
  var notices: js.Array[NoticeType]
  var oid: scala.Double | scala.Null
  var rowAsArray: scala.Boolean
  var rowCount: scala.Double
  var rows: js.Array[T]
}

object QueryResultType {
  @scala.inline
  def apply[T](
    command: slonikLib.slonikLibStrings.DELETE | slonikLib.slonikLibStrings.INSERT | slonikLib.slonikLibStrings.SELECT | slonikLib.slonikLibStrings.UPDATE,
    fields: js.Array[FieldType],
    notices: js.Array[NoticeType],
    rowAsArray: scala.Boolean,
    rowCount: scala.Double,
    rows: js.Array[T],
    oid: scala.Int | scala.Double = null
  ): QueryResultType[T] = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], fields = fields, notices = notices, rowAsArray = rowAsArray, rowCount = rowCount, rows = rows)
    if (oid != null) __obj.updateDynamic("oid")(oid.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryResultType[T]]
  }
}

