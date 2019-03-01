package typings
package slonikLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Command[T] extends js.Object {
  var command: slonikLib.slonikLibStrings.DELETE | slonikLib.slonikLibStrings.INSERT | slonikLib.slonikLibStrings.SELECT | slonikLib.slonikLibStrings.UPDATE
  var fields: js.Array[slonikLib.slonikMod.FieldType]
  var notices: js.Array[slonikLib.slonikMod.NoticeType]
  var oid: scala.Double | scala.Null
  var rowAsArray: scala.Boolean
  var rowCount: scala.Double
  var rows: js.Array[T]
}

object Anon_Command {
  @scala.inline
  def apply[T](
    command: slonikLib.slonikLibStrings.DELETE | slonikLib.slonikLibStrings.INSERT | slonikLib.slonikLibStrings.SELECT | slonikLib.slonikLibStrings.UPDATE,
    fields: js.Array[slonikLib.slonikMod.FieldType],
    notices: js.Array[slonikLib.slonikMod.NoticeType],
    rowAsArray: scala.Boolean,
    rowCount: scala.Double,
    rows: js.Array[T],
    oid: scala.Int | scala.Double = null
  ): Anon_Command[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("command")(command.asInstanceOf[js.Any])
    __obj.updateDynamic("fields")(fields)
    __obj.updateDynamic("notices")(notices)
    __obj.updateDynamic("rowAsArray")(rowAsArray)
    __obj.updateDynamic("rowCount")(rowCount)
    __obj.updateDynamic("rows")(rows)
    if (oid != null) __obj.updateDynamic("oid")(oid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Command[T]]
  }
}

