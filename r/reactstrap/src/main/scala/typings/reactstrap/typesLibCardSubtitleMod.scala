package typings.reactstrap

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ElementType
import typings.react.mod.HTMLAttributes
import typings.reactstrap.typesLibUtilsMod.CSSModule
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLibCardSubtitleMod {
  
  @JSImport("reactstrap/types/lib/CardSubtitle", JSImport.Default)
  @js.native
  open class default ()
    extends Component[CardSubtitleProps, js.Object, Any]
  
  type CardSubtitle = Component[CardSubtitleProps, js.Object, Any]
  
  trait CardSubtitleProps
    extends StObject
       with HTMLAttributes[HTMLElement]
       with /* key */ StringDictionary[Any] {
    
    var cssModule: js.UndefOr[CSSModule] = js.undefined
    
    var tag: js.UndefOr[ElementType[Any]] = js.undefined
  }
  object CardSubtitleProps {
    
    inline def apply(): CardSubtitleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardSubtitleProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CardSubtitleProps] (val x: Self) extends AnyVal {
      
      inline def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      inline def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      inline def setTag(value: ElementType[Any]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    }
  }
}
