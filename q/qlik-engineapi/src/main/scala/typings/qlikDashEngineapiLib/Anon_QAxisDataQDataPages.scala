package typings
package qlikDashEngineapiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_QAxisDataQDataPages extends js.Object {
  var qAxisData: js.Array[qlikDashEngineapiLib.EngineAPINs.INxAxisData]
  var qDataPages: qlikDashEngineapiLib.EngineAPINs.INxDataPage
}

object Anon_QAxisDataQDataPages {
  @scala.inline
  def apply(
    qAxisData: js.Array[qlikDashEngineapiLib.EngineAPINs.INxAxisData],
    qDataPages: qlikDashEngineapiLib.EngineAPINs.INxDataPage
  ): Anon_QAxisDataQDataPages = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qAxisData")(qAxisData)
    __obj.updateDynamic("qDataPages")(qDataPages)
    __obj.asInstanceOf[Anon_QAxisDataQDataPages]
  }
}

