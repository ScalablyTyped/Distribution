package typings.qlikEngineapi

import typings.qlikEngineapi.EngineAPI.IDataField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonQFields extends js.Object {
  var qFields: js.Array[IDataField]
  var qFormatSpec: String
}

object AnonQFields {
  @scala.inline
  def apply(qFields: js.Array[IDataField], qFormatSpec: String): AnonQFields = {
    val __obj = js.Dynamic.literal(qFields = qFields.asInstanceOf[js.Any], qFormatSpec = qFormatSpec.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonQFields]
  }
}

