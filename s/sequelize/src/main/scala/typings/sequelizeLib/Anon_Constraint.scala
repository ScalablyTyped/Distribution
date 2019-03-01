package typings
package sequelizeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Constraint extends js.Object {
  var constraint: js.UndefOr[java.lang.String] = js.undefined
  var fields: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var message: js.UndefOr[java.lang.String] = js.undefined
  var parent: js.UndefOr[nodeLib.Error] = js.undefined
  var table: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Constraint {
  @scala.inline
  def apply(
    constraint: java.lang.String = null,
    fields: js.Array[java.lang.String] = null,
    message: java.lang.String = null,
    parent: nodeLib.Error = null,
    table: java.lang.String = null
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

