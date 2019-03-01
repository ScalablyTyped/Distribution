package typings
package simplDashSchemaLib.simplDashSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleSchemaValidationContextStaticKeys extends js.Object {
  var name: java.lang.String
  var `type`: java.lang.String
  var value: js.UndefOr[js.Any] = js.undefined
}

object SimpleSchemaValidationContextStaticKeys {
  @scala.inline
  def apply(name: java.lang.String, `type`: java.lang.String, value: js.Any = null): SimpleSchemaValidationContextStaticKeys = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("name")(name)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[SimpleSchemaValidationContextStaticKeys]
  }
}

