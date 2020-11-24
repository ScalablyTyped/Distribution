package typings.reactAliceCarousel

import typings.react.mod.global.JSX.Element
import typings.reactAliceCarousel.anon.ClassName
import typings.reactAliceCarousel.anon.SlidesLength
import typings.reactAliceCarousel.dotsNavigationMod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-alice-carousel/lib/views", JSImport.Namespace)
@js.native
object viewsMod extends js.Object {
  
  def DotsNavigation(hasStateOnClickOnMouseEnterOnMouseLeave: Props): Element = js.native
  
  def PlayPauseButton(hasIsPlayingOnClick: typings.reactAliceCarousel.playPauseButtonMod.Props): Element = js.native
  
  def PrevNextButton(hasNameDisabledOnClick: typings.reactAliceCarousel.prevNextButtonMod.Props): Element = js.native
  
  def SlideInfo(hasActiveIndexSlidesLength: SlidesLength): Element = js.native
  
  def StageItem(hasItemClassNameStyles: ClassName): Element = js.native
}
