package typings.reactAliceCarousel

import typings.reactAliceCarousel.anon.IsPrevSlideDisabled
import typings.reactAliceCarousel.anon.SlideIndex
import typings.reactAliceCarousel.typesMod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderMod {
  
  @JSImport("react-alice-carousel/lib/utils/render", "getActiveSlideDotsLength")
  @js.native
  def getActiveSlideDotsLength(): Double = js.native
  @JSImport("react-alice-carousel/lib/utils/render", "getActiveSlideDotsLength")
  @js.native
  def getActiveSlideDotsLength(slidesLength: js.UndefOr[scala.Nothing], itemsInSlide: Double): Double = js.native
  @JSImport("react-alice-carousel/lib/utils/render", "getActiveSlideDotsLength")
  @js.native
  def getActiveSlideDotsLength(slidesLength: Double): Double = js.native
  @JSImport("react-alice-carousel/lib/utils/render", "getActiveSlideDotsLength")
  @js.native
  def getActiveSlideDotsLength(slidesLength: Double, itemsInSlide: Double): Double = js.native
  
  @JSImport("react-alice-carousel/lib/utils/render", "getActiveSlideIndex")
  @js.native
  def getActiveSlideIndex(isNextSlideDisabled: js.Any, state: State): Double = js.native
  
  @JSImport("react-alice-carousel/lib/utils/render", "getSlideIndexForMultipleItems")
  @js.native
  def getSlideIndexForMultipleItems(activeIndex: js.Any, itemsInSlide: js.Any, slidesLength: js.Any, isNextSlideDisabled: js.Any): Double = js.native
  
  @JSImport("react-alice-carousel/lib/utils/render", "getSlideIndexForNonMultipleItems")
  @js.native
  def getSlideIndexForNonMultipleItems(activeIndex: js.Any, itemsInSlide: js.Any, slidesLength: js.Any): Double = js.native
  
  @JSImport("react-alice-carousel/lib/utils/render", "getSlideInfo")
  @js.native
  def getSlideInfo(): SlideIndex = js.native
  @JSImport("react-alice-carousel/lib/utils/render", "getSlideInfo")
  @js.native
  def getSlideInfo(activeIndex: js.UndefOr[scala.Nothing], slidesLength: Double): SlideIndex = js.native
  @JSImport("react-alice-carousel/lib/utils/render", "getSlideInfo")
  @js.native
  def getSlideInfo(activeIndex: Double): SlideIndex = js.native
  @JSImport("react-alice-carousel/lib/utils/render", "getSlideInfo")
  @js.native
  def getSlideInfo(activeIndex: Double, slidesLength: Double): SlideIndex = js.native
  
  @JSImport("react-alice-carousel/lib/utils/render", "getSlideItemInfo")
  @js.native
  def getSlideItemInfo(state: State): IsPrevSlideDisabled = js.native
}
