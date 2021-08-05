package typings.reactBeautifulDnd.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.reactBeautifulDnd.mod.IdleState
  - typings.reactBeautifulDnd.mod.DraggingState
  - typings.reactBeautifulDnd.mod.CollectingState
  - typings.reactBeautifulDnd.mod.DropPendingState
  - typings.reactBeautifulDnd.mod.DropAnimatingState
*/
trait State extends StObject
object State {
  
  inline def CollectingState(
    afterCritical: LiftEffect,
    critical: Critical,
    current: DragPositions,
    dimensions: DimensionMap,
    impact: DragImpact,
    initial: DragPositions,
    isWindowScrollAllowed: Boolean,
    movementMode: MovementMode,
    onLiftImpact: DragImpact,
    viewport: Viewport
  ): typings.reactBeautifulDnd.mod.CollectingState = {
    val __obj = js.Dynamic.literal(afterCritical = afterCritical.asInstanceOf[js.Any], critical = critical.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any], dimensions = dimensions.asInstanceOf[js.Any], impact = impact.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any], isDragging = true, isWindowScrollAllowed = isWindowScrollAllowed.asInstanceOf[js.Any], movementMode = movementMode.asInstanceOf[js.Any], onLiftImpact = onLiftImpact.asInstanceOf[js.Any], phase = "COLLECTING", viewport = viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactBeautifulDnd.mod.CollectingState]
  }
  
  inline def DraggingState(
    afterCritical: LiftEffect,
    critical: Critical,
    current: DragPositions,
    dimensions: DimensionMap,
    impact: DragImpact,
    initial: DragPositions,
    isWindowScrollAllowed: Boolean,
    movementMode: MovementMode,
    onLiftImpact: DragImpact,
    viewport: Viewport
  ): typings.reactBeautifulDnd.mod.DraggingState = {
    val __obj = js.Dynamic.literal(afterCritical = afterCritical.asInstanceOf[js.Any], critical = critical.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any], dimensions = dimensions.asInstanceOf[js.Any], impact = impact.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any], isDragging = true, isWindowScrollAllowed = isWindowScrollAllowed.asInstanceOf[js.Any], movementMode = movementMode.asInstanceOf[js.Any], onLiftImpact = onLiftImpact.asInstanceOf[js.Any], phase = "DRAGGING", viewport = viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactBeautifulDnd.mod.DraggingState]
  }
  
  inline def DropAnimatingState(
    completed: CompletedDrag,
    dimensions: DimensionMap,
    dropDuration: Double,
    newHomeClientOffset: Position
  ): typings.reactBeautifulDnd.mod.DropAnimatingState = {
    val __obj = js.Dynamic.literal(completed = completed.asInstanceOf[js.Any], dimensions = dimensions.asInstanceOf[js.Any], dropDuration = dropDuration.asInstanceOf[js.Any], newHomeClientOffset = newHomeClientOffset.asInstanceOf[js.Any], phase = "DROP_ANIMATING")
    __obj.asInstanceOf[typings.reactBeautifulDnd.mod.DropAnimatingState]
  }
  
  inline def DropPendingState(
    afterCritical: LiftEffect,
    critical: Critical,
    current: DragPositions,
    dimensions: DimensionMap,
    impact: DragImpact,
    initial: DragPositions,
    isWaiting: Boolean,
    isWindowScrollAllowed: Boolean,
    movementMode: MovementMode,
    onLiftImpact: DragImpact,
    reason: DropReason,
    viewport: Viewport
  ): typings.reactBeautifulDnd.mod.DropPendingState = {
    val __obj = js.Dynamic.literal(afterCritical = afterCritical.asInstanceOf[js.Any], critical = critical.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any], dimensions = dimensions.asInstanceOf[js.Any], impact = impact.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any], isDragging = true, isWaiting = isWaiting.asInstanceOf[js.Any], isWindowScrollAllowed = isWindowScrollAllowed.asInstanceOf[js.Any], movementMode = movementMode.asInstanceOf[js.Any], onLiftImpact = onLiftImpact.asInstanceOf[js.Any], phase = "DROP_PENDING", reason = reason.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactBeautifulDnd.mod.DropPendingState]
  }
  
  inline def IdleState(shouldFlush: Boolean): typings.reactBeautifulDnd.mod.IdleState = {
    val __obj = js.Dynamic.literal(phase = "IDLE", shouldFlush = shouldFlush.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactBeautifulDnd.mod.IdleState]
  }
}
