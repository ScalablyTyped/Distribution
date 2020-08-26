package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * GenericDimensionsListProperties width extend GenericProperties
  */
@js.native
trait IGenericDimensionsListProperties extends IGenericProperties {
  var qDimensionListDef: IDimensionListDef = js.native
  @JSName("qInfo")
  var qInfo_IGenericDimensionsListProperties: IGenericDimensionListNxInfo = js.native
}

object IGenericDimensionsListProperties {
  @scala.inline
  def apply(qDimensionListDef: IDimensionListDef, qInfo: IGenericDimensionListNxInfo): IGenericDimensionsListProperties = {
    val __obj = js.Dynamic.literal(qDimensionListDef = qDimensionListDef.asInstanceOf[js.Any], qInfo = qInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericDimensionsListProperties]
  }
  @scala.inline
  implicit class IGenericDimensionsListPropertiesOps[Self <: IGenericDimensionsListProperties] (val x: Self) extends AnyVal {
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
    def setQDimensionListDef(value: IDimensionListDef): Self = this.set("qDimensionListDef", value.asInstanceOf[js.Any])
    @scala.inline
    def setQInfo(value: IGenericDimensionListNxInfo): Self = this.set("qInfo", value.asInstanceOf[js.Any])
  }
  
}

