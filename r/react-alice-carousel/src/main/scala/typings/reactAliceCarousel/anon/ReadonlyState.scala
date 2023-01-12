package typings.reactAliceCarousel.anon

import typings.reactAliceCarousel.libTypesMod.ItemCoords
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<react-alice-carousel.react-alice-carousel/lib/types.State> */
trait ReadonlyState extends StObject {
  
  val activeIndex: Double
  
  val animationDuration: js.UndefOr[Double] = js.undefined
  
  val autoWidth: Boolean
  
  val canUseDom: Boolean
  
  val clones: js.Array[Any]
  
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
  
  val transformationSet: js.Array[ItemCoords]
  
  val transition: String
  
  val translate3d: Double
}
object ReadonlyState {
  
  inline def apply(
    activeIndex: Double,
    autoWidth: Boolean,
    canUseDom: Boolean,
    clones: js.Array[Any],
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
    transformationSet: js.Array[ItemCoords],
    transition: String,
    translate3d: Double
  ): ReadonlyState = {
    val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any], autoWidth = autoWidth.asInstanceOf[js.Any], canUseDom = canUseDom.asInstanceOf[js.Any], clones = clones.asInstanceOf[js.Any], fadeoutAnimationProcessing = fadeoutAnimationProcessing.asInstanceOf[js.Any], initialStageHeight = initialStageHeight.asInstanceOf[js.Any], isAutoPlayCanceledOnAction = isAutoPlayCanceledOnAction.asInstanceOf[js.Any], isAutoPlaying = isAutoPlaying.asInstanceOf[js.Any], isStageContentPartial = isStageContentPartial.asInstanceOf[js.Any], itemsCount = itemsCount.asInstanceOf[js.Any], itemsInSlide = itemsInSlide.asInstanceOf[js.Any], itemsOffset = itemsOffset.asInstanceOf[js.Any], stageContentWidth = stageContentWidth.asInstanceOf[js.Any], stageWidth = stageWidth.asInstanceOf[js.Any], swipeAllowedPositionMax = swipeAllowedPositionMax.asInstanceOf[js.Any], swipeLimitMax = swipeLimitMax.asInstanceOf[js.Any], swipeLimitMin = swipeLimitMin.asInstanceOf[js.Any], swipeShiftValue = swipeShiftValue.asInstanceOf[js.Any], transformationSet = transformationSet.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any], translate3d = translate3d.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadonlyState] (val x: Self) extends AnyVal {
    
    inline def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
    
    inline def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
    
    inline def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
    
    inline def setAutoWidth(value: Boolean): Self = StObject.set(x, "autoWidth", value.asInstanceOf[js.Any])
    
    inline def setCanUseDom(value: Boolean): Self = StObject.set(x, "canUseDom", value.asInstanceOf[js.Any])
    
    inline def setClones(value: js.Array[Any]): Self = StObject.set(x, "clones", value.asInstanceOf[js.Any])
    
    inline def setClonesVarargs(value: Any*): Self = StObject.set(x, "clones", js.Array(value*))
    
    inline def setFadeoutAnimationIndex(value: Double): Self = StObject.set(x, "fadeoutAnimationIndex", value.asInstanceOf[js.Any])
    
    inline def setFadeoutAnimationIndexNull: Self = StObject.set(x, "fadeoutAnimationIndex", null)
    
    inline def setFadeoutAnimationIndexUndefined: Self = StObject.set(x, "fadeoutAnimationIndex", js.undefined)
    
    inline def setFadeoutAnimationPosition(value: Double): Self = StObject.set(x, "fadeoutAnimationPosition", value.asInstanceOf[js.Any])
    
    inline def setFadeoutAnimationPositionNull: Self = StObject.set(x, "fadeoutAnimationPosition", null)
    
    inline def setFadeoutAnimationPositionUndefined: Self = StObject.set(x, "fadeoutAnimationPosition", js.undefined)
    
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
    
    inline def setTransformationSet(value: js.Array[ItemCoords]): Self = StObject.set(x, "transformationSet", value.asInstanceOf[js.Any])
    
    inline def setTransformationSetVarargs(value: ItemCoords*): Self = StObject.set(x, "transformationSet", js.Array(value*))
    
    inline def setTransition(value: String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    inline def setTranslate3d(value: Double): Self = StObject.set(x, "translate3d", value.asInstanceOf[js.Any])
  }
}
