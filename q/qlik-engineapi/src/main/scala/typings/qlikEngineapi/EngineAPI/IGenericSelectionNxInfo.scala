package typings.qlikEngineapi.EngineAPI

import typings.qlikEngineapi.qlikEngineapiStrings.CurrentSelection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * GenericSelectionNxInfo width extend NxInfo
  */
trait IGenericSelectionNxInfo extends INxInfo {
  @JSName("qType")
  var qType_IGenericSelectionNxInfo: CurrentSelection
}

object IGenericSelectionNxInfo {
  @scala.inline
  def apply(qType: CurrentSelection, qId: String = null): IGenericSelectionNxInfo = {
    val __obj = js.Dynamic.literal(qType = qType.asInstanceOf[js.Any])
    if (qId != null) __obj.updateDynamic("qId")(qId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericSelectionNxInfo]
  }
}

