package typings.reactBeautifulDnd.mod

import typings.reactBeautifulDnd.reactBeautifulDndBooleans.`true`
import typings.reactBeautifulDnd.reactBeautifulDndStrings.COLLECTING
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent react-beautiful-dnd.react-beautiful-dnd.Omit<react-beautiful-dnd.react-beautiful-dnd.DraggingState, 'phase'> */
@js.native
trait CollectingState
  extends State
     with StateWhenUpdatesAllowed {
  var afterCritical: LiftEffect = js.native
  var critical: Critical = js.native
  var current: DragPositions = js.native
  var dimensions: DimensionMap = js.native
  var forceShouldAnimate: js.UndefOr[Boolean] = js.native
  var impact: DragImpact = js.native
  var initial: DragPositions = js.native
  var isDragging: `true` = js.native
  var isWindowScrollAllowed: Boolean = js.native
  var movementMode: MovementMode = js.native
  var onLiftImpact: DragImpact = js.native
  var phase: COLLECTING = js.native
  var scrollJumpRequest: js.UndefOr[Position] = js.native
  var viewport: Viewport = js.native
}

object CollectingState {
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
    phase: COLLECTING,
    viewport: Viewport
  ): CollectingState = {
    val __obj = js.Dynamic.literal(afterCritical = afterCritical.asInstanceOf[js.Any], critical = critical.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any], dimensions = dimensions.asInstanceOf[js.Any], impact = impact.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any], isDragging = isDragging.asInstanceOf[js.Any], isWindowScrollAllowed = isWindowScrollAllowed.asInstanceOf[js.Any], movementMode = movementMode.asInstanceOf[js.Any], onLiftImpact = onLiftImpact.asInstanceOf[js.Any], phase = phase.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectingState]
  }
  @scala.inline
  implicit class CollectingStateOps[Self <: CollectingState] (val x: Self) extends AnyVal {
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
    def setAfterCritical(value: LiftEffect): Self = this.set("afterCritical", value.asInstanceOf[js.Any])
    @scala.inline
    def setCritical(value: Critical): Self = this.set("critical", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrent(value: DragPositions): Self = this.set("current", value.asInstanceOf[js.Any])
    @scala.inline
    def setDimensions(value: DimensionMap): Self = this.set("dimensions", value.asInstanceOf[js.Any])
    @scala.inline
    def setImpact(value: DragImpact): Self = this.set("impact", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitial(value: DragPositions): Self = this.set("initial", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsDragging(value: `true`): Self = this.set("isDragging", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsWindowScrollAllowed(value: Boolean): Self = this.set("isWindowScrollAllowed", value.asInstanceOf[js.Any])
    @scala.inline
    def setMovementMode(value: MovementMode): Self = this.set("movementMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnLiftImpact(value: DragImpact): Self = this.set("onLiftImpact", value.asInstanceOf[js.Any])
    @scala.inline
    def setPhase(value: COLLECTING): Self = this.set("phase", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewport(value: Viewport): Self = this.set("viewport", value.asInstanceOf[js.Any])
    @scala.inline
    def setForceShouldAnimate(value: Boolean): Self = this.set("forceShouldAnimate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceShouldAnimate: Self = this.set("forceShouldAnimate", js.undefined)
    @scala.inline
    def setScrollJumpRequest(value: Position): Self = this.set("scrollJumpRequest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollJumpRequest: Self = this.set("scrollJumpRequest", js.undefined)
  }
  
}

