package typings
package qlikDashEngineapiLib.EngineAPINs

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
  var qShowConfig: scala.Boolean
  /**
    * Shows the reserved variables if set to true.
    */
  var qShowReserved: scala.Boolean
  /**
    * Type of the list.
    */
  var qType: java.lang.String
}

object IVariableListDef {
  @scala.inline
  def apply(qData: js.Any, qShowConfig: scala.Boolean, qShowReserved: scala.Boolean, qType: java.lang.String): IVariableListDef = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qData")(qData)
    __obj.updateDynamic("qShowConfig")(qShowConfig)
    __obj.updateDynamic("qShowReserved")(qShowReserved)
    __obj.updateDynamic("qType")(qType)
    __obj.asInstanceOf[IVariableListDef]
  }
}

