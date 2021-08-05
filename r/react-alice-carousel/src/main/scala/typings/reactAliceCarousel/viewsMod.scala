package typings.reactAliceCarousel

import typings.react.mod.global.JSX.Element
import typings.reactAliceCarousel.anon.ClassName
import typings.reactAliceCarousel.anon.SlidesLength
import typings.reactAliceCarousel.dotsNavigationMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viewsMod {
  
  @JSImport("react-alice-carousel/lib/views", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def DotsNavigation(hasStateOnClickOnMouseEnterOnMouseLeave: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("DotsNavigation")(hasStateOnClickOnMouseEnterOnMouseLeave.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def PlayPauseButton(hasIsPlayingOnClick: typings.reactAliceCarousel.playPauseButtonMod.Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("PlayPauseButton")(hasIsPlayingOnClick.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def PrevNextButton(hasNameDisabledOnClick: typings.reactAliceCarousel.prevNextButtonMod.Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("PrevNextButton")(hasNameDisabledOnClick.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def SlideInfo(hasActiveIndexSlidesLength: SlidesLength): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SlideInfo")(hasActiveIndexSlidesLength.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def StageItem(hasItemClassNameStyles: ClassName): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("StageItem")(hasItemClassNameStyles.asInstanceOf[js.Any]).asInstanceOf[Element]
}
