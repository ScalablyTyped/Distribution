package typings
package simplDashSchemaLib.simplDashSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimpleSchemaValidationContextStatic extends js.Object {
  def addInvalidKeys(errors: js.Array[SimpleSchemaError]): scala.Unit = js.native
  def getErrorObject(): js.Any = js.native
  def invalidKeys(): js.Array[SimpleSchemaValidationContextStaticKeys] = js.native
  def isValid(): scala.Boolean = js.native
  def keyErrorMessage(name: js.Any): java.lang.String = js.native
  def keyIsInvalid(name: js.Any): scala.Boolean = js.native
  def resetValidation(): scala.Unit = js.native
  def validate(obj: js.Any): scala.Boolean = js.native
  def validate(obj: js.Any, options: ValidationOption): scala.Boolean = js.native
  def validateOne(doc: js.Any, keyName: java.lang.String): scala.Boolean = js.native
  def validateOne(doc: js.Any, keyName: java.lang.String, options: ValidationOption): scala.Boolean = js.native
}

