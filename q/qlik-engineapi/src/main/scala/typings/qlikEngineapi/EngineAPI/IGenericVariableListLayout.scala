package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * GenericVariableLayout width extend GenericObjectLayout
  */
@js.native
trait IGenericVariableListLayout extends IGenericBaseLayout {
  var qVariableListObject: IVariableList = js.native
}

object IGenericVariableListLayout {
  @scala.inline
  def apply(qInfo: INxInfo, qMeta: INxMeta, qVariableListObject: IVariableList): IGenericVariableListLayout = {
    val __obj = js.Dynamic.literal(qInfo = qInfo.asInstanceOf[js.Any], qMeta = qMeta.asInstanceOf[js.Any], qVariableListObject = qVariableListObject.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericVariableListLayout]
  }
  @scala.inline
  implicit class IGenericVariableListLayoutOps[Self <: IGenericVariableListLayout] (val x: Self) extends AnyVal {
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
    def setQVariableListObject(value: IVariableList): Self = this.set("qVariableListObject", value.asInstanceOf[js.Any])
  }
  
}

