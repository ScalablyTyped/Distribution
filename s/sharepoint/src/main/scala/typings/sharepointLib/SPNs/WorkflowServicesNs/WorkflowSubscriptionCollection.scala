package typings
package sharepointLib.SPNs.WorkflowServicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a collection of WorkflowSubscription objects */
@js.native
trait WorkflowSubscriptionCollection
  extends sharepointLib.SPNs.ClientObjectCollection[WorkflowSubscription] {
  /** returns SP.WorkflowInstance class */
  def get_childItemType(): js.Any = js.native
  def get_item(index: scala.Double): WorkflowSubscription = js.native
  def itemAt(index: scala.Double): WorkflowSubscription = js.native
}

