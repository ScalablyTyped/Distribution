package typings.reactstrap

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ElementType
import typings.react.mod.HTMLAttributes
import typings.reactstrap.mod.CSSModule
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object carouselItemMod {
  
  @JSImport("reactstrap/lib/CarouselItem", JSImport.Default)
  @js.native
  class default ()
    extends Component[CarouselItemProps, js.Object, js.Any]
  
  type CarouselItem = Component[CarouselItemProps, js.Object, js.Any]
  
  @js.native
  trait CarouselItemProps
    extends HTMLAttributes[HTMLElement]
       with /* key */ StringDictionary[js.Any] {
    
    var cssModule: js.UndefOr[CSSModule] = js.native
    
    var in: js.UndefOr[Boolean] = js.native
    
    var onEnter: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onEntered: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onEntering: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onExit: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onExited: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onExiting: js.UndefOr[js.Function0[Unit]] = js.native
    
    var slide: js.UndefOr[Boolean] = js.native
    
    var tag: js.UndefOr[ElementType[_]] = js.native
  }
  object CarouselItemProps {
    
    @scala.inline
    def apply(): CarouselItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CarouselItemProps]
    }
    
    @scala.inline
    implicit class CarouselItemPropsMutableBuilder[Self <: CarouselItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      @scala.inline
      def setIn(value: Boolean): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInUndefined: Self = StObject.set(x, "in", js.undefined)
      
      @scala.inline
      def setOnEnter(value: () => Unit): Self = StObject.set(x, "onEnter", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnEnterUndefined: Self = StObject.set(x, "onEnter", js.undefined)
      
      @scala.inline
      def setOnEntered(value: () => Unit): Self = StObject.set(x, "onEntered", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnEnteredUndefined: Self = StObject.set(x, "onEntered", js.undefined)
      
      @scala.inline
      def setOnEntering(value: () => Unit): Self = StObject.set(x, "onEntering", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnEnteringUndefined: Self = StObject.set(x, "onEntering", js.undefined)
      
      @scala.inline
      def setOnExit(value: () => Unit): Self = StObject.set(x, "onExit", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnExitUndefined: Self = StObject.set(x, "onExit", js.undefined)
      
      @scala.inline
      def setOnExited(value: () => Unit): Self = StObject.set(x, "onExited", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnExitedUndefined: Self = StObject.set(x, "onExited", js.undefined)
      
      @scala.inline
      def setOnExiting(value: () => Unit): Self = StObject.set(x, "onExiting", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnExitingUndefined: Self = StObject.set(x, "onExiting", js.undefined)
      
      @scala.inline
      def setSlide(value: Boolean): Self = StObject.set(x, "slide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlideUndefined: Self = StObject.set(x, "slide", js.undefined)
      
      @scala.inline
      def setTag(value: ElementType[_]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    }
  }
}
