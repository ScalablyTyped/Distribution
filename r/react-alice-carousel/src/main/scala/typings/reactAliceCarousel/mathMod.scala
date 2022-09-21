package typings.reactAliceCarousel

import typings.reactAliceCarousel.anon.Infinite
import typings.reactAliceCarousel.anon.PartialProps
import typings.reactAliceCarousel.anon.PartialState
import typings.reactAliceCarousel.typesMod.ItemCoords
import typings.reactAliceCarousel.typesMod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mathMod {
  
  @JSImport("react-alice-carousel/lib/utils/math", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getActiveIndex(hasStartIndexItemsCountInfinite: Infinite): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getActiveIndex")(hasStartIndexItemsCountInfinite.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getFadeoutAnimationIndex(state: State): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getFadeoutAnimationIndex")(state.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getFadeoutAnimationPosition(nextIndex: Any, state: State): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getFadeoutAnimationPosition")(nextIndex.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getIsLeftDirection(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getIsLeftDirection")().asInstanceOf[Boolean]
  inline def getIsLeftDirection(deltaX: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getIsLeftDirection")(deltaX.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def getItemCoords(): ItemCoords = ^.asInstanceOf[js.Dynamic].applyDynamic("getItemCoords")().asInstanceOf[ItemCoords]
  inline def getItemCoords(cursor: Double): ItemCoords = ^.asInstanceOf[js.Dynamic].applyDynamic("getItemCoords")(cursor.asInstanceOf[js.Any]).asInstanceOf[ItemCoords]
  inline def getItemCoords(cursor: Double, transformationSet: js.Array[ItemCoords]): ItemCoords = (^.asInstanceOf[js.Dynamic].applyDynamic("getItemCoords")(cursor.asInstanceOf[js.Any], transformationSet.asInstanceOf[js.Any])).asInstanceOf[ItemCoords]
  inline def getItemCoords(cursor: Unit, transformationSet: js.Array[ItemCoords]): ItemCoords = (^.asInstanceOf[js.Dynamic].applyDynamic("getItemCoords")(cursor.asInstanceOf[js.Any], transformationSet.asInstanceOf[js.Any])).asInstanceOf[ItemCoords]
  
  inline def getShiftIndex(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getShiftIndex")().asInstanceOf[Double]
  inline def getShiftIndex(itemsInSlide: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getShiftIndex")(itemsInSlide.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getShiftIndex(itemsInSlide: Double, itemsOffset: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getShiftIndex")(itemsInSlide.asInstanceOf[js.Any], itemsOffset.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getShiftIndex(itemsInSlide: Unit, itemsOffset: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getShiftIndex")(itemsInSlide.asInstanceOf[js.Any], itemsOffset.asInstanceOf[js.Any])).asInstanceOf[Double]
  
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
  
  inline def getTransformationItemIndex(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getTransformationItemIndex")().asInstanceOf[Double]
  inline def getTransformationItemIndex(transformationSet: js.Array[ItemCoords]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getTransformationItemIndex")(transformationSet.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getTransformationItemIndex(transformationSet: js.Array[ItemCoords], position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getTransformationItemIndex")(transformationSet.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getTransformationItemIndex(transformationSet: Unit, position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getTransformationItemIndex")(transformationSet.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getUpdateSlidePositionIndex(activeIndex: Double, itemsCount: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getUpdateSlidePositionIndex")(activeIndex.asInstanceOf[js.Any], itemsCount.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def isVerticalTouchmoveDetected(absX: Double, absY: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isVerticalTouchmoveDetected")(absX.asInstanceOf[js.Any], absY.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isVerticalTouchmoveDetected(absX: Double, absY: Double, swipeDelta: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isVerticalTouchmoveDetected")(absX.asInstanceOf[js.Any], absY.asInstanceOf[js.Any], swipeDelta.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def shouldCancelSlideAnimation(activeIndex: Any, itemsCount: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldCancelSlideAnimation")(activeIndex.asInstanceOf[js.Any], itemsCount.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def shouldRecalculateSlideIndex(activeIndex: Any, itemsCount: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldRecalculateSlideIndex")(activeIndex.asInstanceOf[js.Any], itemsCount.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def shouldRecalculateSwipePosition(currentPosition: Any, minPosition: Any, maxPosition: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldRecalculateSwipePosition")(currentPosition.asInstanceOf[js.Any], minPosition.asInstanceOf[js.Any], maxPosition.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
