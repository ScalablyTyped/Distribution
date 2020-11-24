package typings.reactAliceCarousel.anon

import typings.reactAliceCarousel.typesMod.TransformationSetItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<react-alice-carousel.react-alice-carousel/lib/types.State> */
@js.native
trait ReadonlyState extends js.Object {
  
  val activeIndex: Double = js.native
  
  val animationDuration: js.UndefOr[Double] = js.native
  
  val autoWidth: Boolean = js.native
  
  val clones: js.Array[_] = js.native
  
  val fadeoutAnimationIndex: js.UndefOr[Double | Null] = js.native
  
  val fadeoutAnimationPosition: js.UndefOr[Double | Null] = js.native
  
  val fadeoutAnimationProcessing: Boolean = js.native
  
  val infinite: js.UndefOr[Boolean] = js.native
  
  val initialStageHeight: Double = js.native
  
  val isAutoPlayCanceledOnAction: Boolean = js.native
  
  val isAutoPlaying: Boolean = js.native
  
  val isStageContentPartial: Boolean = js.native
  
  val itemsCount: Double = js.native
  
  val itemsInSlide: Double = js.native
  
  val itemsOffset: Double = js.native
  
  val stageContentWidth: Double = js.native
  
  val stageWidth: Double = js.native
  
  val swipeAllowedPositionMax: Double = js.native
  
  val swipeLimitMax: Double = js.native
  
  val swipeLimitMin: Double = js.native
  
  val swipeShiftValue: Double = js.native
  
  val transformationSet: js.Array[TransformationSetItem] = js.native
  
  val transition: String = js.native
  
  val translate3d: Double = js.native
}
object ReadonlyState {
  
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
  ): ReadonlyState = {
    val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any], autoWidth = autoWidth.asInstanceOf[js.Any], clones = clones.asInstanceOf[js.Any], fadeoutAnimationProcessing = fadeoutAnimationProcessing.asInstanceOf[js.Any], initialStageHeight = initialStageHeight.asInstanceOf[js.Any], isAutoPlayCanceledOnAction = isAutoPlayCanceledOnAction.asInstanceOf[js.Any], isAutoPlaying = isAutoPlaying.asInstanceOf[js.Any], isStageContentPartial = isStageContentPartial.asInstanceOf[js.Any], itemsCount = itemsCount.asInstanceOf[js.Any], itemsInSlide = itemsInSlide.asInstanceOf[js.Any], itemsOffset = itemsOffset.asInstanceOf[js.Any], stageContentWidth = stageContentWidth.asInstanceOf[js.Any], stageWidth = stageWidth.asInstanceOf[js.Any], swipeAllowedPositionMax = swipeAllowedPositionMax.asInstanceOf[js.Any], swipeLimitMax = swipeLimitMax.asInstanceOf[js.Any], swipeLimitMin = swipeLimitMin.asInstanceOf[js.Any], swipeShiftValue = swipeShiftValue.asInstanceOf[js.Any], transformationSet = transformationSet.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any], translate3d = translate3d.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyState]
  }
  
  @scala.inline
  implicit class ReadonlyStateOps[Self <: ReadonlyState] (val x: Self) extends AnyVal {
    
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
    def setAutoWidth(value: Boolean): Self = this.set("autoWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClonesVarargs(value: js.Any*): Self = this.set("clones", js.Array(value :_*))
    
    @scala.inline
    def setClones(value: js.Array[_]): Self = this.set("clones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFadeoutAnimationProcessing(value: Boolean): Self = this.set("fadeoutAnimationProcessing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialStageHeight(value: Double): Self = this.set("initialStageHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAutoPlayCanceledOnAction(value: Boolean): Self = this.set("isAutoPlayCanceledOnAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAutoPlaying(value: Boolean): Self = this.set("isAutoPlaying", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsStageContentPartial(value: Boolean): Self = this.set("isStageContentPartial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsCount(value: Double): Self = this.set("itemsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsInSlide(value: Double): Self = this.set("itemsInSlide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsOffset(value: Double): Self = this.set("itemsOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStageContentWidth(value: Double): Self = this.set("stageContentWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStageWidth(value: Double): Self = this.set("stageWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipeAllowedPositionMax(value: Double): Self = this.set("swipeAllowedPositionMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipeLimitMax(value: Double): Self = this.set("swipeLimitMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipeLimitMin(value: Double): Self = this.set("swipeLimitMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipeShiftValue(value: Double): Self = this.set("swipeShiftValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformationSetVarargs(value: TransformationSetItem*): Self = this.set("transformationSet", js.Array(value :_*))
    
    @scala.inline
    def setTransformationSet(value: js.Array[TransformationSetItem]): Self = this.set("transformationSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransition(value: String): Self = this.set("transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslate3d(value: Double): Self = this.set("translate3d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationDuration(value: Double): Self = this.set("animationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationDuration: Self = this.set("animationDuration", js.undefined)
    
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
    def setInfinite(value: Boolean): Self = this.set("infinite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInfinite: Self = this.set("infinite", js.undefined)
  }
}
