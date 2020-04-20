package typings.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreDragActions extends js.Object {
  // cancel the pre drag without starting a drag. Releases the lock
  def abort(): Unit
  // lift the current item
  def fluidLift(clientSelection: Position): FluidDragActions
  // discover if the lock is still active
  def isActive(): Boolean
  // whether it has been indicated if force press should be respected
  def shouldRespectForcePress(): Boolean
  def snapLift(): SnapDragActions
}

object PreDragActions {
  @scala.inline
  def apply(
    abort: () => Unit,
    fluidLift: Position => FluidDragActions,
    isActive: () => Boolean,
    shouldRespectForcePress: () => Boolean,
    snapLift: () => SnapDragActions
  ): PreDragActions = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), fluidLift = js.Any.fromFunction1(fluidLift), isActive = js.Any.fromFunction0(isActive), shouldRespectForcePress = js.Any.fromFunction0(shouldRespectForcePress), snapLift = js.Any.fromFunction0(snapLift))
    __obj.asInstanceOf[PreDragActions]
  }
}

