package typings.qlikDashEngineapi

import typings.qlikDashEngineapi.EngineAPINs.INxAxisData
import typings.qlikDashEngineapi.EngineAPINs.INxDataPage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_QAxisData extends js.Object {
  var qAxisData: js.Array[INxAxisData]
  var qDataPages: js.Array[INxDataPage]
}

object Anon_QAxisData {
  @scala.inline
  def apply(qAxisData: js.Array[INxAxisData], qDataPages: js.Array[INxDataPage]): Anon_QAxisData = {
    val __obj = js.Dynamic.literal(qAxisData = qAxisData, qDataPages = qDataPages)
  
    __obj.asInstanceOf[Anon_QAxisData]
  }
}

