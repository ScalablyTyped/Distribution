package typings.qlikEngineapi.EngineAPI

import typings.qlikEngineapi.qlikEngineapiStrings.MeasureList
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
    val __obj = js.Dynamic.literal(qType = qType.asInstanceOf[js.Any])
    if (qId != null) __obj.updateDynamic("qId")(qId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericMeassureListNxInfo]
  }
}

