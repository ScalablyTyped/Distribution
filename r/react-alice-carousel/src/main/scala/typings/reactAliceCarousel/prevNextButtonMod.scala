package typings.reactAliceCarousel

import typings.react.mod.global.JSX.Element
import typings.reactAliceCarousel.reactAliceCarouselStrings.next
import typings.reactAliceCarousel.reactAliceCarouselStrings.prev
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object prevNextButtonMod {
  
  @JSImport("react-alice-carousel/lib/views/PrevNextButton", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def PrevNextButton(hasNameDisabledOnClick: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("PrevNextButton")(hasNameDisabledOnClick.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait Props extends StObject {
    
    var disabled: Boolean
    
    var name: prev | next
    
    def onClick(e: js.Any): Unit
  }
  object Props {
    
    @scala.inline
    def apply(disabled: Boolean, name: prev | next, onClick: js.Any => Unit): Props = {
      val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick))
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: prev | next): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClick(value: js.Any => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    }
  }
}
