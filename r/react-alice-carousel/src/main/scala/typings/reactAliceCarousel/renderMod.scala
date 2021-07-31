package typings.reactAliceCarousel

import typings.reactAliceCarousel.anon.IsPrevSlideDisabled
import typings.reactAliceCarousel.anon.SlideIndex
import typings.reactAliceCarousel.typesMod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderMod {
  
  @JSImport("react-alice-carousel/lib/utils/render", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
}
