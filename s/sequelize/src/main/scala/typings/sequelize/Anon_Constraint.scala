package typings.sequelize

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Constraint extends js.Object {
  var constraint: js.UndefOr[String] = js.undefined
  var fields: js.UndefOr[js.Array[String]] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var parent: js.UndefOr[Error] = js.undefined
  var table: js.UndefOr[String] = js.undefined
}

object Anon_Constraint {
  @scala.inline
  def apply(
    constraint: String = null,
    fields: js.Array[String] = null,
    message: String = null,
    parent: Error = null,
    table: String = null
  ): Anon_Constraint = {
    val __obj = js.Dynamic.literal()
    if (constraint != null) __obj.updateDynamic("constraint")(constraint)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (message != null) __obj.updateDynamic("message")(message)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (table != null) __obj.updateDynamic("table")(table)
    __obj.asInstanceOf[Anon_Constraint]
  }
}

