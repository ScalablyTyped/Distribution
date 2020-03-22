package typings.rcFieldForm.interfaceMod

import typings.rcFieldForm.AnonErrors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidateErrorEntity extends js.Object {
  var errorFields: js.Array[AnonErrors]
  var outOfDate: Boolean
  var values: Store
}

object ValidateErrorEntity {
  @scala.inline
  def apply(errorFields: js.Array[AnonErrors], outOfDate: Boolean, values: Store): ValidateErrorEntity = {
    val __obj = js.Dynamic.literal(errorFields = errorFields.asInstanceOf[js.Any], outOfDate = outOfDate.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ValidateErrorEntity]
  }
}

