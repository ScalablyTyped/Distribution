package typings.qlikDashEngineapi.EngineAPI

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
  var qName: String
}

object INxFieldSelectionInfo {
  @scala.inline
  def apply(qFieldSelectionMode: FieldSelectionModeType, qName: String): INxFieldSelectionInfo = {
    val __obj = js.Dynamic.literal(qFieldSelectionMode = qFieldSelectionMode, qName = qName)
  
    __obj.asInstanceOf[INxFieldSelectionInfo]
  }
}

