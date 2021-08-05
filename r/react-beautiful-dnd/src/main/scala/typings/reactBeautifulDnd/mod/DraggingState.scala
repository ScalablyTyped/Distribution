package typings.reactBeautifulDnd.mod

import typings.reactBeautifulDnd.reactBeautifulDndBooleans.`true`
import typings.reactBeautifulDnd.reactBeautifulDndStrings.DRAGGING
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DraggingState
  extends StObject
     with State
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
  
  var viewport: Viewport
}
object DraggingState {
  
  inline def apply(
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
  ): DraggingState = {
    val __obj = js.Dynamic.literal(afterCritical = afterCritical.asInstanceOf[js.Any], critical = critical.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any], dimensions = dimensions.asInstanceOf[js.Any], impact = impact.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any], isDragging = true, isWindowScrollAllowed = isWindowScrollAllowed.asInstanceOf[js.Any], movementMode = movementMode.asInstanceOf[js.Any], onLiftImpact = onLiftImpact.asInstanceOf[js.Any], phase = "DRAGGING", viewport = viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraggingState]
  }
  
  extension [Self <: DraggingState](x: Self) {
    
    inline def setAfterCritical(value: LiftEffect): Self = StObject.set(x, "afterCritical", value.asInstanceOf[js.Any])
    
    inline def setCritical(value: Critical): Self = StObject.set(x, "critical", value.asInstanceOf[js.Any])
    
    inline def setCurrent(value: DragPositions): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setDimensions(value: DimensionMap): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    inline def setForceShouldAnimate(value: Boolean): Self = StObject.set(x, "forceShouldAnimate", value.asInstanceOf[js.Any])
    
    inline def setForceShouldAnimateUndefined: Self = StObject.set(x, "forceShouldAnimate", js.undefined)
    
    inline def setImpact(value: DragImpact): Self = StObject.set(x, "impact", value.asInstanceOf[js.Any])
    
    inline def setInitial(value: DragPositions): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
    
    inline def setIsDragging(value: `true`): Self = StObject.set(x, "isDragging", value.asInstanceOf[js.Any])
    
    inline def setIsWindowScrollAllowed(value: Boolean): Self = StObject.set(x, "isWindowScrollAllowed", value.asInstanceOf[js.Any])
    
    inline def setMovementMode(value: MovementMode): Self = StObject.set(x, "movementMode", value.asInstanceOf[js.Any])
    
    inline def setOnLiftImpact(value: DragImpact): Self = StObject.set(x, "onLiftImpact", value.asInstanceOf[js.Any])
    
    inline def setPhase(value: DRAGGING): Self = StObject.set(x, "phase", value.asInstanceOf[js.Any])
    
    inline def setScrollJumpRequest(value: Position): Self = StObject.set(x, "scrollJumpRequest", value.asInstanceOf[js.Any])
    
    inline def setScrollJumpRequestUndefined: Self = StObject.set(x, "scrollJumpRequest", js.undefined)
    
    inline def setViewport(value: Viewport): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
  }
}
