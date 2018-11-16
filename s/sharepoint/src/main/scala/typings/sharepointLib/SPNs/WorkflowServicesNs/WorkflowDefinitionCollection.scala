package typings
package sharepointLib.SPNs.WorkflowServicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a collection of WorkflowDefinition objects */
@js.native
trait WorkflowDefinitionCollection
  extends sharepointLib.SPNs.ClientObjectCollection[WorkflowDefinition] {
  /** returns SP.WorkflowDefinition class */
  def get_childItemType(): js.Any = js.native
  def get_item(index: scala.Double): WorkflowDefinition = js.native
  def itemAt(index: scala.Double): WorkflowDefinition = js.native
}

