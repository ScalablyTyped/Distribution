package typings.qlikDashEngineapi.EngineAPI

import typings.qlikDashEngineapi.qlikDashEngineapiStrings.MeasureList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * IGenericMeassureListNxInfo
  */
trait IGenericMeassureListNxInfo extends INxInfo {
  @JSName("qType")
  var qType_IGenericMeassureListNxInfo: MeasureList
}

object IGenericMeassureListNxInfo {
  @scala.inline
  def apply(qType: MeasureList, qId: String = null): IGenericMeassureListNxInfo = {
    val __obj = js.Dynamic.literal(qType = qType)
    if (qId != null) __obj.updateDynamic("qId")(qId)
    __obj.asInstanceOf[IGenericMeassureListNxInfo]
  }
}

