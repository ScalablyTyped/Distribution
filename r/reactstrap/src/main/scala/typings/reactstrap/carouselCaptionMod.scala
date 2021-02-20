package typings.reactstrap

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactNode
import typings.reactstrap.mod.CSSModule
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object carouselCaptionMod {
  
  @JSImport("reactstrap/lib/CarouselCaption", JSImport.Default)
  @js.native
  class default ()
    extends Component[CarouselCaptionProps, js.Object, js.Any]
  
  type CarouselCaption = Component[CarouselCaptionProps, js.Object, js.Any]
  
  @js.native
  trait CarouselCaptionProps
    extends HTMLAttributes[HTMLElement]
       with /* key */ StringDictionary[js.Any] {
    
    var captionHeader: js.UndefOr[ReactNode] = js.native
    
    var captionText: ReactNode = js.native
    
    var cssModule: js.UndefOr[CSSModule] = js.native
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
      def setCaptionHeader(value: ReactNode): Self = StObject.set(x, "captionHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptionHeaderUndefined: Self = StObject.set(x, "captionHeader", js.undefined)
      
      @scala.inline
      def setCaptionText(value: ReactNode): Self = StObject.set(x, "captionText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptionTextUndefined: Self = StObject.set(x, "captionText", js.undefined)
      
      @scala.inline
      def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
    }
  }
}
