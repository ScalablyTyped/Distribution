package typings.qlikDashVisualizationextensions.BackendAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INxPatch extends js.Object {
  /**
    * Operation to perform.
    * One of:
    *       # Add
    *       # Remove
    *       # Replace
    */
  var qOp: PatchType
  /**
    * Path to the property to add, remove or replace.
    * String
    */
  var qPath: String
  /**
    * This parameter is not used in a remove operation. Corresponds to the value of the
    * property to add or to the new value of the property to update.
    * Examples: "false", "2", "\"New title\""
    * String
    */
  var qValue: String
}

object INxPatch {
  @scala.inline
  def apply(qOp: PatchType, qPath: String, qValue: String): INxPatch = {
    val __obj = js.Dynamic.literal(qOp = qOp, qPath = qPath, qValue = qValue)
  
    __obj.asInstanceOf[INxPatch]
  }
}

