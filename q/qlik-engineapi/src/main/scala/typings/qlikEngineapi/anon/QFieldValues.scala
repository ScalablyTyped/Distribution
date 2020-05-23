package typings.qlikEngineapi.anon

import typings.qlikEngineapi.EngineAPI.IFieldValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QFieldValues extends js.Object {
  var qFieldValues: js.Array[IFieldValue]
}

object QFieldValues {
  @scala.inline
  def apply(qFieldValues: js.Array[IFieldValue]): QFieldValues = {
    val __obj = js.Dynamic.literal(qFieldValues = qFieldValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[QFieldValues]
  }
}

