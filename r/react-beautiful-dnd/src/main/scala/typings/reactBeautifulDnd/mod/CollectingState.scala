package typings.reactBeautifulDnd.mod

import typings.reactBeautifulDnd.reactBeautifulDndBooleans.`true`
import typings.reactBeautifulDnd.reactBeautifulDndStrings.COLLECTING
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent react-beautiful-dnd.react-beautiful-dnd.Omit<react-beautiful-dnd.react-beautiful-dnd.DraggingState, 'phase'> */
trait CollectingState
  extends StObject
     with State
     with StateWhenUpdatesAllowed {
  
  var afterCritical: LiftEffect
  
  var critical: Critical
  
  var current: DragPositions
  
  var dimensions: DimensionMap
  
  var forceShouldAnimate: js.UndefOr[Boolean] = js.undefined
  
  var impact: DragImpact
  
  var initial: DragPositions
  
  var isDragging: `true`
  
  var isWindowScrollAllowed: Boolean
  
  var movementMode: MovementMode
  
  var onLiftImpact: DragImpact
  
  var phase: COLLECTING
  
  var scrollJumpRequest: js.UndefOr[Position] = js.undefined
  
  var viewport: Viewport
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
    isWindowScrollAllowed: Boolean,
    movementMode: MovementMode,
    onLiftImpact: DragImpact,
    viewport: Viewport
  ): CollectingState = {
    val __obj = js.Dynamic.literal(afterCritical = afterCritical.asInstanceOf[js.Any], critical = critical.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any], dimensions = dimensions.asInstanceOf[js.Any], impact = impact.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any], isDragging = true, isWindowScrollAllowed = isWindowScrollAllowed.asInstanceOf[js.Any], movementMode = movementMode.asInstanceOf[js.Any], onLiftImpact = onLiftImpact.asInstanceOf[js.Any], phase = "COLLECTING", viewport = viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectingState]
  }
  
  @scala.inline
  implicit class CollectingStateMutableBuilder[Self <: CollectingState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfterCritical(value: LiftEffect): Self = StObject.set(x, "afterCritical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCritical(value: Critical): Self = StObject.set(x, "critical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrent(value: DragPositions): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensions(value: DimensionMap): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceShouldAnimate(value: Boolean): Self = StObject.set(x, "forceShouldAnimate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceShouldAnimateUndefined: Self = StObject.set(x, "forceShouldAnimate", js.undefined)
    
    @scala.inline
    def setImpact(value: DragImpact): Self = StObject.set(x, "impact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitial(value: DragPositions): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDragging(value: `true`): Self = StObject.set(x, "isDragging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsWindowScrollAllowed(value: Boolean): Self = StObject.set(x, "isWindowScrollAllowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMovementMode(value: MovementMode): Self = StObject.set(x, "movementMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnLiftImpact(value: DragImpact): Self = StObject.set(x, "onLiftImpact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhase(value: COLLECTING): Self = StObject.set(x, "phase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollJumpRequest(value: Position): Self = StObject.set(x, "scrollJumpRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollJumpRequestUndefined: Self = StObject.set(x, "scrollJumpRequest", js.undefined)
    
    @scala.inline
    def setViewport(value: Viewport): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
  }
}
