package typings.reactAliceCarousel

import typings.reactAliceCarousel.anon.PartialProps
import typings.reactAliceCarousel.anon.PartialState
import typings.reactAliceCarousel.typesMod.State
import typings.reactAliceCarousel.typesMod.TransformationSetItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mathMod {
  
  @JSImport("react-alice-carousel/lib/utils/math", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getActiveIndex(index: Double, dotsLength: Double, infinite: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getActiveIndex")(index.asInstanceOf[js.Any], dotsLength.asInstanceOf[js.Any], infinite.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def getFadeoutAnimationIndex(state: State): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getFadeoutAnimationIndex")(state.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def getFadeoutAnimationPosition(nextIndex: js.Any, state: State): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getFadeoutAnimationPosition")(nextIndex.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def getIsLeftDirection(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getIsLeftDirection")().asInstanceOf[Boolean]
  @scala.inline
  def getIsLeftDirection(deltaX: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getIsLeftDirection")(deltaX.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def getShiftIndex(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getShiftIndex")().asInstanceOf[Double]
  @scala.inline
  def getShiftIndex(itemsInSlide: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getShiftIndex")(itemsInSlide.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def getShiftIndex(itemsInSlide: Double, itemsOffset: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getShiftIndex")(itemsInSlide.asInstanceOf[js.Any], itemsOffset.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def getShiftIndex(itemsInSlide: Unit, itemsOffset: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getShiftIndex")(itemsInSlide.asInstanceOf[js.Any], itemsOffset.asInstanceOf[js.Any])).asInstanceOf[Double]
  
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
  def getUpdateSlidePositionIndex(activeIndex: Double, itemsCount: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getUpdateSlidePositionIndex")(activeIndex.asInstanceOf[js.Any], itemsCount.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def isVerticalTouchmoveDetected(absX: Double, absY: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isVerticalTouchmoveDetected")(absX.asInstanceOf[js.Any], absY.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isVerticalTouchmoveDetected(absX: Double, absY: Double, swipeDelta: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isVerticalTouchmoveDetected")(absX.asInstanceOf[js.Any], absY.asInstanceOf[js.Any], swipeDelta.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def shouldCancelSlideAnimation(activeIndex: js.Any, itemsCount: js.Any, itemsInSlide: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldCancelSlideAnimation")(activeIndex.asInstanceOf[js.Any], itemsCount.asInstanceOf[js.Any], itemsInSlide.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def shouldRecalculateSlideIndex(activeIndex: js.Any, itemsCount: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldRecalculateSlideIndex")(activeIndex.asInstanceOf[js.Any], itemsCount.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def shouldRecalculateSwipePosition(currentPosition: js.Any, minPosition: js.Any, maxPosition: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldRecalculateSwipePosition")(currentPosition.asInstanceOf[js.Any], minPosition.asInstanceOf[js.Any], maxPosition.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
