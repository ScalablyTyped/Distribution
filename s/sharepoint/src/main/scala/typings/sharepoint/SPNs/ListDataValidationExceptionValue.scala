package typings.sharepoint.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.ListDataValidationExceptionValue")
@js.native
class ListDataValidationExceptionValue () extends ClientValueObject {
  def get_fieldFailures(): js.Array[ListDataValidationFailure] = js.native
  def get_itemFailure(): ListDataValidationFailure = js.native
}

