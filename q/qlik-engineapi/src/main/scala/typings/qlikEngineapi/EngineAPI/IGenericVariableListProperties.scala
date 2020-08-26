package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * GenericVariableListProperties width extend GenericProperties
  */
@js.native
trait IGenericVariableListProperties extends IGenericProperties {
  var qVariableListDef: IVariableListDef = js.native
}

object IGenericVariableListProperties {
  @scala.inline
  def apply(qInfo: INxInfo, qVariableListDef: IVariableListDef): IGenericVariableListProperties = {
    val __obj = js.Dynamic.literal(qInfo = qInfo.asInstanceOf[js.Any], qVariableListDef = qVariableListDef.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericVariableListProperties]
  }
  @scala.inline
  implicit class IGenericVariableListPropertiesOps[Self <: IGenericVariableListProperties] (val x: Self) extends AnyVal {
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
    def setQVariableListDef(value: IVariableListDef): Self = this.set("qVariableListDef", value.asInstanceOf[js.Any])
  }
  
}

