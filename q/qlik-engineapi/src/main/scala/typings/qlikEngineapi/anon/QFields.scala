package typings.qlikEngineapi.anon

import typings.qlikEngineapi.EngineAPI.IDataField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QFields extends js.Object {
  var qFields: js.Array[IDataField]
  var qFormatSpec: String
}

object QFields {
  @scala.inline
  def apply(qFields: js.Array[IDataField], qFormatSpec: String): QFields = {
    val __obj = js.Dynamic.literal(qFields = qFields.asInstanceOf[js.Any], qFormatSpec = qFormatSpec.asInstanceOf[js.Any])
    __obj.asInstanceOf[QFields]
  }
}

