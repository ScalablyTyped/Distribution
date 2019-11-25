package typings.schemaDashUtils.schemaDashUtilsMod.SchemaUtils

import typings.ajv.ajvMod.ErrorObject
import typings.schemaDashUtils.schemaDashUtilsMod.PostFormatter
import typings.schemaDashUtils.schemaDashUtilsMod.Schema
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationError extends Error {
  var baseDataPath: String
  var errors: js.Array[ErrorObject]
  var headerName: String
  var postFormatter: PostFormatter | Null
  var schema: Schema
}

object ValidationError {
  @scala.inline
  def apply(
    baseDataPath: String,
    errors: js.Array[ErrorObject],
    headerName: String,
    message: String,
    name: String,
    schema: Schema,
    postFormatter: (/* formattedError */ String, /* error */ ErrorObject) => String = null,
    stack: String = null
  ): ValidationError = {
    val __obj = js.Dynamic.literal(baseDataPath = baseDataPath.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], headerName = headerName.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    if (postFormatter != null) __obj.updateDynamic("postFormatter")(js.Any.fromFunction2(postFormatter))
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationError]
  }
}

