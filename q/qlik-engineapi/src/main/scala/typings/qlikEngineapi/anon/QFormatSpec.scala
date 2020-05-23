package typings.qlikEngineapi.anon

import typings.qlikEngineapi.EngineAPI.IDataRecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QFormatSpec extends js.Object {
  var qFormatSpec: String
  var qPreview: js.Array[IDataRecord]
}

object QFormatSpec {
  @scala.inline
  def apply(qFormatSpec: String, qPreview: js.Array[IDataRecord]): QFormatSpec = {
    val __obj = js.Dynamic.literal(qFormatSpec = qFormatSpec.asInstanceOf[js.Any], qPreview = qPreview.asInstanceOf[js.Any])
    __obj.asInstanceOf[QFormatSpec]
  }
}

