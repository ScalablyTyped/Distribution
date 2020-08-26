package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Is the layout for GenericVariableProperties.
  */
@js.native
trait IGenericVariableLayout extends IGenericBaseLayout {
  /**
    * If set to true, it means that the variable was defined via script.
    */
  var qIsScriptCreated: Boolean = js.native
  /**
    * A value.
    */
  var qNum: Double = js.native
  /**
    * Some text.
    */
  var qText: String = js.native
}

object IGenericVariableLayout {
  @scala.inline
  def apply(qInfo: INxInfo, qIsScriptCreated: Boolean, qMeta: INxMeta, qNum: Double, qText: String): IGenericVariableLayout = {
    val __obj = js.Dynamic.literal(qInfo = qInfo.asInstanceOf[js.Any], qIsScriptCreated = qIsScriptCreated.asInstanceOf[js.Any], qMeta = qMeta.asInstanceOf[js.Any], qNum = qNum.asInstanceOf[js.Any], qText = qText.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericVariableLayout]
  }
  @scala.inline
  implicit class IGenericVariableLayoutOps[Self <: IGenericVariableLayout] (val x: Self) extends AnyVal {
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
    def setQIsScriptCreated(value: Boolean): Self = this.set("qIsScriptCreated", value.asInstanceOf[js.Any])
    @scala.inline
    def setQNum(value: Double): Self = this.set("qNum", value.asInstanceOf[js.Any])
    @scala.inline
    def setQText(value: String): Self = this.set("qText", value.asInstanceOf[js.Any])
  }
  
}

