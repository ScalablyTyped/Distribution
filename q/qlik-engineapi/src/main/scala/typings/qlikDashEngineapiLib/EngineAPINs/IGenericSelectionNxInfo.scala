package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * GenericSelectionNxInfo width extend NxInfo
  */
trait IGenericSelectionNxInfo extends INxInfo {
  @JSName("qType")
  var qType_IGenericSelectionNxInfo: qlikDashEngineapiLib.qlikDashEngineapiLibStrings.CurrentSelection
}

object IGenericSelectionNxInfo {
  @scala.inline
  def apply(
    qType: qlikDashEngineapiLib.qlikDashEngineapiLibStrings.CurrentSelection,
    qId: java.lang.String = null
  ): IGenericSelectionNxInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qType")(qType)
    if (qId != null) __obj.updateDynamic("qId")(qId)
    __obj.asInstanceOf[IGenericSelectionNxInfo]
  }
}

