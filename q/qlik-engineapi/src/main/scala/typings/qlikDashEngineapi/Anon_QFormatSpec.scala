package typings.qlikDashEngineapi

import typings.qlikDashEngineapi.EngineAPI.IDataRecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_QFormatSpec extends js.Object {
  var qFormatSpec: String
  var qPreview: js.Array[IDataRecord]
}

object Anon_QFormatSpec {
  @scala.inline
  def apply(qFormatSpec: String, qPreview: js.Array[IDataRecord]): Anon_QFormatSpec = {
    val __obj = js.Dynamic.literal(qFormatSpec = qFormatSpec, qPreview = qPreview)
  
    __obj.asInstanceOf[Anon_QFormatSpec]
  }
}

