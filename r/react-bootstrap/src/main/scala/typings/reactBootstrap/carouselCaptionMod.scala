package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import typings.react.mod.ReactType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object carouselCaptionMod {
  
  @JSImport("react-bootstrap/lib/CarouselCaption", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[CarouselCaptionProps, js.Object, js.Any]
  
  @js.native
  trait CarouselCaption
    extends Component[CarouselCaptionProps, js.Object, js.Any]
  
  trait CarouselCaptionProps
    extends StObject
       with HTMLProps[CarouselCaption] {
    
    var componentClass: js.UndefOr[ReactType[js.Any]] = js.undefined
  }
  object CarouselCaptionProps {
    
    @scala.inline
    def apply(): CarouselCaptionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CarouselCaptionProps]
    }
    
    @scala.inline
    implicit class CarouselCaptionPropsMutableBuilder[Self <: CarouselCaptionProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponentClass(value: ReactType[js.Any]): Self = StObject.set(x, "componentClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentClassUndefined: Self = StObject.set(x, "componentClass", js.undefined)
    }
  }
}
