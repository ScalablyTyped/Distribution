package typings.reactAliceCarousel

import typings.reactAliceCarousel.anon.AnimationDuration
import typings.reactAliceCarousel.anon.Height
import typings.reactAliceCarousel.anon.IsPrevSlideDisabled
import typings.reactAliceCarousel.anon.PaddingLeft
import typings.reactAliceCarousel.anon.PartialProps
import typings.reactAliceCarousel.anon.PartialState
import typings.reactAliceCarousel.anon.SlideIndex
import typings.reactAliceCarousel.anon.Transform
import typings.reactAliceCarousel.reactAliceCarouselNumbers.`0`
import typings.reactAliceCarousel.reactAliceCarouselNumbers.`1`
import typings.reactAliceCarousel.typesMod.Props
import typings.reactAliceCarousel.typesMod.RootElement
import typings.reactAliceCarousel.typesMod.State
import typings.reactAliceCarousel.typesMod.Style
import typings.reactAliceCarousel.typesMod.TransformationSetItem
import typings.reactAliceCarousel.typesMod.Transition
import typings.std.Element
import typings.std.Event
import typings.std.RegExpMatchArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("react-alice-carousel/lib/utils", "animate")
  @js.native
  def animate(element: js.Any, options: js.Any): js.Any = js.native
  
  @JSImport("react-alice-carousel/lib/utils", "calculateInitialState")
  @js.native
  def calculateInitialState(props: PartialProps, el: js.Any): State = js.native
  
  @JSImport("react-alice-carousel/lib/utils", "checkIsTheLastDotIndex")
  @js.native
  def checkIsTheLastDotIndex(index: Double, infinite: Boolean, dotsLength: Double): Boolean = js.native
  
  @JSImport("react-alice-carousel/lib/utils", "createAutowidthTransformationSet")
  @js.native
  def createAutowidthTransformationSet(el: js.Any): js.Array[TransformationSetItem] = js.native
  
  @JSImport("react-alice-carousel/lib/utils", "createClones")
  @js.native
  def createClones(props: Props): js.Any = js.native
  
  @JSImport("react-alice-carousel/lib/utils", "createDefaultTransformationSet")
  @js.native
  def createDefaultTransformationSet(children: js.Array[_], galleryWidth: Double, itemsInSlide: Double): js.Array[TransformationSetItem] = js.native
  
  @JSImport("react-alice-carousel/lib/utils", "debounce")
  @js.native
  def debounce(func: js.Function1[/* repeated */ js.Any, Unit]): js.Function1[/* repeated */ js.Any, Unit] = js.native
  @JSImport("react-alice-carousel/lib/utils", "debounce")
  @js.native
  def debounce(func: js.Function1[/* repeated */ js.Any, Unit], ms: Double): js.Function1[/* repeated */ js.Any, Unit] = js.native
  
  @JSImport("react-alice-carousel/lib/utils", "debug")
  @js.native
  def debug(args: js.Any*): Unit = js.native
  
  @JSImport("react-alice-carousel/lib/utils", "getActiveIndex")
  @js.native
  def getActiveIndex(index: Double, dotsLength: Double, infinite: Boolean): Double = js.native
  
  @JSImport("react-alice-carousel/lib/utils", "getActiveSlideDotsLength")
  @js.native
  def getActiveSlideDotsLength(): Double = js.native
  @JSImport("react-alice-carousel/lib/utils", "getActiveSlideDotsLength")
  @js.native
  def getActiveSlideDotsLength(slidesLength: js.UndefOr[scala.Nothing], itemsInSlide: Double): Double = js.native
  @JSImport("react-alice-carousel/lib/utils", "getActiveSlideDotsLength")
  @js.native
  def getActiveSlideDotsLength(slidesLength: Double): Double = js.native
  @JSImport("react-alice-carousel/lib/utils", "getActiveSlideDotsLength")
  @js.native
  def getActiveSlideDotsLength(slidesLength: Double, itemsInSlide: Double): Double = js.native
  
  @JSImport("react-alice-carousel/lib/utils", "getActiveSlideIndex")
  @js.native
  def getActiveSlideIndex(isNextSlideDisabled: js.Any, state: State): Double = js.native
  
  @JSImport("react-alice-carousel/lib/utils", "getAutoheightProperty")
  @js.native
  def getAutoheightProperty(stageComponent: Element, props: Props, state: State): js.UndefOr[Double] = js.native
  
  @JSImport("react-alice-carousel/lib/utils", "getDotsNavigationLength")
  @js.native
  def getDotsNavigationLength(itemsCount: js.UndefOr[scala.Nothing], itemsInSlide: js.UndefOr[scala.Nothing], autoWidth: js.Any): Double = js.native
  @JSImport("react-alice-carousel/lib/utils", "getDotsNavigationLength")
  @js.native
  def getDotsNavigationLength(itemsCount: js.UndefOr[scala.Nothing], itemsInSlide: Double, autoWidth: js.Any): Double = js.native
  @JSImport("react-alice-carousel/lib/utils", "getDotsNavigationLength")
  @js.native
  def getDotsNavigationLength(itemsCount: Double, itemsInSlide: js.UndefOr[scala.Nothing], autoWidth: js.Any): Double = js.native
  @JSImport("react-alice-carousel/lib/utils", "getDotsNavigationLength")
  @js.native
  def getDotsNavigationLength(itemsCount: Double, itemsInSlide: Double, autoWidth: js.Any): Double = js.native
  
  @JSImport("react-alice-carousel/lib/utils", "getElementCursor")
  @js.native
  def getElementCursor(props: Props, state: State): Double = js.native
  
  @JSImport("react-alice-carousel/lib/utils", "getElementDimensions")
  @js.native
  def getElementDimensions(element: js.Any): Height = js.native
  
  @JSImport("react-alice-carousel/lib/utils", "getElementFirstChild")
  @js.native
  def getElementFirstChild(stageComponent: js.Any, cursor: js.Any): js.Any = js.native
  
  @JSImport("react-alice-carousel/lib/utils", "getFadeoutAnimationIndex")
  @js.native
  def getFadeoutAnimationIndex(state: State): Double = js.native
  
  @JSImport("react-alice-carousel/lib/utils", "getFadeoutAnimationPosition")
  @js.native
  def getFadeoutAnimationPosition(nextIndex: js.Any, state: State): Double = js.native
  
  @JSImport("react-alice-carousel/lib/utils", "getIsLeftDirection")
  @js.native
  def getIsLeftDirection(): Boolean = js.native
  @JSImport("react-alice-carousel/lib/utils", "getIsLeftDirection")
  @js.native
  def getIsLeftDirection(deltaX: Double): Boolean = js.native
  
  @JSImport("react-alice-carousel/lib/utils", "getIsStageContentPartial")
  @js.native
  def getIsStageContentPartial(): Boolean = js.native
  @JSImport("react-alice-carousel/lib/utils", "getIsStageContentPartial")
  @js.native
  def getIsStageContentPartial(stageWidth: js.UndefOr[scala.Nothing], contentWidth: Double): Boolean = js.native
  @JSImport("react-alice-carousel/lib/utils", "getIsStageContentPartial")
  @js.native
  def getIsStageContentPartial(stageWidth: Double): Boolean = js.native
  @JSImport("react-alice-carousel/lib/utils", "getIsStageContentPartial")
  @js.native
  def getIsStageContentPartial(stageWidth: Double, contentWidth: Double): Boolean = js.native
  
  @JSImport("react-alice-carousel/lib/utils", "getItemIndexForDotNavigation")
  @js.native
  def getItemIndexForDotNavigation(index: Double, isTheLastIndex: Boolean, slidesLength: Double, itemsInSlide: Double): Double = js.native
  
  @JSImport("react-alice-carousel/lib/utils", "getItemWidth")
  @js.native
  def getItemWidth(galleryWidth: Double, itemsInSlide: Double): Double = js.native
  
  @JSImport("react-alice-carousel/lib/utils", "getItemsCount")
  @js.native
  def getItemsCount(props: Props): js.Any = js.native
  
  @JSImport("react-alice-carousel/lib/utils", "getItemsInSlide")
  @js.native
  def getItemsInSlide(itemsCount: Double, props: Props): Double = js.native
  
  @JSImport("react-alice-carousel/lib/utils", "getItemsOffset")
  @js.native
  def getItemsOffset(props: Props): `0` | `1` = js.native
  
  @JSImport("react-alice-carousel/lib/utils", "getRenderStageItemClasses")
  @js.native
  def getRenderStageItemClasses(i: js.UndefOr[scala.Nothing], state: State): String = js.native
  @JSImport("react-alice-carousel/lib/utils", "getRenderStageItemClasses")
  @js.native
  def getRenderStageItemClasses(i: Double, state: State): String = js.native
  
  @JSImport("react-alice-carousel/lib/utils", "getRenderStageItemStyles")
  @js.native
  def getRenderStageItemStyles(i: Double, state: State): AnimationDuration | Transform = js.native
  
  @JSImport("react-alice-carousel/lib/utils", "getRenderStageStyles")
  @js.native
  def getRenderStageStyles(nextStyles: js.Any, currentStyles: Style): Style = js.native
  
  @JSImport("react-alice-carousel/lib/utils", "getRenderWrapperStyles")
  @js.native
  def getRenderWrapperStyles(props: Props, state: State, element: js.Any): PaddingLeft = js.native
  
  @JSImport("react-alice-carousel/lib/utils", "getShiftIndex")
  @js.native
  def getShiftIndex(): Double = js.native
  @JSImport("react-alice-carousel/lib/utils", "getShiftIndex")
  @js.native
  def getShiftIndex(itemsInSlide: js.UndefOr[scala.Nothing], itemsOffset: Double): Double = js.native
  @JSImport("react-alice-carousel/lib/utils", "getShiftIndex")
  @js.native
  def getShiftIndex(itemsInSlide: Double): Double = js.native
  @JSImport("react-alice-carousel/lib/utils", "getShiftIndex")
  @js.native
  def getShiftIndex(itemsInSlide: Double, itemsOffset: Double): Double = js.native
  
  @JSImport("react-alice-carousel/lib/utils", "getSlideIndexForMultipleItems")
  @js.native
  def getSlideIndexForMultipleItems(activeIndex: js.Any, itemsInSlide: js.Any, slidesLength: js.Any, isNextSlideDisabled: js.Any): Double = js.native
  
  @JSImport("react-alice-carousel/lib/utils", "getSlideIndexForNonMultipleItems")
  @js.native
  def getSlideIndexForNonMultipleItems(activeIndex: js.Any, itemsInSlide: js.Any, slidesLength: js.Any): Double = js.native
  
  @JSImport("react-alice-carousel/lib/utils", "getSlideInfo")
  @js.native
  def getSlideInfo(): SlideIndex = js.native
  @JSImport("react-alice-carousel/lib/utils", "getSlideInfo")
  @js.native
  def getSlideInfo(activeIndex: js.UndefOr[scala.Nothing], slidesLength: Double): SlideIndex = js.native
  @JSImport("react-alice-carousel/lib/utils", "getSlideInfo")
  @js.native
  def getSlideInfo(activeIndex: Double): SlideIndex = js.native
  @JSImport("react-alice-carousel/lib/utils", "getSlideInfo")
  @js.native
  def getSlideInfo(activeIndex: Double, slidesLength: Double): SlideIndex = js.native
  
  @JSImport("react-alice-carousel/lib/utils", "getSlideItemInfo")
  @js.native
  def getSlideItemInfo(state: State): IsPrevSlideDisabled = js.native
  
  @JSImport("react-alice-carousel/lib/utils", "getSlides")
  @js.native
  def getSlides(props: Props): js.Any = js.native
  
  @JSImport("react-alice-carousel/lib/utils", "getStageContentWidth")
  @js.native
  def getStageContentWidth(state: PartialState): Double = js.native
  
  @JSImport("react-alice-carousel/lib/utils", "getStartIndex")
  @js.native
  def getStartIndex(): Double = js.native
  @JSImport("react-alice-carousel/lib/utils", "getStartIndex")
  @js.native
  def getStartIndex(index: js.UndefOr[scala.Nothing], childrenLength: Double): Double = js.native
  @JSImport("react-alice-carousel/lib/utils", "getStartIndex")
  @js.native
  def getStartIndex(index: Double): Double = js.native
  @JSImport("react-alice-carousel/lib/utils", "getStartIndex")
  @js.native
  def getStartIndex(index: Double, childrenLength: Double): Double = js.native
  
  @JSImport("react-alice-carousel/lib/utils", "getSwipeLimitMax")
  @js.native
  def getSwipeLimitMax(state: PartialState, props: PartialProps): Double = js.native
  
  @JSImport("react-alice-carousel/lib/utils", "getSwipeLimitMin")
  @js.native
  def getSwipeLimitMin(state: PartialState, props: PartialProps): Double = js.native
  
  @JSImport("react-alice-carousel/lib/utils", "getSwipeShiftValue")
  @js.native
  def getSwipeShiftValue(): Double = js.native
  @JSImport("react-alice-carousel/lib/utils", "getSwipeShiftValue")
  @js.native
  def getSwipeShiftValue(cursor: js.UndefOr[scala.Nothing], transformationSet: js.Array[TransformationSetItem]): Double = js.native
  @JSImport("react-alice-carousel/lib/utils", "getSwipeShiftValue")
  @js.native
  def getSwipeShiftValue(cursor: Double): Double = js.native
  @JSImport("react-alice-carousel/lib/utils", "getSwipeShiftValue")
  @js.native
  def getSwipeShiftValue(cursor: Double, transformationSet: js.Array[TransformationSetItem]): Double = js.native
  
  @JSImport("react-alice-carousel/lib/utils", "getSwipeTouchendIndex")
  @js.native
  def getSwipeTouchendIndex(position: js.Any, state: State): Double = js.native
  
  @JSImport("react-alice-carousel/lib/utils", "getSwipeTouchendPosition")
  @js.native
  def getSwipeTouchendPosition(state: State, deltaX: Double): Double = js.native
  @JSImport("react-alice-carousel/lib/utils", "getSwipeTouchendPosition")
  @js.native
  def getSwipeTouchendPosition(state: State, deltaX: Double, swipePosition: Double): Double = js.native
  
  @JSImport("react-alice-carousel/lib/utils", "getSwipeTransformationCursor")
  @js.native
  def getSwipeTransformationCursor(): Double = js.native
  @JSImport("react-alice-carousel/lib/utils", "getSwipeTransformationCursor")
  @js.native
  def getSwipeTransformationCursor(transformationSet: js.UndefOr[scala.Nothing], position: js.UndefOr[scala.Nothing], deltaX: Double): Double = js.native
  @JSImport("react-alice-carousel/lib/utils", "getSwipeTransformationCursor")
  @js.native
  def getSwipeTransformationCursor(transformationSet: js.UndefOr[scala.Nothing], position: Double): Double = js.native
  @JSImport("react-alice-carousel/lib/utils", "getSwipeTransformationCursor")
  @js.native
  def getSwipeTransformationCursor(transformationSet: js.UndefOr[scala.Nothing], position: Double, deltaX: Double): Double = js.native
  @JSImport("react-alice-carousel/lib/utils", "getSwipeTransformationCursor")
  @js.native
  def getSwipeTransformationCursor(transformationSet: js.Array[TransformationSetItem]): Double = js.native
  @JSImport("react-alice-carousel/lib/utils", "getSwipeTransformationCursor")
  @js.native
  def getSwipeTransformationCursor(
    transformationSet: js.Array[TransformationSetItem],
    position: js.UndefOr[scala.Nothing],
    deltaX: Double
  ): Double = js.native
  @JSImport("react-alice-carousel/lib/utils", "getSwipeTransformationCursor")
  @js.native
  def getSwipeTransformationCursor(transformationSet: js.Array[TransformationSetItem], position: Double): Double = js.native
  @JSImport("react-alice-carousel/lib/utils", "getSwipeTransformationCursor")
  @js.native
  def getSwipeTransformationCursor(transformationSet: js.Array[TransformationSetItem], position: Double, deltaX: Double): Double = js.native
  
  @JSImport("react-alice-carousel/lib/utils", "getTouchmoveTranslatePosition")
  @js.native
  def getTouchmoveTranslatePosition(deltaX: Double, translate3d: Double): Double = js.native
  
  @JSImport("react-alice-carousel/lib/utils", "getTransformMatrix")
  @js.native
  def getTransformMatrix(element: js.Any): RegExpMatchArray = js.native
  
  @JSImport("react-alice-carousel/lib/utils", "getTransformationItemIndex")
  @js.native
  def getTransformationItemIndex(): Double = js.native
  @JSImport("react-alice-carousel/lib/utils", "getTransformationItemIndex")
  @js.native
  def getTransformationItemIndex(transformationSet: js.UndefOr[scala.Nothing], position: Double): Double = js.native
  @JSImport("react-alice-carousel/lib/utils", "getTransformationItemIndex")
  @js.native
  def getTransformationItemIndex(transformationSet: js.Array[TransformationSetItem]): Double = js.native
  @JSImport("react-alice-carousel/lib/utils", "getTransformationItemIndex")
  @js.native
  def getTransformationItemIndex(transformationSet: js.Array[TransformationSetItem], position: Double): Double = js.native
  
  @JSImport("react-alice-carousel/lib/utils", "getTransformationSetItem")
  @js.native
  def getTransformationSetItem(): TransformationSetItem = js.native
  @JSImport("react-alice-carousel/lib/utils", "getTransformationSetItem")
  @js.native
  def getTransformationSetItem(cursor: js.UndefOr[scala.Nothing], transformationSet: js.Array[TransformationSetItem]): TransformationSetItem = js.native
  @JSImport("react-alice-carousel/lib/utils", "getTransformationSetItem")
  @js.native
  def getTransformationSetItem(cursor: Double): TransformationSetItem = js.native
  @JSImport("react-alice-carousel/lib/utils", "getTransformationSetItem")
  @js.native
  def getTransformationSetItem(cursor: Double, transformationSet: js.Array[TransformationSetItem]): TransformationSetItem = js.native
  
  @JSImport("react-alice-carousel/lib/utils", "getTransitionProperty")
  @js.native
  def getTransitionProperty(): String = js.native
  @JSImport("react-alice-carousel/lib/utils", "getTransitionProperty")
  @js.native
  def getTransitionProperty(options: Transition): String = js.native
  
  @JSImport("react-alice-carousel/lib/utils", "getTranslate3dProperty")
  @js.native
  def getTranslate3dProperty(nextIndex: js.Any, state: PartialState): Double = js.native
  
  @JSImport("react-alice-carousel/lib/utils", "getTranslateXProperty")
  @js.native
  def getTranslateXProperty(element: js.Any): Double = js.native
  
  @JSImport("react-alice-carousel/lib/utils", "getUpdateSlidePositionIndex")
  @js.native
  def getUpdateSlidePositionIndex(activeIndex: Double, itemsCount: Double): Double = js.native
  
  @JSImport("react-alice-carousel/lib/utils", "isActiveItem")
  @js.native
  def isActiveItem(i: js.UndefOr[scala.Nothing], state: State): Boolean = js.native
  @JSImport("react-alice-carousel/lib/utils", "isActiveItem")
  @js.native
  def isActiveItem(i: Double, state: State): Boolean = js.native
  
  @JSImport("react-alice-carousel/lib/utils", "isClonedItem")
  @js.native
  def isClonedItem(i: js.UndefOr[scala.Nothing], state: State): Boolean = js.native
  @JSImport("react-alice-carousel/lib/utils", "isClonedItem")
  @js.native
  def isClonedItem(i: Double, state: State): Boolean = js.native
  
  @JSImport("react-alice-carousel/lib/utils", "isElement")
  @js.native
  def isElement(element: js.Any): Boolean = js.native
  
  @JSImport("react-alice-carousel/lib/utils", "isVerticalTouchmoveDetected")
  @js.native
  def isVerticalTouchmoveDetected(absX: Double, absY: Double): Boolean = js.native
  @JSImport("react-alice-carousel/lib/utils", "isVerticalTouchmoveDetected")
  @js.native
  def isVerticalTouchmoveDetected(absX: Double, absY: Double, swipeDelta: Double): Boolean = js.native
  
  @JSImport("react-alice-carousel/lib/utils", "shouldCancelAutoPlayOnAction")
  @js.native
  def shouldCancelAutoPlayOnAction(): Boolean = js.native
  @JSImport("react-alice-carousel/lib/utils", "shouldCancelAutoPlayOnAction")
  @js.native
  def shouldCancelAutoPlayOnAction(strategy: String): Boolean = js.native
  
  @JSImport("react-alice-carousel/lib/utils", "shouldCancelAutoPlayOnHover")
  @js.native
  def shouldCancelAutoPlayOnHover(): Boolean = js.native
  @JSImport("react-alice-carousel/lib/utils", "shouldCancelAutoPlayOnHover")
  @js.native
  def shouldCancelAutoPlayOnHover(strategy: String): Boolean = js.native
  
  @JSImport("react-alice-carousel/lib/utils", "shouldCancelSlideAnimation")
  @js.native
  def shouldCancelSlideAnimation(activeIndex: js.Any, itemsCount: js.Any, itemsInSlide: js.Any): Boolean = js.native
  
  @JSImport("react-alice-carousel/lib/utils", "shouldDisableDots")
  @js.native
  def shouldDisableDots(props: Props, state: State): Boolean = js.native
  
  @JSImport("react-alice-carousel/lib/utils", "shouldHandleResizeEvent")
  @js.native
  def shouldHandleResizeEvent(e: Event): Boolean = js.native
  @JSImport("react-alice-carousel/lib/utils", "shouldHandleResizeEvent")
  @js.native
  def shouldHandleResizeEvent(e: Event, prevDimensions: js.UndefOr[scala.Nothing], nextRootComponentDimensions: RootElement): Boolean = js.native
  @JSImport("react-alice-carousel/lib/utils", "shouldHandleResizeEvent")
  @js.native
  def shouldHandleResizeEvent(e: Event, prevDimensions: RootElement): Boolean = js.native
  @JSImport("react-alice-carousel/lib/utils", "shouldHandleResizeEvent")
  @js.native
  def shouldHandleResizeEvent(e: Event, prevDimensions: RootElement, nextRootComponentDimensions: RootElement): Boolean = js.native
  
  @JSImport("react-alice-carousel/lib/utils", "shouldRecalculateSlideIndex")
  @js.native
  def shouldRecalculateSlideIndex(activeIndex: js.Any, itemsCount: js.Any): Boolean = js.native
  
  @JSImport("react-alice-carousel/lib/utils", "shouldRecalculateSwipePosition")
  @js.native
  def shouldRecalculateSwipePosition(currentPosition: js.Any, minPosition: js.Any, maxPosition: js.Any): Boolean = js.native
}
