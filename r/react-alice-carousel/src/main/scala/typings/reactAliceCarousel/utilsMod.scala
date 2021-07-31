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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("react-alice-carousel/lib/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def animate(element: js.Any, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("animate")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def calculateInitialState(props: PartialProps, el: js.Any): State = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateInitialState")(props.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[State]
  
  @scala.inline
  def checkIsTheLastDotIndex(index: Double, infinite: Boolean, dotsLength: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkIsTheLastDotIndex")(index.asInstanceOf[js.Any], infinite.asInstanceOf[js.Any], dotsLength.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def createAutowidthTransformationSet(el: js.Any): js.Array[TransformationSetItem] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAutowidthTransformationSet")(el.asInstanceOf[js.Any]).asInstanceOf[js.Array[TransformationSetItem]]
  
  @scala.inline
  def createClones(props: Props): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createClones")(props.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def createDefaultTransformationSet(children: js.Array[js.Any], galleryWidth: Double, itemsInSlide: Double): js.Array[TransformationSetItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("createDefaultTransformationSet")(children.asInstanceOf[js.Any], galleryWidth.asInstanceOf[js.Any], itemsInSlide.asInstanceOf[js.Any])).asInstanceOf[js.Array[TransformationSetItem]]
  
  @scala.inline
  def debounce(func: js.Function1[/* repeated */ js.Any, Unit]): js.Function1[/* repeated */ js.Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(func.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ js.Any, Unit]]
  @scala.inline
  def debounce(func: js.Function1[/* repeated */ js.Any, Unit], ms: Double): js.Function1[/* repeated */ js.Any, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(func.asInstanceOf[js.Any], ms.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ js.Any, Unit]]
  
  @scala.inline
  def debug(args: js.Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(args.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def getActiveIndex(index: Double, dotsLength: Double, infinite: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getActiveIndex")(index.asInstanceOf[js.Any], dotsLength.asInstanceOf[js.Any], infinite.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def getActiveSlideDotsLength(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getActiveSlideDotsLength")().asInstanceOf[Double]
  @scala.inline
  def getActiveSlideDotsLength(slidesLength: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getActiveSlideDotsLength")(slidesLength.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def getActiveSlideDotsLength(slidesLength: Double, itemsInSlide: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getActiveSlideDotsLength")(slidesLength.asInstanceOf[js.Any], itemsInSlide.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def getActiveSlideDotsLength(slidesLength: Unit, itemsInSlide: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getActiveSlideDotsLength")(slidesLength.asInstanceOf[js.Any], itemsInSlide.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def getActiveSlideIndex(isNextSlideDisabled: js.Any, state: State): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getActiveSlideIndex")(isNextSlideDisabled.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def getAutoheightProperty(stageComponent: Element, props: Props, state: State): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAutoheightProperty")(stageComponent.asInstanceOf[js.Any], props.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  
  @scala.inline
  def getDotsNavigationLength(itemsCount: Double, itemsInSlide: Double, autoWidth: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getDotsNavigationLength")(itemsCount.asInstanceOf[js.Any], itemsInSlide.asInstanceOf[js.Any], autoWidth.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def getDotsNavigationLength(itemsCount: Double, itemsInSlide: Unit, autoWidth: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getDotsNavigationLength")(itemsCount.asInstanceOf[js.Any], itemsInSlide.asInstanceOf[js.Any], autoWidth.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def getDotsNavigationLength(itemsCount: Unit, itemsInSlide: Double, autoWidth: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getDotsNavigationLength")(itemsCount.asInstanceOf[js.Any], itemsInSlide.asInstanceOf[js.Any], autoWidth.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def getDotsNavigationLength(itemsCount: Unit, itemsInSlide: Unit, autoWidth: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getDotsNavigationLength")(itemsCount.asInstanceOf[js.Any], itemsInSlide.asInstanceOf[js.Any], autoWidth.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def getElementCursor(props: Props, state: State): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementCursor")(props.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def getElementDimensions(element: js.Any): Height = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementDimensions")(element.asInstanceOf[js.Any]).asInstanceOf[Height]
  
  @scala.inline
  def getElementFirstChild(stageComponent: js.Any, cursor: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementFirstChild")(stageComponent.asInstanceOf[js.Any], cursor.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def getFadeoutAnimationIndex(state: State): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getFadeoutAnimationIndex")(state.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def getFadeoutAnimationPosition(nextIndex: js.Any, state: State): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getFadeoutAnimationPosition")(nextIndex.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def getIsLeftDirection(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getIsLeftDirection")().asInstanceOf[Boolean]
  @scala.inline
  def getIsLeftDirection(deltaX: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getIsLeftDirection")(deltaX.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def getIsStageContentPartial(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getIsStageContentPartial")().asInstanceOf[Boolean]
  @scala.inline
  def getIsStageContentPartial(stageWidth: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getIsStageContentPartial")(stageWidth.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def getIsStageContentPartial(stageWidth: Double, contentWidth: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("getIsStageContentPartial")(stageWidth.asInstanceOf[js.Any], contentWidth.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def getIsStageContentPartial(stageWidth: Unit, contentWidth: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("getIsStageContentPartial")(stageWidth.asInstanceOf[js.Any], contentWidth.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def getItemIndexForDotNavigation(index: Double, isTheLastIndex: Boolean, slidesLength: Double, itemsInSlide: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getItemIndexForDotNavigation")(index.asInstanceOf[js.Any], isTheLastIndex.asInstanceOf[js.Any], slidesLength.asInstanceOf[js.Any], itemsInSlide.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def getItemWidth(galleryWidth: Double, itemsInSlide: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getItemWidth")(galleryWidth.asInstanceOf[js.Any], itemsInSlide.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def getItemsCount(props: Props): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getItemsCount")(props.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def getItemsInSlide(itemsCount: Double, props: Props): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getItemsInSlide")(itemsCount.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def getItemsOffset(props: Props): `0` | `1` = ^.asInstanceOf[js.Dynamic].applyDynamic("getItemsOffset")(props.asInstanceOf[js.Any]).asInstanceOf[`0` | `1`]
  
  @scala.inline
  def getRenderStageItemClasses(i: Double, state: State): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getRenderStageItemClasses")(i.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def getRenderStageItemClasses(i: Unit, state: State): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getRenderStageItemClasses")(i.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def getRenderStageItemStyles(i: Double, state: State): AnimationDuration | Transform = (^.asInstanceOf[js.Dynamic].applyDynamic("getRenderStageItemStyles")(i.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[AnimationDuration | Transform]
  
  @scala.inline
  def getRenderStageStyles(nextStyles: js.Any, currentStyles: Style): Style = (^.asInstanceOf[js.Dynamic].applyDynamic("getRenderStageStyles")(nextStyles.asInstanceOf[js.Any], currentStyles.asInstanceOf[js.Any])).asInstanceOf[Style]
  
  @scala.inline
  def getRenderWrapperStyles(props: Props, state: State, element: js.Any): PaddingLeft = (^.asInstanceOf[js.Dynamic].applyDynamic("getRenderWrapperStyles")(props.asInstanceOf[js.Any], state.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[PaddingLeft]
  
  @scala.inline
  def getShiftIndex(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getShiftIndex")().asInstanceOf[Double]
  @scala.inline
  def getShiftIndex(itemsInSlide: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getShiftIndex")(itemsInSlide.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def getShiftIndex(itemsInSlide: Double, itemsOffset: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getShiftIndex")(itemsInSlide.asInstanceOf[js.Any], itemsOffset.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def getShiftIndex(itemsInSlide: Unit, itemsOffset: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getShiftIndex")(itemsInSlide.asInstanceOf[js.Any], itemsOffset.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def getSlideIndexForMultipleItems(activeIndex: js.Any, itemsInSlide: js.Any, slidesLength: js.Any, isNextSlideDisabled: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getSlideIndexForMultipleItems")(activeIndex.asInstanceOf[js.Any], itemsInSlide.asInstanceOf[js.Any], slidesLength.asInstanceOf[js.Any], isNextSlideDisabled.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def getSlideIndexForNonMultipleItems(activeIndex: js.Any, itemsInSlide: js.Any, slidesLength: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getSlideIndexForNonMultipleItems")(activeIndex.asInstanceOf[js.Any], itemsInSlide.asInstanceOf[js.Any], slidesLength.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def getSlideInfo(): SlideIndex = ^.asInstanceOf[js.Dynamic].applyDynamic("getSlideInfo")().asInstanceOf[SlideIndex]
  @scala.inline
  def getSlideInfo(activeIndex: Double): SlideIndex = ^.asInstanceOf[js.Dynamic].applyDynamic("getSlideInfo")(activeIndex.asInstanceOf[js.Any]).asInstanceOf[SlideIndex]
  @scala.inline
  def getSlideInfo(activeIndex: Double, slidesLength: Double): SlideIndex = (^.asInstanceOf[js.Dynamic].applyDynamic("getSlideInfo")(activeIndex.asInstanceOf[js.Any], slidesLength.asInstanceOf[js.Any])).asInstanceOf[SlideIndex]
  @scala.inline
  def getSlideInfo(activeIndex: Unit, slidesLength: Double): SlideIndex = (^.asInstanceOf[js.Dynamic].applyDynamic("getSlideInfo")(activeIndex.asInstanceOf[js.Any], slidesLength.asInstanceOf[js.Any])).asInstanceOf[SlideIndex]
  
  @scala.inline
  def getSlideItemInfo(state: State): IsPrevSlideDisabled = ^.asInstanceOf[js.Dynamic].applyDynamic("getSlideItemInfo")(state.asInstanceOf[js.Any]).asInstanceOf[IsPrevSlideDisabled]
  
  @scala.inline
  def getSlides(props: Props): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getSlides")(props.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def getStageContentWidth(state: PartialState): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getStageContentWidth")(state.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def getStartIndex(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getStartIndex")().asInstanceOf[Double]
  @scala.inline
  def getStartIndex(index: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getStartIndex")(index.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def getStartIndex(index: Double, childrenLength: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getStartIndex")(index.asInstanceOf[js.Any], childrenLength.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def getStartIndex(index: Unit, childrenLength: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getStartIndex")(index.asInstanceOf[js.Any], childrenLength.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def getSwipeLimitMax(state: PartialState, props: PartialProps): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getSwipeLimitMax")(state.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def getSwipeLimitMin(state: PartialState, props: PartialProps): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getSwipeLimitMin")(state.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def getSwipeShiftValue(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getSwipeShiftValue")().asInstanceOf[Double]
  @scala.inline
  def getSwipeShiftValue(cursor: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getSwipeShiftValue")(cursor.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def getSwipeShiftValue(cursor: Double, transformationSet: js.Array[TransformationSetItem]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getSwipeShiftValue")(cursor.asInstanceOf[js.Any], transformationSet.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def getSwipeShiftValue(cursor: Unit, transformationSet: js.Array[TransformationSetItem]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getSwipeShiftValue")(cursor.asInstanceOf[js.Any], transformationSet.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def getSwipeTouchendIndex(position: js.Any, state: State): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getSwipeTouchendIndex")(position.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def getSwipeTouchendPosition(state: State, deltaX: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getSwipeTouchendPosition")(state.asInstanceOf[js.Any], deltaX.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def getSwipeTouchendPosition(state: State, deltaX: Double, swipePosition: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getSwipeTouchendPosition")(state.asInstanceOf[js.Any], deltaX.asInstanceOf[js.Any], swipePosition.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def getSwipeTransformationCursor(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getSwipeTransformationCursor")().asInstanceOf[Double]
  @scala.inline
  def getSwipeTransformationCursor(transformationSet: js.Array[TransformationSetItem]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getSwipeTransformationCursor")(transformationSet.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def getSwipeTransformationCursor(transformationSet: js.Array[TransformationSetItem], position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getSwipeTransformationCursor")(transformationSet.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def getSwipeTransformationCursor(transformationSet: js.Array[TransformationSetItem], position: Double, deltaX: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getSwipeTransformationCursor")(transformationSet.asInstanceOf[js.Any], position.asInstanceOf[js.Any], deltaX.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def getSwipeTransformationCursor(transformationSet: js.Array[TransformationSetItem], position: Unit, deltaX: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getSwipeTransformationCursor")(transformationSet.asInstanceOf[js.Any], position.asInstanceOf[js.Any], deltaX.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def getSwipeTransformationCursor(transformationSet: Unit, position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getSwipeTransformationCursor")(transformationSet.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def getSwipeTransformationCursor(transformationSet: Unit, position: Double, deltaX: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getSwipeTransformationCursor")(transformationSet.asInstanceOf[js.Any], position.asInstanceOf[js.Any], deltaX.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def getSwipeTransformationCursor(transformationSet: Unit, position: Unit, deltaX: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getSwipeTransformationCursor")(transformationSet.asInstanceOf[js.Any], position.asInstanceOf[js.Any], deltaX.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def getTouchmoveTranslatePosition(deltaX: Double, translate3d: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getTouchmoveTranslatePosition")(deltaX.asInstanceOf[js.Any], translate3d.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def getTransformMatrix(element: js.Any): RegExpMatchArray = ^.asInstanceOf[js.Dynamic].applyDynamic("getTransformMatrix")(element.asInstanceOf[js.Any]).asInstanceOf[RegExpMatchArray]
  
  @scala.inline
  def getTransformationItemIndex(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getTransformationItemIndex")().asInstanceOf[Double]
  @scala.inline
  def getTransformationItemIndex(transformationSet: js.Array[TransformationSetItem]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getTransformationItemIndex")(transformationSet.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def getTransformationItemIndex(transformationSet: js.Array[TransformationSetItem], position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getTransformationItemIndex")(transformationSet.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def getTransformationItemIndex(transformationSet: Unit, position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getTransformationItemIndex")(transformationSet.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def getTransformationSetItem(): TransformationSetItem = ^.asInstanceOf[js.Dynamic].applyDynamic("getTransformationSetItem")().asInstanceOf[TransformationSetItem]
  @scala.inline
  def getTransformationSetItem(cursor: Double): TransformationSetItem = ^.asInstanceOf[js.Dynamic].applyDynamic("getTransformationSetItem")(cursor.asInstanceOf[js.Any]).asInstanceOf[TransformationSetItem]
  @scala.inline
  def getTransformationSetItem(cursor: Double, transformationSet: js.Array[TransformationSetItem]): TransformationSetItem = (^.asInstanceOf[js.Dynamic].applyDynamic("getTransformationSetItem")(cursor.asInstanceOf[js.Any], transformationSet.asInstanceOf[js.Any])).asInstanceOf[TransformationSetItem]
  @scala.inline
  def getTransformationSetItem(cursor: Unit, transformationSet: js.Array[TransformationSetItem]): TransformationSetItem = (^.asInstanceOf[js.Dynamic].applyDynamic("getTransformationSetItem")(cursor.asInstanceOf[js.Any], transformationSet.asInstanceOf[js.Any])).asInstanceOf[TransformationSetItem]
  
  @scala.inline
  def getTransitionProperty(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTransitionProperty")().asInstanceOf[String]
  @scala.inline
  def getTransitionProperty(options: Transition): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTransitionProperty")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def getTranslate3dProperty(nextIndex: js.Any, state: PartialState): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getTranslate3dProperty")(nextIndex.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def getTranslateXProperty(element: js.Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getTranslateXProperty")(element.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def getUpdateSlidePositionIndex(activeIndex: Double, itemsCount: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getUpdateSlidePositionIndex")(activeIndex.asInstanceOf[js.Any], itemsCount.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def isActiveItem(i: Double, state: State): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isActiveItem")(i.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isActiveItem(i: Unit, state: State): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isActiveItem")(i.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isClonedItem(i: Double, state: State): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isClonedItem")(i.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isClonedItem(i: Unit, state: State): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isClonedItem")(i.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isElement(element: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isElement")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isVerticalTouchmoveDetected(absX: Double, absY: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isVerticalTouchmoveDetected")(absX.asInstanceOf[js.Any], absY.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isVerticalTouchmoveDetected(absX: Double, absY: Double, swipeDelta: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isVerticalTouchmoveDetected")(absX.asInstanceOf[js.Any], absY.asInstanceOf[js.Any], swipeDelta.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def shouldCancelAutoPlayOnAction(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldCancelAutoPlayOnAction")().asInstanceOf[Boolean]
  @scala.inline
  def shouldCancelAutoPlayOnAction(strategy: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldCancelAutoPlayOnAction")(strategy.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def shouldCancelAutoPlayOnHover(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldCancelAutoPlayOnHover")().asInstanceOf[Boolean]
  @scala.inline
  def shouldCancelAutoPlayOnHover(strategy: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldCancelAutoPlayOnHover")(strategy.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def shouldCancelSlideAnimation(activeIndex: js.Any, itemsCount: js.Any, itemsInSlide: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldCancelSlideAnimation")(activeIndex.asInstanceOf[js.Any], itemsCount.asInstanceOf[js.Any], itemsInSlide.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def shouldDisableDots(props: Props, state: State): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldDisableDots")(props.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def shouldHandleResizeEvent(e: Event): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldHandleResizeEvent")(e.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def shouldHandleResizeEvent(e: Event, prevDimensions: Unit, nextRootComponentDimensions: RootElement): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldHandleResizeEvent")(e.asInstanceOf[js.Any], prevDimensions.asInstanceOf[js.Any], nextRootComponentDimensions.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def shouldHandleResizeEvent(e: Event, prevDimensions: RootElement): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldHandleResizeEvent")(e.asInstanceOf[js.Any], prevDimensions.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def shouldHandleResizeEvent(e: Event, prevDimensions: RootElement, nextRootComponentDimensions: RootElement): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldHandleResizeEvent")(e.asInstanceOf[js.Any], prevDimensions.asInstanceOf[js.Any], nextRootComponentDimensions.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def shouldRecalculateSlideIndex(activeIndex: js.Any, itemsCount: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldRecalculateSlideIndex")(activeIndex.asInstanceOf[js.Any], itemsCount.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def shouldRecalculateSwipePosition(currentPosition: js.Any, minPosition: js.Any, maxPosition: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldRecalculateSwipePosition")(currentPosition.asInstanceOf[js.Any], minPosition.asInstanceOf[js.Any], maxPosition.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
