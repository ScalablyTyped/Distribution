package typings.reactAliceCarousel.anon

import typings.reactAliceCarousel.libTypesMod.ItemCoords
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-alice-carousel.react-alice-carousel/lib/types.State> */
trait PartialState extends StObject {
  
  var activeIndex: js.UndefOr[Double] = js.undefined
  
  var animationDuration: js.UndefOr[Double] = js.undefined
  
  var autoWidth: js.UndefOr[Boolean] = js.undefined
  
  var canUseDom: js.UndefOr[Boolean] = js.undefined
  
  var clones: js.UndefOr[js.Array[Any]] = js.undefined
  
  var fadeoutAnimationIndex: js.UndefOr[Double | Null] = js.undefined
  
  var fadeoutAnimationPosition: js.UndefOr[Double | Null] = js.undefined
  
  var fadeoutAnimationProcessing: js.UndefOr[Boolean] = js.undefined
  
  var infinite: js.UndefOr[Boolean] = js.undefined
  
  var initialStageHeight: js.UndefOr[Double] = js.undefined
  
  var isAutoPlayCanceledOnAction: js.UndefOr[Boolean] = js.undefined
  
  var isAutoPlaying: js.UndefOr[Boolean] = js.undefined
  
  var isStageContentPartial: js.UndefOr[Boolean] = js.undefined
  
  var itemsCount: js.UndefOr[Double] = js.undefined
  
  var itemsInSlide: js.UndefOr[Double] = js.undefined
  
  var itemsOffset: js.UndefOr[Double] = js.undefined
  
  var stageContentWidth: js.UndefOr[Double] = js.undefined
  
  var stageWidth: js.UndefOr[Double] = js.undefined
  
  var swipeAllowedPositionMax: js.UndefOr[Double] = js.undefined
  
  var swipeLimitMax: js.UndefOr[Double] = js.undefined
  
  var swipeLimitMin: js.UndefOr[Double] = js.undefined
  
  var swipeShiftValue: js.UndefOr[Double] = js.undefined
  
  var transformationSet: js.UndefOr[js.Array[ItemCoords]] = js.undefined
  
  var transition: js.UndefOr[String] = js.undefined
  
  var translate3d: js.UndefOr[Double] = js.undefined
}
object PartialState {
  
  inline def apply(): PartialState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialState] (val x: Self) extends AnyVal {
    
    inline def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
    
    inline def setActiveIndexUndefined: Self = StObject.set(x, "activeIndex", js.undefined)
    
    inline def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
    
    inline def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
    
    inline def setAutoWidth(value: Boolean): Self = StObject.set(x, "autoWidth", value.asInstanceOf[js.Any])
    
    inline def setAutoWidthUndefined: Self = StObject.set(x, "autoWidth", js.undefined)
    
    inline def setCanUseDom(value: Boolean): Self = StObject.set(x, "canUseDom", value.asInstanceOf[js.Any])
    
    inline def setCanUseDomUndefined: Self = StObject.set(x, "canUseDom", js.undefined)
    
    inline def setClones(value: js.Array[Any]): Self = StObject.set(x, "clones", value.asInstanceOf[js.Any])
    
    inline def setClonesUndefined: Self = StObject.set(x, "clones", js.undefined)
    
    inline def setClonesVarargs(value: Any*): Self = StObject.set(x, "clones", js.Array(value*))
    
    inline def setFadeoutAnimationIndex(value: Double): Self = StObject.set(x, "fadeoutAnimationIndex", value.asInstanceOf[js.Any])
    
    inline def setFadeoutAnimationIndexNull: Self = StObject.set(x, "fadeoutAnimationIndex", null)
    
    inline def setFadeoutAnimationIndexUndefined: Self = StObject.set(x, "fadeoutAnimationIndex", js.undefined)
    
    inline def setFadeoutAnimationPosition(value: Double): Self = StObject.set(x, "fadeoutAnimationPosition", value.asInstanceOf[js.Any])
    
    inline def setFadeoutAnimationPositionNull: Self = StObject.set(x, "fadeoutAnimationPosition", null)
    
    inline def setFadeoutAnimationPositionUndefined: Self = StObject.set(x, "fadeoutAnimationPosition", js.undefined)
    
    inline def setFadeoutAnimationProcessing(value: Boolean): Self = StObject.set(x, "fadeoutAnimationProcessing", value.asInstanceOf[js.Any])
    
    inline def setFadeoutAnimationProcessingUndefined: Self = StObject.set(x, "fadeoutAnimationProcessing", js.undefined)
    
    inline def setInfinite(value: Boolean): Self = StObject.set(x, "infinite", value.asInstanceOf[js.Any])
    
    inline def setInfiniteUndefined: Self = StObject.set(x, "infinite", js.undefined)
    
    inline def setInitialStageHeight(value: Double): Self = StObject.set(x, "initialStageHeight", value.asInstanceOf[js.Any])
    
    inline def setInitialStageHeightUndefined: Self = StObject.set(x, "initialStageHeight", js.undefined)
    
    inline def setIsAutoPlayCanceledOnAction(value: Boolean): Self = StObject.set(x, "isAutoPlayCanceledOnAction", value.asInstanceOf[js.Any])
    
    inline def setIsAutoPlayCanceledOnActionUndefined: Self = StObject.set(x, "isAutoPlayCanceledOnAction", js.undefined)
    
    inline def setIsAutoPlaying(value: Boolean): Self = StObject.set(x, "isAutoPlaying", value.asInstanceOf[js.Any])
    
    inline def setIsAutoPlayingUndefined: Self = StObject.set(x, "isAutoPlaying", js.undefined)
    
    inline def setIsStageContentPartial(value: Boolean): Self = StObject.set(x, "isStageContentPartial", value.asInstanceOf[js.Any])
    
    inline def setIsStageContentPartialUndefined: Self = StObject.set(x, "isStageContentPartial", js.undefined)
    
    inline def setItemsCount(value: Double): Self = StObject.set(x, "itemsCount", value.asInstanceOf[js.Any])
    
    inline def setItemsCountUndefined: Self = StObject.set(x, "itemsCount", js.undefined)
    
    inline def setItemsInSlide(value: Double): Self = StObject.set(x, "itemsInSlide", value.asInstanceOf[js.Any])
    
    inline def setItemsInSlideUndefined: Self = StObject.set(x, "itemsInSlide", js.undefined)
    
    inline def setItemsOffset(value: Double): Self = StObject.set(x, "itemsOffset", value.asInstanceOf[js.Any])
    
    inline def setItemsOffsetUndefined: Self = StObject.set(x, "itemsOffset", js.undefined)
    
    inline def setStageContentWidth(value: Double): Self = StObject.set(x, "stageContentWidth", value.asInstanceOf[js.Any])
    
    inline def setStageContentWidthUndefined: Self = StObject.set(x, "stageContentWidth", js.undefined)
    
    inline def setStageWidth(value: Double): Self = StObject.set(x, "stageWidth", value.asInstanceOf[js.Any])
    
    inline def setStageWidthUndefined: Self = StObject.set(x, "stageWidth", js.undefined)
    
    inline def setSwipeAllowedPositionMax(value: Double): Self = StObject.set(x, "swipeAllowedPositionMax", value.asInstanceOf[js.Any])
    
    inline def setSwipeAllowedPositionMaxUndefined: Self = StObject.set(x, "swipeAllowedPositionMax", js.undefined)
    
    inline def setSwipeLimitMax(value: Double): Self = StObject.set(x, "swipeLimitMax", value.asInstanceOf[js.Any])
    
    inline def setSwipeLimitMaxUndefined: Self = StObject.set(x, "swipeLimitMax", js.undefined)
    
    inline def setSwipeLimitMin(value: Double): Self = StObject.set(x, "swipeLimitMin", value.asInstanceOf[js.Any])
    
    inline def setSwipeLimitMinUndefined: Self = StObject.set(x, "swipeLimitMin", js.undefined)
    
    inline def setSwipeShiftValue(value: Double): Self = StObject.set(x, "swipeShiftValue", value.asInstanceOf[js.Any])
    
    inline def setSwipeShiftValueUndefined: Self = StObject.set(x, "swipeShiftValue", js.undefined)
    
    inline def setTransformationSet(value: js.Array[ItemCoords]): Self = StObject.set(x, "transformationSet", value.asInstanceOf[js.Any])
    
    inline def setTransformationSetUndefined: Self = StObject.set(x, "transformationSet", js.undefined)
    
    inline def setTransformationSetVarargs(value: ItemCoords*): Self = StObject.set(x, "transformationSet", js.Array(value*))
    
    inline def setTransition(value: String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    
    inline def setTranslate3d(value: Double): Self = StObject.set(x, "translate3d", value.asInstanceOf[js.Any])
    
    inline def setTranslate3dUndefined: Self = StObject.set(x, "translate3d", js.undefined)
  }
}
