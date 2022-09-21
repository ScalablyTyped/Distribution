package typings.reactstrap

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ElementType
import typings.react.mod.HTMLAttributes
import typings.reactstrap.utilsMod.CSSModule
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object carouselItemMod {
  
  @JSImport("reactstrap/types/lib/CarouselItem", JSImport.Default)
  @js.native
  open class default ()
    extends Component[CarouselItemProps, js.Object, Any]
  
  type CarouselItem = Component[CarouselItemProps, js.Object, Any]
  
  trait CarouselItemProps
    extends StObject
       with HTMLAttributes[HTMLElement]
       with /* key */ StringDictionary[Any] {
    
    var cssModule: js.UndefOr[CSSModule] = js.undefined
    
    var in: js.UndefOr[Boolean] = js.undefined
    
    var onEnter: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onEntered: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onEntering: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onExit: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onExited: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onExiting: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var slide: js.UndefOr[Boolean] = js.undefined
    
    var tag: js.UndefOr[ElementType[Any]] = js.undefined
  }
  object CarouselItemProps {
    
    inline def apply(): CarouselItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CarouselItemProps]
    }
    
    extension [Self <: CarouselItemProps](x: Self) {
      
      inline def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      inline def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      inline def setIn(value: Boolean): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
      
      inline def setInUndefined: Self = StObject.set(x, "in", js.undefined)
      
      inline def setOnEnter(value: () => Unit): Self = StObject.set(x, "onEnter", js.Any.fromFunction0(value))
      
      inline def setOnEnterUndefined: Self = StObject.set(x, "onEnter", js.undefined)
      
      inline def setOnEntered(value: () => Unit): Self = StObject.set(x, "onEntered", js.Any.fromFunction0(value))
      
      inline def setOnEnteredUndefined: Self = StObject.set(x, "onEntered", js.undefined)
      
      inline def setOnEntering(value: () => Unit): Self = StObject.set(x, "onEntering", js.Any.fromFunction0(value))
      
      inline def setOnEnteringUndefined: Self = StObject.set(x, "onEntering", js.undefined)
      
      inline def setOnExit(value: () => Unit): Self = StObject.set(x, "onExit", js.Any.fromFunction0(value))
      
      inline def setOnExitUndefined: Self = StObject.set(x, "onExit", js.undefined)
      
      inline def setOnExited(value: () => Unit): Self = StObject.set(x, "onExited", js.Any.fromFunction0(value))
      
      inline def setOnExitedUndefined: Self = StObject.set(x, "onExited", js.undefined)
      
      inline def setOnExiting(value: () => Unit): Self = StObject.set(x, "onExiting", js.Any.fromFunction0(value))
      
      inline def setOnExitingUndefined: Self = StObject.set(x, "onExiting", js.undefined)
      
      inline def setSlide(value: Boolean): Self = StObject.set(x, "slide", value.asInstanceOf[js.Any])
      
      inline def setSlideUndefined: Self = StObject.set(x, "slide", js.undefined)
      
      inline def setTag(value: ElementType[Any]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    }
  }
}
