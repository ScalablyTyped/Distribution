package typings.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreDragActions extends js.Object {
  
  // cancel the pre drag without starting a drag. Releases the lock
  def abort(): Unit = js.native
  
  // lift the current item
  def fluidLift(clientSelection: Position): FluidDragActions = js.native
  
  // discover if the lock is still active
  def isActive(): Boolean = js.native
  
  // whether it has been indicated if force press should be respected
  def shouldRespectForcePress(): Boolean = js.native
  
  def snapLift(): SnapDragActions = js.native
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
  
  @scala.inline
  implicit class PreDragActionsOps[Self <: PreDragActions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAbort(value: () => Unit): Self = this.set("abort", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFluidLift(value: Position => FluidDragActions): Self = this.set("fluidLift", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsActive(value: () => Boolean): Self = this.set("isActive", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShouldRespectForcePress(value: () => Boolean): Self = this.set("shouldRespectForcePress", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSnapLift(value: () => SnapDragActions): Self = this.set("snapLift", js.Any.fromFunction0(value))
  }
}
