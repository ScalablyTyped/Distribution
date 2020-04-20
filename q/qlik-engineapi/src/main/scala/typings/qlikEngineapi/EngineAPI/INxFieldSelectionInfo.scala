package typings.qlikEngineapi.EngineAPI

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
    val __obj = js.Dynamic.literal(qFieldSelectionMode = qFieldSelectionMode.asInstanceOf[js.Any], qName = qName.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxFieldSelectionInfo]
  }
}

