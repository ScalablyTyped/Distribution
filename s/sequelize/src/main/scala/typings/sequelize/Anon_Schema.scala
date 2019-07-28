package typings.sequelize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Schema extends js.Object {
  var schema: js.UndefOr[String] = js.undefined
  var tableName: js.UndefOr[String] = js.undefined
}

object Anon_Schema {
  @scala.inline
  def apply(schema: String = null, tableName: String = null): Anon_Schema = {
    val __obj = js.Dynamic.literal()
    if (schema != null) __obj.updateDynamic("schema")(schema)
    if (tableName != null) __obj.updateDynamic("tableName")(tableName)
    __obj.asInstanceOf[Anon_Schema]
  }
}

