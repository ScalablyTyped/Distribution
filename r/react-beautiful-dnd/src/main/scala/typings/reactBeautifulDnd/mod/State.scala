package typings.reactBeautifulDnd.mod

import typings.reactBeautifulDnd.reactBeautifulDndBooleans.`true`
import typings.reactBeautifulDnd.reactBeautifulDndStrings.COLLECTING
import typings.reactBeautifulDnd.reactBeautifulDndStrings.DRAGGING
import typings.reactBeautifulDnd.reactBeautifulDndStrings.DROP_ANIMATING
import typings.reactBeautifulDnd.reactBeautifulDndStrings.DROP_PENDING
import typings.reactBeautifulDnd.reactBeautifulDndStrings.IDLE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactBeautifulDnd.mod.IdleState
  - typings.reactBeautifulDnd.mod.DraggingState
  - typings.reactBeautifulDnd.mod.CollectingState
  - typings.reactBeautifulDnd.mod.DropPendingState
  - typings.reactBeautifulDnd.mod.DropAnimatingState
*/
trait State extends js.Object

object State {
  @scala.inline
  def CollectingState(
    afterCritical: LiftEffect,
    critical: Critical,
    current: DragPositions,
    dimensions: DimensionMap,
    impact: DragImpact,
    initial: DragPositions,
    isDragging: `true`,
    isWindowScrollAllowed: Boolean,
    movementMode: MovementMode,
    onLiftImpact: DragImpact,
    phase: COLLECTING,
    userDirection: UserDirection,
    viewport: Viewport,
    forceShouldAnimate: js.UndefOr[Boolean] = js.undefined,
    scrollJumpRequest: Position = null
  ): State = {
    val __obj = js.Dynamic.literal(afterCritical = afterCritical.asInstanceOf[js.Any], critical = critical.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any], dimensions = dimensions.asInstanceOf[js.Any], impact = impact.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any], isDragging = isDragging.asInstanceOf[js.Any], isWindowScrollAllowed = isWindowScrollAllowed.asInstanceOf[js.Any], movementMode = movementMode.asInstanceOf[js.Any], onLiftImpact = onLiftImpact.asInstanceOf[js.Any], phase = phase.asInstanceOf[js.Any], userDirection = userDirection.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
    if (!js.isUndefined(forceShouldAnimate)) __obj.updateDynamic("forceShouldAnimate")(forceShouldAnimate.asInstanceOf[js.Any])
    if (scrollJumpRequest != null) __obj.updateDynamic("scrollJumpRequest")(scrollJumpRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
  @scala.inline
  def DropPendingState(
    afterCritical: LiftEffect,
    critical: Critical,
    current: DragPositions,
    dimensions: DimensionMap,
    impact: DragImpact,
    initial: DragPositions,
    isDragging: `true`,
    isWaiting: Boolean,
    isWindowScrollAllowed: Boolean,
    movementMode: MovementMode,
    onLiftImpact: DragImpact,
    phase: DROP_PENDING,
    reason: DropReason,
    userDirection: UserDirection,
    viewport: Viewport,
    forceShouldAnimate: js.UndefOr[Boolean] = js.undefined,
    scrollJumpRequest: Position = null
  ): State = {
    val __obj = js.Dynamic.literal(afterCritical = afterCritical.asInstanceOf[js.Any], critical = critical.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any], dimensions = dimensions.asInstanceOf[js.Any], impact = impact.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any], isDragging = isDragging.asInstanceOf[js.Any], isWaiting = isWaiting.asInstanceOf[js.Any], isWindowScrollAllowed = isWindowScrollAllowed.asInstanceOf[js.Any], movementMode = movementMode.asInstanceOf[js.Any], onLiftImpact = onLiftImpact.asInstanceOf[js.Any], phase = phase.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], userDirection = userDirection.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
    if (!js.isUndefined(forceShouldAnimate)) __obj.updateDynamic("forceShouldAnimate")(forceShouldAnimate.asInstanceOf[js.Any])
    if (scrollJumpRequest != null) __obj.updateDynamic("scrollJumpRequest")(scrollJumpRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
  @scala.inline
  def DraggingState(
    afterCritical: LiftEffect,
    critical: Critical,
    current: DragPositions,
    dimensions: DimensionMap,
    impact: DragImpact,
    initial: DragPositions,
    isDragging: `true`,
    isWindowScrollAllowed: Boolean,
    movementMode: MovementMode,
    onLiftImpact: DragImpact,
    phase: DRAGGING,
    userDirection: UserDirection,
    viewport: Viewport,
    forceShouldAnimate: js.UndefOr[Boolean] = js.undefined,
    scrollJumpRequest: Position = null
  ): State = {
    val __obj = js.Dynamic.literal(afterCritical = afterCritical.asInstanceOf[js.Any], critical = critical.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any], dimensions = dimensions.asInstanceOf[js.Any], impact = impact.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any], isDragging = isDragging.asInstanceOf[js.Any], isWindowScrollAllowed = isWindowScrollAllowed.asInstanceOf[js.Any], movementMode = movementMode.asInstanceOf[js.Any], onLiftImpact = onLiftImpact.asInstanceOf[js.Any], phase = phase.asInstanceOf[js.Any], userDirection = userDirection.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
    if (!js.isUndefined(forceShouldAnimate)) __obj.updateDynamic("forceShouldAnimate")(forceShouldAnimate.asInstanceOf[js.Any])
    if (scrollJumpRequest != null) __obj.updateDynamic("scrollJumpRequest")(scrollJumpRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
  @scala.inline
  def DropAnimatingState(
    completed: CompletedDrag,
    dimensions: DimensionMap,
    dropDuration: Double,
    newHomeClientOffset: Position,
    phase: DROP_ANIMATING
  ): State = {
    val __obj = js.Dynamic.literal(completed = completed.asInstanceOf[js.Any], dimensions = dimensions.asInstanceOf[js.Any], dropDuration = dropDuration.asInstanceOf[js.Any], newHomeClientOffset = newHomeClientOffset.asInstanceOf[js.Any], phase = phase.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
  @scala.inline
  def IdleState(phase: IDLE, shouldFlush: Boolean, completed: CompletedDrag = null): State = {
    val __obj = js.Dynamic.literal(phase = phase.asInstanceOf[js.Any], shouldFlush = shouldFlush.asInstanceOf[js.Any])
    if (completed != null) __obj.updateDynamic("completed")(completed.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
}

