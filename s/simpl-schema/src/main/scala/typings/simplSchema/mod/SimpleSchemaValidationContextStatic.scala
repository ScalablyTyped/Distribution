package typings.simplSchema.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimpleSchemaValidationContextStatic extends js.Object {
  def addInvalidKeys(errors: js.Array[SimpleSchemaError]): Unit = js.native
  def getErrorObject(): js.Any = js.native
  def invalidKeys(): js.Array[SimpleSchemaValidationContextStaticKeys] = js.native
  def isValid(): Boolean = js.native
  def keyErrorMessage(name: js.Any): String = js.native
  def keyIsInvalid(name: js.Any): Boolean = js.native
  def resetValidation(): Unit = js.native
  def validate(obj: js.Any): Boolean = js.native
  def validate(obj: js.Any, options: ValidationOption): Boolean = js.native
  def validateOne(doc: js.Any, keyName: String): Boolean = js.native
  def validateOne(doc: js.Any, keyName: String, options: ValidationOption): Boolean = js.native
}

