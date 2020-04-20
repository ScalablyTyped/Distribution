package typings.qlikEngineapi

import typings.qlikEngineapi.EngineAPI.IFieldValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonQFieldValues extends js.Object {
  var qFieldValues: js.Array[IFieldValue]
}

object AnonQFieldValues {
  @scala.inline
  def apply(qFieldValues: js.Array[IFieldValue]): AnonQFieldValues = {
    val __obj = js.Dynamic.literal(qFieldValues = qFieldValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonQFieldValues]
  }
}

