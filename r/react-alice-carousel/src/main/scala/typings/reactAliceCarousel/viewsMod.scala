package typings.reactAliceCarousel

import typings.react.mod.global.JSX.Element
import typings.reactAliceCarousel.anon.ClassName
import typings.reactAliceCarousel.anon.ItemsCount
import typings.reactAliceCarousel.dotsNavigationMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viewsMod {
  
  @JSImport("react-alice-carousel/lib/views", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def DotsNavigation(hasStateOnClickOnMouseEnterOnMouseLeaveControlsStrategyRenderDotsItem: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("DotsNavigation")(hasStateOnClickOnMouseEnterOnMouseLeaveControlsStrategyRenderDotsItem.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def PlayPauseButton(hasIsPlayingOnClickRenderPlayPauseButton: typings.reactAliceCarousel.playPauseButtonMod.Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("PlayPauseButton")(hasIsPlayingOnClickRenderPlayPauseButton.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def PrevNextButton(
    hasNameIsDisabledOnClickRenderPrevButtonRenderNextButton: typings.reactAliceCarousel.prevNextButtonMod.Props
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("PrevNextButton")(hasNameIsDisabledOnClickRenderPrevButtonRenderNextButton.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def SlideInfo(hasActiveIndexItemsCountRenderSlideInfo: ItemsCount): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SlideInfo")(hasActiveIndexItemsCountRenderSlideInfo.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def StageItem(hasItemClassNameStyles: ClassName): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("StageItem")(hasItemClassNameStyles.asInstanceOf[js.Any]).asInstanceOf[Element]
}
