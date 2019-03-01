package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * GenericDimensionListNxInfo width extend NxInfo
  */
trait IGenericDimensionListNxInfo extends INxInfo {
  @JSName("qType")
  var qType_IGenericDimensionListNxInfo: qlikDashEngineapiLib.qlikDashEngineapiLibStrings.DimensionList
}

object IGenericDimensionListNxInfo {
  @scala.inline
  def apply(
    qType: qlikDashEngineapiLib.qlikDashEngineapiLibStrings.DimensionList,
    qId: java.lang.String = null
  ): IGenericDimensionListNxInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qType")(qType)
    if (qId != null) __obj.updateDynamic("qId")(qId)
    __obj.asInstanceOf[IGenericDimensionListNxInfo]
  }
}

