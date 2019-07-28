package typings.simplDashSchema.simplDashSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleSchemaError extends js.Object {
  var name: String
  var `type`: String
}

object SimpleSchemaError {
  @scala.inline
  def apply(name: String, `type`: String): SimpleSchemaError = {
    val __obj = js.Dynamic.literal(name = name)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SimpleSchemaError]
  }
}

