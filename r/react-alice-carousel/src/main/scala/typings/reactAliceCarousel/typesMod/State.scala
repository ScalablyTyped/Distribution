package typings.reactAliceCarousel.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait State extends StObject {
  
  var activeIndex: Double
  
  var animationDuration: js.UndefOr[Double] = js.undefined
  
  var autoWidth: Boolean
  
  var clones: js.Array[js.Any]
  
  var fadeoutAnimationIndex: Double | Null
  
  var fadeoutAnimationPosition: Double | Null
  
  var fadeoutAnimationProcessing: Boolean
  
  var infinite: js.UndefOr[Boolean] = js.undefined
  
  var initialStageHeight: Double
  
  var isAutoPlayCanceledOnAction: Boolean
  
  var isAutoPlaying: Boolean
  
  var isStageContentPartial: Boolean
  
  var itemsCount: Double
  
  var itemsInSlide: Double
  
  var itemsOffset: Double
  
  var stageContentWidth: Double
  
  var stageWidth: Double
  
  var swipeAllowedPositionMax: Double
  
  var swipeLimitMax: Double
  
  var swipeLimitMin: Double
  
  var swipeShiftValue: Double
  
  var transformationSet: js.Array[TransformationSetItem]
  
  var transition: String
  
  var translate3d: Double
}
object State {
  
  inline def apply(
    activeIndex: Double,
    autoWidth: Boolean,
    clones: js.Array[js.Any],
    fadeoutAnimationProcessing: Boolean,
    initialStageHeight: Double,
    isAutoPlayCanceledOnAction: Boolean,
    isAutoPlaying: Boolean,
    isStageContentPartial: Boolean,
    itemsCount: Double,
    itemsInSlide: Double,
    itemsOffset: Double,
    stageContentWidth: Double,
    stageWidth: Double,
    swipeAllowedPositionMax: Double,
    swipeLimitMax: Double,
    swipeLimitMin: Double,
    swipeShiftValue: Double,
    transformationSet: js.Array[TransformationSetItem],
    transition: String,
    translate3d: Double
  ): State = {
    val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any], autoWidth = autoWidth.asInstanceOf[js.Any], clones = clones.asInstanceOf[js.Any], fadeoutAnimationProcessing = fadeoutAnimationProcessing.asInstanceOf[js.Any], initialStageHeight = initialStageHeight.asInstanceOf[js.Any], isAutoPlayCanceledOnAction = isAutoPlayCanceledOnAction.asInstanceOf[js.Any], isAutoPlaying = isAutoPlaying.asInstanceOf[js.Any], isStageContentPartial = isStageContentPartial.asInstanceOf[js.Any], itemsCount = itemsCount.asInstanceOf[js.Any], itemsInSlide = itemsInSlide.asInstanceOf[js.Any], itemsOffset = itemsOffset.asInstanceOf[js.Any], stageContentWidth = stageContentWidth.asInstanceOf[js.Any], stageWidth = stageWidth.asInstanceOf[js.Any], swipeAllowedPositionMax = swipeAllowedPositionMax.asInstanceOf[js.Any], swipeLimitMax = swipeLimitMax.asInstanceOf[js.Any], swipeLimitMin = swipeLimitMin.asInstanceOf[js.Any], swipeShiftValue = swipeShiftValue.asInstanceOf[js.Any], transformationSet = transformationSet.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any], translate3d = translate3d.asInstanceOf[js.Any], fadeoutAnimationIndex = null, fadeoutAnimationPosition = null)
    __obj.asInstanceOf[State]
  }
  
  extension [Self <: State](x: Self) {
    
    inline def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
    
    inline def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
    
    inline def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
    
    inline def setAutoWidth(value: Boolean): Self = StObject.set(x, "autoWidth", value.asInstanceOf[js.Any])
    
    inline def setClones(value: js.Array[js.Any]): Self = StObject.set(x, "clones", value.asInstanceOf[js.Any])
    
    inline def setClonesVarargs(value: js.Any*): Self = StObject.set(x, "clones", js.Array(value :_*))
    
    inline def setFadeoutAnimationIndex(value: Double): Self = StObject.set(x, "fadeoutAnimationIndex", value.asInstanceOf[js.Any])
    
    inline def setFadeoutAnimationIndexNull: Self = StObject.set(x, "fadeoutAnimationIndex", null)
    
    inline def setFadeoutAnimationPosition(value: Double): Self = StObject.set(x, "fadeoutAnimationPosition", value.asInstanceOf[js.Any])
    
    inline def setFadeoutAnimationPositionNull: Self = StObject.set(x, "fadeoutAnimationPosition", null)
    
    inline def setFadeoutAnimationProcessing(value: Boolean): Self = StObject.set(x, "fadeoutAnimationProcessing", value.asInstanceOf[js.Any])
    
    inline def setInfinite(value: Boolean): Self = StObject.set(x, "infinite", value.asInstanceOf[js.Any])
    
    inline def setInfiniteUndefined: Self = StObject.set(x, "infinite", js.undefined)
    
    inline def setInitialStageHeight(value: Double): Self = StObject.set(x, "initialStageHeight", value.asInstanceOf[js.Any])
    
    inline def setIsAutoPlayCanceledOnAction(value: Boolean): Self = StObject.set(x, "isAutoPlayCanceledOnAction", value.asInstanceOf[js.Any])
    
    inline def setIsAutoPlaying(value: Boolean): Self = StObject.set(x, "isAutoPlaying", value.asInstanceOf[js.Any])
    
    inline def setIsStageContentPartial(value: Boolean): Self = StObject.set(x, "isStageContentPartial", value.asInstanceOf[js.Any])
    
    inline def setItemsCount(value: Double): Self = StObject.set(x, "itemsCount", value.asInstanceOf[js.Any])
    
    inline def setItemsInSlide(value: Double): Self = StObject.set(x, "itemsInSlide", value.asInstanceOf[js.Any])
    
    inline def setItemsOffset(value: Double): Self = StObject.set(x, "itemsOffset", value.asInstanceOf[js.Any])
    
    inline def setStageContentWidth(value: Double): Self = StObject.set(x, "stageContentWidth", value.asInstanceOf[js.Any])
    
    inline def setStageWidth(value: Double): Self = StObject.set(x, "stageWidth", value.asInstanceOf[js.Any])
    
    inline def setSwipeAllowedPositionMax(value: Double): Self = StObject.set(x, "swipeAllowedPositionMax", value.asInstanceOf[js.Any])
    
    inline def setSwipeLimitMax(value: Double): Self = StObject.set(x, "swipeLimitMax", value.asInstanceOf[js.Any])
    
    inline def setSwipeLimitMin(value: Double): Self = StObject.set(x, "swipeLimitMin", value.asInstanceOf[js.Any])
    
    inline def setSwipeShiftValue(value: Double): Self = StObject.set(x, "swipeShiftValue", value.asInstanceOf[js.Any])
    
    inline def setTransformationSet(value: js.Array[TransformationSetItem]): Self = StObject.set(x, "transformationSet", value.asInstanceOf[js.Any])
    
    inline def setTransformationSetVarargs(value: TransformationSetItem*): Self = StObject.set(x, "transformationSet", js.Array(value :_*))
    
    inline def setTransition(value: String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    inline def setTranslate3d(value: Double): Self = StObject.set(x, "translate3d", value.asInstanceOf[js.Any])
  }
}
