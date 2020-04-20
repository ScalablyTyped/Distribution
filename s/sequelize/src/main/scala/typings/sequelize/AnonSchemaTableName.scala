package typings.sequelize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSchemaTableName extends js.Object {
  var schema: String
  var tableName: String
}

object AnonSchemaTableName {
  @scala.inline
  def apply(schema: String, tableName: String): AnonSchemaTableName = {
    val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSchemaTableName]
  }
}

