package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.ElementType
import typings.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCarouselCaptionMod {
  
  @JSImport("react-bootstrap/lib/CarouselCaption", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[CarouselCaptionProps, js.Object, Any]
  
  type CarouselCaption = Component[CarouselCaptionProps, js.Object, Any]
  
  trait CarouselCaptionProps
    extends StObject
       with HTMLProps[CarouselCaption] {
    
    var componentClass: js.UndefOr[ElementType[Any]] = js.undefined
  }
  object CarouselCaptionProps {
    
    inline def apply(): CarouselCaptionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CarouselCaptionProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CarouselCaptionProps] (val x: Self) extends AnyVal {
      
      inline def setComponentClass(value: ElementType[Any]): Self = StObject.set(x, "componentClass", value.asInstanceOf[js.Any])
      
      inline def setComponentClassUndefined: Self = StObject.set(x, "componentClass", js.undefined)
    }
  }
}
