package typings.reactBeautifulDnd.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreDragActions extends StObject {
  
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
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: PreDragActions] (val x: Self) extends AnyVal {
    
    inline def setAbort(value: () => Unit): Self = StObject.set(x, "abort", js.Any.fromFunction0(value))
    
    inline def setFluidLift(value: Position => FluidDragActions): Self = StObject.set(x, "fluidLift", js.Any.fromFunction1(value))
    
    inline def setIsActive(value: () => Boolean): Self = StObject.set(x, "isActive", js.Any.fromFunction0(value))
    
    inline def setShouldRespectForcePress(value: () => Boolean): Self = StObject.set(x, "shouldRespectForcePress", js.Any.fromFunction0(value))
    
    inline def setSnapLift(value: () => SnapDragActions): Self = StObject.set(x, "snapLift", js.Any.fromFunction0(value))
  }
}
