package typings.qlikDashEngineapi

import typings.qlikDashEngineapi.EngineAPINs.INxAxisData
import typings.qlikDashEngineapi.EngineAPINs.INxDataPage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_QAxisDataQDataPages extends js.Object {
  var qAxisData: js.Array[INxAxisData]
  var qDataPages: INxDataPage
}

object Anon_QAxisDataQDataPages {
  @scala.inline
  def apply(qAxisData: js.Array[INxAxisData], qDataPages: INxDataPage): Anon_QAxisDataQDataPages = {
    val __obj = js.Dynamic.literal(qAxisData = qAxisData, qDataPages = qDataPages)
  
    __obj.asInstanceOf[Anon_QAxisDataQDataPages]
  }
}

