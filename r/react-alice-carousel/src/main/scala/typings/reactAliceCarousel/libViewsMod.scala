package typings.reactAliceCarousel

import typings.react.mod.global.JSX.Element
import typings.reactAliceCarousel.anon.ClassName
import typings.reactAliceCarousel.anon.ItemsCount
import typings.reactAliceCarousel.libViewsDotsNavigationMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libViewsMod {
  
  @JSImport("react-alice-carousel/lib/views", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def DotsNavigation(param0: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("DotsNavigation")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def PlayPauseButton(param0: typings.reactAliceCarousel.libViewsPlayPauseButtonMod.Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("PlayPauseButton")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def PrevNextButton(param0: typings.reactAliceCarousel.libViewsPrevNextButtonMod.Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("PrevNextButton")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def SlideInfo(param0: ItemsCount): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SlideInfo")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def StageItem(param0: ClassName): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("StageItem")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
}
