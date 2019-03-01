package typings
package reactDashDragtasticLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IsOverAccepted extends js.Object {
  /** A boolean representing whether the user is currently hovering a <Droppable/> that accepts the type of the currently active <Draggable/> */
  var isOverAccepted: scala.Boolean
}

object Anon_IsOverAccepted {
  @scala.inline
  def apply(isOverAccepted: scala.Boolean): Anon_IsOverAccepted = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isOverAccepted")(isOverAccepted)
    __obj.asInstanceOf[Anon_IsOverAccepted]
  }
}

