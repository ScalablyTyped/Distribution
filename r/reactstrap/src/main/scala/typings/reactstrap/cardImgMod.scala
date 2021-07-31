package typings.reactstrap

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ElementType
import typings.react.mod.ImgHTMLAttributes
import typings.reactstrap.mod.CSSModule
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardImgMod {
  
  @JSImport("reactstrap/lib/CardImg", JSImport.Default)
  @js.native
  class default ()
    extends Component[CardImgProps, js.Object, js.Any]
  
  type CardImg = Component[CardImgProps, js.Object, js.Any]
  
  trait CardImgProps
    extends StObject
       with ImgHTMLAttributes[HTMLImageElement]
       with /* key */ StringDictionary[js.Any] {
    
    var bottom: js.UndefOr[Boolean] = js.undefined
    
    var cssModule: js.UndefOr[CSSModule] = js.undefined
    
    var tag: js.UndefOr[ElementType[js.Any]] = js.undefined
    
    var top: js.UndefOr[Boolean] = js.undefined
  }
  object CardImgProps {
    
    @scala.inline
    def apply(): CardImgProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardImgProps]
    }
    
    @scala.inline
    implicit class CardImgPropsMutableBuilder[Self <: CardImgProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Boolean): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      @scala.inline
      def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      @scala.inline
      def setTag(value: ElementType[js.Any]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      @scala.inline
      def setTop(value: Boolean): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
}
