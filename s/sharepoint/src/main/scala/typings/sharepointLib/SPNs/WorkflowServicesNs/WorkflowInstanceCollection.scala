package typings
package sharepointLib.SPNs.WorkflowServicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a collection of WorkflowInstance objects */
@js.native
trait WorkflowInstanceCollection
  extends sharepointLib.SPNs.ClientObjectCollection[WorkflowInstance] {
  /** returns SP.WorkflowInstance class */
  def get_childItemType(): js.Any = js.native
  def get_item(index: scala.Double): WorkflowInstance = js.native
  def itemAt(index: scala.Double): WorkflowInstance = js.native
}

