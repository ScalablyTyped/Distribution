package typings.reactstrap

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactNode
import typings.reactstrap.typesLibUtilsMod.CSSModule
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLibCarouselCaptionMod {
  
  @JSImport("reactstrap/types/lib/CarouselCaption", JSImport.Default)
  @js.native
  open class default ()
    extends Component[CarouselCaptionProps, js.Object, Any]
  
  type CarouselCaption = Component[CarouselCaptionProps, js.Object, Any]
  
  trait CarouselCaptionProps
    extends StObject
       with HTMLAttributes[HTMLElement]
       with /* key */ StringDictionary[Any] {
    
    var captionHeader: js.UndefOr[ReactNode] = js.undefined
    
    var captionText: ReactNode
    
    var cssModule: js.UndefOr[CSSModule] = js.undefined
  }
  object CarouselCaptionProps {
    
    inline def apply(): CarouselCaptionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CarouselCaptionProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CarouselCaptionProps] (val x: Self) extends AnyVal {
      
      inline def setCaptionHeader(value: ReactNode): Self = StObject.set(x, "captionHeader", value.asInstanceOf[js.Any])
      
      inline def setCaptionHeaderUndefined: Self = StObject.set(x, "captionHeader", js.undefined)
      
      inline def setCaptionText(value: ReactNode): Self = StObject.set(x, "captionText", value.asInstanceOf[js.Any])
      
      inline def setCaptionTextUndefined: Self = StObject.set(x, "captionText", js.undefined)
      
      inline def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      inline def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
    }
  }
}
