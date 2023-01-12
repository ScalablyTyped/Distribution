package typings.reactNativeDraggableFlatlist.anon

import typings.reactNativeGestureHandler.libTypescriptStateMod.State
import typings.reactNativeReanimated.mod.SharedValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveCellOffset extends StObject {
  
  var activeCellOffset: SharedValue[Double]
  
  var activeCellSize: SharedValue[Double]
  
  var activeIndexAnim: SharedValue[Double]
  
  var autoScrollDistance: ReadonlySharedValuenumber
  
  var containerSize: SharedValue[Double]
  
  var disabled: SharedValue[Boolean]
  
  var horizontalAnim: SharedValue[Boolean]
  
  var hoverAnim: ReadonlySharedValuenumber
  
  var hoverOffset: ReadonlySharedValuenumber
  
  var isDraggingCell: ReadonlySharedValueboolea
  
  var isTouchActiveNative: SharedValue[Boolean]
  
  var panGestureState: SharedValue[State]
  
  var placeholderOffset: SharedValue[Double]
  
  def resetTouchedCell(): Unit
  
  var scrollOffset: SharedValue[Double]
  
  var scrollViewSize: SharedValue[Double]
  
  var spacerIndexAnim: SharedValue[Double]
  
  var touchPositionDiff: ReadonlySharedValuenumber
  
  var touchTranslate: SharedValue[Double]
}
object ActiveCellOffset {
  
  inline def apply(
    activeCellOffset: SharedValue[Double],
    activeCellSize: SharedValue[Double],
    activeIndexAnim: SharedValue[Double],
    autoScrollDistance: ReadonlySharedValuenumber,
    containerSize: SharedValue[Double],
    disabled: SharedValue[Boolean],
    horizontalAnim: SharedValue[Boolean],
    hoverAnim: ReadonlySharedValuenumber,
    hoverOffset: ReadonlySharedValuenumber,
    isDraggingCell: ReadonlySharedValueboolea,
    isTouchActiveNative: SharedValue[Boolean],
    panGestureState: SharedValue[State],
    placeholderOffset: SharedValue[Double],
    resetTouchedCell: () => Unit,
    scrollOffset: SharedValue[Double],
    scrollViewSize: SharedValue[Double],
    spacerIndexAnim: SharedValue[Double],
    touchPositionDiff: ReadonlySharedValuenumber,
    touchTranslate: SharedValue[Double]
  ): ActiveCellOffset = {
    val __obj = js.Dynamic.literal(activeCellOffset = activeCellOffset.asInstanceOf[js.Any], activeCellSize = activeCellSize.asInstanceOf[js.Any], activeIndexAnim = activeIndexAnim.asInstanceOf[js.Any], autoScrollDistance = autoScrollDistance.asInstanceOf[js.Any], containerSize = containerSize.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], horizontalAnim = horizontalAnim.asInstanceOf[js.Any], hoverAnim = hoverAnim.asInstanceOf[js.Any], hoverOffset = hoverOffset.asInstanceOf[js.Any], isDraggingCell = isDraggingCell.asInstanceOf[js.Any], isTouchActiveNative = isTouchActiveNative.asInstanceOf[js.Any], panGestureState = panGestureState.asInstanceOf[js.Any], placeholderOffset = placeholderOffset.asInstanceOf[js.Any], resetTouchedCell = js.Any.fromFunction0(resetTouchedCell), scrollOffset = scrollOffset.asInstanceOf[js.Any], scrollViewSize = scrollViewSize.asInstanceOf[js.Any], spacerIndexAnim = spacerIndexAnim.asInstanceOf[js.Any], touchPositionDiff = touchPositionDiff.asInstanceOf[js.Any], touchTranslate = touchTranslate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveCellOffset]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActiveCellOffset] (val x: Self) extends AnyVal {
    
    inline def setActiveCellOffset(value: SharedValue[Double]): Self = StObject.set(x, "activeCellOffset", value.asInstanceOf[js.Any])
    
    inline def setActiveCellSize(value: SharedValue[Double]): Self = StObject.set(x, "activeCellSize", value.asInstanceOf[js.Any])
    
    inline def setActiveIndexAnim(value: SharedValue[Double]): Self = StObject.set(x, "activeIndexAnim", value.asInstanceOf[js.Any])
    
    inline def setAutoScrollDistance(value: ReadonlySharedValuenumber): Self = StObject.set(x, "autoScrollDistance", value.asInstanceOf[js.Any])
    
    inline def setContainerSize(value: SharedValue[Double]): Self = StObject.set(x, "containerSize", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: SharedValue[Boolean]): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setHorizontalAnim(value: SharedValue[Boolean]): Self = StObject.set(x, "horizontalAnim", value.asInstanceOf[js.Any])
    
    inline def setHoverAnim(value: ReadonlySharedValuenumber): Self = StObject.set(x, "hoverAnim", value.asInstanceOf[js.Any])
    
    inline def setHoverOffset(value: ReadonlySharedValuenumber): Self = StObject.set(x, "hoverOffset", value.asInstanceOf[js.Any])
    
    inline def setIsDraggingCell(value: ReadonlySharedValueboolea): Self = StObject.set(x, "isDraggingCell", value.asInstanceOf[js.Any])
    
    inline def setIsTouchActiveNative(value: SharedValue[Boolean]): Self = StObject.set(x, "isTouchActiveNative", value.asInstanceOf[js.Any])
    
    inline def setPanGestureState(value: SharedValue[State]): Self = StObject.set(x, "panGestureState", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderOffset(value: SharedValue[Double]): Self = StObject.set(x, "placeholderOffset", value.asInstanceOf[js.Any])
    
    inline def setResetTouchedCell(value: () => Unit): Self = StObject.set(x, "resetTouchedCell", js.Any.fromFunction0(value))
    
    inline def setScrollOffset(value: SharedValue[Double]): Self = StObject.set(x, "scrollOffset", value.asInstanceOf[js.Any])
    
    inline def setScrollViewSize(value: SharedValue[Double]): Self = StObject.set(x, "scrollViewSize", value.asInstanceOf[js.Any])
    
    inline def setSpacerIndexAnim(value: SharedValue[Double]): Self = StObject.set(x, "spacerIndexAnim", value.asInstanceOf[js.Any])
    
    inline def setTouchPositionDiff(value: ReadonlySharedValuenumber): Self = StObject.set(x, "touchPositionDiff", value.asInstanceOf[js.Any])
    
    inline def setTouchTranslate(value: SharedValue[Double]): Self = StObject.set(x, "touchTranslate", value.asInstanceOf[js.Any])
  }
}
