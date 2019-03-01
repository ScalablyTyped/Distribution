package typings
package qlikDashEngineapiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_QAxisData extends js.Object {
  var qAxisData: js.Array[qlikDashEngineapiLib.EngineAPINs.INxAxisData]
  var qDataPages: js.Array[qlikDashEngineapiLib.EngineAPINs.INxDataPage]
}

object Anon_QAxisData {
  @scala.inline
  def apply(
    qAxisData: js.Array[qlikDashEngineapiLib.EngineAPINs.INxAxisData],
    qDataPages: js.Array[qlikDashEngineapiLib.EngineAPINs.INxDataPage]
  ): Anon_QAxisData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qAxisData")(qAxisData)
    __obj.updateDynamic("qDataPages")(qDataPages)
    __obj.asInstanceOf[Anon_QAxisData]
  }
}

