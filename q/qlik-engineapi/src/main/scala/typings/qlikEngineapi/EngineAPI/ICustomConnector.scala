package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CustomConnector...
  */
@js.native
trait ICustomConnector extends js.Object {
  /**
    * Name of the custom connector as displayed in the Qlik interface.
    */
  var qDisplayName: String = js.native
  /**
    * Mode of the machine (64 or 32 bits).
    */
  var qMachineMode: MachineModeType = js.native
  /**
    * Name of the parent folder that contains the custom connector file.
    */
  var qParent: String = js.native
  /**
    * Name of the custom connector file.
    */
  var qProvider: String = js.native
}

object ICustomConnector {
  @scala.inline
  def apply(qDisplayName: String, qMachineMode: MachineModeType, qParent: String, qProvider: String): ICustomConnector = {
    val __obj = js.Dynamic.literal(qDisplayName = qDisplayName.asInstanceOf[js.Any], qMachineMode = qMachineMode.asInstanceOf[js.Any], qParent = qParent.asInstanceOf[js.Any], qProvider = qProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomConnector]
  }
  @scala.inline
  implicit class ICustomConnectorOps[Self <: ICustomConnector] (val x: Self) extends AnyVal {
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
    def setQDisplayName(value: String): Self = this.set("qDisplayName", value.asInstanceOf[js.Any])
    @scala.inline
    def setQMachineMode(value: MachineModeType): Self = this.set("qMachineMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setQParent(value: String): Self = this.set("qParent", value.asInstanceOf[js.Any])
    @scala.inline
    def setQProvider(value: String): Self = this.set("qProvider", value.asInstanceOf[js.Any])
  }
  
}

