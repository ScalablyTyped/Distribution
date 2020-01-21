package typings.qlikEngineapi

import typings.qlikEngineapi.EngineAPI.INxAxisData
import typings.qlikEngineapi.EngineAPI.INxDataPage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonQAxisData extends js.Object {
  var qAxisData: js.Array[INxAxisData]
  var qDataPages: js.Array[INxDataPage]
}

object AnonQAxisData {
  @scala.inline
  def apply(qAxisData: js.Array[INxAxisData], qDataPages: js.Array[INxDataPage]): AnonQAxisData = {
    val __obj = js.Dynamic.literal(qAxisData = qAxisData.asInstanceOf[js.Any], qDataPages = qDataPages.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonQAxisData]
  }
}

