package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.ListDataValidationFailure")
@js.native
class ListDataValidationFailure () extends ClientValueObject {
  def get_displayName(): java.lang.String = js.native
  def get_message(): java.lang.String = js.native
  def get_name(): java.lang.String = js.native
  def get_reason(): ListDataValidationFailureReason = js.native
  def get_validationType(): ListDataValidationType = js.native
}

