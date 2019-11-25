package typings.qlikDashEngineapi

import typings.qlikDashEngineapi.EngineAPI.IDataField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_QFields extends js.Object {
  var qFields: js.Array[IDataField]
  var qFormatSpec: String
}

object Anon_QFields {
  @scala.inline
  def apply(qFields: js.Array[IDataField], qFormatSpec: String): Anon_QFields = {
    val __obj = js.Dynamic.literal(qFields = qFields.asInstanceOf[js.Any], qFormatSpec = qFormatSpec.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_QFields]
  }
}

