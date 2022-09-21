package typings.reactstrap

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ElementType
import typings.react.mod.ImgHTMLAttributes
import typings.reactstrap.utilsMod.CSSModule
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardImgMod {
  
  @JSImport("reactstrap/types/lib/CardImg", JSImport.Default)
  @js.native
  open class default ()
    extends Component[CardImgProps, js.Object, Any]
  
  type CardImg = Component[CardImgProps, js.Object, Any]
  
  trait CardImgProps
    extends StObject
       with ImgHTMLAttributes[HTMLImageElement]
       with /* key */ StringDictionary[Any] {
    
    var bottom: js.UndefOr[Boolean] = js.undefined
    
    var cssModule: js.UndefOr[CSSModule] = js.undefined
    
    var tag: js.UndefOr[ElementType[Any]] = js.undefined
    
    var top: js.UndefOr[Boolean] = js.undefined
  }
  object CardImgProps {
    
    inline def apply(): CardImgProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardImgProps]
    }
    
    extension [Self <: CardImgProps](x: Self) {
      
      inline def setBottom(value: Boolean): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      inline def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      inline def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      inline def setTag(value: ElementType[Any]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      inline def setTop(value: Boolean): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
}
