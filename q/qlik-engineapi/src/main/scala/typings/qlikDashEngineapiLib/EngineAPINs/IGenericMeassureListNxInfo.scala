package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * IGenericMeassureListNxInfo
  */
trait IGenericMeassureListNxInfo extends INxInfo {
  @JSName("qType")
  var qType_IGenericMeassureListNxInfo: qlikDashEngineapiLib.qlikDashEngineapiLibStrings.MeasureList
}

object IGenericMeassureListNxInfo {
  @scala.inline
  def apply(qType: qlikDashEngineapiLib.qlikDashEngineapiLibStrings.MeasureList, qId: java.lang.String = null): IGenericMeassureListNxInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qType")(qType)
    if (qId != null) __obj.updateDynamic("qId")(qId)
    __obj.asInstanceOf[IGenericMeassureListNxInfo]
  }
}

