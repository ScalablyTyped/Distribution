package typings.qlikDashEngineapi.EngineAPINs

import typings.qlikDashEngineapi.qlikDashEngineapiStrings.DimensionList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * GenericDimensionListNxInfo width extend NxInfo
  */
trait IGenericDimensionListNxInfo extends INxInfo {
  @JSName("qType")
  var qType_IGenericDimensionListNxInfo: DimensionList
}

object IGenericDimensionListNxInfo {
  @scala.inline
  def apply(qType: DimensionList, qId: String = null): IGenericDimensionListNxInfo = {
    val __obj = js.Dynamic.literal(qType = qType)
    if (qId != null) __obj.updateDynamic("qId")(qId)
    __obj.asInstanceOf[IGenericDimensionListNxInfo]
  }
}

