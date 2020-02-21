package typings.reactBeautifulDnd.mod

import typings.reactBeautifulDnd.reactBeautifulDndBooleans.`true`
import typings.reactBeautifulDnd.reactBeautifulDndStrings.DRAGGING
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DraggingState
  extends State
     with StateWhenUpdatesAllowed {
  var afterCritical: LiftEffect
  var critical: Critical
  var current: DragPositions
  var dimensions: DimensionMap
  // whether or not draggable movements should be animated
  var forceShouldAnimate: js.UndefOr[Boolean] = js.undefined
  var impact: DragImpact
  var initial: DragPositions
  var isDragging: `true`
  // when there is a fixed list we want to opt out of this behaviour
  var isWindowScrollAllowed: Boolean
  var movementMode: MovementMode
  var onLiftImpact: DragImpact
  var phase: DRAGGING
  // if we need to jump the scroll (keyboard dragging)
  var scrollJumpRequest: js.UndefOr[Position] = js.undefined
  var userDirection: UserDirection
  var viewport: Viewport
}

object DraggingState {
  @scala.inline
  def apply(
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
  ): DraggingState = {
    val __obj = js.Dynamic.literal(afterCritical = afterCritical.asInstanceOf[js.Any], critical = critical.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any], dimensions = dimensions.asInstanceOf[js.Any], impact = impact.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any], isDragging = isDragging.asInstanceOf[js.Any], isWindowScrollAllowed = isWindowScrollAllowed.asInstanceOf[js.Any], movementMode = movementMode.asInstanceOf[js.Any], onLiftImpact = onLiftImpact.asInstanceOf[js.Any], phase = phase.asInstanceOf[js.Any], userDirection = userDirection.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
    if (!js.isUndefined(forceShouldAnimate)) __obj.updateDynamic("forceShouldAnimate")(forceShouldAnimate.asInstanceOf[js.Any])
    if (scrollJumpRequest != null) __obj.updateDynamic("scrollJumpRequest")(scrollJumpRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraggingState]
  }
}

