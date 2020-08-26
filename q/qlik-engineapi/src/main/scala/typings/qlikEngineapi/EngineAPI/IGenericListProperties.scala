package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * GenericListProperties...
  */
@js.native
trait IGenericListProperties extends IGenericProperties {
  var qListObjectDef: IListObjectDef = js.native
}

object IGenericListProperties {
  @scala.inline
  def apply(qInfo: INxInfo, qListObjectDef: IListObjectDef): IGenericListProperties = {
    val __obj = js.Dynamic.literal(qInfo = qInfo.asInstanceOf[js.Any], qListObjectDef = qListObjectDef.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericListProperties]
  }
  @scala.inline
  implicit class IGenericListPropertiesOps[Self <: IGenericListProperties] (val x: Self) extends AnyVal {
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
    def setQListObjectDef(value: IListObjectDef): Self = this.set("qListObjectDef", value.asInstanceOf[js.Any])
  }
  
}

