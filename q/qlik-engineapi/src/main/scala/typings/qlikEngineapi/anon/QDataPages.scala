package typings.qlikEngineapi.anon

import typings.qlikEngineapi.EngineAPI.INxAxisData
import typings.qlikEngineapi.EngineAPI.INxDataPage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QDataPages extends js.Object {
  var qAxisData: js.Array[INxAxisData]
  var qDataPages: INxDataPage
}

object QDataPages {
  @scala.inline
  def apply(qAxisData: js.Array[INxAxisData], qDataPages: INxDataPage): QDataPages = {
    val __obj = js.Dynamic.literal(qAxisData = qAxisData.asInstanceOf[js.Any], qDataPages = qDataPages.asInstanceOf[js.Any])
    __obj.asInstanceOf[QDataPages]
  }
}

