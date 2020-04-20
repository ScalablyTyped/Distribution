package typings.qlikEngineapi

import typings.qlikEngineapi.EngineAPI.INxAxisData
import typings.qlikEngineapi.EngineAPI.INxDataPage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonQDataPages extends js.Object {
  var qAxisData: js.Array[INxAxisData]
  var qDataPages: INxDataPage
}

object AnonQDataPages {
  @scala.inline
  def apply(qAxisData: js.Array[INxAxisData], qDataPages: INxDataPage): AnonQDataPages = {
    val __obj = js.Dynamic.literal(qAxisData = qAxisData.asInstanceOf[js.Any], qDataPages = qDataPages.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonQDataPages]
  }
}

