package typings.reactBeautifulDnd.mod

import typings.reactBeautifulDnd.reactBeautifulDndBooleans.`true`
import typings.reactBeautifulDnd.reactBeautifulDndStrings.DROP_PENDING
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent react-beautiful-dnd.react-beautiful-dnd.Omit<react-beautiful-dnd.react-beautiful-dnd.DraggingState, 'phase'> */
trait DropPendingState extends State {
  var afterCritical: LiftEffect
  var critical: Critical
  var current: DragPositions
  var dimensions: DimensionMap
  var forceShouldAnimate: js.UndefOr[Boolean] = js.undefined
  var impact: DragImpact
  var initial: DragPositions
  var isDragging: `true`
  var isWaiting: Boolean
  var isWindowScrollAllowed: Boolean
  var movementMode: MovementMode
  var onLiftImpact: DragImpact
  var phase: DROP_PENDING
  var reason: DropReason
  var scrollJumpRequest: js.UndefOr[Position] = js.undefined
  var viewport: Viewport
}

object DropPendingState {
  @scala.inline
  def apply(
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
    viewport: Viewport,
    forceShouldAnimate: js.UndefOr[Boolean] = js.undefined,
    scrollJumpRequest: Position = null
  ): DropPendingState = {
    val __obj = js.Dynamic.literal(afterCritical = afterCritical.asInstanceOf[js.Any], critical = critical.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any], dimensions = dimensions.asInstanceOf[js.Any], impact = impact.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any], isDragging = isDragging.asInstanceOf[js.Any], isWaiting = isWaiting.asInstanceOf[js.Any], isWindowScrollAllowed = isWindowScrollAllowed.asInstanceOf[js.Any], movementMode = movementMode.asInstanceOf[js.Any], onLiftImpact = onLiftImpact.asInstanceOf[js.Any], phase = phase.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
    if (!js.isUndefined(forceShouldAnimate)) __obj.updateDynamic("forceShouldAnimate")(forceShouldAnimate.get.asInstanceOf[js.Any])
    if (scrollJumpRequest != null) __obj.updateDynamic("scrollJumpRequest")(scrollJumpRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropPendingState]
  }
}

