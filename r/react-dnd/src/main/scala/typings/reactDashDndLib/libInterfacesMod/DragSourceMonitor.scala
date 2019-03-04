package typings
package reactDashDndLib.libInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DragSourceMonitor
  extends dndDashCoreLib.libInterfacesMod.DragDropMonitor {
  /**
    * Returns true if no drag operation is in progress, and the owner's canDrag() returns true or is not defined.
    */
  def canDrag(): scala.Boolean = js.native
}

