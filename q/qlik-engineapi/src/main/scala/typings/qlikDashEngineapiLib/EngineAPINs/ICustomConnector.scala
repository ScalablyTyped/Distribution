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

