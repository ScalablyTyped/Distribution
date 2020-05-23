package typings.sequelize.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableName extends js.Object {
  var schema: js.UndefOr[String] = js.undefined
  var tableName: js.UndefOr[String] = js.undefined
}

object TableName {
  @scala.inline
  def apply(schema: String = null, tableName: String = null): TableName = {
    val __obj = js.Dynamic.literal()
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    if (tableName != null) __obj.updateDynamic("tableName")(tableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableName]
  }
}

