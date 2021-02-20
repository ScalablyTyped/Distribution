package typings.reactstrap

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ElementType
import typings.react.mod.ImgHTMLAttributes
import typings.reactstrap.mod.CSSModule
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardImgMod {
  
  @JSImport("reactstrap/lib/CardImg", JSImport.Default)
  @js.native
  class default ()
    extends Component[CardImgProps, js.Object, js.Any]
  
  type CardImg = Component[CardImgProps, js.Object, js.Any]
  
  @js.native
  trait CardImgProps
    extends ImgHTMLAttributes[HTMLImageElement]
       with /* key */ StringDictionary[js.Any] {
    
    var bottom: js.UndefOr[Boolean] = js.native
    
    var cssModule: js.UndefOr[CSSModule] = js.native
    
    var tag: js.UndefOr[ElementType[_]] = js.native
    
    var top: js.UndefOr[Boolean] = js.native
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
      def setTag(value: ElementType[_]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      @scala.inline
      def setTop(value: Boolean): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
}
