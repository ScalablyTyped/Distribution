package typings.sequelize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSchemaTableNameString extends js.Object {
  var schema: String
  var tableName: String
}

object AnonSchemaTableNameString {
  @scala.inline
  def apply(schema: String, tableName: String): AnonSchemaTableNameString = {
    val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSchemaTableNameString]
  }
}

