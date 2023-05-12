package typings.reactAliceCarousel

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.global.JSX.Element
import typings.reactAliceCarousel.anon.IsDisabled
import typings.reactAliceCarousel.reactAliceCarouselStrings.next
import typings.reactAliceCarousel.reactAliceCarouselStrings.prev
import typings.std.HTMLParagraphElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libViewsPrevNextButtonMod {
  
  @JSImport("react-alice-carousel/lib/views/PrevNextButton", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def PrevNextButton(param0: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("PrevNextButton")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @js.native
  trait Props extends StObject {
    
    var isDisabled: Boolean = js.native
    
    var name: prev | next = js.native
    
    def onClick(): Unit = js.native
    def onClick(e: MouseEvent[HTMLParagraphElement, NativeMouseEvent]): Unit = js.native
    
    var renderNextButton: js.UndefOr[js.Function1[/* param0 */ IsDisabled, Any]] = js.native
    
    var renderPrevButton: js.UndefOr[js.Function1[/* param0 */ IsDisabled, Any]] = js.native
  }
}
