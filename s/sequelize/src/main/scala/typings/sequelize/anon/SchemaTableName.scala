package typings.sequelize.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchemaTableName extends js.Object {
  var schema: String
  var tableName: String
}

object SchemaTableName {
  @scala.inline
  def apply(schema: String, tableName: String): SchemaTableName = {
    val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTableName]
  }
}

