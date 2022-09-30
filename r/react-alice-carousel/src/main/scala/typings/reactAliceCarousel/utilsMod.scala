package typings.reactAliceCarousel

import typings.reactAliceCarousel.anon.AnimationDuration
import typings.reactAliceCarousel.anon.Height
import typings.reactAliceCarousel.anon.Infinite
import typings.reactAliceCarousel.anon.IsNextSlideDisabled
import typings.reactAliceCarousel.anon.Item
import typings.reactAliceCarousel.anon.PaddingLeft
import typings.reactAliceCarousel.anon.PartialProps
import typings.reactAliceCarousel.anon.PartialState
import typings.reactAliceCarousel.anon.Transform
import typings.reactAliceCarousel.reactAliceCarouselInts.`0`
import typings.reactAliceCarousel.reactAliceCarouselInts.`1`
import typings.reactAliceCarousel.typesMod.ItemCoords
import typings.reactAliceCarousel.typesMod.Props
import typings.reactAliceCarousel.typesMod.RootElement
import typings.reactAliceCarousel.typesMod.State
import typings.reactAliceCarousel.typesMod.Style
import typings.reactAliceCarousel.typesMod.Transformations
import typings.reactAliceCarousel.typesMod.Transition
import typings.std.Element
import typings.std.Event
import typings.std.HTMLElement
import typings.std.RegExpMatchArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("react-alice-carousel/lib/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def animate(element: Any, options: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("animate")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def calculateInitialState(props: PartialProps): State = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateInitialState")(props.asInstanceOf[js.Any]).asInstanceOf[State]
  inline def calculateInitialState(props: PartialProps, el: Null, canUseDom: Boolean): State = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateInitialState")(props.asInstanceOf[js.Any], el.asInstanceOf[js.Any], canUseDom.asInstanceOf[js.Any])).asInstanceOf[State]
  inline def calculateInitialState(props: PartialProps, el: HTMLElement): State = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateInitialState")(props.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[State]
  inline def calculateInitialState(props: PartialProps, el: HTMLElement, canUseDom: Boolean): State = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateInitialState")(props.asInstanceOf[js.Any], el.asInstanceOf[js.Any], canUseDom.asInstanceOf[js.Any])).asInstanceOf[State]
  
  inline def canUseDOM(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canUseDOM")().asInstanceOf[Boolean]
  
  inline def checkIsTheLastDotIndex(index: Double, infinite: Boolean, dotsLength: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkIsTheLastDotIndex")(index.asInstanceOf[js.Any], infinite.asInstanceOf[js.Any], dotsLength.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def concatClassnames(classes: Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("concatClassnames")(classes.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
  
  inline def createAutowidthTransformationSet(el: Any): Transformations = ^.asInstanceOf[js.Dynamic].applyDynamic("createAutowidthTransformationSet")(el.asInstanceOf[js.Any]).asInstanceOf[Transformations]
  inline def createAutowidthTransformationSet(el: Any, stageWidth: Double): Transformations = (^.asInstanceOf[js.Dynamic].applyDynamic("createAutowidthTransformationSet")(el.asInstanceOf[js.Any], stageWidth.asInstanceOf[js.Any])).asInstanceOf[Transformations]
  inline def createAutowidthTransformationSet(el: Any, stageWidth: Double, infinite: Boolean): Transformations = (^.asInstanceOf[js.Dynamic].applyDynamic("createAutowidthTransformationSet")(el.asInstanceOf[js.Any], stageWidth.asInstanceOf[js.Any], infinite.asInstanceOf[js.Any])).asInstanceOf[Transformations]
  inline def createAutowidthTransformationSet(el: Any, stageWidth: Unit, infinite: Boolean): Transformations = (^.asInstanceOf[js.Dynamic].applyDynamic("createAutowidthTransformationSet")(el.asInstanceOf[js.Any], stageWidth.asInstanceOf[js.Any], infinite.asInstanceOf[js.Any])).asInstanceOf[Transformations]
  
  inline def createClones(props: Props): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createClones")(props.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def createDefaultTransformationSet(children: js.Array[Any], stageWidth: Double, itemsInSlide: Double): Transformations = (^.asInstanceOf[js.Dynamic].applyDynamic("createDefaultTransformationSet")(children.asInstanceOf[js.Any], stageWidth.asInstanceOf[js.Any], itemsInSlide.asInstanceOf[js.Any])).asInstanceOf[Transformations]
  inline def createDefaultTransformationSet(children: js.Array[Any], stageWidth: Double, itemsInSlide: Double, infinite: Boolean): Transformations = (^.asInstanceOf[js.Dynamic].applyDynamic("createDefaultTransformationSet")(children.asInstanceOf[js.Any], stageWidth.asInstanceOf[js.Any], itemsInSlide.asInstanceOf[js.Any], infinite.asInstanceOf[js.Any])).asInstanceOf[Transformations]
  
  inline def debounce(func: js.Function1[/* repeated */ Any, Unit]): js.Function1[/* repeated */ Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(func.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ Any, Unit]]
  inline def debounce(func: js.Function1[/* repeated */ Any, Unit], ms: Double): js.Function1[/* repeated */ Any, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(func.asInstanceOf[js.Any], ms.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ Any, Unit]]
  
  inline def debug(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  inline def getActiveIndex(hasStartIndexItemsCountInfinite: Infinite): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getActiveIndex")(hasStartIndexItemsCountInfinite.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getActiveSlideDotsLength(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getActiveSlideDotsLength")().asInstanceOf[Double]
  inline def getActiveSlideDotsLength(slidesLength: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getActiveSlideDotsLength")(slidesLength.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getActiveSlideDotsLength(slidesLength: Double, itemsInSlide: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getActiveSlideDotsLength")(slidesLength.asInstanceOf[js.Any], itemsInSlide.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getActiveSlideDotsLength(slidesLength: Unit, itemsInSlide: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getActiveSlideDotsLength")(slidesLength.asInstanceOf[js.Any], itemsInSlide.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getActiveSlideIndex(isNextSlideDisabled: Any, state: State): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getActiveSlideIndex")(isNextSlideDisabled.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getAutoheightProperty(stageComponent: Element, props: Props, state: State): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAutoheightProperty")(stageComponent.asInstanceOf[js.Any], props.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  
  inline def getDotsNavigationLength(itemsCount: Double, itemsInSlide: Double, hasDotForEachSlide: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getDotsNavigationLength")(itemsCount.asInstanceOf[js.Any], itemsInSlide.asInstanceOf[js.Any], hasDotForEachSlide.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getDotsNavigationLength(itemsCount: Double, itemsInSlide: Unit, hasDotForEachSlide: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getDotsNavigationLength")(itemsCount.asInstanceOf[js.Any], itemsInSlide.asInstanceOf[js.Any], hasDotForEachSlide.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getDotsNavigationLength(itemsCount: Unit, itemsInSlide: Double, hasDotForEachSlide: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getDotsNavigationLength")(itemsCount.asInstanceOf[js.Any], itemsInSlide.asInstanceOf[js.Any], hasDotForEachSlide.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getDotsNavigationLength(itemsCount: Unit, itemsInSlide: Unit, hasDotForEachSlide: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getDotsNavigationLength")(itemsCount.asInstanceOf[js.Any], itemsInSlide.asInstanceOf[js.Any], hasDotForEachSlide.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getElementCursor(props: Props, state: State): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementCursor")(props.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getElementDimensions(element: Any): Height = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementDimensions")(element.asInstanceOf[js.Any]).asInstanceOf[Height]
  
  inline def getElementFirstChild(stageComponent: Any, cursor: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementFirstChild")(stageComponent.asInstanceOf[js.Any], cursor.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getFadeoutAnimationIndex(state: State): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getFadeoutAnimationIndex")(state.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getFadeoutAnimationPosition(nextIndex: Any, state: State): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getFadeoutAnimationPosition")(nextIndex.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getIsLeftDirection(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getIsLeftDirection")().asInstanceOf[Boolean]
  inline def getIsLeftDirection(deltaX: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getIsLeftDirection")(deltaX.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def getIsStageContentPartial(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getIsStageContentPartial")().asInstanceOf[Boolean]
  inline def getIsStageContentPartial(infinite: Boolean): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getIsStageContentPartial")(infinite.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def getIsStageContentPartial(infinite: Boolean, stageWidth: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("getIsStageContentPartial")(infinite.asInstanceOf[js.Any], stageWidth.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def getIsStageContentPartial(infinite: Boolean, stageWidth: Double, contentWidth: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("getIsStageContentPartial")(infinite.asInstanceOf[js.Any], stageWidth.asInstanceOf[js.Any], contentWidth.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def getIsStageContentPartial(infinite: Boolean, stageWidth: Unit, contentWidth: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("getIsStageContentPartial")(infinite.asInstanceOf[js.Any], stageWidth.asInstanceOf[js.Any], contentWidth.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def getIsStageContentPartial(infinite: Unit, stageWidth: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("getIsStageContentPartial")(infinite.asInstanceOf[js.Any], stageWidth.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def getIsStageContentPartial(infinite: Unit, stageWidth: Double, contentWidth: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("getIsStageContentPartial")(infinite.asInstanceOf[js.Any], stageWidth.asInstanceOf[js.Any], contentWidth.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def getIsStageContentPartial(infinite: Unit, stageWidth: Unit, contentWidth: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("getIsStageContentPartial")(infinite.asInstanceOf[js.Any], stageWidth.asInstanceOf[js.Any], contentWidth.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def getItemCoords(): ItemCoords = ^.asInstanceOf[js.Dynamic].applyDynamic("getItemCoords")().asInstanceOf[ItemCoords]
  inline def getItemCoords(cursor: Double): ItemCoords = ^.asInstanceOf[js.Dynamic].applyDynamic("getItemCoords")(cursor.asInstanceOf[js.Any]).asInstanceOf[ItemCoords]
  inline def getItemCoords(cursor: Double, transformationSet: js.Array[ItemCoords]): ItemCoords = (^.asInstanceOf[js.Dynamic].applyDynamic("getItemCoords")(cursor.asInstanceOf[js.Any], transformationSet.asInstanceOf[js.Any])).asInstanceOf[ItemCoords]
  inline def getItemCoords(cursor: Unit, transformationSet: js.Array[ItemCoords]): ItemCoords = (^.asInstanceOf[js.Dynamic].applyDynamic("getItemCoords")(cursor.asInstanceOf[js.Any], transformationSet.asInstanceOf[js.Any])).asInstanceOf[ItemCoords]
  
  inline def getItemIndexForDotNavigation(index: Double, isTheLastIndex: Boolean, slidesLength: Double, itemsInSlide: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getItemIndexForDotNavigation")(index.asInstanceOf[js.Any], isTheLastIndex.asInstanceOf[js.Any], slidesLength.asInstanceOf[js.Any], itemsInSlide.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getItemWidth(galleryWidth: Double, itemsInSlide: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getItemWidth")(galleryWidth.asInstanceOf[js.Any], itemsInSlide.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getItemsCount(props: Props): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getItemsCount")(props.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getItemsInSlide(itemsCount: Double, props: Props): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getItemsInSlide")(itemsCount.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getItemsOffset(props: Props): `0` | `1` = ^.asInstanceOf[js.Dynamic].applyDynamic("getItemsOffset")(props.asInstanceOf[js.Any]).asInstanceOf[`0` | `1`]
  
  inline def getRenderStageItemClasses(i: Double, state: State): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getRenderStageItemClasses")(i.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getRenderStageItemClasses(i: Unit, state: State): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getRenderStageItemClasses")(i.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getRenderStageItemStyles(i: Double, state: State): AnimationDuration | Transform = (^.asInstanceOf[js.Dynamic].applyDynamic("getRenderStageItemStyles")(i.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[AnimationDuration | Transform]
  
  inline def getRenderStageStyles(nextStyles: Any, currentStyles: Style): Style = (^.asInstanceOf[js.Dynamic].applyDynamic("getRenderStageStyles")(nextStyles.asInstanceOf[js.Any], currentStyles.asInstanceOf[js.Any])).asInstanceOf[Style]
  
  inline def getRenderWrapperStyles(props: Props, state: State, element: Any): PaddingLeft = (^.asInstanceOf[js.Dynamic].applyDynamic("getRenderWrapperStyles")(props.asInstanceOf[js.Any], state.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[PaddingLeft]
  
  inline def getShiftIndex(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getShiftIndex")().asInstanceOf[Double]
  inline def getShiftIndex(itemsInSlide: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getShiftIndex")(itemsInSlide.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getShiftIndex(itemsInSlide: Double, itemsOffset: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getShiftIndex")(itemsInSlide.asInstanceOf[js.Any], itemsOffset.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getShiftIndex(itemsInSlide: Unit, itemsOffset: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getShiftIndex")(itemsInSlide.asInstanceOf[js.Any], itemsOffset.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getSlideIndexForMultipleItems(activeIndex: Any, itemsInSlide: Any, slidesLength: Any, isNextSlideDisabled: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getSlideIndexForMultipleItems")(activeIndex.asInstanceOf[js.Any], itemsInSlide.asInstanceOf[js.Any], slidesLength.asInstanceOf[js.Any], isNextSlideDisabled.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getSlideIndexForNonMultipleItems(activeIndex: Any, itemsInSlide: Any, slidesLength: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getSlideIndexForNonMultipleItems")(activeIndex.asInstanceOf[js.Any], itemsInSlide.asInstanceOf[js.Any], slidesLength.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getSlideInfo(): Item = ^.asInstanceOf[js.Dynamic].applyDynamic("getSlideInfo")().asInstanceOf[Item]
  inline def getSlideInfo(activeIndex: Double): Item = ^.asInstanceOf[js.Dynamic].applyDynamic("getSlideInfo")(activeIndex.asInstanceOf[js.Any]).asInstanceOf[Item]
  inline def getSlideInfo(activeIndex: Double, itemsCount: Double): Item = (^.asInstanceOf[js.Dynamic].applyDynamic("getSlideInfo")(activeIndex.asInstanceOf[js.Any], itemsCount.asInstanceOf[js.Any])).asInstanceOf[Item]
  inline def getSlideInfo(activeIndex: Unit, itemsCount: Double): Item = (^.asInstanceOf[js.Dynamic].applyDynamic("getSlideInfo")(activeIndex.asInstanceOf[js.Any], itemsCount.asInstanceOf[js.Any])).asInstanceOf[Item]
  
  inline def getSlideItemInfo(state: State): IsNextSlideDisabled = ^.asInstanceOf[js.Dynamic].applyDynamic("getSlideItemInfo")(state.asInstanceOf[js.Any]).asInstanceOf[IsNextSlideDisabled]
  
  inline def getSlides(props: Props): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getSlides")(props.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getStartIndex(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getStartIndex")().asInstanceOf[Double]
  inline def getStartIndex(index: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getStartIndex")(index.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getStartIndex(index: Double, itemsCount: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getStartIndex")(index.asInstanceOf[js.Any], itemsCount.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getStartIndex(index: Unit, itemsCount: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getStartIndex")(index.asInstanceOf[js.Any], itemsCount.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getSwipeLimitMax(state: PartialState, props: PartialProps): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getSwipeLimitMax")(state.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getSwipeLimitMin(state: PartialState, props: PartialProps): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getSwipeLimitMin")(state.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getSwipeShiftValue(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getSwipeShiftValue")().asInstanceOf[Double]
  inline def getSwipeShiftValue(cursor: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getSwipeShiftValue")(cursor.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getSwipeShiftValue(cursor: Double, transformationSet: js.Array[ItemCoords]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getSwipeShiftValue")(cursor.asInstanceOf[js.Any], transformationSet.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getSwipeShiftValue(cursor: Unit, transformationSet: js.Array[ItemCoords]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getSwipeShiftValue")(cursor.asInstanceOf[js.Any], transformationSet.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getSwipeTouchendIndex(position: Any, state: State): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getSwipeTouchendIndex")(position.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getSwipeTouchendPosition(state: State, deltaX: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getSwipeTouchendPosition")(state.asInstanceOf[js.Any], deltaX.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getSwipeTouchendPosition(state: State, deltaX: Double, swipePosition: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getSwipeTouchendPosition")(state.asInstanceOf[js.Any], deltaX.asInstanceOf[js.Any], swipePosition.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getSwipeTransformationCursor(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getSwipeTransformationCursor")().asInstanceOf[Double]
  inline def getSwipeTransformationCursor(transformationSet: js.Array[ItemCoords]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getSwipeTransformationCursor")(transformationSet.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getSwipeTransformationCursor(transformationSet: js.Array[ItemCoords], position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getSwipeTransformationCursor")(transformationSet.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getSwipeTransformationCursor(transformationSet: js.Array[ItemCoords], position: Double, deltaX: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getSwipeTransformationCursor")(transformationSet.asInstanceOf[js.Any], position.asInstanceOf[js.Any], deltaX.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getSwipeTransformationCursor(transformationSet: js.Array[ItemCoords], position: Unit, deltaX: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getSwipeTransformationCursor")(transformationSet.asInstanceOf[js.Any], position.asInstanceOf[js.Any], deltaX.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getSwipeTransformationCursor(transformationSet: Unit, position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getSwipeTransformationCursor")(transformationSet.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getSwipeTransformationCursor(transformationSet: Unit, position: Double, deltaX: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getSwipeTransformationCursor")(transformationSet.asInstanceOf[js.Any], position.asInstanceOf[js.Any], deltaX.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getSwipeTransformationCursor(transformationSet: Unit, position: Unit, deltaX: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getSwipeTransformationCursor")(transformationSet.asInstanceOf[js.Any], position.asInstanceOf[js.Any], deltaX.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getTouchmoveTranslatePosition(deltaX: Double, translate3d: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getTouchmoveTranslatePosition")(deltaX.asInstanceOf[js.Any], translate3d.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getTransformMatrix(element: Any): RegExpMatchArray = ^.asInstanceOf[js.Dynamic].applyDynamic("getTransformMatrix")(element.asInstanceOf[js.Any]).asInstanceOf[RegExpMatchArray]
  
  inline def getTransformationItemIndex(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getTransformationItemIndex")().asInstanceOf[Double]
  inline def getTransformationItemIndex(transformationSet: js.Array[ItemCoords]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getTransformationItemIndex")(transformationSet.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getTransformationItemIndex(transformationSet: js.Array[ItemCoords], position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getTransformationItemIndex")(transformationSet.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getTransformationItemIndex(transformationSet: Unit, position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getTransformationItemIndex")(transformationSet.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getTransitionProperty(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTransitionProperty")().asInstanceOf[String]
  inline def getTransitionProperty(options: Transition): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTransitionProperty")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getTranslate3dProperty(nextIndex: Any, state: PartialState): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getTranslate3dProperty")(nextIndex.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getTranslateXProperty(element: Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getTranslateXProperty")(element.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getUpdateSlidePositionIndex(activeIndex: Double, itemsCount: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getUpdateSlidePositionIndex")(activeIndex.asInstanceOf[js.Any], itemsCount.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def hasDotForEachSlide(autoWidth: Any, controlsStrategy: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("hasDotForEachSlide")(autoWidth.asInstanceOf[js.Any], controlsStrategy.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def isActiveItem(i: Double, state: State): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isActiveItem")(i.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isActiveItem(i: Unit, state: State): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isActiveItem")(i.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isClonedItem(i: Double, state: State): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isClonedItem")(i.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isClonedItem(i: Unit, state: State): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isClonedItem")(i.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isElement(element: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isElement")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isStrategy(strategy: Any, value: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isStrategy")(strategy.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def isTargetItem(i: Double, state: State): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTargetItem")(i.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isTargetItem(i: Unit, state: State): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTargetItem")(i.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isVerticalTouchmoveDetected(absX: Double, absY: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isVerticalTouchmoveDetected")(absX.asInstanceOf[js.Any], absY.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isVerticalTouchmoveDetected(absX: Double, absY: Double, swipeDelta: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isVerticalTouchmoveDetected")(absX.asInstanceOf[js.Any], absY.asInstanceOf[js.Any], swipeDelta.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def mapPartialCoords(coords: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("mapPartialCoords")(coords.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def mapPositionCoords(coords: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("mapPositionCoords")(coords.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def mapPositionCoords(coords: Any, position: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mapPositionCoords")(coords.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def shouldCancelAutoPlayOnAction(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldCancelAutoPlayOnAction")().asInstanceOf[Boolean]
  inline def shouldCancelAutoPlayOnAction(strategy: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldCancelAutoPlayOnAction")(strategy.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def shouldCancelAutoPlayOnHover(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldCancelAutoPlayOnHover")().asInstanceOf[Boolean]
  inline def shouldCancelAutoPlayOnHover(strategy: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldCancelAutoPlayOnHover")(strategy.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def shouldCancelSlideAnimation(activeIndex: Any, itemsCount: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldCancelSlideAnimation")(activeIndex.asInstanceOf[js.Any], itemsCount.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def shouldDisableButtons(props: Props, state: State): js.UndefOr[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldDisableButtons")(props.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Boolean]]
  
  inline def shouldDisableControls(props: Props, state: State): js.UndefOr[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldDisableControls")(props.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Boolean]]
  
  inline def shouldDisableDots(props: Props, state: State): js.UndefOr[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldDisableDots")(props.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Boolean]]
  
  inline def shouldHandleResizeEvent(e: Event): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldHandleResizeEvent")(e.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def shouldHandleResizeEvent(e: Event, prevDimensions: Unit, nextRootComponentDimensions: RootElement): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldHandleResizeEvent")(e.asInstanceOf[js.Any], prevDimensions.asInstanceOf[js.Any], nextRootComponentDimensions.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def shouldHandleResizeEvent(e: Event, prevDimensions: RootElement): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldHandleResizeEvent")(e.asInstanceOf[js.Any], prevDimensions.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def shouldHandleResizeEvent(e: Event, prevDimensions: RootElement, nextRootComponentDimensions: RootElement): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldHandleResizeEvent")(e.asInstanceOf[js.Any], prevDimensions.asInstanceOf[js.Any], nextRootComponentDimensions.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def shouldRecalculateSlideIndex(activeIndex: Any, itemsCount: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldRecalculateSlideIndex")(activeIndex.asInstanceOf[js.Any], itemsCount.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def shouldRecalculateSwipePosition(currentPosition: Any, minPosition: Any, maxPosition: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldRecalculateSwipePosition")(currentPosition.asInstanceOf[js.Any], minPosition.asInstanceOf[js.Any], maxPosition.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
