package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the list of variables in an app.
  */
@js.native
trait IVariableListDef extends js.Object {
  /**
    * Data Type JSON
    */
  var qData: js.Any = js.native
  /**
    * Shows the system variables if set to true.
    */
  var qShowConfig: Boolean = js.native
  /**
    * Shows the reserved variables if set to true.
    */
  var qShowReserved: Boolean = js.native
  /**
    * Type of the list.
    */
  var qType: String = js.native
}

object IVariableListDef {
  @scala.inline
  def apply(qData: js.Any, qShowConfig: Boolean, qShowReserved: Boolean, qType: String): IVariableListDef = {
    val __obj = js.Dynamic.literal(qData = qData.asInstanceOf[js.Any], qShowConfig = qShowConfig.asInstanceOf[js.Any], qShowReserved = qShowReserved.asInstanceOf[js.Any], qType = qType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVariableListDef]
  }
  @scala.inline
  implicit class IVariableListDefOps[Self <: IVariableListDef] (val x: Self) extends AnyVal {
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
    def setQData(value: js.Any): Self = this.set("qData", value.asInstanceOf[js.Any])
    @scala.inline
    def setQShowConfig(value: Boolean): Self = this.set("qShowConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def setQShowReserved(value: Boolean): Self = this.set("qShowReserved", value.asInstanceOf[js.Any])
    @scala.inline
    def setQType(value: String): Self = this.set("qType", value.asInstanceOf[js.Any])
  }
  
}

