package typings.reactBeautifulDnd.mod

import typings.reactBeautifulDnd.reactBeautifulDndBooleans.`true`
import typings.reactBeautifulDnd.reactBeautifulDndStrings.COLLECTING
import typings.reactBeautifulDnd.reactBeautifulDndStrings.DRAGGING
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactBeautifulDnd.mod.DraggingState
  - typings.reactBeautifulDnd.mod.CollectingState
*/
trait StateWhenUpdatesAllowed extends js.Object

object StateWhenUpdatesAllowed {
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
  ): StateWhenUpdatesAllowed = {
    val __obj = js.Dynamic.literal(afterCritical = afterCritical.asInstanceOf[js.Any], critical = critical.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any], dimensions = dimensions.asInstanceOf[js.Any], impact = impact.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any], isDragging = isDragging.asInstanceOf[js.Any], isWindowScrollAllowed = isWindowScrollAllowed.asInstanceOf[js.Any], movementMode = movementMode.asInstanceOf[js.Any], onLiftImpact = onLiftImpact.asInstanceOf[js.Any], phase = phase.asInstanceOf[js.Any], userDirection = userDirection.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
    if (!js.isUndefined(forceShouldAnimate)) __obj.updateDynamic("forceShouldAnimate")(forceShouldAnimate.get.asInstanceOf[js.Any])
    if (scrollJumpRequest != null) __obj.updateDynamic("scrollJumpRequest")(scrollJumpRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateWhenUpdatesAllowed]
  }
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
  ): StateWhenUpdatesAllowed = {
    val __obj = js.Dynamic.literal(afterCritical = afterCritical.asInstanceOf[js.Any], critical = critical.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any], dimensions = dimensions.asInstanceOf[js.Any], impact = impact.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any], isDragging = isDragging.asInstanceOf[js.Any], isWindowScrollAllowed = isWindowScrollAllowed.asInstanceOf[js.Any], movementMode = movementMode.asInstanceOf[js.Any], onLiftImpact = onLiftImpact.asInstanceOf[js.Any], phase = phase.asInstanceOf[js.Any], userDirection = userDirection.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
    if (!js.isUndefined(forceShouldAnimate)) __obj.updateDynamic("forceShouldAnimate")(forceShouldAnimate.get.asInstanceOf[js.Any])
    if (scrollJumpRequest != null) __obj.updateDynamic("scrollJumpRequest")(scrollJumpRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateWhenUpdatesAllowed]
  }
}

