package typings.sequelize.anon

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Constraint extends js.Object {
  var constraint: js.UndefOr[String] = js.undefined
  var fields: js.UndefOr[js.Array[String]] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var parent: js.UndefOr[Error] = js.undefined
  var table: js.UndefOr[String] = js.undefined
}

object Constraint {
  @scala.inline
  def apply(
    constraint: String = null,
    fields: js.Array[String] = null,
    message: String = null,
    parent: Error = null,
    table: String = null
  ): Constraint = {
    val __obj = js.Dynamic.literal()
    if (constraint != null) __obj.updateDynamic("constraint")(constraint.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (table != null) __obj.updateDynamic("table")(table.asInstanceOf[js.Any])
    __obj.asInstanceOf[Constraint]
  }
}

