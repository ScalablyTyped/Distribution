package typings.reactAliceCarousel

import typings.react.mod.global.JSX.Element
import typings.reactAliceCarousel.libViewsDotsNavigationMod.DotsNavigationProps
import typings.reactAliceCarousel.libViewsPlayPauseButtonMod.Props
import typings.reactAliceCarousel.libViewsSlideInfoMod.SlideProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libViewsMod {
  
  @JSImport("react-alice-carousel/lib/views", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def DotsNavigation(param0: DotsNavigationProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("DotsNavigation")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def PlayPauseButton(param0: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("PlayPauseButton")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def PrevNextButton(param0: typings.reactAliceCarousel.libViewsPrevNextButtonMod.Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("PrevNextButton")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def SlideInfo(param0: SlideProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SlideInfo")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def StageItem(param0: typings.reactAliceCarousel.libViewsStageItemMod.Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("StageItem")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
}
