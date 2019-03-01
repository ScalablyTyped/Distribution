package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxFieldSelectionInfo...
  */
trait INxFieldSelectionInfo extends js.Object {
  /**
    * Selection mode.
    */
  var qFieldSelectionMode: FieldSelectionModeType
  /**
    * Name of the field.
    */
  var qName: java.lang.String
}

object INxFieldSelectionInfo {
  @scala.inline
  def apply(qFieldSelectionMode: FieldSelectionModeType, qName: java.lang.String): INxFieldSelectionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qFieldSelectionMode")(qFieldSelectionMode)
    __obj.updateDynamic("qName")(qName)
    __obj.asInstanceOf[INxFieldSelectionInfo]
  }
}

