package typings
package simplDashSchemaLib.simplDashSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleSchemaValidationError
  extends /* key */ org.scalablytyped.runtime.StringDictionary[scala.Double | java.lang.String] {
  var `type`: java.lang.String
}

object SimpleSchemaValidationError {
  @scala.inline
  def apply(
    `type`: java.lang.String,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[scala.Double | java.lang.String] = null
  ): SimpleSchemaValidationError = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[SimpleSchemaValidationError]
  }
}

