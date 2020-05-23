package typings.qlikEngineapi.anon

import typings.qlikEngineapi.EngineAPI.INxAxisData
import typings.qlikEngineapi.EngineAPI.INxDataPage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QAxisData extends js.Object {
  var qAxisData: js.Array[INxAxisData]
  var qDataPages: js.Array[INxDataPage]
}

object QAxisData {
  @scala.inline
  def apply(qAxisData: js.Array[INxAxisData], qDataPages: js.Array[INxDataPage]): QAxisData = {
    val __obj = js.Dynamic.literal(qAxisData = qAxisData.asInstanceOf[js.Any], qDataPages = qDataPages.asInstanceOf[js.Any])
    __obj.asInstanceOf[QAxisData]
  }
}

