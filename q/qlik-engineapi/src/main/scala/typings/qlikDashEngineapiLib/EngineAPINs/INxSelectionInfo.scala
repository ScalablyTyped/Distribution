package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxSelectionInfo...
  */
trait INxSelectionInfo extends js.Object {
  /**
    * Is set to true if the visualization is in selection mode.
    * For more information about the selection mode
    */
  var qInSelections: scala.Boolean
  /**
    * Is set to true if the visualization is in selection mode
    * and if some selections have been made while in selection mode.
    */
  var qMadeSelections: scala.Boolean
}

object INxSelectionInfo {
  @scala.inline
  def apply(qInSelections: scala.Boolean, qMadeSelections: scala.Boolean): INxSelectionInfo = {
    val __obj = js.Dynamic.literal(qInSelections = qInSelections, qMadeSelections = qMadeSelections)
  
    __obj.asInstanceOf[INxSelectionInfo]
  }
}

