package typings.reactAliceCarousel.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait State extends StObject {
  
  var activeIndex: Double = js.native
  
  var animationDuration: js.UndefOr[Double] = js.native
  
  var autoWidth: Boolean = js.native
  
  var clones: js.Array[_] = js.native
  
  var fadeoutAnimationIndex: Double | Null = js.native
  
  var fadeoutAnimationPosition: Double | Null = js.native
  
  var fadeoutAnimationProcessing: Boolean = js.native
  
  var infinite: js.UndefOr[Boolean] = js.native
  
  var initialStageHeight: Double = js.native
  
  var isAutoPlayCanceledOnAction: Boolean = js.native
  
  var isAutoPlaying: Boolean = js.native
  
  var isStageContentPartial: Boolean = js.native
  
  var itemsCount: Double = js.native
  
  var itemsInSlide: Double = js.native
  
  var itemsOffset: Double = js.native
  
  var stageContentWidth: Double = js.native
  
  var stageWidth: Double = js.native
  
  var swipeAllowedPositionMax: Double = js.native
  
  var swipeLimitMax: Double = js.native
  
  var swipeLimitMin: Double = js.native
  
  var swipeShiftValue: Double = js.native
  
  var transformationSet: js.Array[TransformationSetItem] = js.native
  
  var transition: String = js.native
  
  var translate3d: Double = js.native
}
object State {
  
  @scala.inline
  def apply(
    activeIndex: Double,
    autoWidth: Boolean,
    clones: js.Array[_],
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
    val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any], autoWidth = autoWidth.asInstanceOf[js.Any], clones = clones.asInstanceOf[js.Any], fadeoutAnimationProcessing = fadeoutAnimationProcessing.asInstanceOf[js.Any], initialStageHeight = initialStageHeight.asInstanceOf[js.Any], isAutoPlayCanceledOnAction = isAutoPlayCanceledOnAction.asInstanceOf[js.Any], isAutoPlaying = isAutoPlaying.asInstanceOf[js.Any], isStageContentPartial = isStageContentPartial.asInstanceOf[js.Any], itemsCount = itemsCount.asInstanceOf[js.Any], itemsInSlide = itemsInSlide.asInstanceOf[js.Any], itemsOffset = itemsOffset.asInstanceOf[js.Any], stageContentWidth = stageContentWidth.asInstanceOf[js.Any], stageWidth = stageWidth.asInstanceOf[js.Any], swipeAllowedPositionMax = swipeAllowedPositionMax.asInstanceOf[js.Any], swipeLimitMax = swipeLimitMax.asInstanceOf[js.Any], swipeLimitMin = swipeLimitMin.asInstanceOf[js.Any], swipeShiftValue = swipeShiftValue.asInstanceOf[js.Any], transformationSet = transformationSet.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any], translate3d = translate3d.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
  
  @scala.inline
  implicit class StateMutableBuilder[Self <: State] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
    
    @scala.inline
    def setAutoWidth(value: Boolean): Self = StObject.set(x, "autoWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClones(value: js.Array[_]): Self = StObject.set(x, "clones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClonesVarargs(value: js.Any*): Self = StObject.set(x, "clones", js.Array(value :_*))
    
    @scala.inline
    def setFadeoutAnimationIndex(value: Double): Self = StObject.set(x, "fadeoutAnimationIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFadeoutAnimationIndexNull: Self = StObject.set(x, "fadeoutAnimationIndex", null)
    
    @scala.inline
    def setFadeoutAnimationPosition(value: Double): Self = StObject.set(x, "fadeoutAnimationPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFadeoutAnimationPositionNull: Self = StObject.set(x, "fadeoutAnimationPosition", null)
    
    @scala.inline
    def setFadeoutAnimationProcessing(value: Boolean): Self = StObject.set(x, "fadeoutAnimationProcessing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfinite(value: Boolean): Self = StObject.set(x, "infinite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfiniteUndefined: Self = StObject.set(x, "infinite", js.undefined)
    
    @scala.inline
    def setInitialStageHeight(value: Double): Self = StObject.set(x, "initialStageHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAutoPlayCanceledOnAction(value: Boolean): Self = StObject.set(x, "isAutoPlayCanceledOnAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAutoPlaying(value: Boolean): Self = StObject.set(x, "isAutoPlaying", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsStageContentPartial(value: Boolean): Self = StObject.set(x, "isStageContentPartial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsCount(value: Double): Self = StObject.set(x, "itemsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsInSlide(value: Double): Self = StObject.set(x, "itemsInSlide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsOffset(value: Double): Self = StObject.set(x, "itemsOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStageContentWidth(value: Double): Self = StObject.set(x, "stageContentWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStageWidth(value: Double): Self = StObject.set(x, "stageWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipeAllowedPositionMax(value: Double): Self = StObject.set(x, "swipeAllowedPositionMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipeLimitMax(value: Double): Self = StObject.set(x, "swipeLimitMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipeLimitMin(value: Double): Self = StObject.set(x, "swipeLimitMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipeShiftValue(value: Double): Self = StObject.set(x, "swipeShiftValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformationSet(value: js.Array[TransformationSetItem]): Self = StObject.set(x, "transformationSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformationSetVarargs(value: TransformationSetItem*): Self = StObject.set(x, "transformationSet", js.Array(value :_*))
    
    @scala.inline
    def setTransition(value: String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslate3d(value: Double): Self = StObject.set(x, "translate3d", value.asInstanceOf[js.Any])
  }
}
