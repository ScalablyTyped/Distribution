package typings.sequelize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SchemaTableNameString extends js.Object {
  var schema: String
  var tableName: String
}

object Anon_SchemaTableNameString {
  @scala.inline
  def apply(schema: String, tableName: String): Anon_SchemaTableNameString = {
    val __obj = js.Dynamic.literal(schema = schema, tableName = tableName)
  
    __obj.asInstanceOf[Anon_SchemaTableNameString]
  }
}

