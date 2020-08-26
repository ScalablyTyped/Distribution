package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * GenericSelectionListProperties width extend GenericObjectProperties
  */
@js.native
trait IGenericSelectionListProperties extends IGenericObjectProperties {
  @JSName("qInfo")
  var qInfo_IGenericSelectionListProperties: IGenericSelectionNxInfo = js.native
  var qSelectionObjectDef: js.Any = js.native
}

object IGenericSelectionListProperties {
  @scala.inline
  def apply(qInfo: IGenericSelectionNxInfo, qSelectionObjectDef: js.Any): IGenericSelectionListProperties = {
    val __obj = js.Dynamic.literal(qInfo = qInfo.asInstanceOf[js.Any], qSelectionObjectDef = qSelectionObjectDef.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericSelectionListProperties]
  }
  @scala.inline
  implicit class IGenericSelectionListPropertiesOps[Self <: IGenericSelectionListProperties] (val x: Self) extends AnyVal {
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
    def setQInfo(value: IGenericSelectionNxInfo): Self = this.set("qInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def setQSelectionObjectDef(value: js.Any): Self = this.set("qSelectionObjectDef", value.asInstanceOf[js.Any])
  }
  
}

