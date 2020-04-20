package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the list of variables in an app.
  */
trait IVariableListDef extends js.Object {
  /**
    * Data Type JSON
    */
  var qData: js.Any
  /**
    * Shows the system variables if set to true.
    */
  var qShowConfig: Boolean
  /**
    * Shows the reserved variables if set to true.
    */
  var qShowReserved: Boolean
  /**
    * Type of the list.
    */
  var qType: String
}

object IVariableListDef {
  @scala.inline
  def apply(qData: js.Any, qShowConfig: Boolean, qShowReserved: Boolean, qType: String): IVariableListDef = {
    val __obj = js.Dynamic.literal(qData = qData.asInstanceOf[js.Any], qShowConfig = qShowConfig.asInstanceOf[js.Any], qShowReserved = qShowReserved.asInstanceOf[js.Any], qType = qType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVariableListDef]
  }
}

