package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CustomConnector...
  */
trait ICustomConnector extends js.Object {
  /**
    * Name of the custom connector as displayed in the Qlik interface.
    */
  var qDisplayName: String
  /**
    * Mode of the machine (64 or 32 bits).
    */
  var qMachineMode: MachineModeType
  /**
    * Name of the parent folder that contains the custom connector file.
    */
  var qParent: String
  /**
    * Name of the custom connector file.
    */
  var qProvider: String
}

object ICustomConnector {
  @scala.inline
  def apply(qDisplayName: String, qMachineMode: MachineModeType, qParent: String, qProvider: String): ICustomConnector = {
    val __obj = js.Dynamic.literal(qDisplayName = qDisplayName.asInstanceOf[js.Any], qMachineMode = qMachineMode.asInstanceOf[js.Any], qParent = qParent.asInstanceOf[js.Any], qProvider = qProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomConnector]
  }
}

