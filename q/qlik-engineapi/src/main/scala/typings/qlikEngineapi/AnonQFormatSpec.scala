package typings.qlikEngineapi

import typings.qlikEngineapi.EngineAPI.IDataRecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonQFormatSpec extends js.Object {
  var qFormatSpec: String
  var qPreview: js.Array[IDataRecord]
}

object AnonQFormatSpec {
  @scala.inline
  def apply(qFormatSpec: String, qPreview: js.Array[IDataRecord]): AnonQFormatSpec = {
    val __obj = js.Dynamic.literal(qFormatSpec = qFormatSpec.asInstanceOf[js.Any], qPreview = qPreview.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonQFormatSpec]
  }
}

