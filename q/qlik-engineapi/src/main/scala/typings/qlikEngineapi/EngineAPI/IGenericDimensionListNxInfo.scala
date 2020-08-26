package typings.qlikEngineapi.EngineAPI

import typings.qlikEngineapi.qlikEngineapiStrings.DimensionList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * GenericDimensionListNxInfo width extend NxInfo
  */
@js.native
trait IGenericDimensionListNxInfo extends INxInfo {
  @JSName("qType")
  var qType_IGenericDimensionListNxInfo: DimensionList = js.native
}

object IGenericDimensionListNxInfo {
  @scala.inline
  def apply(qType: DimensionList): IGenericDimensionListNxInfo = {
    val __obj = js.Dynamic.literal(qType = qType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericDimensionListNxInfo]
  }
  @scala.inline
  implicit class IGenericDimensionListNxInfoOps[Self <: IGenericDimensionListNxInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setQType(value: DimensionList): Self = this.set("qType", value.asInstanceOf[js.Any])
  }
  
}

