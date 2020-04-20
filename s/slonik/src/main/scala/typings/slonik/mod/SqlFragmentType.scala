package typings.slonik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SqlFragmentType extends js.Object {
  var parameters: js.Array[PrimitiveValueExpressionType]
  var sql: String
}

object SqlFragmentType {
  @scala.inline
  def apply(parameters: js.Array[PrimitiveValueExpressionType], sql: String): SqlFragmentType = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], sql = sql.asInstanceOf[js.Any])
    __obj.asInstanceOf[SqlFragmentType]
  }
}

