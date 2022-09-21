package typings.reactAliceCarousel

import typings.reactAliceCarousel.anon.IsNextSlideDisabled
import typings.reactAliceCarousel.anon.Item
import typings.reactAliceCarousel.typesMod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderMod {
  
  @JSImport("react-alice-carousel/lib/utils/render", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getActiveSlideDotsLength(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getActiveSlideDotsLength")().asInstanceOf[Double]
  inline def getActiveSlideDotsLength(slidesLength: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getActiveSlideDotsLength")(slidesLength.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getActiveSlideDotsLength(slidesLength: Double, itemsInSlide: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getActiveSlideDotsLength")(slidesLength.asInstanceOf[js.Any], itemsInSlide.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getActiveSlideDotsLength(slidesLength: Unit, itemsInSlide: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getActiveSlideDotsLength")(slidesLength.asInstanceOf[js.Any], itemsInSlide.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getActiveSlideIndex(isNextSlideDisabled: Any, state: State): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getActiveSlideIndex")(isNextSlideDisabled.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getSlideIndexForMultipleItems(activeIndex: Any, itemsInSlide: Any, slidesLength: Any, isNextSlideDisabled: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getSlideIndexForMultipleItems")(activeIndex.asInstanceOf[js.Any], itemsInSlide.asInstanceOf[js.Any], slidesLength.asInstanceOf[js.Any], isNextSlideDisabled.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getSlideIndexForNonMultipleItems(activeIndex: Any, itemsInSlide: Any, slidesLength: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getSlideIndexForNonMultipleItems")(activeIndex.asInstanceOf[js.Any], itemsInSlide.asInstanceOf[js.Any], slidesLength.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getSlideInfo(): Item = ^.asInstanceOf[js.Dynamic].applyDynamic("getSlideInfo")().asInstanceOf[Item]
  inline def getSlideInfo(activeIndex: Double): Item = ^.asInstanceOf[js.Dynamic].applyDynamic("getSlideInfo")(activeIndex.asInstanceOf[js.Any]).asInstanceOf[Item]
  inline def getSlideInfo(activeIndex: Double, itemsCount: Double): Item = (^.asInstanceOf[js.Dynamic].applyDynamic("getSlideInfo")(activeIndex.asInstanceOf[js.Any], itemsCount.asInstanceOf[js.Any])).asInstanceOf[Item]
  inline def getSlideInfo(activeIndex: Unit, itemsCount: Double): Item = (^.asInstanceOf[js.Dynamic].applyDynamic("getSlideInfo")(activeIndex.asInstanceOf[js.Any], itemsCount.asInstanceOf[js.Any])).asInstanceOf[Item]
  
  inline def getSlideItemInfo(state: State): IsNextSlideDisabled = ^.asInstanceOf[js.Dynamic].applyDynamic("getSlideItemInfo")(state.asInstanceOf[js.Any]).asInstanceOf[IsNextSlideDisabled]
}
