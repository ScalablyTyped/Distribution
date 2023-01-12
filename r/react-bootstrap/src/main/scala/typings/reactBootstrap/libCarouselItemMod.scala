package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCarouselItemMod {
  
  @JSImport("react-bootstrap/lib/CarouselItem", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[CarouselItemProps, js.Object, Any]
  
  type CarouselItem = Component[CarouselItemProps, js.Object, Any]
  
  trait CarouselItemProps
    extends StObject
       with HTMLProps[CarouselItem] {
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    var animateOut: js.UndefOr[Boolean] = js.undefined
    
    var animtateIn: js.UndefOr[Boolean] = js.undefined
    
    var direction: js.UndefOr[String] = js.undefined
    
    var index: js.UndefOr[Double] = js.undefined
    
    // TODO: Add more specific type
    var onAnimateOutEnd: js.UndefOr[js.Function] = js.undefined
  }
  object CarouselItemProps {
    
    inline def apply(): CarouselItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CarouselItemProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CarouselItemProps] (val x: Self) extends AnyVal {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setAnimateOut(value: Boolean): Self = StObject.set(x, "animateOut", value.asInstanceOf[js.Any])
      
      inline def setAnimateOutUndefined: Self = StObject.set(x, "animateOut", js.undefined)
      
      inline def setAnimtateIn(value: Boolean): Self = StObject.set(x, "animtateIn", value.asInstanceOf[js.Any])
      
      inline def setAnimtateInUndefined: Self = StObject.set(x, "animtateIn", js.undefined)
      
      inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setOnAnimateOutEnd(value: js.Function): Self = StObject.set(x, "onAnimateOutEnd", value.asInstanceOf[js.Any])
      
      inline def setOnAnimateOutEndUndefined: Self = StObject.set(x, "onAnimateOutEnd", js.undefined)
    }
  }
}
