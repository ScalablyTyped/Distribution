package typings
package qlikDashEngineapiLib.EngineAPINs

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
  var qDisplayName: java.lang.String
  /**
    * Mode of the machine (64 or 32 bits).
    */
  var qMachineMode: MachineModeType
  /**
    * Name of the parent folder that contains the custom connector file.
    */
  var qParent: java.lang.String
  /**
    * Name of the custom connector file.
    */
  var qProvider: java.lang.String
}

object ICustomConnector {
  @scala.inline
  def apply(
    qDisplayName: java.lang.String,
    qMachineMode: MachineModeType,
    qParent: java.lang.String,
    qProvider: java.lang.String
  ): ICustomConnector = {
    val __obj = js.Dynamic.literal(qDisplayName = qDisplayName, qMachineMode = qMachineMode, qParent = qParent, qProvider = qProvider)
  
    __obj.asInstanceOf[ICustomConnector]
  }
}

