package typings.reactAliceCarousel.anon

import typings.reactAliceCarousel.typesMod.TransformationSetItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-alice-carousel.react-alice-carousel/lib/types.State> */
@js.native
trait PartialState extends js.Object {
  
  var activeIndex: js.UndefOr[Double] = js.native
  
  var animationDuration: js.UndefOr[Double] = js.native
  
  var autoWidth: js.UndefOr[Boolean] = js.native
  
  var clones: js.UndefOr[js.Array[_]] = js.native
  
  var fadeoutAnimationIndex: js.UndefOr[Double | Null] = js.native
  
  var fadeoutAnimationPosition: js.UndefOr[Double | Null] = js.native
  
  var fadeoutAnimationProcessing: js.UndefOr[Boolean] = js.native
  
  var infinite: js.UndefOr[Boolean] = js.native
  
  var initialStageHeight: js.UndefOr[Double] = js.native
  
  var isAutoPlayCanceledOnAction: js.UndefOr[Boolean] = js.native
  
  var isAutoPlaying: js.UndefOr[Boolean] = js.native
  
  var isStageContentPartial: js.UndefOr[Boolean] = js.native
  
  var itemsCount: js.UndefOr[Double] = js.native
  
  var itemsInSlide: js.UndefOr[Double] = js.native
  
  var itemsOffset: js.UndefOr[Double] = js.native
  
  var stageContentWidth: js.UndefOr[Double] = js.native
  
  var stageWidth: js.UndefOr[Double] = js.native
  
  var swipeAllowedPositionMax: js.UndefOr[Double] = js.native
  
  var swipeLimitMax: js.UndefOr[Double] = js.native
  
  var swipeLimitMin: js.UndefOr[Double] = js.native
  
  var swipeShiftValue: js.UndefOr[Double] = js.native
  
  var transformationSet: js.UndefOr[js.Array[TransformationSetItem]] = js.native
  
  var transition: js.UndefOr[String] = js.native
  
  var translate3d: js.UndefOr[Double] = js.native
}
object PartialState {
  
  @scala.inline
  def apply(): PartialState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialState]
  }
  
  @scala.inline
  implicit class PartialStateOps[Self <: PartialState] (val x: Self) extends AnyVal {
    
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
    def setActiveIndex(value: Double): Self = this.set("activeIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveIndex: Self = this.set("activeIndex", js.undefined)
    
    @scala.inline
    def setAnimationDuration(value: Double): Self = this.set("animationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationDuration: Self = this.set("animationDuration", js.undefined)
    
    @scala.inline
    def setAutoWidth(value: Boolean): Self = this.set("autoWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoWidth: Self = this.set("autoWidth", js.undefined)
    
    @scala.inline
    def setClonesVarargs(value: js.Any*): Self = this.set("clones", js.Array(value :_*))
    
    @scala.inline
    def setClones(value: js.Array[_]): Self = this.set("clones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClones: Self = this.set("clones", js.undefined)
    
    @scala.inline
    def setFadeoutAnimationIndex(value: Double): Self = this.set("fadeoutAnimationIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFadeoutAnimationIndex: Self = this.set("fadeoutAnimationIndex", js.undefined)
    
    @scala.inline
    def setFadeoutAnimationIndexNull: Self = this.set("fadeoutAnimationIndex", null)
    
    @scala.inline
    def setFadeoutAnimationPosition(value: Double): Self = this.set("fadeoutAnimationPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFadeoutAnimationPosition: Self = this.set("fadeoutAnimationPosition", js.undefined)
    
    @scala.inline
    def setFadeoutAnimationPositionNull: Self = this.set("fadeoutAnimationPosition", null)
    
    @scala.inline
    def setFadeoutAnimationProcessing(value: Boolean): Self = this.set("fadeoutAnimationProcessing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFadeoutAnimationProcessing: Self = this.set("fadeoutAnimationProcessing", js.undefined)
    
    @scala.inline
    def setInfinite(value: Boolean): Self = this.set("infinite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInfinite: Self = this.set("infinite", js.undefined)
    
    @scala.inline
    def setInitialStageHeight(value: Double): Self = this.set("initialStageHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialStageHeight: Self = this.set("initialStageHeight", js.undefined)
    
    @scala.inline
    def setIsAutoPlayCanceledOnAction(value: Boolean): Self = this.set("isAutoPlayCanceledOnAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsAutoPlayCanceledOnAction: Self = this.set("isAutoPlayCanceledOnAction", js.undefined)
    
    @scala.inline
    def setIsAutoPlaying(value: Boolean): Self = this.set("isAutoPlaying", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsAutoPlaying: Self = this.set("isAutoPlaying", js.undefined)
    
    @scala.inline
    def setIsStageContentPartial(value: Boolean): Self = this.set("isStageContentPartial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsStageContentPartial: Self = this.set("isStageContentPartial", js.undefined)
    
    @scala.inline
    def setItemsCount(value: Double): Self = this.set("itemsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemsCount: Self = this.set("itemsCount", js.undefined)
    
    @scala.inline
    def setItemsInSlide(value: Double): Self = this.set("itemsInSlide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemsInSlide: Self = this.set("itemsInSlide", js.undefined)
    
    @scala.inline
    def setItemsOffset(value: Double): Self = this.set("itemsOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemsOffset: Self = this.set("itemsOffset", js.undefined)
    
    @scala.inline
    def setStageContentWidth(value: Double): Self = this.set("stageContentWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStageContentWidth: Self = this.set("stageContentWidth", js.undefined)
    
    @scala.inline
    def setStageWidth(value: Double): Self = this.set("stageWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStageWidth: Self = this.set("stageWidth", js.undefined)
    
    @scala.inline
    def setSwipeAllowedPositionMax(value: Double): Self = this.set("swipeAllowedPositionMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwipeAllowedPositionMax: Self = this.set("swipeAllowedPositionMax", js.undefined)
    
    @scala.inline
    def setSwipeLimitMax(value: Double): Self = this.set("swipeLimitMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwipeLimitMax: Self = this.set("swipeLimitMax", js.undefined)
    
    @scala.inline
    def setSwipeLimitMin(value: Double): Self = this.set("swipeLimitMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwipeLimitMin: Self = this.set("swipeLimitMin", js.undefined)
    
    @scala.inline
    def setSwipeShiftValue(value: Double): Self = this.set("swipeShiftValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwipeShiftValue: Self = this.set("swipeShiftValue", js.undefined)
    
    @scala.inline
    def setTransformationSetVarargs(value: TransformationSetItem*): Self = this.set("transformationSet", js.Array(value :_*))
    
    @scala.inline
    def setTransformationSet(value: js.Array[TransformationSetItem]): Self = this.set("transformationSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransformationSet: Self = this.set("transformationSet", js.undefined)
    
    @scala.inline
    def setTransition(value: String): Self = this.set("transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransition: Self = this.set("transition", js.undefined)
    
    @scala.inline
    def setTranslate3d(value: Double): Self = this.set("translate3d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranslate3d: Self = this.set("translate3d", js.undefined)
  }
}
