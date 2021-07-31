package typings.reactAliceCarousel.anon

import typings.reactAliceCarousel.typesMod.TransformationSetItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<react-alice-carousel.react-alice-carousel/lib/types.State> */
trait ReadonlyState extends StObject {
  
  val activeIndex: Double
  
  val animationDuration: js.UndefOr[Double] = js.undefined
  
  val autoWidth: Boolean
  
  val clones: js.Array[js.Any]
  
  val fadeoutAnimationIndex: js.UndefOr[Double | Null] = js.undefined
  
  val fadeoutAnimationPosition: js.UndefOr[Double | Null] = js.undefined
  
  val fadeoutAnimationProcessing: Boolean
  
  val infinite: js.UndefOr[Boolean] = js.undefined
  
  val initialStageHeight: Double
  
  val isAutoPlayCanceledOnAction: Boolean
  
  val isAutoPlaying: Boolean
  
  val isStageContentPartial: Boolean
  
  val itemsCount: Double
  
  val itemsInSlide: Double
  
  val itemsOffset: Double
  
  val stageContentWidth: Double
  
  val stageWidth: Double
  
  val swipeAllowedPositionMax: Double
  
  val swipeLimitMax: Double
  
  val swipeLimitMin: Double
  
  val swipeShiftValue: Double
  
  val transformationSet: js.Array[TransformationSetItem]
  
  val transition: String
  
  val translate3d: Double
}
object ReadonlyState {
  
  @scala.inline
  def apply(
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
  ): ReadonlyState = {
    val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any], autoWidth = autoWidth.asInstanceOf[js.Any], clones = clones.asInstanceOf[js.Any], fadeoutAnimationProcessing = fadeoutAnimationProcessing.asInstanceOf[js.Any], initialStageHeight = initialStageHeight.asInstanceOf[js.Any], isAutoPlayCanceledOnAction = isAutoPlayCanceledOnAction.asInstanceOf[js.Any], isAutoPlaying = isAutoPlaying.asInstanceOf[js.Any], isStageContentPartial = isStageContentPartial.asInstanceOf[js.Any], itemsCount = itemsCount.asInstanceOf[js.Any], itemsInSlide = itemsInSlide.asInstanceOf[js.Any], itemsOffset = itemsOffset.asInstanceOf[js.Any], stageContentWidth = stageContentWidth.asInstanceOf[js.Any], stageWidth = stageWidth.asInstanceOf[js.Any], swipeAllowedPositionMax = swipeAllowedPositionMax.asInstanceOf[js.Any], swipeLimitMax = swipeLimitMax.asInstanceOf[js.Any], swipeLimitMin = swipeLimitMin.asInstanceOf[js.Any], swipeShiftValue = swipeShiftValue.asInstanceOf[js.Any], transformationSet = transformationSet.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any], translate3d = translate3d.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyState]
  }
  
  @scala.inline
  implicit class ReadonlyStateMutableBuilder[Self <: ReadonlyState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
    
    @scala.inline
    def setAutoWidth(value: Boolean): Self = StObject.set(x, "autoWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClones(value: js.Array[js.Any]): Self = StObject.set(x, "clones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClonesVarargs(value: js.Any*): Self = StObject.set(x, "clones", js.Array(value :_*))
    
    @scala.inline
    def setFadeoutAnimationIndex(value: Double): Self = StObject.set(x, "fadeoutAnimationIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFadeoutAnimationIndexNull: Self = StObject.set(x, "fadeoutAnimationIndex", null)
    
    @scala.inline
    def setFadeoutAnimationIndexUndefined: Self = StObject.set(x, "fadeoutAnimationIndex", js.undefined)
    
    @scala.inline
    def setFadeoutAnimationPosition(value: Double): Self = StObject.set(x, "fadeoutAnimationPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFadeoutAnimationPositionNull: Self = StObject.set(x, "fadeoutAnimationPosition", null)
    
    @scala.inline
    def setFadeoutAnimationPositionUndefined: Self = StObject.set(x, "fadeoutAnimationPosition", js.undefined)
    
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
