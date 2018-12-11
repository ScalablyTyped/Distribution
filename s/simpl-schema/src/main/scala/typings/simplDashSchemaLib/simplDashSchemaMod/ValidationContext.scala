package typings
package simplDashSchemaLib.simplDashSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidationContext extends SimpleSchemaValidationContextStatic {
  def addValidationErrors(errors: js.Any): scala.Unit = js.native
  def clean(args: js.Any*): js.Any = js.native
  def getErrorForKey(key: js.Any, args: js.Any*): js.Any = js.native
  def reset(): scala.Unit = js.native
  def setValidationErrors(errors: js.Any): scala.Unit = js.native
  def validationErrors(): js.Any = js.native
}

