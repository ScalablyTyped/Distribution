package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object carouselItemMod {
  
  @JSImport("react-bootstrap/lib/CarouselItem", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[CarouselItemProps, js.Object, js.Any]
  
  @js.native
  trait CarouselItem
    extends Component[CarouselItemProps, js.Object, js.Any]
  
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
    
    @scala.inline
    def apply(): CarouselItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CarouselItemProps]
    }
    
    @scala.inline
    implicit class CarouselItemPropsMutableBuilder[Self <: CarouselItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setAnimateOut(value: Boolean): Self = StObject.set(x, "animateOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimateOutUndefined: Self = StObject.set(x, "animateOut", js.undefined)
      
      @scala.inline
      def setAnimtateIn(value: Boolean): Self = StObject.set(x, "animtateIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimtateInUndefined: Self = StObject.set(x, "animtateIn", js.undefined)
      
      @scala.inline
      def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setOnAnimateOutEnd(value: js.Function): Self = StObject.set(x, "onAnimateOutEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnAnimateOutEndUndefined: Self = StObject.set(x, "onAnimateOutEnd", js.undefined)
    }
  }
}
