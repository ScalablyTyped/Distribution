package typings.reactAliceCarousel

import typings.react.mod.global.JSX.Element
import typings.reactAliceCarousel.anon.ClassName
import typings.reactAliceCarousel.anon.SlidesLength
import typings.reactAliceCarousel.dotsNavigationMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viewsMod {
  
  @JSImport("react-alice-carousel/lib/views", "DotsNavigation")
  @js.native
  def DotsNavigation(hasStateOnClickOnMouseEnterOnMouseLeave: Props): Element = js.native
  
  @JSImport("react-alice-carousel/lib/views", "PlayPauseButton")
  @js.native
  def PlayPauseButton(hasIsPlayingOnClick: typings.reactAliceCarousel.playPauseButtonMod.Props): Element = js.native
  
  @JSImport("react-alice-carousel/lib/views", "PrevNextButton")
  @js.native
  def PrevNextButton(hasNameDisabledOnClick: typings.reactAliceCarousel.prevNextButtonMod.Props): Element = js.native
  
  @JSImport("react-alice-carousel/lib/views", "SlideInfo")
  @js.native
  def SlideInfo(hasActiveIndexSlidesLength: SlidesLength): Element = js.native
  
  @JSImport("react-alice-carousel/lib/views", "StageItem")
  @js.native
  def StageItem(hasItemClassNameStyles: ClassName): Element = js.native
}
