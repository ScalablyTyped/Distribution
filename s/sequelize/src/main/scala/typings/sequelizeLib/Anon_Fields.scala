package typings
package sequelizeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fields extends js.Object {
  var fields: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var index: js.UndefOr[java.lang.String] = js.undefined
  var message: js.UndefOr[java.lang.String] = js.undefined
  var parent: js.UndefOr[nodeLib.Error] = js.undefined
  var table: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Fields {
  @scala.inline
  def apply(
    fields: js.Array[java.lang.String] = null,
    index: java.lang.String = null,
    message: java.lang.String = null,
    parent: nodeLib.Error = null,
    table: java.lang.String = null
  ): Anon_Fields = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (index != null) __obj.updateDynamic("index")(index)
    if (message != null) __obj.updateDynamic("message")(message)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (table != null) __obj.updateDynamic("table")(table)
    __obj.asInstanceOf[Anon_Fields]
  }
}

