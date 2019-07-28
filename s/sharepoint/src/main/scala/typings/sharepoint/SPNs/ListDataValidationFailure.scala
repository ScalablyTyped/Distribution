package typings.sharepoint.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.ListDataValidationFailure")
@js.native
class ListDataValidationFailure () extends ClientValueObject {
  def get_displayName(): String = js.native
  def get_message(): String = js.native
  def get_name(): String = js.native
  def get_reason(): ListDataValidationFailureReason = js.native
  def get_validationType(): ListDataValidationType = js.native
}

